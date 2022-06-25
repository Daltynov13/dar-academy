package lesson1.additionalLeetCode;

public class ShuffleString {

  public static String restoreString(String s, int[] indices) {
    char[] str = new char[indices.length];
    for (int i = 0; i < indices.length; i++) {
      str[indices[i]] = s.charAt(i);
    }
    return new String(str);
  }

  public static void main(String[] args) {
    System.out.println(restoreString("codeleet", new int[]{4, 5, 6, 7, 0, 2, 1, 3}));
  }
}
