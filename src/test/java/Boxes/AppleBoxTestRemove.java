package Boxes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppleBoxTestRemove {

    @Test
    void removetheapple() {


        AppleBox<Number> appleBox1 = new AppleBox<Number>(1.0, 1.0, 1.0);

        boolean actual = appleBox1.removetheapple();

       Assertions.assertTrue(actual);
    }
}