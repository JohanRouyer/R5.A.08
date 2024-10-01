package com.johan.facteurPremier;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

public class FacteursPremiersTest {

    @Test
    void generate_de_1_doit_retourner_liste_vide(){
        //GIVEN
        int a = 1;
        List<Integer> attendu = new ArrayList<Integer>();

        // WITH
        List<Integer> resultat = FacteursPremiers.generate(a);

        // THEN
        assertThat(resultat).isEqualTo(attendu);
    }


    @Test
    void generate_de_2_retourne_une_liste_avec_2(){
        //GIVEN
        int a = 2;
        List<Integer> attendu = new ArrayList<Integer>();
        attendu.add(2);

        // WITH
        List<Integer> resultat = FacteursPremiers.generate(a);

        // THEN
        assertThat(resultat).isEqualTo(attendu);
    }

    @Test
    void generate_de_3_retourne_une_liste_avec_3(){
        //GIVEN
        int a = 3;
        List<Integer> attendu = new ArrayList<Integer>();
        attendu.add(3);

        // WITH
        List<Integer> resultat = FacteursPremiers.generate(a);

        // THEN
        assertThat(resultat).isEqualTo(attendu);
    }
    @Test
    void generate_de_9_retourne_une_liste_avec_3_3(){
        //GIVEN
        int a = 9;
        List<Integer> attendu = new ArrayList<Integer>();
        attendu.add(3);
        attendu.add(3);

        // WITH
        List<Integer> resultat = FacteursPremiers.generate(a);

        // THEN
        assertThat(resultat).isEqualTo(attendu);
    }

    @Test
    void generate_de_21_retourne_une_liste_avec_3_7(){
        //GIVEN
        int a = 21;
        List<Integer> attendu = new ArrayList<Integer>();
        attendu.add(3);
        attendu.add(7);

        // WITH
        List<Integer> resultat = FacteursPremiers.generate(a);

        // THEN
        assertThat(resultat).isEqualTo(attendu);
    }

//    @ParameterizedTest
//    @CsvSource({"1,[]","2,[2]","3,[3]","9,[3,3]","21,[3,7]"})
//    void generate_doit_retourner_la_liste_des_nombres_premiers_composant_un_nombre(int a, List<Integer> attendu){
//        // WITH
//        List<Integer> resultat = FacteursPremiers.generate(a);
//
//        // THEN
//        assertThat(resultat).isEqualTo(attendu);
//    }

}
