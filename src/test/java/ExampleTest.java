import org.junit.Assert;
import org.junit.Test;

public class ExampleTest {
    @Test
    public void exempluTest(){
        System.out.println("Primul test");
        int a =2;


       // assert a==3;
        //assert; verifica daca conditia este true; dupa assert urmeaza conditia

       // assert a=2;
        Assert.assertEquals(3,a);

    }

    @Test
    public  void  exempluTest2(){
        System.out.println("Al doilea test");
    }

}
