package services.analizer;


import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Analyzer {

    public static Stream<String> analyzeByString(List<String> stringList) {
        return stringList.stream();
    }

    public static IntStream analyzeByCharacter(List<String> stringList) {
        return analyzeByString(stringList).flatMapToInt(String::chars);
    }
}
