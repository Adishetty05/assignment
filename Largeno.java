package com.sonata1;

public class Largeno {
public static void main(String[] args) {
int arr[] = {1,5,7,27,28};
int max1 = arr[0];
int max2 = arr[1];
for(int i=2;i<arr.length;i++)
{
if(arr[i]>max1)
{
int temp = max1;
max1 = arr[i];
max2 = temp;
}
else if(arr[i]>max2 && arr[i]<=max1)
{
max2 = arr[i];
	}
}

System.out.println("First Largest No. is : "+max1);
System.out.println("Second Largest No. is : "+max2);

	}

}

