public class DOG {

    private String culoare;
    private int varsta;
    private float greutate;
    private String rasa;
    private String nume;

    DOG(String color, int varsta, float greutate,
        String rasa, String nume) {
        System.out.println("Initializat");
        culoare = color;
        this.varsta = varsta;
        this.greutate = greutate;
        this.rasa = rasa;
        this.nume = nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }
    public String getNume(){
        return nume;
    }
    public void setVarsta(int varsta){
        this.varsta = varsta;
    }

    public void alearga() {
        System.out.println("Catelul alearga. Pazea!");
    }

    public void mananca() {
        System.out.println("Momentan, mananca niste Royal Canin");
    }

    public void latra() {
        System.out.println("HAM!");
    }


}
