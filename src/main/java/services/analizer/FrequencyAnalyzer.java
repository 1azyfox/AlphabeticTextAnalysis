package services.analizer;

import java.io.IOException;
import java.util.Map;

public interface FrequencyAnalyzer {
    Map<String,Long> analyzeCharacters() throws IOException;
}
