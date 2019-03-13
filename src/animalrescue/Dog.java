package animalrescue;

import animalrescue.Animal;

public class Dog extends Animal {

    private String rasa;


    public void setRasa(String rasa){
        this.rasa = rasa;
    }
    public String getRasa(){
        return this.rasa;
    }


    public void alearga() {
        System.out.println("Catelul alearga. Pazea!");
    }

    public void mananca() {
        System.out.println("Momentan, mananca niste Purina!");
    }

    public void latra() {
        System.out.println("HAM!");
    }
}
