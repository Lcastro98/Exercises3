package com.bootcamp;

public class Main {
    public static void main(String[] args) {
        var result = sum(1,2,3);
        System.out.println("El resultado de la suma es: " + result);

        Car myCar = new Car();
        myCar.addDoor();
        System.out.println("El numero de puestas del carro es: " + myCar.getDoors());
    }

    public static int sum(int a, int b, int c) {
        return a+b+c;
    }
}
