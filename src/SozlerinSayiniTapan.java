import java.util.Scanner;
public class SozlerinSayiniTapan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[1];
        System.out.println("Cumleni daxil edin");
        arr = sc.nextLine().split(" ");
        sozler(arr);
    }
    public static void sozler (String[] a){
        int say=0;
        for (int i = 0; i < a.length; i++) {
            say=i+1;
        }
        System.out.println("Sozlerin sayi ="+" "+say);
        }
    }
