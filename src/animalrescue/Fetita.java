package animalrescue;

public class Fetita {

    private String nume;
    private String prenume;
    private int varsta;
    private String nationalitate;
    private String localitate;

    public void setNume(String nume){
        this.nume = nume;
    }
    public String getNume(){
        return this.nume;
    }

    public void setPrenume(String prenume){
        this.prenume = prenume;
    }
    public String getPrenume(){
        return this.prenume;
    }

    public void setVarsta(int varsta){
        this.varsta = varsta;
    }
    public int getVarsta(){
        return this.varsta;
    }

    public void setNationalitate(String nationalitate){
        this.nationalitate = nationalitate;
    }
    public String getNationalitate(){
        return this.nationalitate;
    }

    public void setLocalitate(String localitate){
        this.localitate = localitate;
    }
    public String getLocalitate(){
        return this.localitate;
    }



    public void adopta() {
        System.out.println("animalrescue.Fetita vrea sa adopte un catel");
    }

    public void hraneste() {
        System.out.println("animalrescue.Fetita hraneste catelul");
    }

    public void plimba() {
        System.out.println("animalrescue.Fetita plimba catelul");
    }

    public void dreseaza() {
        System.out.println("animalrescue.Fetita dreseaza catelul");
    }

}
