package com.sonata1;

public class Duplicate {

public static void main(String[] args) {
int arr[] = {1,2,5,5,6,7,7};
System.out.println("Duplicate Elements :");
for(int i=0;i<arr.length;i++)
{
for(int j=i+1;j<arr.length;j++)
{
if(arr[i]==arr[j])
{
System.out.println(arr[j]);
}
}
}
}
}
