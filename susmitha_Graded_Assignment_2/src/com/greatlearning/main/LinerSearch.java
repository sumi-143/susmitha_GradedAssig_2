package com.greatlearning.main;

public class LinerSearch {
	
	public int search(double value,double[] arr) {
		
		for(int i=0; i<arr.length;i++)
		{
			if(arr[i] == value)
			return i;
		}
		return -1;

	}
}
