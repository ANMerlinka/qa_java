import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    private Feline feline;

    @Test
    public void testGetSound() {
        Cat cat = new Cat(feline);
        cat.getSound();
        Assert.assertEquals("Мяу", cat.getSound());
    }

    @Test
    public void testGetFood() throws Exception {
        Cat cat = new Cat(feline);
        List<String> result = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.eatMeat()).thenReturn(result);
        Assert.assertEquals(result, cat.getFood());
    }
}
