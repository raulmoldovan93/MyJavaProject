public class Dog {

    private String culoare;
    private int varsta;
    private float greutate;
    private String rasa;
    private String nume;

//    Dog(String color, int varsta, float greutate, String rasa, String nume){
//        System.out.println("Initializat!");
//        culoare = color;
//        this.varsta = varsta;
//        this.greutate = greutate;
//        this.rasa = rasa;
//        this.nume = nume;
//    }

    public void setNume(String nume) {
        this.nume = nume;
    }
    public String getNume() {
        return this.nume;
    }

    public void setVarsta(int varsta){
        this.varsta = varsta;
    }
    public int getVarsta(){
        return this.varsta;
    }

    public void setGreutate(int greutate){
        this.greutate = greutate;
    }
    public float getGreutate(){
        return this.greutate;
    }

    public void setRasa(String rasa){
        this.rasa = rasa;
    }
    public String getRasa(){
        return this.rasa;
    }

    public void setCuloare(String culoare){
        this.culoare = culoare;
    }
    public String getCuloare(){
        return this.culoare;
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
