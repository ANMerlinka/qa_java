import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;

@RunWith(Parameterized.class)
public class LionExceptionTest {
    private final String sex;

    @Mock
    private Feline feline;

    public LionExceptionTest(String sex) {
        this.sex = sex;
    }

    @Parameterized.Parameters
    public static Object[][] data() {
        return new Object[][] {
                {"Муж"},
                {"Жен"}
        };
    }

    @Test
    public void testDoesHaveManeNoAcceptable() {
        String textResult = "Используйте допустимые значения пола животного - самей или самка";

        Exception exception = Assert.assertThrows(Exception.class, () -> {
                Lion lion = new Lion(sex, new Feline());
        });

        Assert.assertEquals(textResult, exception.getMessage());
    }

}

