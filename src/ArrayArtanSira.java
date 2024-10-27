import java.util.Arrays;
import java.util.Scanner;
public class ArrayArtanSira {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        artansira(arr);
    }
    public static void artansira(int[] a){
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
        }
        }
