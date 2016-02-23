package ross.goncharuk;

public class MyCalc {
    public static void calcPi(int n){

        double sum = 0;

        for(int i = 1; i < n; i++){
            sum+=(4*(Math.pow(-1, i + 1)))/(2*i - 1);
        }
        System.out.println(sum);
    }
}
