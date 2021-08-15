package services.jsonCreator;

import java.util.Collection;

public class CompleteDataForJSON {
    private Collection<DataAboutOneCharacter> dataAboutOneCharacter;

//    public DataAboutOneCharacter getDataAboutOneCharacter() {
//        return dataAboutOneCharacter;
//    }
//
//    public void add(DataAboutOneCharacter dataAboutOneCharacter) {
//        this.dataAboutOneCharacter = dataAboutOneCharacter;
//    }
}

class DataAboutOneCharacter {
    private String character;
    private long frequency;

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    public long getFrequency() {
        return frequency;
    }

    public void setFrequency(long frequency) {
        this.frequency = frequency;
    }
}
