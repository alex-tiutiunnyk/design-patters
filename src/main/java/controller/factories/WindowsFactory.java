package controller.factories;

import model.computers.IComputer;
import model.computers.WindowsComputer;
import model.laptops.ILaptop;
import model.laptops.WindowsLaptop;

public class WindowsFactory implements GUIFactory{
    @Override
    public ILaptop useLaptop() {
        return new WindowsLaptop();
    }

    @Override
    public IComputer useComputer() {
        return new WindowsComputer();
    }
}
