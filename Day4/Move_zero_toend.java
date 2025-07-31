package Day4;

import java.util.Scanner;

public class Move_zero_toend {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array size");
		int n=sc.nextInt();
		System.out.println("enter the elements");
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		int temp=0;
		int pos=0;
		for(int i=0;i<n;i++) {
			if(arr[i]!=0) {
				temp=arr[pos];
				arr[pos]=arr[i];
				arr[i]=temp;
				pos++;
			}
			
		}
		for(int i=0;i<n;i++) {
		System.out.println(arr[i]);
		
		}
		sc.close();
	}

}
