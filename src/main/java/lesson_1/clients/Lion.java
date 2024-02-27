package lesson_1.clients;

import java.time.LocalDate;

public class Lion extends Animal{

    public Lion(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    public Lion() {
        super();
    }

    @Override
    protected void fly() {
        System.out.println(getType() + " Are you crazy? I can't fly");
    }
}
