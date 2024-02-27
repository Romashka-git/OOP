package lesson_1.clients;

import java.time.LocalDate;

public class Penguin extends Animal{
    public Penguin(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    public Penguin() {
        super();
    }
    @Override
    protected void fly() {
        System.out.println(getType() + " Are you crazy? I can't fly");
    }

    @Override
    protected void toGo() {
        System.out.println(getType() + " I can slide on an ice floe! Yuiiii!");
    }
}
