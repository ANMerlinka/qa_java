import com.example.Cat;
import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import java.util.List;

@RunWith(Parameterized.class)
public class LionTest {
    private final String sex;

    @Mock
    private Feline feline;

    public LionTest(String sex) {
        this.sex = sex;
    }

    @Parameterized.Parameters
    public static Object[][] data() {
        return new Object[][] {
                {"Самец"},
                {"Самка"}
        };
    }

    @Test
    public void testGetKittens() throws Exception {
        Lion lion = new Lion(sex, new Feline());
        Assert.assertEquals(1, lion.getKittens());
    }

    @Test
    public void testGetFood() throws Exception {
        Lion lion = new Lion(sex, new Feline());
        List<String> result = List.of("Животные", "Птицы", "Рыба");
        Assert.assertEquals(result, lion.getFood());
    }

}
