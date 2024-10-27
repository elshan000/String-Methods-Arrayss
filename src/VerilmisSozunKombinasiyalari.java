import java.util.Scanner;
public class VerilmisSozunKombinasiyalari {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] soz = new String[n];
        for (int i = 0; i < soz.length; i++) {
            soz[i]=sc.nextLine();
        }
        kombinasiya(soz);
        factorial(soz.length);
    }
    public static int factorial(int a) {
        int p=1,k=1;
        while(k<=a){
            p=p*k;
            k=k+1;
        }
        return p;
    }
    public static void kombinasiya(String[] b ){
        Scanner sc = new Scanner(System.in);
        int fact=factorial(b.length);
        String[] arr=new String[fact];
        for(int i=0;i<=fact;i++){
            for(int j=0;j<b.length;j++){
                arr[i]=b[j];
            }
        }
        }
    }
