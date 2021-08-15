package services.analizer;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FrequencyAnalyzer extends Analyzer {

    public static TreeMap<String,Long> analyzeCharacters(List<String> stringList) {
        TreeMap<String, Long> collect = (TreeMap<String, Long>) analyzeByCharacter(stringList)
                .collect(
                        Collectors.toMap(
                                c -> ((Character) c).toString(),
                                c -> 1L,
                                (existing, replacement) -> existing + 1,
                                TreeMap::new
                        )
                );
        System.out.println(collect);
        return (TreeMap<String, Long>) analyzeByCharacter(stringList)
                .collect(
                        Collectors.toMap(
                                c -> ((Character)c).toString(),
                                c -> 1L,
                                (existing, replacement) -> existing+1,
                                TreeMap::new
                        )
                );
    }
}
