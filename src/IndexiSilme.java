import java.util.Scanner;
public class IndexiSilme {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sozu daxil edin");
        String soz=sc.nextLine();
        indexSil(soz);
    }
    public static void indexSil(String a){
        Scanner sc = new Scanner(System.in);
        System.out.println("Silmek istediyiniz indexleri daxil edin");
        String yeni="";
        int i1=sc.nextInt();
        int i2=sc.nextInt();
        for(int i=0;i<a.length();i++){
            if(i!=i1 && i!=i2){
                System.out.print(a.charAt(i));
            }
        }
    }
}
