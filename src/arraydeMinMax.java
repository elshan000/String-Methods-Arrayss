import java.util.Scanner;
public class arraydeMinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Massivin ölçüsünü daxil edin");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Elementleri daxil edin");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        array(a);
    }
        public static void array(int[] s) {
                int max = s[0];
                int min = s[1];
                for (int i = 0; i <s.length ; i++) {
                    if (s[i] > max) {
                        max = s[i];
                    }
                }
                for (int i = 0; i < s.length ; i++) {
                    if (s[i] < min) {
                        min = s[i];
                    }
                }
                System.out.println("max=" + max + " " + "min=" + min);
            }
        }

