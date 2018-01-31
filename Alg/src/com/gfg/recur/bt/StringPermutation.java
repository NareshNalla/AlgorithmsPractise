package com.gfg.recur.bt;

/*
 * O(n*n!) Note that there are n! permutations and it requires O(n) time to print a a permutation.
*/
public class StringPermutation {
	public static void main(String[] args) {
		String str = "ABC";
		int n = str.length();
		permute(str, 0, n-1);
	}

	private static void permute(String str, int l, int r) {
		if( l == r){
			System.out.println(str);
		}else {
			for(int i=l; i <= r; i++){
				str = swap(str, l, i);
				permute(str, l+1, r);
				str = swap(str, l, i);
			}
		}
	}

	private static String swap(String str, int i, int j) {
		char temp;
		char[] charArray =  str.toCharArray();
		temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);
	}

}
