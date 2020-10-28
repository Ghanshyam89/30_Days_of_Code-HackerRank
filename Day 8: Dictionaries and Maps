Day 8: Dictionaries and Maps


import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        Map<String,Integer> phoneBook = new HashMap<String,Integer>();
        String name;
        int phone;

        for(int i = 0; i < n; i++){
            name = in.next();
            phone = in.nextInt();

            phoneBook.put(name,phone);
        }
        while(in.hasNext()){
            String s = in.next();

            if (phoneBook.get(s) != null)
                System.out.println(s+"="+phoneBook.get(s));
            else
                System.out.println("Not found");
        }
        in.close();
    }
}
