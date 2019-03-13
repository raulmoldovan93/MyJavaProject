package animalrescue;

public class Medic {

    private String nume;
    private int numartelefon;
    private int varsta;
    private int experienta;
    private int pretconsultatie;

    public void setNume(String nume){
        this.nume = nume;
    }
    public String getNume(){
        return this.nume;
    }

    public void setNumartelefon(int numartelefon){
        this.numartelefon = numartelefon;
    }
    public int getNumartelefon(){
        return this.numartelefon;
    }

    public void setVarsta(int varsta){
        this.varsta = varsta;
    }
    public int getVarsta(){
        return this.varsta;
    }

    public void setExperienta(int experienta){
        this.experienta = experienta;
    }
    public int getExperienta(){
        return this.experienta;
    }

    public void setPretconsultatie(int pretconsultatie){
        this.pretconsultatie = pretconsultatie;
    }
    public int getPretconsultatie(){
        return this.pretconsultatie;
    }

}
