import java.util.Scanner;
public class ArrayDublikatSilen {
    public static void main(String[] args) {                   //SEHVDIR
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        dublikat(arr);
    }
    public static void dublikat(int[] a) {
        int c=0;
        int k;
        int [] arr1 = new int[a.length];
        for (int i = 0; i < a.length; i++) {
                for(int j=i+1;j<a.length;j++){
                    if(a[i]==a[j]){
                        k=i;
                        c=c+1;
                    }
                }
                }
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]);
                }
            }
        }
