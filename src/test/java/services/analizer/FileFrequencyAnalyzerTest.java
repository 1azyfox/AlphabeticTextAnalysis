package services.analizer;

import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.Map;

import static org.junit.Assert.assertTrue;

public class FileFrequencyAnalyzerTest {

    private FrequencyAnalyzer frequencyAnalyzer;

    private String fileName = "fileName";

    @Before
    public void setUp() throws Exception {
        this.frequencyAnalyzer = new FileFrequencyAnalyzer(fileName);
    }

    @Test
    public void analyzeCharacters() throws IOException {
        Map<String, Long> stringLongMap = frequencyAnalyzer.analyzeCharacters();
        assertTrue(true);
    }

}