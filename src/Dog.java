public class Dog {

    String culoare;
    int varsta;
    float greutate;
    String rasa;
    String nume;

    Dog(String color, int varsta, float greutate, String rasa, String nume){
        culoare = color;
        this.varsta = varsta;
        this.greutate = greutate;
        this.rasa = rasa;
        this.nume = nume;
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
