public class Solution {
    public static int search(int nums[], int target) {
        int s = 0, e = nums.length - 1;
        while (s <= e) {
            int mid = (s + e) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 120};
        int target = 100;
        int res = search(nums, target);
        if (res != -1) {
            System.out.println("Element found at index = " + res);
        } else {
            System.out.println("Element not found");
        }
    }
}
