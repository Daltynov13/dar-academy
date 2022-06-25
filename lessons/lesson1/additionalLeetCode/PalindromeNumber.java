package lesson1.additionalLeetCode;

public class PalindromeNumber {

  public static boolean isPalindrome(int x) {
    if (x < 0) {
      return false;
    }

    int revers = 0, remainder, original = x;
    while (x != 0) {
      remainder = x % 10;
      revers = revers * 10 + remainder;
      x /= 10;
    }
    return original == revers;
  }

  public static void main(String[] args) {
    System.out.println(isPalindrome(121));
  }
}
