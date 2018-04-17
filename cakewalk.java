import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
	
public class CakeWalk {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Integer [] calories = new Integer[n];
        for (int i = 0; i < n; i++){
            calories[i] = scan.nextInt();
        }
        scan.close();
        System.out.println(minimumWalk(calories));
    }
    
    private static long minimumWalk(Integer [] calories) {
        Arrays.sort(calories, Collections.reverseOrder());
        long multiplier = 1;
        long miles = 0;
        for (int j = 0; j < calories.length; j++) {
            miles += calories[j] * multiplier;
            multiplier *= 2;
        }
        return miles;
    }
}