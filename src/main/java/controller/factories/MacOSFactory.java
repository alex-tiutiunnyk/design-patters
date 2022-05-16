package controller.factories;

import model.computers.IComputer;
import model.computers.MacOSComputer;
import model.laptops.ILaptop;
import model.laptops.MacOSLaptop;

public class MacOSFactory implements GUIFactory{
    @Override
    public ILaptop useLaptop() {
        return new MacOSLaptop();
    }

    @Override
    public IComputer useComputer() {
        return new MacOSComputer();
    }
}
