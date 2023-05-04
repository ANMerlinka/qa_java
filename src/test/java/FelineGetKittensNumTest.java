import com.example.Feline;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

@RunWith(Parameterized.class)
public class FelineGetKittensNumTest {

    private int kittensNum;
    private int expectedResult;

    @Mock
    private Feline feline;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

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
        Mockito.when(feline.getKittens(kittensNum)).thenReturn(expectedResult);
        Assert.assertEquals(expectedResult, feline.getKittens(kittensNum));
    }
}
