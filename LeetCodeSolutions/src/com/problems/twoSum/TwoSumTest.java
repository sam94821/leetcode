package com.problems.twoSum;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.problems.twoSum.*;
//@RunWith(Parameterized.class)
class TwoSumTest {
	
	/*
	 * private int[] numArray; private int[] expectedResult; private int
	 * targetElement; private TwoSum tsObj;
	 * 
	 * //create a constructor public TwoSumTest(int[] numArray,int
	 * targetElement,int[] expectedResult) { super(); this.numArray = numArray;
	 * this.targetElement = targetElement; this.expectedResult = expectedResult; }
	 * 
	 * //create a static method
	 * 
	 * @Parameterized.Parameters public static Collection input() {
	 * 
	 * return Arrays.asList(new Integer[][][] {{ {2,7,11,15},9,{0,1}}
	 * 
	 * 
	 * }); }
	 */
	
	TwoSum tsObj = new TwoSum();
	
	@Test
	void testTwoSum() {
		
		assertArrayEquals(new int[] {0,1},tsObj.twoSum(new int[] {2,7,11,15},9));
	}
	@Test
	void testTwoSumOther() {
		
		assertArrayEquals(new int[] {0,2},tsObj.twoSum(new int[] {2,7,11,15},13));
	}
	@Test
	void testTwoSumNull() {
		
		assertArrayEquals(null,tsObj.twoSum(new int[] {2,7,11,15},119));
	}
	@Test
	void testTwoSumOneElement() {
	
		assertArrayEquals(null,tsObj.twoSum(new int[] {1},7));
	}

	
}
