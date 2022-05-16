package model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString
public final class Laptop extends Computer {
    private static Laptop instance;
    private double diagonal; //екран
    private double weight; //вага
    private int capacity; //об'єм батареї

    private Laptop(String name, double frequency, enums.CPU CPU, int coreNumber, int amountRAM, int amountROM, double diagonal, double weight, int capacity) {
        super(name, frequency, CPU, coreNumber, amountRAM, amountROM);
        //lazy initialization
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.diagonal = diagonal;
        this.weight = weight;
        this.capacity = capacity;
    }

    public static Laptop getInstance(String name, double frequency, enums.CPU CPU, int coreNumber, int amountRAM, int amountROM, double diagonal, double weight, int capacity) {
        if (instance == null) {
            instance = new Laptop(name, frequency, CPU, coreNumber, amountRAM, amountROM, diagonal, weight, capacity);
        }
        return instance;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(double diagonal) {
        if (diagonal > 0) this.diagonal = diagonal;
        else throw new IllegalArgumentException("Number can not be negative");
    }

    public boolean isComfortable() {
        return (getDiagonal() < 15.0 && getWeight() < 1.5);
    }

    public void play() throws InterruptedException {
        int battery = 100;
        System.out.println("The battery is full");
        System.out.println("Playing...");
        do {
            Thread.sleep(500);
            battery -= 10;
            System.out.println(battery);
        } while (battery != 0);
        System.out.println("The battery is discharged. Please connect the charger");
    }
}
