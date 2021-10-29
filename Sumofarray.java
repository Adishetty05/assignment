package com.sonata1;

public class Sumofarray {
public static void main(String[] arg) {
	//initialise array
	int arr[]=new int[]{1,2,3,4,5,6,7,8};
	int sum=0;
	//loop to calculate sum of array values
	for(int i=0;i<arr.length;i++) {
		sum=sum+arr[i];
	}
	System.out.println("sum of all the values in array is:"+sum);
}
}
