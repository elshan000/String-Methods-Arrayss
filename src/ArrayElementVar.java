import java.util.Scanner;
public class ArrayElementVar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Massivin element sayini daxil edin");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Massivin elementlerini daxil edin");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        HeYox(arr);
    }

    public static int HeYox(int[] a) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Yoxlamaq istediyiniz ededi daxil edin");
        int b = sc.nextInt();
        for (int i = 0; i < a.length; i++) {
            if (a[i] == b) {
                System.out.println("Hemin ededin indexi=" + i);
            }
            }
        return -1;
    }
    }
