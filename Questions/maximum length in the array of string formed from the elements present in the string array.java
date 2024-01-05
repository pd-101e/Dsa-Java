import java.util.*;

public class Main {
    public static String longest(String[] wordlist) {
        Arrays.sort(wordlist, (a, b) -> b.length() - a.length());
        Set<String> wordSet = new HashSet<>(Arrays.asList(wordlist));
        for (String word : wordlist) {
            wordSet.remove(word);
            if (wordbreak(word, wordSet)) {
                return word;
            }
            wordSet.add(word);
        }
        return "null";
    }

    public static boolean wordbreak(String word, Set<String> wordSet) {
        if (word.isEmpty()) {
            return true;
        }
        for (int i = 1; i <= word.length(); i++) {
            if (wordSet.contains(word.substring(0, i)) && wordbreak(word.substring(i), wordSet)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        String[] strarr = {"basket", "basket", "big", "bigtennisball", "tennis", "ball", "big"};
        System.out.println(longest(strarr)); // Output: bigtennisball
    }
}
