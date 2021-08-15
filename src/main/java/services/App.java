package services;

import services.analizer.FrequencyAnalyzer;
import services.inputReader.FileInputReader;
import services.jsonCreator.JSONFileCreator;

import java.io.IOException;

/**
 *
 */
public class App {
    public static void main(String[] args) {
        FileInputReader fileInputReader = new FileInputReader("input.txt");
        JSONFileCreator jsonFileCreator = new JSONFileCreator("output.txt");
        try {
            jsonFileCreator.create(FrequencyAnalyzer.analyzeCharacters(fileInputReader.readFile()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
