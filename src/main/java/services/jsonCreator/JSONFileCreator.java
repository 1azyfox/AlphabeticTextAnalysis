package services.jsonCreator;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class JSONFileCreator {
    private String jsonFileName;

    public JSONFileCreator(String jsonFileName) {
        this.jsonFileName = jsonFileName;
    }

    public void create(Map<String, Long> treeMapOfCharacters) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        List<Map.Entry<String,Long>> sortedData = treeMapOfCharacters.entrySet().stream()
                .sorted((a,b) -> -a.getValue().compareTo(b.getValue()) )
                .collect(Collectors.toList());
        objectMapper.writeValue(new File(jsonFileName),sortedData);
    }
}
