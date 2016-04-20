package com.dapper_apps;

import java.util.Scanner;

/**
 * Created by falven on 4/19/16.
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while(t-- > 0) {
            System.out.println(generateDecent(input.nextInt()));
        }
    }

    public static String generateDecent(final int n) {
        int fives = n;
        while (fives > 0 && fives % 3 != 0) {
            fives -= 5;
        }
        int threes = n - fives;
        if (fives < 0 || threes % 5 != 0) {
            return "-1";
        }
        StringBuilder output = new StringBuilder();
        while (fives-- > 0) {
            output.append(5);
        }
        while (threes-- > 0) {
            output.append(3);
        }
        return output.toString();
    }
}