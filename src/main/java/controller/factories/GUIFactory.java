package controller.factories;

import model.computers.IComputer;
import model.laptops.ILaptop;

public interface GUIFactory {
    ILaptop useLaptop();
    IComputer useComputer();
}
