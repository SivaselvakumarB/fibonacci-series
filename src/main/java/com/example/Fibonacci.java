
package com.example;

import java.util.Scanner;

public class Fibonacci {

    public static long[] generate(int n) {
        if (n < 0 || n > 92) {
            throw new IllegalArgumentException("Enter n between 0 and 92");
        }

        long[] series = new long[n];

        if (n > 0) series[0] = 0;
        if (n > 1) series[1] = 1;

        for (int i = 2; i < n; i++) {
            series[i] = series[i - 1] + series[i - 2];
        }

        return series;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();

        System.out.println("Fibonacci Series:");

        for (long num : generate(n)) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
