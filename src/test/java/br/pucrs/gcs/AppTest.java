package br.pucrs.gcs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void validateInitialXPositionInvalid() {
        Plateau plateau = new Plateau(5, 5);
        Rover rover = new Rover(10,0,"N");

        Boolean initialPositionValid = new App().validateInitialPosition(plateau, rover);

        assertFalse(initialPositionValid);
    }

    @Test
    void validateInitialYPositionInvalid() {
        Plateau plateau = new Plateau(5, 5);
        Rover rover = new Rover(5,7,"N");

        Boolean initialPositionValid = new App().validateInitialPosition(plateau, rover);

        assertFalse(initialPositionValid);
    }

    @Test
    void validateFacingCoordinateInvalid() {
        Plateau plateau = new Plateau(5, 5);
        Rover rover = new Rover(5,2,"INVALID");

        Boolean facingCoordinateValid = new App().validateInitialPosition(plateau, rover);

        assertFalse(facingCoordinateValid );
    }


    @Test
    void validateInitialPositionValid() {
        Plateau plateau = new Plateau(5, 5);
        Rover rover = new Rover(2,0,"N");

        Boolean initialPositionValid = new App().validateInitialPosition(plateau, rover);

        assertTrue(initialPositionValid);
    }
}