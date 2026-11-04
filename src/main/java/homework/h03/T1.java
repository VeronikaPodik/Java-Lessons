package homework.h03;

import java.util.Arrays;

// base
// https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/
public class T1 {
    public double average(int[] salary) {
        Arrays.sort(salary);

        double sum = 0;

        for (int i = 1; i < salary.length -1; i++) {
            sum += salary[i];
        }

        return sum / (salary.length - 2);
    }
}
