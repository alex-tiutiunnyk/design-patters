package APIController;

import controller.commands.AddCommand;
import model.Laptop;

public class AddCommandAdapter extends AddCommand implements ICommand {

    public AddCommandAdapter(Laptop laptop) {
        super(laptop);
    }

    @Override
    public void run() {
        System.out.println("Start execute in run");
        this.execute(null);
        System.out.println("Finish execute in run");
    }
}
