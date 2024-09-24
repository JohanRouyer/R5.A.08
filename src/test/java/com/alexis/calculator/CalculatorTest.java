package com.alexis.calculator;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

public class CalculatorTest {


    @Test
    void methode_add_devrait_retourner_la_somme_de_deux_entiers(){

        //GIVEN
        Calculator calc = new Calculator();
        int a = 5;
        int b = 5;
        int attendu = 10;

        // WITH
        int resultat = calc.add(a,b);

        // THEN
        assertThat(resultat).isEqualTo(attendu);
    }

    @Test
    void methode_divide_devrait_retourner_la_division_de_deux_entiers(){

        //GIVEN
        Calculator calc = new Calculator();
        int a = 12;
        int b = 2;
        int attendu = 6;

        // WITH
        int resultat = calc.divide(a,b);

        // THEN
        assertThat(resultat).isEqualTo(attendu);
    }

}
