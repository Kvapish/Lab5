package com.company;

import java.util.ArrayList;

public class Cones {
    public ArrayList<Cone> list;

    public Cones() {
        this.list = new ArrayList<>();
    }
    public double getLargestvolume(){
        double  maximum = 0;
        for (int i = 0; i < list.size(); i++) {
            if (maximum < list.get(i).getVolume()) {
                maximum = list.get(i).getVolume();
            }
        }
        return maximum;
    }

    public String largestvolume(){
        String temp4="";
        for (Cone cone :list) {
            if (getLargestvolume() <= cone.getVolume())
            temp4 = cone+System.lineSeparator();
        }
        return temp4;
    }
}
