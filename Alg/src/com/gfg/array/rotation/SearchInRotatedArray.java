package com.gfg.array.rotation;

public class SearchInRotatedArray {
	public static void main(String[] args) {
		int arr[] = {1, 2,3,4,5,6,7};
		int result = search(arr, 2); // Search for 6, o/p is 5(index)
		System.out.print(result+" ");
	}
	static int search(int[] nums, int target) {
		int start = 0;
		int end = nums.length - 1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (nums[mid] == target) return mid;
			if (nums[mid] > target) {
				if (nums[start] <= nums[mid] && nums[end] <= nums[start] && nums[start] > target)
					start = mid + 1;
				else end = mid - 1;
			}
			else {
				if (nums[mid] <= nums[end] && nums[end] <= nums[start] && nums[end] < target)
					end = mid - 1;
				else start = mid + 1;
			}
		}
		return -1;
	}
}


