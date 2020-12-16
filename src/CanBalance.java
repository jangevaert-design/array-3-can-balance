import java.util.Arrays;

public class CanBalance {
  /*
  Given a non-empty array, return true if there is a place to split the array so that the sum of
  the numbers on one side is equal to the sum of the numbers on the other side.
   */

  public static void main(String[] args) {
    int[] nums = {1, 1, 1, 2, 1};
    System.out.printf("\nthe int array %s returns: " + canBalance(nums) + "\n", Arrays.toString(nums));
  }

  public static boolean canBalance(int[] nums) {
    int left = 0;

    for (int i = 0; i < nums.length; i++) {
      left += nums[i];
      int right = 0;
      for (int j = nums.length - 1; j > i; j--) {
        right += nums[j];
      }
      if (left == right) {
        return true;
      }
    }
    return false;
  }


}
