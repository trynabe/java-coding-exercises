import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static int countChar(String str, char ch) {
        if (str == null || str.isEmpty()) {
            return 0;
        }

        int match = (str.charAt(0) == ch) ? 1 : 0;

        return match + countChar(str.substring(1), ch);
    }

    public static void main(String[] args) {
        System.out.println(countChar("banana", 'a'));
        System.out.println(countChar("hello", 'l'));
        System.out.println(countChar("Shuuuu", 'u'));
    }
}