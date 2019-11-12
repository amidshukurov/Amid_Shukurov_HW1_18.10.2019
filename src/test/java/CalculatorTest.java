import classroom.ZOld.Calculator;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    Calculator c;
    @Before
    public void before1(){this.c = new Calculator();}

    @After
    public void after1(){
        System.out.println("Amid");
    }
    @Test
    public void add() {
        assertEquals(40,c.add(20,20));
    }

    @Test
    public void sub() {
        assertEquals(0,c.sub(10,10));
    }

    @Test
    public void mul() {
        assertEquals(100,c.mul(10,10));
    }

    @Test
    public void div() {
        assertEquals(1,c.div(10,10));
    }
}