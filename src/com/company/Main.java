package com.company;

public class Main {

    public static void main(String[] args) {

        Animal[] animals = {new Shark(), new Turtle(), new Eagle()};
        Shark[] sharks = {(Shark) animals[0]};
        Turtle[] turtles = {(Turtle) animals[1]};
        Eagle[] eagles = {(Eagle) animals[2]};
        for (Animal a : animals) {
            if (a instanceof Shark) {
                ((Shark) a).attack();

            }
            if (a.getClass().getName().equals("com.company.Shark")) {
                ((Shark) a).attack();
            }
        }
        for (Animal a : animals) {
            if (a instanceof Turtle) ((Turtle) a).swim();
        }
        for (Animal a : animals) {
            if (a instanceof Eagle) ((Eagle) a).fly();
        }

    }
}
