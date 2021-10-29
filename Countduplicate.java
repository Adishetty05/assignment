package com.sonata1;

public class Countduplicate {
public static void main(String[] args) {
int arr[] = {1,2,5,5,6,7};
int max = 0;
int num = 0;
for(int i=0;i<arr.length;i++)
{
int counter=1;
for(int j=i+1;j<arr.length;j++)
{
if(arr[i]==arr[j])
{
counter++;
}
			}
if(max<counter)
{
max=counter;
num=arr[i];
}
}

System.out.println("The Max Repeated Number is : "+num);
}

}
