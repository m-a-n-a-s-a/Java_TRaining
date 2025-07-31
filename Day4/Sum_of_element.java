package Day4;

import java.util.Scanner;

public class Sum_of_element {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of an array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter the elements of an array");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<n;i++) {
			sum +=arr[i];
		}
		System.out.println(sum);
		}

	}


