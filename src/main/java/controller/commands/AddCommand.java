package controller.commands;

import model.Laptop;

public class AddCommand extends Command {

    public AddCommand(Laptop laptop) {
        super(laptop);
    }

    @Override
    public String execute(String text) {
        return laptop.getName() + text;
    }
}
