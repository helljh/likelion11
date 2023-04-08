package Practice1;

public class ex2 {
    public static void main(String[] args){
        int a = 169;
        int b = 4;
        String op = "*";
        switch (op){
            case "+": System.out.println("169 + 4 = " + (a+b));
                break;
            case "-": System.out.println("169 - 4 = " + (a-b));
                break;
            case "*": System.out.println("169 * 4 = " + (a*b));
                break;
            case "%": System.out.println("169 % 4 = " + (a%b));
                break;
            case "/": System.out.println("169 나누기 4는 = " + (a/(double)b));
                break;
        }
    }
}
