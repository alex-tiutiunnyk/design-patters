import APIController.AddCommandAdapter;
import controller.commands.AddCommand;
import controller.commands.Command;
import controller.commands.ReplaceCommand;
import controller.factories.GUIFactory;
import controller.factories.MacOSFactory;
import controller.factories.WindowsFactory;
import controller.template.ComputerUser;
import controller.template.LaptopUser;
import controller.template.TechnologyUsage;
import enums.CPU;
import model.Laptop;

import java.util.Scanner;

public class Runner {

    private static Application configureApplication() {
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("windows")) {
            factory = new WindowsFactory();
        } else {
            factory = new MacOSFactory();
        }
        app = new Application(factory);
        return app;
    }


    public static void main(String[] args) {
        System.out.println("Factory pattern:");
        Application app = configureApplication();
        app.use();

        System.out.println();
        System.out.println("Singleton pattern:");
        System.out.println("Якщо бачимо однакові значення, то екземпляр перевикористався \nАле якщо значення різні, то другий екземпляр створився \nRESULT:");
        Laptop laptop = Laptop.getInstance("Laptop1", 3.2, CPU.FOURTH, 4, 16, 512, 15.2, 1.2, 2600);
        Laptop anotherLaptop = Laptop.getInstance("Laptop2", 2.6, CPU.FOURTH, 4, 16, 512, 15.2, 3.1, 2600);
        System.out.println(laptop.getName() + "  " + laptop.getFrequency());
        System.out.println(anotherLaptop.getName() + "  " + anotherLaptop.getFrequency());

        System.out.println();
        System.out.println("Command pattern:");
        Command command = new AddCommand(laptop);
        Command command2 = new ReplaceCommand(laptop);
        String one = "new";
        String two = "Hello";

        String name = command.execute(one);
        System.out.println("Adding: " + name);
        name = command2.execute(two);
        System.out.println("Replacing: " + name);

        System.out.println();
        System.out.println("Template pattern:");
        Scanner s = new Scanner(System.in);
        TechnologyUsage technologyUsage = null;
        System.out.println("Input user name: ");
        String userName = s.nextLine();
        System.out.println("Input password: ");
        String password = s.nextLine();

        System.out.println("\nChoose technology for enter into: \n 1-Computer\n 2-Laptop");
        int choice = s.nextInt();

        switch (choice) {
            case 1: {
                technologyUsage = new ComputerUser(userName, password);
                break;
            }
            case 2: {
                technologyUsage = new LaptopUser(userName, password);
                break;
            }
            default: {
                System.out.println("Please rerun your app");
            }
        }
        technologyUsage.successEnter();

        System.out.println();
        System.out.println("Adapter pattern:");
        AddCommandAdapter adapter = new AddCommandAdapter(laptop);
        adapter.run();
    }
}
