import java.util.Arrays;

public class Task1BenarySearch {
    public int[] twoSum(int[] nums, int k) {
        for (int i = 0; i < nums.length; i++) {
            int numberToFind = k - nums[i];
            int left = i + 1;
            int right = nums.length - 1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (nums[mid] == numberToFind) {
                    return new int[] { nums[i], nums[mid] };

                }
                if (numberToFind < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }
        return new int[0];
    }

    public static void main(String[] args) {
        Task1BenarySearch task = new Task1BenarySearch();
        int[] result = task.twoSum(new int[] { -4, -3, 2, 4, 8, 10, 15 }, 5);
        System.out.println(Arrays.toString(result));
    }
}