package com.johan.Personnages;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OrientationPersonnageTest {

    @Test
        public void test_tourner_1() {
            // GIVEN
            OrientationPersonnage personnage = new OrientationPersonnage();

            // WHEN
            personnage.tourner(1);

            // THEN
            assertEquals("Est", personnage.getOrientation(), "Devrait être Est");
        }

        @Test
        public void test_tourner_2() {
            // GIVEN
            OrientationPersonnage personnage = new OrientationPersonnage();

            // WHEN
            personnage.tourner(2);

            // THEN
            assertEquals("Sud", personnage.getOrientation(), "Devrait être Sud");
        }

        @Test
        public void test_tourner_3() {
            // GIVEN
            OrientationPersonnage personnage = new OrientationPersonnage();

            // WHEN
            personnage.tourner(3);

            // THEN
            assertEquals("Ouest", personnage.getOrientation(), "Devrait être Ouest");
        }

        @Test
        public void test_tourner_4() {
            // GIVEN
            OrientationPersonnage personnage = new OrientationPersonnage();

            // WHEN
            personnage.tourner(4);

            // THEN
            assertEquals("Nord", personnage.getOrientation(), "Devrait être Nord");
        }

        @Test
        public void test_tourner_5() {
            // GIVEN
            OrientationPersonnage personnage = new OrientationPersonnage();

            // WHEN
            personnage.tourner(5);

            // THEN
            assertEquals("Est", personnage.getOrientation(), "Devrait être Est");
        }

        @Test
        public void test_tourner_position_non_nord() {
            // GIVEN
            OrientationPersonnage personnage = new OrientationPersonnage();

            // WHEN
            personnage.tourner(6);

            // THEN
            assertEquals("Sud", personnage.getOrientation(), "Devrait être Sud");
        }


    }
