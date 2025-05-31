package Assignment_6;

public class first_non_repeating_character {

	public static void main(String[] args) {
		String str = "Mountain";
		str = str.toLowerCase();
		
		int[] count = new int[256];
		for(int i=0;i<str.length();i++) {
			count[str.charAt(i)]++;
		}
		for(int i=0;i<str.length();i++) {
			if(count[str.charAt(i)]==1) {
				System.out.println(i);
				return;
			}
			
		}
		System.out.println("No repeating character");
		
	}

}
