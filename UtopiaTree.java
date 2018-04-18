import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int utopianTree(int n) {
        int hDouble = 1;
        int h = 1;
         for(int i=0; i<n; i++){
            hDouble++;
            h = (hDouble %2 ==0) ? (h*2) : (h+1);
        }
        return h;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int result = utopianTree(n);
            System.out.println(result);
        }
        in.close();
    }
}
