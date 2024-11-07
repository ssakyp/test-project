
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Vector2DTest {
    private final double ESP = 1e-9;
    private static Vector2D v1;

    @BeforeClass     // will be started before each test method
    public static void createNewVector(){
        v1 = new Vector2D();
    }

    @Test
    public void newVectorShouldHaveZeroValue(){
        //Vector2D v1 = new Vector2D();   //action

        // assertion
        // 1e-9 = 0.00.....001
        Assert.assertEquals(0, v1.length(), ESP);

    }

    @Test
    public void newVectorShouldHaveZeroX(){
        //Vector2D v1 = new Vector2D();
        Assert.assertEquals(0, v1.getX(), ESP);

    }

    @Test
    public void newVectorShouldHaveZeroY(){
       //Vector2D v1 = new Vector2D();
        Assert.assertEquals(0, v1.getY(), ESP);
    }
}
