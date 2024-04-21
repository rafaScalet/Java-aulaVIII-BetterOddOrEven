package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int bigger = 0;
        int smaller = 0; 
        int[] value = new int[10];
        Scanner in = new Scanner(System.in);

        System.out.println("Type 10 numbers: ");
        for(int indx = 0; indx < value.length; indx++){
            value[indx] = in.nextInt();
            if(value[indx] > value[bigger]){
                bigger = indx;
            }
            if(value[indx] < value[smaller]){
                smaller = indx;
            }
        }
        in.close();

        System.out.println("Bigger: " + value[bigger]);
        System.out.println("Smaller: " + value[smaller]);
    }
}
