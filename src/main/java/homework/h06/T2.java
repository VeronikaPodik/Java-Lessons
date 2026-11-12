package homework.h06;

// advanced
// https://leetcode.com/problems/valid-palindrome/
public class T2 {
  public boolean isPalindrome(String s) {
    String clean = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    String reversed = new StringBuilder(clean).reverse().toString();

    return clean.equals(reversed);
  }
}
