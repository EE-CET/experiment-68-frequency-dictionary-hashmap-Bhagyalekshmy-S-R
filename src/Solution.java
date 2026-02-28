import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine().trim();
        HashMap<String, Integer> map = new HashMap<>();

        if (!line.isEmpty()) {
            String[] words = line.split("\\s+");
            for (String word : words) {
                map.put(word, map.getOrDefault(word, 0) + 1);
            }
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        scanner.close();
    }
}