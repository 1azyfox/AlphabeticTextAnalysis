package services.jsonCreator;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.util.HashMap;
import java.util.TreeMap;

public class JSONFileCreator {
    private String jsonFileName;

    public JSONFileCreator(String jsonFileName) {
        this.jsonFileName = jsonFileName;
    }

    public void create(TreeMap<String, Long> treeMapOfCharacters) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(jsonFileName));
        ObjectMapper objectMapper = new ObjectMapper();
        Treemap treemap = new Treemap();
        treemap.treeMapOfCharacters = treeMapOfCharacters;
        objectMapper.writeValue(new File(jsonFileName),treemap);
//        for (int i = 0; i < 10; i++) {
//            bw.write(objectMapper.writeValueAsString(treemap));
//        }

//        int i = treeMapOfCharacters.size() + 1;
//        while (i != 0) {
//            bw.write(JSONStringCreator.createJSONContent(treeMapOfCharacters));
//            i--;
//        }
    }

    class Treemap {
        public TreeMap<String, Long> treeMapOfCharacters;

        public TreeMap<String, Long> getTreeMapOfCharacters() {
            return treeMapOfCharacters;
        }

        public void setTreeMapOfCharacters(TreeMap<String, Long> treeMapOfCharacters) {
            this.treeMapOfCharacters = treeMapOfCharacters;
        }
    }
}
