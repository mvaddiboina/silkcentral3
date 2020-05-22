package com.sample.junit;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import com.sample.calculation.Calculation;

public class JunitTests {
	
	@Test
	public void generateReport()
	{
		System.out.println("Executing pre-conditions");
	}
	@Test  
    public void testFindMax1(){  
        assertEquals(4,Calculation.findMax(new int[]{1,3,4,2}));  
        assertEquals(-1,Calculation.findMax(new int[]{-12,-1,-3,-4,-2}));  
    }  
	
	@Test  
    public void testFindMax2(){  
        assertEquals(4,Calculation.findMax(new int[]{1,3,4,2}));  
        assertEquals(0,Calculation.findMax(new int[]{-12,-1,-3,-4,-2}));  
    }  
}
