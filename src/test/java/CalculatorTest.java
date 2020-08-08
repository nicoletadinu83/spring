import com.sdacademy.calculator.Calculator;
import org.junit.*;

public class CalculatorTest {
    //given
    private Calculator calc = new Calculator();
    //calculator este membru al clasei;

    @BeforeClass
    public static void IncepeSuitaDeTeste() {
        System.out.println("Incepe suita de teste");
    }

    @AfterClass
    public static void sfarsitSuitaDeTeste() {
        System.out.println("Sfarsit suita de teste");
    }


    @Before
    public void incepeTestul() {
        System.out.println("Incepe testul");
    }

    @After
    public void sfarsitTest() {
        System.out.println("Sfarsit tstul");
    }

    @Test
    public void testSum() {
        //when
        int result = calc.sum(2, 3);
        Assert.assertEquals("Nu sunt egale", 5, result);

        Assert.assertTrue(result == 5);
        Assert.assertFalse(result == 7);

        int result2 = calc.sum(2, 6);
        //then
        Assert.assertEquals(8, result2);
    }


    @Test
    public void testSubstract() {
        int result = calc.substract(2, 3);
        Assert.assertEquals(-1, result);
    }

    @Test
    public void testMultiply() {
        int result = calc.multiply(2, 3);
        Assert.assertEquals(6, result);
    }

    @Test
    public void testDivide() {
        int result = calc.divide(6, 3);
        Assert.assertEquals(2, result);

    }

    @Test(expected = ArithmeticException.class)
    public void testDivideLaZero() {
        int result = calc.divide(10, 0);

    }
}
