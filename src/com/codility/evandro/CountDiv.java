package com.codility.evandro;

/* Write a function:

class Solution { public int solution(int A, int B, int K); }

that, given three integers A, B and K, returns the number of integers within the range [A..B] that are divisible by K, i.e.:

{ i : A ≤ i ≤ B, i mod K = 0 }

For example, for A = 6, B = 11 and K = 2, your function should return 3, because there are three numbers divisible by 2 within the range [6..11], namely 6, 8 and 10.

Write an efficient algorithm for the following assumptions:

    - A and B are integers within the range [0..2,000,000,000];
    - K is an integer within the range [1..2,000,000,000];
    - A ≤ B. */
public class CountDiv {

    public int solution(int A, int B, int K) {

        if (K == 1) {
            return B - A + 1;
        }

        if (B == 0) {
            return 1;
        }

        if (K > B) {
            return 0;
        }

        if (K == B) {
            if (A == 0) {
                return 2;
            } else {
                return 1;
            }
        }

        if (A == B && K < B) {
            return B % K == 0 ? 1 : 0;
        }

        if (A < K) {
            if (A == 0) {
                return 1 + B / K;
            }
            return B / K;
        } else {
            if (A % K == 0 || B % K == 0) {
                return 1 + (B - A) / K;
            } else {
                return (B - A) / K;
            }
        }

    }

}
