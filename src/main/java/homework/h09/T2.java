package homework.h09;

// base
// https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/

import java.util.ArrayList;
import java.util.List;

public class T2 {
  public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
    int maxCandies = 0;
    for (int candy : candies) {
      if (candy > maxCandies) {
        maxCandies = candy;
      }
    }

    List<Boolean> result = new ArrayList<>();
    for (int candy : candies) {
      result.add(candy + extraCandies >= maxCandies);
    }

    return result;
  }
}
