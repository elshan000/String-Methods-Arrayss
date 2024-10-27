import java.util.Scanner;
public class ArrayMaxMinDeyis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Element sayi");
        int n=sc.nextInt();
        int[] arr=new int[n];          //{1,2,3,4}
        System.out.println("Elementleri daxil edin");
        for(int i=0 ; i<n; i++){
            arr[i]=sc.nextInt();
        }
        mmChange(arr);
    }
    public static void mmChange(int[] a){
        int max=a[0],s=0,k=0;     //S-minimumun indexi K-maximumun indexi
        int min=a[1];
        for(int i=0 ; i<a.length; i++){
            if(a[i]>max){
                max=a[i];
                k=i;
            }
        }
        for(int i=0 ; i<a.length; i++){
            if(a[i]<min){
                min=a[i];
                s=i;
            }
        }
        a[k]=min;
        a[s]=max;
        for(int i=0 ; i<a.length; i++){
            System.out.print(a[i]);
        }
    }
}
