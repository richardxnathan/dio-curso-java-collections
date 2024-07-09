package src.map.BasicOperations.Dictionary;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {

    private Map<String, String> dictionary = new HashMap<>();

    public void addWord(String name, String definition){
        dictionary.put(name, definition);
    }

    public void removeWord(String name){
        dictionary.remove(name);
    }

    public void showDictionary(){
        System.out.println(dictionary);
    }

    public String findWordByName(String name){
        String definition = dictionary.get(name);

        return definition;
    }

}
