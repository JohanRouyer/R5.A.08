package com.johan.calculator;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CalculatorTest {

    private Calculator calc;

    @BeforeEach
    public void init(){
        calc = new Calculator();
    }

    @AfterEach
    public void teardown() {
        calc = null;
    }

    @ParameterizedTest
    @CsvSource({"0,1,1","1,2,3","-2,2,0","0,0,0","-1,-2,-3"})
    void methode_add_devrait_retourner_la_somme_de_deux_entiers(int a, int b, int attendu){

        // WITH
        int resultat = calc.add(a,b);

        // THEN
        assertThat(resultat).isEqualTo(attendu);
    }

    @Test
    void methode_divide_devrait_retourner_la_division_de_deux_entiers(){

        //GIVEN
        int a = 12;
        int b = 2;
        int attendu = 6;

        // WITH
        int resultat = calc.divide(a,b);

        // THEN
        assertThat(resultat).isEqualTo(attendu);
    }

}
