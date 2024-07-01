package src.set.BasicOperations.Words;

import java.util.HashSet;
import java.util.Set;

public class UniqueWordsSet {

    private Set<String> words = new HashSet<>();

    public void addWord(String word){
        words.add(word);
    }

    public void removeWord(String word){
        if (words.contains(word)){
            words.remove(word);
        }
    }

    public boolean checkWord(String word){
        return words.contains(word);
    }

    public void showWords(){
        System.out.println(words);
    }

}
