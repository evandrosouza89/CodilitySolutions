package com.codility.evandro;

/*Write a function:

class Solution { public int solution(int[] A); }

that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.

For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.

Given A = [1, 2, 3], the function should return 4.

Given A = [−1, −3], the function should return 1.

Write an efficient algorithm for the following assumptions:

    - N is an integer within the range [1..100,000];
    - each element of array A is an integer within the range [−1,000,000..1,000,000].*/
public class MissingInteger {

    public int solution(int[] A) {

        int[] a = new int[A.length];

        for (int value : A) {
            if (value > 0 && value <= a.length) {
                a[value - 1] = value;
            }
        }

        for (int i = 0; i < A.length; i++) {
            if (a[i] == 0) {
                return i + 1;
            }
        }

        return A.length + 1;

    }

}
