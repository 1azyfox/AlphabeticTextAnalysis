package services.analizer;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

public class FileFrequencyAnalyzer implements FrequencyAnalyzer {
    private String fileName;

    public FileFrequencyAnalyzer(String fileName) {
        this.fileName = fileName;
    }

    public List<String> readFile() {
        List<String> linesOfFile = new ArrayList<>();
        try (BufferedReader reader = Files.newBufferedReader(Paths.get(".\\src\\main\\resources\\" + fileName), StandardCharsets.UTF_8)) {
            String lineOfFile;
            while ((lineOfFile = reader.readLine()) != null) {
                linesOfFile.add(lineOfFile);
            }
        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return linesOfFile;
    }

    @Override
    public Map<String,Long> analyzeCharacters() {
        return readFile().stream()
                .flatMap(s -> {
                    List<Character> list = new ArrayList();
                    for (int i=0;i<s.length();i++) {
                        list.add(s.charAt(i));
                    }
                    return list.stream();
                })
                .filter(c->c !=' ')
                .filter(character -> character != '-')
                .collect(
                        Collectors.toMap(
                                Object::toString,
                                c -> 1L,
                                (existing, replacement) -> existing + 1,
                                TreeMap::new
                        )
                );
    }
}
