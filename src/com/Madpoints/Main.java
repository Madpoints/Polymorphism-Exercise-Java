package com.Madpoints;

class Car {
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;
    private int doors;

    public Car(String name, int cylinders, int doors) {
        this.name = name;
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.doors = doors;
    }

    public String ignition() {
        return "Engine started";
    }

    public String accelerate() {
        return "Moving forward";
    }

    public String brake() {
        return "Stopping";
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getDoors() {
        return doors;
    }
}

class Volvo extends Car {
    public Volvo() {
        super("Volvo", 6, 4);
    }

    @Override
    public String ignition() {
        return "Volvo's engine has started";
    }

    @Override
    public String accelerate() {
        return "Volvo is moving forward";
    }

    @Override
    public String brake() {
        return "Volvo is slowing down";
    }
}

class MiniCooper extends Car {
    public MiniCooper() {
        super("Mini Cooper", 4, 2);
    }

    @Override
    public String ignition() {
        return "Mini Cooper's engine has started";
    }

    @Override
    public String accelerate() {
        return "Mini Cooper is moving forward";
    }

    @Override
    public String brake() {
        return "Mini Cooper is slowing down";
    }
}

class Corolla extends Car {
    public Corolla() {
        super("Corolla", 4, 4);
    }

    @Override
    public String ignition() {
        return "Corolla's engine has started";
    }

    @Override
    public String accelerate() {
        return "Corolla is moving forward";
    }

    @Override
    public String brake() {
        return "Corolla is slowing down";
    }
}


public class Main {

    public static void main(String[] args) {
	    Volvo volvo = new Volvo();
        System.out.println("A volvo has " + volvo.getCylinders() +
                            " cylinders and " + volvo.getDoors() +
                            " doors.");
        System.out.println(volvo.ignition());
        System.out.println(volvo.accelerate());
        System.out.println(volvo.brake());

        System.out.println("\n");

        Corolla corolla = new Corolla();
        System.out.println("A corolla has " + corolla.getCylinders() +
                " cylinders and " + corolla.getDoors() +
                " doors.");
        System.out.println(corolla.ignition());
        System.out.println(corolla.accelerate());
        System.out.println(corolla.brake());
    }
}
