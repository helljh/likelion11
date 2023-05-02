import java.util.Scanner;

public class pra2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Inspector a = new Inspector();

        System.out.print("Input: ");
        int num = sc.nextInt();
        a.findEvenOdd(num);
    }
}
