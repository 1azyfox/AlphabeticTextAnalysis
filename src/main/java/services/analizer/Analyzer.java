package services.analizer;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Analyzer {

    public static Stream<String> analyzeByString(List<String> stringList) {
        return stringList.stream();
    }

    public static Stream<Character> analyzeByCharacter(List<String> stringList) {
        return analyzeByString(stringList)
                .flatMap(s -> {
                    List<Character> list = new ArrayList();
                    for (int i=0;i<s.length();i++) {
                        list.add(s.charAt(i));
                    }
                    return list.stream();
                })
                .filter(c->c !=' ')
                .filter(character -> character != '-');
    }
}
