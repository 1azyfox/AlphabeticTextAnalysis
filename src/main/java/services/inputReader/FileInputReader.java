package services.inputReader;


import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileInputReader {
    private String fileName;

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public FileInputReader(String fileName) {
        this.fileName = fileName;
    }

    public List<String> readFile() {
        List<String> linesOfFile = new ArrayList<>();
        try (BufferedReader reader = Files.newBufferedReader(Paths.get(".\\src\\main\\java\\resources\\" + fileName), StandardCharsets.UTF_8)) {
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
}
