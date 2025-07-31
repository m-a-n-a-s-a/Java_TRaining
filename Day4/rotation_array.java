package Day4;

import java.util.Arrays;

public class rotation_array {

	public static void main(String[] args) {
		
		        int[] arr = {1, 2, 3, 4, 5};
		        int k = 2; 
		        int n = arr.length;

		        int[] result = new int[n];

		        for (int i = 0; i < n; i++) {
		            result[(i + k) % n] = arr[i];
		        }

		        System.out.println("Rotated Array: " + Arrays.toString(result));
		    }
		}

	
