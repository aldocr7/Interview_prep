import java.*;
import java.io.*;
import java.util.*;

public class isort 
{
	public static void main(String args[])
	{
		isort s = new isort();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of elements in the array");
		
		int length=sc.nextInt();
		System.out.println("Enter the elements of the array");
		int a[]= new int[length];
		for(int i=0;i<length;i++)
		{
			a[i]= sc.nextInt();
		}
		
		s.insert(a,a.length);
	}
	void insert(int a[],int n)
	{
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{
					int temp;
					temp=a[i];
					a[i]=a[j];
				    a[j]=temp;
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
	}
}
				
				
				
				
				
				
				
				
				
				
