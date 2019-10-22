import org.junit.Test;

import static org.junit.Assert.*;

public class classTestTest {
    public boolean isCharValid(char c) {
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z');
    }

    @Test
    public void gen_random() {
        classTest t = new classTest();
        String s1 = t.gen_random(2);
        String s2 = s1.substring(1, s1.length() - 1).replaceAll(",", "");
        assertEquals(2,s2.length());
    }
    @Test
    public void gen_random1() {
        classTest t = new classTest();
        String s1 = t.gen_random(6);
        String s2 = s1.substring(1, s1.length() - 1).replaceAll(",", "");
        char charAt0 = s2.charAt(0);
        assertTrue(isCharValid(charAt0));
    }
}