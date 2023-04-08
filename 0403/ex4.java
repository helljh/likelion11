package Practice1;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String[] name = {"james", "Cathy", "Kenny", "Martin", "Crystal"};
        int[] height = new int[5];
        int sum=0;
        int avg;

        for(int i=0; i<name.length; i++){
            System.out.print(name[i]+"의 신장을 입력하세요: ");
            height[i] = sc.nextInt();
        }

        for(int i=0; i<name.length; i++){
            System.out.println(name[i] + "의 키는 " + height[i] + "입니다.");
        }


        for(int i=0; i<name.length; i++){
            sum += height[i];
        }

        avg = sum / height.length;

        System.out.println("신장의 합계: " + sum);
        System.out.println("평균 신장: " + avg);
    }
}
