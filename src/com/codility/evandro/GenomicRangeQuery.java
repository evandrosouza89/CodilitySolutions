package com.codility.evandro;

public class GenomicRangeQuery {

    public int[] solution(String S, int[] P, int[] Q) {
        int[] answer = new int[P.length];
        int index = 0;

        char[] chars = S.toCharArray();

        int[] a = new int[chars.length + 1];
        int aPrefix = 0;

        int[] c = new int[chars.length + 1];
        int cPrefix = 0;

        int[] g = new int[chars.length + 1];
        int gPrefix = 0;

        for (int i = 0; i < chars.length; i++) {
            if ((int) chars[i] == 65) {
                aPrefix++;
            } else if ((int) chars[i] == 67) {
                cPrefix++;
            } else if ((int) chars[i] == 71) {
                gPrefix++;
            }
            a[i + 1] = aPrefix;
            c[i + 1] = cPrefix;
            g[i + 1] = gPrefix;
        }

        int answerIndex = 0;

        for (int i = 0; i < P.length; i++) {
            if (a[Q[i] + 1] - a[P[i]] > 0) {
                answer[answerIndex++] = 1;
            } else if (c[Q[i] + 1] - c[P[i]] > 0) {
                answer[answerIndex++] = 2;
            } else if (g[Q[i] + 1] - g[P[i]] > 0) {
                answer[answerIndex++] = 3;
            } else {
                answer[answerIndex++] = 4;
            }
        }

        return answer;
    }
}
