package Boxes;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class AppleBox <Apple extends Number>{

    private List<Apple> box1;
    private double appleinit = 0.0;

public AppleBox(Apple...box1){
    this.box1 = Arrays.asList(box1);
}

    public List<Apple> getBox1() {
        return box1;
    }

    public double getweigthApple() {
        for (Apple a : box1) {
            appleinit += a.doubleValue();
        }
        return appleinit;
        }



    public boolean removetheapple(){


        Iterator<Apple> appleIterator = box1.iterator();
        while (appleIterator.hasNext()) {
            Apple nextapple = appleIterator.next();
            if (nextapple.equals(1.0)) {appleIterator.remove();}
        }
        return true;

        }





}
