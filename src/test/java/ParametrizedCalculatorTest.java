import com.sdacademy.calculator.Calculator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)

public class ParametrizedCalculatorTest {

    private Calculator calc = new Calculator();
    private int num1;
    private int num2;

    //definim constructorul; este constructor deoarece nu are return; are numele clasei si ""keyword this-asta am pus-o eu""
    public ParametrizedCalculatorTest(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    //pt a testa un sir de date-array;
    //adnotare de parametri
    @Parameterized.Parameters
    public static Collection parameterizare() {
        return Arrays.asList(new Object[][]{
                {2, 1},
                {6, 3},
                {19, 4},
                {22, 5},
                {23, 6}
        });
    }


    @Test
    public void testSum() {
        int result1 = calc.sum(num1, num2);
        Assert.assertEquals(num1 + num2, result1);

       /* int result2=calc.sum(3,4);
        Assert.assertEquals(8,result2);*/

    }

}
