import java.util.Scanner;
public class ArraydeKesisenElementler {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a1 = {1,3,6,2,7,10};
        int[] a2 = {1,2,3,4,5,7};
        KesisenEded(a1,a2);
    }
    public static void KesisenEded(int[] arr1, int[] arr2) {
        for(int i = 0; i<arr1.length; i++){
            for(int j = 0; j<arr2.length; j++){
                if(arr1[i] == arr2[j]){
                    System.out.print(arr1[i]+" ");
                }
            }
        }
    }
}
