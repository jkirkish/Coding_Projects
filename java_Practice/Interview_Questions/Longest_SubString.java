

import java.util.HashSet;

public class Longest_SubString {
    
    public static int findLongestSubString(String s){
        if(s == null || s.length() == 0){
            return 0;
        }
     
        HashSet<Character> set = new HashSet<>();
        int maxLength = 0;
        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            // Slide the left pointer until there are no duplicates
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }

            // Add the current character to the set
            set.add(s.charAt(right));

            // Update the maximum length
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String input = "abcabcbb";
        System.out.println("Input: " + input);
        int length = findLongestSubString(input);
        System.out.println("Length of Longest Substring Without Repeating Characters: " + length);
    }
}

/*
 * Time Complexity
The time complexity of the code is O(n), where 
𝑛
n is the length of the input string.

The right pointer iterates through the string once from start to end, which is 
𝑂
(
𝑛
)
O(n).
The left pointer only moves forward when duplicates are found, but each character is added and removed from the HashSet at most once. Therefore, the total number of operations for the left pointer is also 
𝑂
(
𝑛
)
O(n).
 */