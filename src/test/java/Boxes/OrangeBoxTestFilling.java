package Boxes;


import Friuts.Orange;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

class OrangeBoxTestFilling {

    @Test
    void getweigthOrange() {
        OrangeBox<Number> orangeBox1 = new OrangeBox<Number>(1.5, 1.5, 1.5);
        double actual = orangeBox1.getweigthOrange();
        Assertions.assertEquals(4.5, actual);

    }
}