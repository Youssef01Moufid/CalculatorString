package CalculatorString;
import CalculatorString.*;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;
public class CalculatorStringTest {
    @Test
    public void addTestVide() {
        //GIVEN
        CalculatorString calculatorString = new CalculatorString();
        //WHEN
        int result = calculatorString.add("");
        //THEN
        assertThat(result).isEqualTo(0);
    }

    @Test
    public void addTestNbr1() {
        //GIVEN
        CalculatorString calculatorString = new CalculatorString();
        //WHEN
        int result = calculatorString.add("1");
        //THEN
        assertThat(result).isEqualTo(1);
    }

    @Test
    public void addTest2Nbrs() {
        //GIVEN
        CalculatorString calculatorString = new CalculatorString();
        //WHEN
        int result = calculatorString.add("1,2");
        //THEN
        assertThat(result).isEqualTo(3);
    }

    @Test
    public void addTest3Nbrs() {
        //GIVEN
        CalculatorString calculatorString = new CalculatorString();
        //WHEN
        int result = calculatorString.add("1,2,3");
        //THEN
        assertThat(result).isEqualTo(6);
    }

    @Test
    public void addTestPlusieursNbrs() {
        //GIVEN
        CalculatorString calculatorString = new CalculatorString();
        //WHEN
        int result = calculatorString.add("1,2,3,4,5,10");
        //THEN
        assertThat(result).isEqualTo(25);
    }


}
