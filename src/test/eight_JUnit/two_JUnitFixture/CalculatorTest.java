package test.eight_JUnit.two_JUnitFixture; 

import eight_JUnit.two_JUnitFixture.Calculator;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import static org.junit.Assert.assertEquals;

/** 
* Calculator Tester. 
* 
* @author <Authors name> 
* @since <pre>八月 13, 2018</pre> 
* @version 1.0 
*/ 
public class CalculatorTest {
    Calculator calc;

@Before
public void setUp() {
    calc = new Calculator();
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: caculate(String expression) 
* 
*/ 
@Test
public void testCalcAdd2Numbers() {
    int r = calc.calculate("1+2");
    assertEquals(3, r);
}

@Test
public void testCalcAdd3Numbers() {
int r = calc.calculate("1+2+3");
assertEquals(6, r);
}

@Test
public void testCalcAddLargeNumbers() {
    int r = calc.calculate("123+456");
    assertEquals(579, r);
}

@Test
public void testCalcWithWhiteSpaces() {
    int r = calc.calculate("1 + 5 + 10");
    assertEquals(16, r);
}
} 
