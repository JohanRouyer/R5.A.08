package com.johan.facteurPremier;

import java.util.ArrayList;
import java.util.List;

public class FacteursPremiers {

    public static List<Integer> generate(int n) {
        List<Integer> liste = new ArrayList<Integer>();
        int facteur = 2;

        while(n > 1){
            if ((n % facteur) == 0){
                n /= facteur;
                liste.add(facteur);
            }else{
                facteur++;
            }
        }

        return liste;
    }


}
