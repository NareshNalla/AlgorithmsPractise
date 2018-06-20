package com.gfg.array.interview;

public class DuplicatesFind {

	int[] printRepeating(int arr[], int size) {
		int tempA[] = new int[size];
		int i, j, k, l;
		System.out.println("Repeated Elements are :");
		for (i = 0; i < size; i++) {
			for (j = i + 1; j < size; j++) {
				if (arr[i] == arr[j]) {
					for (k = 0; k < size; i++) {
						for (l = k + 1; l < size; l++) {
							if (tempA[k] == tempA[l]) {
								System.out.print(arr[k] + " ");
								tempA[k] = arr[k];
							}
						}

					}
				}
			}
		}
		return tempA;
	}

	public static void main(String[] args) {
		DuplicatesFind repeat = new DuplicatesFind();
		int arr[] = { 4, 2, 4, 4, 5, 2, 3, 1 };
		int arr_size = arr.length;
		// int [] result=repeat.printRepeating(arr, arr_size);
		System.out.println();
		findDuplicate(arr);
		/*
		 * for(int i:result){ if(i !=0 ) System.out.print(i+" "); }
		 */
	}

	public static void findDuplicate(int[] nums)

	{

		if (nums.length == 0 || nums.length == 1)

		{

		}
		for (int i =0;i<nums.length;i++) {
			int slow = nums[i];

			int fast = nums[nums[i]];

			while (slow != fast)

			{

				slow = nums[slow];

				fast = nums[nums[fast]];

			}

			fast = 0;

			while (slow != fast)

			{

				slow = nums[slow];

				fast = nums[fast];

			}
			System.out.print(fast + " ");
		}

	}
}
