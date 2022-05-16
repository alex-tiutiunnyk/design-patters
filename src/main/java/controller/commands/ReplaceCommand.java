package controller.commands;

import model.Laptop;

public class ReplaceCommand extends Command {

    public ReplaceCommand(Laptop laptop) {
        super(laptop);
    }

    @Override
    public String execute(String text) {
        laptop.setName(text);
        return laptop.getName();
    }
}
