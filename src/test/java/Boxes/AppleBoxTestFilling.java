package Boxes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppleBoxTestFilling {

    @Test
    void getweigthApple() {

        AppleBox<Number> appleBox1 = new AppleBox<Number>(1.0, 1.0, 1.0);
        double actual = appleBox1.getweigthApple();
        Assertions.assertEquals(3, actual);

    }
}