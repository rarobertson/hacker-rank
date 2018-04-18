import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.*;

public class Solution {
    
	//TODO: check parseint
   static int reversible(int i){
        StringBuilder sba = new StringBuilder(String.valueOf(i));
        return Integer.parseInt(sba.reverse().toString());
    }

    static int beautifulDays(int i, int j, int k) {
        int bd=0;
        for (int l = i; l <= j; l++){
            int diff = Math.abs(l - reversible(l)); // get the diff
            if(diff % k == 0){ // check if it is divisible
                bd++;
            }
        }
        return bd;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        int j = in.nextInt();
        int k = in.nextInt();
        int result = beautifulDays(i, j, k);
        System.out.println(result);
        in.close();
    }
}
