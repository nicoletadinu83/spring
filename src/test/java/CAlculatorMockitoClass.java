import com.sdacademy.calculator.Calculator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)

public class CAlculatorMockitoClass {
    @Mock
    Calculator spyCalculator;

    @Test
    public void testSpy(){
        Calculator calculator=new Calculator();
        Calculator spyCalculator= spy(calculator);
        spyCalculator.sum(2,5);
        spyCalculator.sum(2,5);

        verify(spyCalculator, times(2)).sum(anyInt(),anyInt());

    }


}
