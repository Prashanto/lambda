import java.util.function.Function;
import java.util.function.IntBinaryOperator;

public class Sum {
    public static void main(String[] args) {

        int a=5;
        int b=10;
        IntBinaryOperator sumCalc=(x,y)-> x+y;
        System.out.println("Sum: "+sumCalc.applyAsInt(a,b));


    }
}