package edu.ucsd.cse110.lab2;

import static org.junit.Assert.*;
import org.junit.Test;

public class UtilitiesTest {
    @Test
    public void test_trimDisplayStr() {
        assertEquals("1.234", Utilities.trimDisplayStr("1.234000"));
        assertEquals("13", Utilities.trimDisplayStr("13.0"));
    }
}
