package com.company;

public class Main {

    public static void main(String[] args) {

        int AmountOfBricks = 79;
        int ContainerCapacity = 7;
        int Full;
        int Not_Full;
        int Sum;
        Not_Full = AmountOfBricks % ContainerCapacity;

        System.out.println("The containers that aren't full is " + Not_Full);

        Full = AmountOfBricks  / ContainerCapacity;

        System.out.println("The containers that are full is " + Full);
        Sum = Full + Not_Full ;

        System.out.println("sum of full containers and not full containers is " + Sum);
    }
}
