package model.computers;

public class WindowsComputer implements IComputer{
    @Override
    public void use() {
        System.out.println("You used WindowsComputer.");
    }
}
