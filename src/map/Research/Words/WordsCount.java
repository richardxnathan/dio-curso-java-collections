package src.map.Research.Words;

import java.util.HashMap;
import java.util.Map;

public class WordsCount {

    private Map<String, Integer> words = new HashMap<>();

    public void addWord(String word, Integer count){
        words.put(word, count);
    }

    public void removeWord(String word){
        words.remove(word);
    }

    public int calculateTotalWords(){
        int total = 0;

        for (Integer i : words.values()) {
            total += i;
        }

        return total;
    }

    public String findMostFrequentWord(){
        String word = null;
        Integer count = Integer.MIN_VALUE;

        for (Map.Entry<String, Integer> entry : words.entrySet()) {
            if (entry.getValue() > count){
                word = entry.getKey();
                count = entry.getValue();
            }
        }

        return word;
    }

}
