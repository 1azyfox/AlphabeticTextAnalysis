package services.analizer;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FrequencyAnalyzer extends Analyzer {

    public static HashMap<String,Long> analyzeCharacters(List<String> stringList) {
        return analyzeByCharacter(stringList)
                .collect(
                        Collectors.toMap(
                                c -> ((Character)c).toString(),
                                c -> 1,
                                (existing, replacement) -> existing+1
                        )
                );
    }
}
