package Assignment_8;
import java.util.Scanner;
public class Infinite_string {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		long n = sc.nextInt();
		long count=0;
		for( int c : str.toCharArray()) {
			if(c=='a')
				count++;
		}
		long fullrepeats = n/str.length();
		long remainder = n%str.length();
		long total = fullrepeats*count;
		for(int i=0;i<remainder;i++) {
			if(str.charAt(i)=='a')
				total++;
		}
		System.out.println(total);

	}

}
