package com.company;

import java.util.Arrays;

public class Circles {
    public Circle[] getCircles() {
        return circles;
    }

    public void setCircleAt(int index, Circle circle) {
        circles[index] = circle;
    }

    public void add(Circle circle) {
        int temp1 = 0;
        for (Circle circle1 : circles) {
            if (circle1 == null) {
                break;
            }
            else {
                temp1++;
            }
        }
        if (circles.length == temp1) {
            resize(temp1 + 1);
        }
        setCircleAt(temp1, circle);
    }
    public double getAverageSqaure(){
        double average = 0;
        for (int i = 0; i < circles.length; i++) {
            average+=circles[i].getSquare();
        }
        return average/circles.length;
    }
    private Circle[] circles;

    public void resize(int newLength) {
        Circle[] tempCircles = new Circle[newLength];
        if (circles.length < newLength) {
            tempCircles = Arrays.copyOf(circles, newLength);
        }
        circles = tempCircles;
    }
    public String avaragereturn(){
        String temp3="";
        for (Circle circle :circles) {
            if(getAverageSqaure()>circle.getSquare()){
               temp3+=circle+System.lineSeparator();
            }
        }
        return temp3;
    }
    public Circles(int length) {
        this.circles = new Circle[length];
    }

    public Circles() {
        circles = new Circle[0];
    }

    @Override
    public String toString() {
        String temp2="Circles : "+System.lineSeparator();
        for (Circle circle : circles){
            temp2+=circle+System.lineSeparator();
        }
        return temp2;
    }
}
