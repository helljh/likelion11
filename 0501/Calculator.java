public class Calculator {
    int sum = 0;
    int avg(int[] data){
        for(int i=0; i<data.length; i++){
            sum += data[i];
        }
        return sum / data.length;
    }
}
