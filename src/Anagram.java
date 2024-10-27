import java.util.*;
public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        anagram(s1, s2);
    }
    public static void anagram(String a, String b) {
        int k=0;
        if(a.length() == b.length()){
        for (int i = 0; i < a.length(); i++) {
            for (int j = 0; j < b.length(); j++) {
                if (a.charAt(i) == b.charAt(j)) {
                    k=k+1;
                    break;
                }
            }
            }
        }
        else{
            System.out.println("Anagram deyil");
        }
        if(k==a.length()){
            System.out.println("Anagramdir");
        }
        else{
            System.out.println("Anagram deyil");
        }
        }
    }
