import java.util.Scanner;

public class pra3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Rectangle rect = new Rectangle();

        System.out.println("사각형의 가로와 세로 길이를 띄어쓰기를 기준으로 입력해주세요.");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(rect.area(a,b));
    }
}
