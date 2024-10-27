import java.util.Scanner;
public class ArrayITersine {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }
        Ters(arr);
    }
    public static void Ters(int[] a){
        for(int i=a.length-1;i>=0;i--){
            System.out.print(a[i]);
        }
    }
}
