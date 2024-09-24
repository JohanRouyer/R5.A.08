package com.johan.calculator;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class CalculatorTest {
    @Test
    void additionPositif(){
        //GIVEN
        Calculator calculator = new Calculator();

        //WHEN
        int result = calculator.add(1, 2);

        //THEN
        assertThat(result).isEqualTo(3);
    }

    @Test
    void additionNegatives(){
        //given
        Calculator calculator = new Calculator();
        //WHEN
        int result = calculator.add(-1, -2);

        //THEN
        assertThat(result).isEqualTo(-3);
    }

    @Test
    void additionzero(){
        //given
        Calculator calculator = new Calculator();
        //WHEN
        int result = calculator.add(0,0 );

        //THEN
        assertThat(result).isEqualTo(0);
    }

    @Test
    void divisionPositif(){
        //GIVEN
        Calculator calculator = new Calculator();
        //WHEN
        int result = calculator.divide(4,2);
        //THEN
        assertThat(result).isEqualTo(2);
    }

    @Test
    void divisionNegative(){
        //GIVEN
        Calculator calculator = new Calculator();
        //WHEN
        int result = calculator.divide(-4,2);
        //THEN
        assertThat(result).isEqualTo(-2);
    }

}
