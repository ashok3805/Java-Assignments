package Assignment_15;

import java.util.*;

public class Letter_Combination {

    public static List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();

        if (digits == null || digits.length() == 0)
            return result;
        String[] mapping = {
            "",     
            "",     
            "abc",  
            "def",  
            "ghi",  
            "jkl",  
            "mno",  
            "pqrs", 
            "tuv",  
            "wxyz"  
        };
        backtrack(digits, 0, new StringBuilder(), result, mapping);
        return result;
    }
    private static void backtrack(String digits, int index, StringBuilder current, List<String> result, String[] mapping) {
        if (index == digits.length()) {
            result.add(current.toString());
            return;
        }
        String letters = mapping[digits.charAt(index) - '0'];
        for (char c : letters.toCharArray()) {
            current.append(c);
            backtrack(digits, index + 1, current, result, mapping);
            current.deleteCharAt(current.length() - 1); 
        }
    }
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        String digits = sc.nextLine();
        List<String> combinations = letterCombinations(digits);

        System.out.println(combinations);
    }
}
