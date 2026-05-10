import java.util.*;

public class WordCounter {
    private Set<String> uniqueWords;
    
    public WordCounter() {
        this.uniqueWords = new HashSet<>();
    }
    
    public void processText(String text) {
        String[] words = text.split(" ");
        for (String word : words) {
            uniqueWords.add(word);
        }
    }

    public int getUniqueCount() {
        return uniqueWords.size();
    }

    public Set<String> getUniqueWords() {
        return uniqueWords;
    }
}