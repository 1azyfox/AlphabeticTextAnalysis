import services.analizer.FileFrequencyAnalyzer;
import services.json.JSONFileCreator;

import java.io.IOException;

/**
 *
 */
public class App {
    public static void main(String[] args) {
        try {
//            System.getenv();
//            args
            String inputFileName = "input";
            String outputFileName = "output";
            FileFrequencyAnalyzer fileFrequencyAnalyzer = new FileFrequencyAnalyzer(inputFileName + ".txt");
            JSONFileCreator jsonFileCreator = new JSONFileCreator(outputFileName + ".txt");
            jsonFileCreator.create(fileFrequencyAnalyzer.analyzeCharacters());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
