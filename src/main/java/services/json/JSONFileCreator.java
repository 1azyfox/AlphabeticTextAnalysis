package services.json;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class JSONFileCreator {

    private final ObjectMapper objectMapper = new ObjectMapper();

    private final String jsonFileName;

    public JSONFileCreator(String jsonFileName) {
        this.jsonFileName = jsonFileName;
    }

    public void create(Map<String, Long> treeMapOfCharacters) throws IOException {
        List<Map.Entry<String,Long>> sortedData = treeMapOfCharacters.entrySet().stream()
                .sorted((a,b) -> -a.getValue().compareTo(b.getValue()) )
                .collect(Collectors.toList());
        objectMapper.writeValue(new File(jsonFileName), sortedData);
    }
}
