package Boxes;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class OrangeBox <Orange extends Number>{


    private List<Orange> box2;

    public OrangeBox(Orange...box2){
        this.box2 = Arrays.asList(box2);
    }

    public List<Orange> getBox2() {
        return box2;
    }

    public double getweigthOrange() {

        double orangeinit = 0.0;
        for (Orange a : box2) {
            orangeinit += a.doubleValue();
        }
        return orangeinit;
    }



    public boolean removetheorange(){
        Iterator<Orange> orangeIterator = box2.iterator();
        while (orangeIterator.hasNext()) {
            Orange nextapple = orangeIterator.next();
            if (nextapple.equals(1.0)) {orangeIterator.remove();}
        }
        return true;
    }



}

