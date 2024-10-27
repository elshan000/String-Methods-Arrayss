import java.util.Scanner;
public class ilkherfboyuk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String soz = sc.nextLine();
        ilkherf(soz);
    }
    public static void ilkherf(String s){
        String a = s.substring(0, 1).toUpperCase();
        System.out.println(a+s.substring(1));

    }
}
