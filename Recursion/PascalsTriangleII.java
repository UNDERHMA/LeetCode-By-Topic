package leetcode.LeetCode.Recursion;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleII {

	public List<Integer> getRow(int rowIndex) {
		List<Integer> result = new ArrayList<>();
		if(rowIndex < 0) return result;
		result.add(1);
		return getRow(result,rowIndex);
    }
	
	public List<Integer> getRow(List<Integer> rowAbove, int rowIndex) {
		if(rowAbove.size() == rowIndex+1) return rowAbove;
		List<Integer> result = new ArrayList<>();
		int newRowLength = rowAbove.size();
		while(result.size() <= newRowLength) {
			if(result.size() == 0) result.add(1);
			else if(result.size() == newRowLength) result.add(1);
			else result.add(rowAbove.get(result.size()-1) + rowAbove.get(result.size()));
		}
		result = getRow(result,rowIndex);
		return result;
	}
}
	
