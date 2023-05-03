import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;

@RunWith(Parameterized.class)
public class LionDoesHaveManeTest {
    private final String sex;
    private final boolean doesHaveMane;

    @Mock
    private Feline feline;

    @Parameterized.Parameters
    public static Object[][] data() {
        return new Object[][] {
                {"Самец", true},
                {"Самка", false}
        };
    }

    public LionDoesHaveManeTest(String sex, boolean doesHaveMane) {
        this.sex = sex;
        this.doesHaveMane = doesHaveMane;
    }

    @Test
    public void testDoesHaveMane() throws Exception {
        Lion lion = new Lion(sex, new Feline());
        Assert.assertEquals(doesHaveMane, lion.doesHaveMane());
    }

}

