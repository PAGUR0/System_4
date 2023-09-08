package com.company;

import java.util.Scanner;

import static java.lang.Math.abs;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        System.out.println(multiply(x, y));
        System.out.println(multiply_2(x, y));
    }

    // побитовый сдвиг
    public static int multiply(int x, int y){
        int c = 0;
        if(x < 0 && y < 0){
            c = multiply(abs(x), abs(y));
        }
        if(y < 0){
            c = multiply(y, x);
        }
        else{
            while (y != 0){
                if ((y & 1) != 0) {
                    c += x;
                }
                y >>= 1;
                x <<= 1;
            }
        }
        return c;
        }
    // метод сложения
    public static int multiply_2(int a, int b) {
        int c = 0;

        for (int i = 0; i < abs(b); i++) {
            c += abs(a);
        }

        if ((a < 0 && b > 0) || (a > 0 && b < 0)) {
            c = -c;
        }

        return c;
    }}