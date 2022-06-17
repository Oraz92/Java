import java.lang.reflect.Array;
import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {1, 7, 9, 14, 5};
        System.out.println(Arrays.toString(twoSum(nums, 6)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] indices = new int[2];
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i == j) {
                    continue;
                } else {
                    if (nums[i] + nums[j] == target) {
                        indices[0] = j;
                        indices[1] = i;
                        break;
                    }
                }
            }
        }
        return indices;
    }
}
