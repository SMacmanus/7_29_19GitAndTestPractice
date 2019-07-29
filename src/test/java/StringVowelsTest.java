import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
public class StringVowelsTest {
    StringVowels str;

    @Before
    public void setUp(){
        str = new StringVowels();
    }

    @Test
    public void testFindVowelsInString(){
        assertEquals(4, str.findVowelsInString("w3resource"));
        assertEquals( 3, str.findVowelsInString("helloworld"));
    }
}
