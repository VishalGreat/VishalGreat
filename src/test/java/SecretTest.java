import org.testng.annotations.Test;

@Test
public class SecretTest {
    public  void test(){
        System.out.println("HI");
        System.out.println("secret is "+System.getenv("SLACK_SECRET"));
    }
}
