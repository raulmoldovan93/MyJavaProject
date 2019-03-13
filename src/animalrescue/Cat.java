package animalrescue;

import animalrescue.Animal;

public class Cat extends Animal {

    private String rasa;

    public String getRasa() {
        return rasa;
    }

    public void setRasa(String rasa) {
        this.rasa = rasa;
    }


    public void alearga() {
        System.out.println("Pisica sare. Pazea!");
    }

    public void mananca() {
        System.out.println("Momentan, mananca niste Wiskas!");
    }

    public void miauna() {
        System.out.println("Miau!");
    }

    public void toarce() {
        System.out.println("Purr!");
    }

}
