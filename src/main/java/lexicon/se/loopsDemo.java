package lexicon.se;

import java.util.Scanner;

public class loopsDemo {
    // define a main method
    // psvm +tap
    public static void main(String[] args) {

      /* for(int i = 0; i <= 10 ; i++ ){
           if(i % 2 != 0){
               System.out.println(i);
           }


       }*/
        /*
        int row = 4;
        for (int i = 0; i< row ;i++){
            for (int j =0; j<= i;j++){
                System.out.println(" *");

        }
              System.out.println(); */


    /*   int [] numbers ={1,2,23,5,71,9,10};
        for( int number : numbers) {
            System.out.println(number);
            if (number > 23){
               System.out.println(number>10);
            }
        }*/
        for (int i = 1; i <= 10; i++) {
            if(i== 7){
                continue;
            }
            if (i % 2 != 0) {
                System.out.println(i);
            }

        }
    }
}