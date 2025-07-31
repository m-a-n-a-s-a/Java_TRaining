package Day4;
 
import java.util.*;

public class Paragram {
public static void main(String[] args) {    // : The quick brown fox jumps over a lazy dog
	Scanner sc=new Scanner(System.in);
	
	System.out.print("Enter string: ");
	
	String str = sc.nextLine().toLowerCase();

	char[] found = new char[26];
    int count = 0;

    for (int i = 0; i < str.length(); i++) {
        char ch = str.charAt(i);
        if (ch >= 'a' && ch <= 'z') {
            int index = ch - 'a';
            if(found[index] == 0) {
            	found[index] = ch;
            	count++;
            }
        }
    }

    if (count == 26) {
        System.out.println("Pangram");
    } else {
    	System.out.println(" not Pangram");
    }
}
}
