package services.analizer;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class FileFrequencyAnalyzer implements FrequencyAnalyzer {

    private final String fileName;

    public FileFrequencyAnalyzer(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public Map<String, Long> analyzeCharacters() throws IOException {
        return Files.lines(Paths.get(".\\src\\main\\resources\\" + fileName), StandardCharsets.UTF_8)
                .flatMap(s -> s.chars().mapToObj(c -> (char) c))
                .filter(c -> c != ' ')
                .filter(character -> character != '-')
                .collect(
                        Collectors.toMap(
                                String::valueOf,
                                c -> 1L,
                                (existing, replacement) -> existing + 1,
                                TreeMap::new
                        )
                );
    }
}
