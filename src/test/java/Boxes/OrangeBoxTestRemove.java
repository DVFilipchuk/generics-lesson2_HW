package Boxes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrangeBoxTestRemove {

    @Test
    void removetheorange() {


        OrangeBox<Number> orangeBox1 = new OrangeBox<Number>(1.5, 1.5, 1.5);

        boolean actual = orangeBox1.removetheorange();

        Assertions.assertTrue(actual);

    }
}