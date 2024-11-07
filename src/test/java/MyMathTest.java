import org.junit.Test;

public class MyMathTest {
    @Test(expected = ArithmeticException.class)
    public void checkZeroDenominatorShouldThrowException(){
        MyMath.divide(1,0);
    }
}
