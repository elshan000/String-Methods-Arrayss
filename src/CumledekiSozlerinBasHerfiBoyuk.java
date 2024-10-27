import java.util.Scanner;
public class CumledekiSozlerinBasHerfiBoyuk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] cumle=new String[1];
        cumle=sc.nextLine().split(" ");
        basHerf(cumle);
    }
    public static void basHerf(String[] a){
        for(int i=0;i<a.length;i++){
            a[i]=a[i].substring(0,1).toUpperCase()+a[i].substring(1);
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
