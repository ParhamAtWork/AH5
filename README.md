# Algo Hour 5

## Objectives

Write a function, mostFrequentChar, that takes in a string as an argument. 
The function should return the most frequent character of the string. If there are ties, 
the character that appears earlier in the string. You can assume that the input string is non-empty.

## Test Cases

```java
System.out.println(Source.mostFrequentChar("bookeeper")); // -> 'e'
```

```java
System.out.println(Source.mostFrequentChar("david")); // -> 'd'
```

```java
System.out.println(Source.mostFrequentChar("mississippi")); // -> 'i'
```

```java
System.out.println(Source.mostFrequentChar("eleventennine")); // -> 'e'
```

```java
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
```
