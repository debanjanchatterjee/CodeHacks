/*
You will be given an array of integers and a target value. Determine the number of pairs of array elements that have a difference equal to a target value.

For example, given an array of [1, 2, 3, 4] and a target value of 1, we have three values meeting the condition: , , and .

Function Description

Complete the pairs function below. It must return an integer representing the number of element pairs having the required difference.

pairs has the following parameter(s):

k: an integer, the target difference
arr: an array of integers
Input Format

The first line contains two space-separated integers  and , the size of  and the target value. 
The second line contains  space-separated integers of the array .

Constraints

each integer  will be unique
Output Format

An integer representing the number of pairs of integers whose difference is .
*/

import java.util.*;
class Pairs
{


	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of array elements:");
		int n=sc.nextInt();
		System.out.println("Enter target value:");
		int x=sc.nextInt();
		int i,j,m;
		int d;
		int count=0;
		int a[]=new int[n];
		for(i=0;i<n;i++)
			a[i]=sc.nextInt();
		for(i=0;i<n;i++)
		{
			m=a[i];
			for(j=i+1;j<n;j++)
			{
				d=(int)Math.abs(a[j]-m);
				if(d==x)
					count++;
			}
		}
		System.out.println(count);
	}


}