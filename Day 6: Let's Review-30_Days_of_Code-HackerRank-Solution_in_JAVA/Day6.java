Day 6: Let's Review

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int test = 0;

        int t = scan.nextInt();

        while(true) {

            String myString = scan.nextLine();
            char[] myCharArray = myString.toCharArray();

            for(int i = 0; i < myString.length(); i++){
            
                if(i % 2 == 0) {
                    System.out.print(myCharArray[i]); 
                }
            }
            
            if (test != 0) {
                System.out.print(" ");
            }
            

            for(int i = 0; i < myString.length(); i++){
            
                if(i % 2 != 0) {
                    System.out.print(myCharArray[i]); 
                }
            }
            if (test != 0) {
                System.out.println();
            }
            
            if(test == t){ 
                return; 
            }

            test += 1;

        }
    }
}
