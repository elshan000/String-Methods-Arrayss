import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String soz = sc.nextLine();
        sait(soz);
    }

    public static void sait(String s) {
        char[] saitler = new char[]{'a', 'A', 'ı', 'I', 'o', 'O', 'u', 'U', 'e', 'E', 'ə', 'Ə', 'i', 'İ', 'ö', 'Ö', 'ü', 'Ü'};
        int say = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < saitler.length; j++) {
                if (s.charAt(i) == saitler[j]) {
                    say = say + 1;
                }
            }
        }
        System.out.println(say);
    }
}