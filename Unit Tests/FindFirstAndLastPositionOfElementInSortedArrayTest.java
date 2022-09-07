package leetcode.LeetCode;

import static org.junit.Assert.*;

import org.junit.Test;

public class FindFirstAndLastPositionOfElementInSortedArrayTest {

	int[] inp1 = new int[] {5,7,7,8,8,10};
	int[] inp2 = new int[] {3};
	int[] inp3 = new int[] {8,8,8,8,8,8,8,8};
	int[] inp4 = new int[] {8,8,8,8,8,8,6,8};
	int[] inp5 = new int[0];
	int[] inp6 = new int[] {1,3};
	int[] inp7 = new int[] {1,2,3};
	int[] inp8 = new int[] {1,2,2,3,4,4,4};
	
	@Test
	public void test() {
		int[] ans1 = FindFirstAndLastPositionOfElementInSortedArray.searchRange(inp1, 8);
		int[] ans2 = FindFirstAndLastPositionOfElementInSortedArray.searchRange(inp2, 3);
		int[] ans3 = FindFirstAndLastPositionOfElementInSortedArray.searchRange(inp2, 1);
		int[] ans4 = FindFirstAndLastPositionOfElementInSortedArray.searchRange(inp3, 8);
		int[] ans5 = FindFirstAndLastPositionOfElementInSortedArray.searchRange(inp4, 8);
		int[] ans6 = FindFirstAndLastPositionOfElementInSortedArray.searchRange(inp5, 8);
		int[] ans7 = FindFirstAndLastPositionOfElementInSortedArray.searchRange(inp6, 1);
		int[] ans8 = FindFirstAndLastPositionOfElementInSortedArray.searchRange(inp7, 3);
		int[] ans9 = FindFirstAndLastPositionOfElementInSortedArray.searchRange(inp8, 4);
		//assertEquals(ans1 ,FindFirstAndLastPositionOfElementInSortedArray.searchRange(inp1, 8));
		for(int i = 0; i < ans1.length; i++) {
			System.out.print(ans1[i]);
		}
		System.out.println();
		for(int i = 0; i < ans2.length; i++) {
			System.out.print(ans2[i]);
		}
		System.out.println();
		for(int i = 0; i < ans3.length; i++) {
			System.out.print(ans3[i]);
		}
		System.out.println();
		for(int i = 0; i < ans4.length; i++) {
			System.out.print(ans4[i]);
		}
		System.out.println();
		for(int i = 0; i < ans5.length; i++) {
			System.out.print(ans5[i]);
		}
		System.out.println();
		for(int i = 0; i < ans6.length; i++) {
			System.out.print(ans6[i]);
		}
		System.out.println();
		for(int i = 0; i < ans7.length; i++) {
			System.out.print(ans7[i]);
		}
		System.out.println();
		for(int i = 0; i < ans8.length; i++) {
			System.out.print(ans8[i]);
		}
		System.out.println();
		for(int i = 0; i < ans9.length; i++) {
			System.out.print(ans9[i]);
		}
	}

}
