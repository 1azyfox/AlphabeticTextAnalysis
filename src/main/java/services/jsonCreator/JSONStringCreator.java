package services.jsonCreator;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.HashMap;

public class JSONStringCreator {
    public static String createJSONContent(HashMap<String,Long> hashMapOfCharacters) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        CompleteDataForJSON completeDataForJSOn = new CompleteDataForJSON();
        for (String s : hashMapOfCharacters.keySet()) {
            for (Long value : hashMapOfCharacters.values()) {
                DataAboutOneCharacter dataAboutOneCharacter = new DataAboutOneCharacter();
                completeDataForJSOn.setDataAboutOneCharacter(dataAboutOneCharacter);
                dataAboutOneCharacter.setCharacter(s);
                dataAboutOneCharacter.setFrequency(value);
            }
        }
        return objectMapper.writeValueAsString(completeDataForJSOn);
    }
}
