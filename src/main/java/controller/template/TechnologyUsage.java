package controller.template;

public abstract class TechnologyUsage {
    String userName;
    String password;

    TechnologyUsage() {
    }

    public boolean successEnter() {
        return logIn(this.userName, this.password);
    }

    abstract boolean logIn(String userName, String password);

    abstract void logOut();
}
