package services.analizer;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public interface FrequencyAnalyzer {

    Map<String, Long> analyzeCharacters();

}
