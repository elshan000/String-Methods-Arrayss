import java.util.*;
public class ArrayAraligaBolen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,5,11,13,15,22};
        for (int i = 0; i < 6; i++) {
        }
        aralig(arr);
    }
        public static void aralig(int[] a){
        int x=0,y=0,z=0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]>0 && a[i]<=10){
                x=x+1;
            }
            else if(a[i]>10 && a[i]<=20){
                y=y+1;
            }
            else{
                z=z+1;
            }
        }
        System.out.println("[0-10]"+";"+x+" element"+","+"[11-20]"+";"+y+" element"+","+"[21-30]"+";"+z+" element"+";" );
    }
}
