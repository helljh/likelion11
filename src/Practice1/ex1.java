package Practice1;

public class ex1 {
    public static void main(String[] args){
        int korean = 92;
        int english = 80;
        int math = 96;
        double avg = (korean + english + math) / 3.0;
        System.out.println("평균점수(실수형) = " + avg);
        System.out.println("평균점수(정수형) = " + (int)avg);
    }
}
