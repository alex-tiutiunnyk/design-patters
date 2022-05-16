import model.computers.IComputer;
import controller.factories.GUIFactory;
import model.laptops.ILaptop;

public class Application {
    private ILaptop laptop;
    private IComputer computer;

    public Application(GUIFactory factory) {
        laptop = factory.useLaptop();
        computer = factory.useComputer();
    }

    public void use() {
        laptop.use();
        computer.use();
    }
}
