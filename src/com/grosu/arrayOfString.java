package com.grosu;

import jdk.internal.org.objectweb.asm.tree.TryCatchBlockNode;

import java.util.ArrayList;

public class arrayOfString {

    public void outlist(int actnmb, ArrayList arr) {
        System.out.println("Action number: "+actnmb);
        for (Object s : arr) {
            System.out.println(s);
        }
    }

    public void init() {
        ArrayList Cities = new ArrayList();
        Cities.add("Chisinau");
        Cities.add("Paris");
        Cities.add("Chicago");

        outlist(1, Cities);

        Cities.set(0, "Berlin");

        outlist(2, Cities);

        System.out.println("Array size = "+Cities.size());

        Cities.remove(2);

        outlist(3, Cities);
    }

}
