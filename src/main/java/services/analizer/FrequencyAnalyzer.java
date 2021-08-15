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

        return (HashMap<String, Long>) analyzeByCharacter(stringList)
                .collect(
                        Collectors.toMap(
                                c -> ((Character)c).toString(),
                                c -> 1L,
                                (existing, replacement) -> existing+1,
                                HashMap::new
                        )
                );
    }
}
