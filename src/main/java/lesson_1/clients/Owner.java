package lesson_1.clients;

public class Owner {
    public String name;

    public Owner(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("Name: %s", name);
    }
}
