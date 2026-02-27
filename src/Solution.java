import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read a single line of text
        String line = scanner.nextLine();
        
        // Split the text into words
        String[] words = line.split(" ");
        
        // Create a HashMap
        HashMap<String, Integer> frequencyMap = new HashMap<>();
        
        // Count word frequencies
        for (String word : words) {
            if (frequencyMap.containsKey(word)) {
                frequencyMap.put(word, frequencyMap.get(word) + 1);
            } else {
                frequencyMap.put(word, 1);
            }
        }
        
        // Print word: count
        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        
        scanner.close();
    }
}
