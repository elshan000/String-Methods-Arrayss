import java.util.Scanner;
public class ArraydeTekCut {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        TekCut(arr);
    }
    public static void TekCut(int[] a){
        int cem=0,hasil=1;
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0){
                hasil=hasil*a[i];
            }
            else{
                cem=cem+a[i];
            }
        }
        System.out.println("Tək ədədlərin cəmi="+cem+"  *********  "+"cüt ədələrin hasili="+hasil);
    }
}
