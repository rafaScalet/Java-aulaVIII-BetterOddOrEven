package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] value = new int[10];
        int odd = 0, even = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("Type 10 numbers: ");
        for (int indx = 0; indx < value.length; indx++) {
            value[indx] = in.nextInt();
            if (value[indx] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        in.close();

        System.out.println("There are " + even + " even numbers");
        System.out.println("There are " + odd + " odd numbers");
    }
}
