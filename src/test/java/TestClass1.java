import org.testng.annotations.Test;

public class TestClass1 {
    int waitTimeInMiliSecond = 5000;

    @Test
    public void TestClass1_test1()
    {
        System.out.println("In TestClass1_test1. , Thread id is " + Thread.currentThread().getId());
        try {
            Thread.sleep(waitTimeInMiliSecond);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
