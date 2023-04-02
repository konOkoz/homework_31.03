import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class MainTests {

    @Test
    public void returnString_TheSmallestFaster(){
        List<String> list = Arrays.asList("bb", "a", "ff", "ddd");
        String expected = "a";

        assertEquals(expected, Main.returnString(list));
    }
    @Test
    public void returnString_TheBiggestFaster(){
        List<String> list = Arrays.asList("bbbb", "a", "ff", "ddd");
        String expected = "bbbb";

        assertEquals(expected, Main.returnString(list));
    }

}
