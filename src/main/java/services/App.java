package services;

import services.analizer.FileFrequencyAnalyzer;
import services.inputReader.FileInputReader;
import services.jsonCreator.JSONFileCreator;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 *
 */
public class App {
    public static void main(String[] args) {
        FileInputReader fileInputReader = new FileInputReader(System.getenv("input_file_app"));
//
////        Files.lines(Paths.get(""))
//
        JSONFileCreator jsonFileCreator = new JSONFileCreator(System.getenv("input_file_app"));
//
//        try {
////            jsonFileCreator.create(FileFrequencyAnalyzer.analyzeCharacters(fileInputReader.readFile()));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}
