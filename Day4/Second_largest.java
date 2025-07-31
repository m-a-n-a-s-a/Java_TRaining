package Day4;

import java.util.Scanner;

public class Second_largest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of an array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter the elements of an array");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		int first=arr[0];
		int second=arr[1];
		for(int i=0;i<n;i++) {
		if(first<arr[i]) {
			second=first;
			first=arr[i];
		}
		}
		System.out.println(second);

	}

}
