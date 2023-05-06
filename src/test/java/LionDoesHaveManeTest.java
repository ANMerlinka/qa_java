import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

@RunWith(Parameterized.class)
public class LionDoesHaveManeTest {
    private final String sex;
    private final boolean doesHaveMane;

    @Mock
    private Feline feline;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

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
        Lion lion = new Lion(sex, feline);
        Assert.assertEquals(doesHaveMane, lion.doesHaveMane());
    }

}

