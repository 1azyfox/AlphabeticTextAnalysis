package services.jsonCreator;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.HashMap;
import java.util.TreeMap;

public class JSONStringCreator {
    public static String createJSONContent(TreeMap<String,Long> treeMapOfCharacters) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        CompleteDataForJSON completeDataForJSOn = new CompleteDataForJSON();
        for (String s : treeMapOfCharacters.keySet()) {
            DataAboutOneCharacter dataAboutOneCharacter = new DataAboutOneCharacter();
//            completeDataForJSOn.add(dataAboutOneCharacter);
            dataAboutOneCharacter.setCharacter(s);
            long value = treeMapOfCharacters.get(s);
            dataAboutOneCharacter.setFrequency(value);
        }
        return objectMapper.writeValueAsString(completeDataForJSOn);
    }
}
