import java.util.Scanner;

public class Correctness {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int s = scan.nextInt();
        int[] array = new int[s];
        for (int i = 0; i < s; i++) {
            array[i] = scan.nextInt(); 
        }
        scan.close();
        insertionSort(array);
    }
    
    public static void insertionSort(int[] vec) {
        for (int i = 1; i < vec.length; i++) {
            int value = vec[i];
            int j = i;
			j--;
            while (j >= 0 && vec[j] > value) {
                vec[j + 1] = vec[j];
                j = j - 1;
            }
            vec[j + 1] = value;
        }
        showResult(vec);
    }

    private static void showResult(int[] array) {
        for (int num: array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}