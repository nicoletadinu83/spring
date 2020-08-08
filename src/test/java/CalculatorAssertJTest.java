import com.sdacademy.calculator.Calculator;
import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class CalculatorAssertJTest {
     private Calculator calculator= new Calculator();

     @Test
     public void sum(){
         calculator.sum(2,3);
         assertThat(calculator.sum(2,3)).isEqualTo(2);
     }

}
