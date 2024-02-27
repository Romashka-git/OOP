package lesson_1.clients;

import java.time.LocalDate;

// гепард
public class Cheetah extends Animal {
    public Cheetah(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    public Cheetah() {
        super();
    }

    @Override
    protected void fly() {
        System.out.println(getType() + " Are you crazy? I can't fly");
    }
}
