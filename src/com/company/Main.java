package com.company;

/**
 * Вариант 8. Создать класс окружность, член класса – R. Предусмотреть в классе методы вычисления и
 * вывода сведений о фигуре – площади, длины окружности. Создать производный класс – конус с высотой
 * h, добавить в класс метод определения объема фигуры, перегрузить методы расчета площади и вывода
 * сведений о фигуре. Написать программу, демонстрирующую работу с классом: дано N окружностей и M
 * конусов, найти количество окружностей, у которых площадь меньше средней площади всех окружностей,
 * и наибольший по объему конус.
 */
public class Main {

    public static void main(String[] args) {

        Circle circle;
        double side = -1;
        Circles circles = new Circles();
        for (int i = 0; i < 10; i++) {
            while (Circle.CorrectRadius("" + (side = Math.random() * 11 - 5)) < 0) {
            }
            circle = new Circle(side);
            circles.add(circle);

        }
        System.out.println(circles);


        System.out.println("\nAverage square of circles : "+circles.getAverageSqaure());
        System.out.println(circles.avaragereturn());
        Cone cone;
        double height=-1;
        Cones cones = new Cones();
        for (int i = 0; i < 10; i++) {
            while (Cone.CorrectRadius("" + (side = Math.random() * 11 - 5)) < 0 || Cone.CorrectHeight("" + (height = Math.random() * 11 - 5)) < 0) {

            }
            cone = new Cone(side,height);
            cones.list.add(cone);
        }
        System.out.println("Cones :  ");
        for (int i = 0; i < cones.list.size(); i++) {
            System.out.println(cones.list.get(i));
        }
        System.out.println("\nThe largest volume of the cone : "+cones.getLargestvolume());
        System.out.println(cones.largestvolume());
    }
}
