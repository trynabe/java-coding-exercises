import java.util.*;

public class Main {
    public static void main(String[] args) {
        WordCounter wc = new WordCounter();
        wc.processText("hello world hello java set map java");

        System.out.println("Total unique words: " + wc.getUniqueCount() + " word(s)");
        System.out.println("Words found:");
        for (String word : wc.getUniqueWords()) {
            System.out.println(word);
        }
    }
}