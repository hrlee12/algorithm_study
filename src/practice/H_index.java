package practice;

import java.util.*;
import java.io.*;


public class H_index {
	public static void main(String[] args) {
		System.out.println(Solution.solution(new int[]{3, 0, 6, 1, 5}));
	}
}

class Solution{
	public static int solution(int[] citations) {

		Arrays.sort(citations);

		for (int idx = citations.length - 1; idx >= 0; idx--) {
			if (citations[idx] > citations.length) continue;

			if(citations.length - idx >= citations[idx]) return citations[idx];
		}

		return 0;
	}
}
