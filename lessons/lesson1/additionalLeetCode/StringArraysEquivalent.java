package lesson1.additionalLeetCode;

public class StringArraysEquivalent {

  public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
    StringBuilder result1 = new StringBuilder();
    StringBuilder result2 = new StringBuilder();
    for (int i = 0; i < word1.length; i++) {
      result1.append(word1[i]);
    }
    for (int i = 0; i < word2.length; i++) {
      result2.append(word2[i]);
    }
    return result1.toString().equalsIgnoreCase(result2.toString());
  }

  public static void main(String[] args) {
    System.out.println(arrayStringsAreEqual(new String[]{"ab", "c"}, new String[]{"a", "bc"}));
  }
}
