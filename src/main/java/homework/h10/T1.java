package homework.h10;

// base
// https://leetcode.com/problems/find-the-k-th-character-in-string-game-i/
public class T1 {
  public char kthCharacter(int k) {
    StringBuilder word = new StringBuilder("a");

    while (word.length() < k) {
      int currentLen = word.length();
      for (int i = 0; i < currentLen; i++) {
        char c = word.charAt(i);
        char nextChar = (c == 'z') ? 'a' : (char) (c + 1);
        word.append(nextChar);
      }
    }
    return word.charAt(k - 1);
  }
}
