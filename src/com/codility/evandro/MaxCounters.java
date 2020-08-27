package com.codility.evandro;

public class MaxCounters {

    public int[] solution(int N, int[] A) {

        int[] answer = new int[N];

        int max = 0;

        int min = 0;

        for (int item : A) {

            if (item > N) {
                min = max;
            } else {

                int index = item - 1;
                int value = answer[index];

                if (value < min) {
                    answer[index] = min;
                    value = min;
                }

                answer[index] = ++value;

                if (value > max) {
                    max = value;
                }
            }

        }

        for (int i = 0; i < answer.length; i++) {
            if (answer[i] < min) {
                answer[i] = min;
            }
        }

        return answer;

    }

}
