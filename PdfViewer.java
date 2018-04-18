import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

     static int designerPdfViewer(int[] h, String word) {
        int height =0;
		word.toLowerCase();
        for(int i=0; i < word.length(); i++){
            char character = word.charAt(i); 
            int index = (int) character-97; //adjust ascii value of it to the array
            if(h[index] > height){
                height = h[index];
            }
        }
        return (word.length()*height);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] h = new int[26];
        for(int h_i = 0; h_i < 26; h_i++){
            h[h_i] = in.nextInt();
        }
        String word = in.next();
        int result = designerPdfViewer(h, word);
        System.out.println(result);
        in.close();
    }
}
