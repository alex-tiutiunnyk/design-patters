package model;

import lombok.*;

@AllArgsConstructor
@Builder
@Getter
@Setter
@ToString
public class Computer {
    private String name; //назва
    private double frequency; //частота оновлення
    private enums.CPU CPU; //процесор
    private int coreNumber; //кількість ядер
    private int amountRAM; //об'єм оперативної пам'яті
    private int amountROM; //об'єм внутрішньої пам'яті

    public Computer() {
    }

    public int addROM(int number) {
        System.out.println("Previous ROM " + getAmountROM());
        if (number > 0)
            amountROM += number;
        else throw new IllegalArgumentException("Number can not be negative");
        return getAmountROM();
    }

    public boolean isModern() {
        return getAmountRAM() >= 16;
    }
}
