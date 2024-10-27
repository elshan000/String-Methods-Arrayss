import java.util.Scanner;
public class SozuTersineCeviren {
        public static void main(String[] args) {
            String a;
            Scanner sc = new Scanner(System.in);
            a=sc.nextLine();
            reverse(a);
        }
        public static void reverse(String word){
            int s=word.length();
            String b="";
            for(int i=0;i<s;i++){
                b=word.charAt(i)+b;
            }
            System.out.println(b);
        }
    }
