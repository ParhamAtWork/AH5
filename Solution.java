import java.util.HashMap;
import java.util.Map;

public class Solution {

  public static char mostFrequentChar(String s) {
    if (s == null || s.isEmpty()) {
      throw new IllegalArgumentException("Input string is empty or null.");
    }

    Map<Character, Integer> charCount = new HashMap<>();
    char mostFrequent = s.charAt(0);
    int maxCount = 1;

    for (char c : s.toCharArray()) {
      int count = charCount.getOrDefault(c, 0) + 1;
      charCount.put(c, count);

      if (count > maxCount || (count == maxCount && s.indexOf(c) < s.indexOf(mostFrequent))) {
        maxCount = count;
        mostFrequent = c;
      }
    }

    return mostFrequent;
  }

  public static void main(String[] args) {
    System.out.println(Solution.mostFrequentChar("bookeeper")); // -> 'e'
  }

}
