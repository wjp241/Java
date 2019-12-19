package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

//Given an array of integers, 

//return indices of the two numbers such 
//that they add up to a specific target.
//You may assume that each input would have exactly one solution, 
//and you may not use the same element twice.

//Example:
//
//Given nums = [2, 7, 11, 15], target = 9,
//
//Because nums[0] + nums[1] = 2 + 7 = 9,
//return [0, 1].

class Solution {
	static int[] twoSum(int[] nums, int target) {
		
		int[] answer = new int[2];
		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] >= target) {
				continue;
			}

			for (int j = i + 1; j < nums.length; j++) {

				if (nums[j] >= target) {
					continue;
				}

				if ((nums[i] + nums[j]) == target) {
					return new int[]{i, j};
				}

			}
		}
		
		
	    throw new IllegalArgumentException("No two sum solution");
	}
}

class Solution2 {
	public int[] twoSum(int[] nums, int target) {
	    HashMap<Integer, Integer> map = new HashMap<>();
	    //map nums into map
	    // nums as keys and index as value
	    for (int i = 0; i < nums.length; i++) {
	        map.put(nums[i], i);
	    }
	    
	    
	    //
	    for (int i = 0; i < nums.length; i++) {
	    	//find the complement for each element, which together adds up to target
	    	
	        int complement = target - nums[i];
	        
	        //if map has the complement for that element,  
	        // and the complement has different index
	        if (map.containsKey(complement) && map.get(complement) != i) {
	            return new int[] { i, map.get(complement) };
	        }
	    }
	    throw new IllegalArgumentException("No two sum solution");
	}
	
	static int[] practice(int[] nums, int target){
		HashMap<Integer, Integer> map = new HashMap<>();
		//add all nums to map
		for(int i = 0; i < nums.length; i++) {
			map.put(nums[i], i);
		}
		
		for(int i = 0; i < nums.length; i ++) {
			int complement = target - nums[i];
			if(map.containsKey(complement)) {
				return new int[] {i, map.get(complement)};
			}
		}
		
		throw new IllegalArgumentException();
	}
	
	
}

class Solution3 {
	
	public int[] twoSum(int[] nums, int target) {
	    HashMap<Integer, Integer> map = new HashMap<>();
	    
	    //iterate nums array
	    for (int i = 0; i < nums.length; i++) {
	    	//find the complement which adds up to target 
	        int complement = target - nums[i];
	        
	        //see if map has the complement
	        if (map.containsKey(complement)) {
	        	//if so, return its value(index) and current i
	            return new int[] { map.get(complement), i };
	        }
	        
	        //add element as key and index as value.
	        map.put(nums[i], i);
	    }
	    throw new IllegalArgumentException("No two sum solution");
	}
	
	static int[] practice(int[] nums, int target){
		HashMap<Integer, Integer> map = new HashMap<>();

		//one-pass
		for(int i = 0; i < nums.length; i ++) {
			//find complement which adds up to target
			int complement = target - nums[i];
			if(map.containsKey(complement)) {
				return new int[] {map.get(complement), i};
			}
			
			map.put(nums[i], i);
		}
		
		throw new IllegalArgumentException();
	}
	
	
	
	
}

public class TwoSum {

	public static void main(String[] args) {
		int[] nums = { 2, 7, 11, 15 };
		int target = 17;
		int[] answer = Solution.twoSum(nums, target);
		
		System.out.println(Arrays.toString(Solution3.practice(nums, target)));
		
		

	}

}
