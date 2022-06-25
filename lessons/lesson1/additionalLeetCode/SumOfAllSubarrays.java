package lesson1.additionalLeetCode;

public class SumOfAllSubarrays {

  public static int sumOddLengthSubarrays(int[] arr) {
    int result = 0;

    for (int subarraySize = 1; subarraySize <= arr.length; subarraySize += 2) {
      int step = 0;
      for (; ; ) {
        int[] subarray = new int[subarraySize];

        for (int j = 0; j < subarray.length; j++) {
          result += arr[j + step];
        }
        step++;

        if ((step + subarraySize - 1) >= arr.length) {
          break;
        }
      }
      if (subarraySize >= arr.length) {
        break;
      }
    }
    return result;
  }

  public static void main(String[] args) {
    System.out.println(sumOddLengthSubarrays(new int[]{1, 4, 2, 5, 3}));
  }
}
