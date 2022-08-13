package com.ironhack;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
       //exercitio 1//



        //exercise 2//
        int[] numbers = {1, 2, 3, 4, 5};
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }

            //cuatro//
            int[] pares = {1, 2, 3, 4, 5, 6, 7, 8, 9};
            for (int j = 0; j < pares.length; j++) {
                if (pares[j] % 2 == 0) {
                    System.out.println(pares[j]);
                }
            }

        //tres//

        int num = 5;
            int p = 0;
            for(int x = 1 ; x <= num; x++){
                p = x + p;
                System.out.println(p);
            }


        }
    }

