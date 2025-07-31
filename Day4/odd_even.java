package Day4;

import java.util.Scanner;

public class odd_even {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of an array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter the elements of an array");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int odd=0;
		int even=0;
		for(int i=0;i<n;i++) {
			if(arr[i]%2==0)
			{
				even+=arr[i];
			}
			else {
				odd+=arr[i];
			}
		
		}
		
		System.out.println(even);
		System.out.println(odd);
	}

}
