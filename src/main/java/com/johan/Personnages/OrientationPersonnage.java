package com.johan.Personnages;

import java.util.ArrayList;

public class OrientationPersonnage {
    private String orientation = "Nord";

    public void tourner(int nbFois) {
        ArrayList<String> listeOrientations = new ArrayList<String>();

        listeOrientations.add("Nord");
        listeOrientations.add("Est");
        listeOrientations.add("Sud");
        listeOrientations.add("Ouest");

        for (int i = 0; i < nbFois; i++) {
            String orientationAcuelle = orientation;

            int indexOrientationActuelle = listeOrientations.indexOf(orientationAcuelle);

            int indexNouvelleOrientation = indexOrientationActuelle + 1;
            if (indexNouvelleOrientation >= listeOrientations.size()) {
                indexNouvelleOrientation = 0;
            }
            String nouvelleOrientation = listeOrientations.get(indexNouvelleOrientation);
            orientation = nouvelleOrientation;
        }
    }
    public String getOrientation() {
        return orientation;
    }
}
