import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class FelineGetKittensNumTest {

    private int kittensNum;
    private int expectedResult;

    Feline feline = new Feline();

    @Parameterized.Parameters
    public static Object[][] kittensData() {
        return new Object[][]{
                {2, 2},
                {0, 0},
                {5, 5}
        };
    }

    public FelineGetKittensNumTest(int kittensNum, int expectedResult) {
        this.kittensNum = kittensNum;
        this.expectedResult = expectedResult;
    }

    @Test
    public void testGetKittenCount() {
        Assert.assertEquals(expectedResult, feline.getKittens(kittensNum));
    }
}
