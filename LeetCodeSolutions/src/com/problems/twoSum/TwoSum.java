
package com.problems.twoSum;

import java.util.HashMap;
import java.util.Map;
/**
 * FileName : TwoSum.java
 * -----------------------------------------------------------------
 * Problem Statement:	Given an array of integers nums and an
 * 						integer target, return indices of the 
 * 						two numbers such that they add up to
 * 						target.You may assume that each input 
 * 						would have exactly one solution, 
 * 						and you may not use the same element twice.
 * 						You can return the answer in any order.
 * ---------------------------------------------------------------
 * @author Sam
 * ----------------------------------------------------------------
 *
 */
public class TwoSum {
	
	public int[] twoSum(int[] nums, int target) {
		
			//creating HashMap
			Map<Integer, Integer> map = new HashMap<>();
			/**
			 * Iterate over the given array and
			 * add each element as :
			 * arrayElement -> Key 
			 * and 
			 * corresponding index-> value; to a HashMap.
			 * While doing so, check whether the complement 
			 * of current array element is already present 
			 * as a key in the HashMap.  
			 * If yes, return a new array containing,the value of the 
			 * key i.e. the index of the element present in the HashMap along
			 * with current index(the index of the arrayElement). 
			 * 
			 * In case, there is no element return null.
			 */
			for (int i = 0; i < nums.length; i++) {
				
				int complement = target - nums[i];
				
				if (map.containsKey(complement)) {
					
					return new int[] { map.get(complement), i };
			}
			map.put(nums[i], i);
		}
			// In case there is no solution, we'll just return null
    return null;
}
}
