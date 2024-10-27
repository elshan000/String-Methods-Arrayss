import java.util.Scanner;
public class saitlerisilen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String soz = sc.nextLine();
        sait(soz);
    }

    public static void sait(String s) {
        char[] saitler = new char[]{'a', 'A', 'ı', 'I', 'o', 'O', 'u', 'U', 'e', 'E', 'ə', 'Ə', 'i', 'İ', 'ö', 'Ö', 'ü', 'Ü'};
        String s1 = "";
        for (int i = 0; i < saitler.length; i++) {
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) != saitler[i]) {
                    s1 = s1 + s.charAt(j);
                }
            }
            System.out.print(s1);
            break;
        }
    }
}
