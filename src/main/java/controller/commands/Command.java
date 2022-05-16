package controller.commands;

import model.Laptop;

public abstract class Command implements ICommand{
    public Laptop laptop;

    Command(Laptop laptop) {
        this.laptop = laptop;
    }

    public abstract String execute(String text);

}