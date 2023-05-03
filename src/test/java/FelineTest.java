import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

    Feline feline = new Feline();

    @Test
    public void testGetFamily() {
        Assert.assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void testGetFood() throws Exception {
        List<String> result = List.of("Животные", "Птицы", "Рыба");
        Assert.assertEquals(result, feline.eatMeat());
    }
}
