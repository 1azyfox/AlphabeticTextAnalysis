package services.analizer;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FrequencyAnalyzer extends Analyzer {

    public static TreeMap<String,Long> analyzeCharacters(List<String> stringList) {
        TreeMap<String, Long> collect = analyzeByCharacter(stringList)
                .collect(
                        Collectors.toMap(
                                Object::toString,
                                c -> 1L,
                                (existing, replacement) -> existing + 1,
                                TreeMap::new
                        )
                );
        System.out.println(collect);
        return analyzeByCharacter(stringList)
                .collect(
                        Collectors.toMap(
                                Object::toString,
                                c -> 1L,
                                (existing, replacement) -> existing+1,
                                TreeMap::new
                        )
                );
    }
}
