import java.util.Scanner;

public class Main {


    public static float myFloat = 3.2f;

    public static void main(String[] args) {
        Scanner scanez = new Scanner(System.in);

        Dog rex = new Dog("rosu", 3,
                15.5f, "doberman", "Rex");
        System.out.println(rex.culoare);

//        int x = 3;
//        int z = 4;
//        String nume = "Raul";
//
//        double adunare = x + 2.3f;
//
//        System.out.println("prima adunare = " + (x + 2.3f));
//
//        adunare++;    // adunare = adunare + 1;
//        adunare += 3; // adunare = adunare + 3;
//
//        System.out.println("a doua adunare = " + adunare);
//        int scadere = x - y;
//
//        System.out.println("Rezultatul scaderii dintre " + x + " si " + y + " este " + scadere);
//
//        System.out.println(" 1+2 ");
//        System.out.println("Hello World");

//        System.out.println("T1,ex.1");
//        System.out.println("Hello \nRaul Moldovan");
//
//        System.out.println("T1,ex.2");
//        byte adunare = 8 + 7;
//        System.out.println("rezultatul adunarii dintre 8 si 7 este: " + adunare);
//
//        System.out.println("T1,ex.3");
//        byte impartire = 26 / 2;
//        System.out.println("rezultatul impartirii dintre 26 si 2 este: " + impartire);
//
//        System.out.println("T1,ex.4");
//        byte ecuatie1 = (-5 + 8 * 6);
//        System.out.println("rezultatul ecuatie1 este: " + ecuatie1);
//
//        byte ecuatie2 = ((55 + 9) % 9);
//        System.out.println("rezultatul ecuatie2 este: " + ecuatie2);
//
//        float ecuatie3 = (20 + (((-3 * 5) / 8f)));
//        System.out.println("rezultatul ecuatie3 este: " + ecuatie3);
//
//        byte ecuatie4 = (5 + 15 / 3 * 2 - 8 % 3);
//        System.out.println("rezultatul ecuatie4 este: " + ecuatie4);
//        System.out.println("\n");
//

//        System.out.print("Introdu un int: ");
//        int x = scanez.nextInt();
//        System.out.print("Introdu un String: ");
//        String y = scanez.next();
//        System.out.print("Introdu un float: ");
//        int z = scanez.nextInt();
//
//        float mySecondFloat = 3.3f;
//        System.out.println(Grafice.afisareHelloNume());
//
//        int res = adunare(2, 3);
//        System.out.println(res);
//        System.out.println(adunare(x, z));
//        System.out.println(scadere(5123, 123));
//        System.out.println(inmultire(10, 10));
//        System.out.println(impartire(5000, 100));


//        Dog rex = new Dog();
//        rex.nume = "Rex";
//        rex.culoare = "Rosu";
//        rex.greutate = 3.4f;
//        rex.rasa = "Bichon";
//        rex.varsta = 3;
//
//        Dog dingo = new Dog();
//        dingo.nume = "Dingo";
//        dingo.greutate = 35;
//        dingo.rasa = "Ciobanesc";
//        dingo.varsta = 1;
//        dingo.culoare = "Alb cu Negru";
//        dingo.alearga();
//
//        Dog gigi = new Dog();
//        gigi.nume = "Gigi";
//        gigi.rasa = "Pug";
//        gigi.culoare = "Maro";
//        gigi.varsta = 2;
//        gigi.greutate = 8;
//
//        System.out.println(rex.culoare);

//        System.out.println(product(25, 3));
//
//
//        System.out.println("   J   a  v     v  a");
//        System.out.println("   J  a a  v   v  a a");
//        System.out.println("J  J aaaaa  V V  aaaaa");
//        System.out.println(" JJ a     a  V  a     a");
//
//
//        System.out.println(averege(10, 20, 30));
//
//
//        System.out.println("  +\"\"\"\"\"+ ");
//        System.out.println(" [| o o |] ");
//        System.out.println("  |  ^  |");
//        System.out.println("  | '-' |");
//        System.out.println("  +-----+");
//
//
//        System.out.println(addition(125, 24));
//        System.out.println(substract(125, 24));
//        System.out.println(multiply(125, 24));
//        System.out.println(divide(125, 24));
//        System.out.println(remainder(125, 24));
//
//

//        Scanner convertg = new Scanner(System.in);
//        System.out.println("Introdu o temperatura in grade Fahrenheit: ");
//        float fahrenheit = convertg.nextFloat();
//        float Celsius = (fahrenheit - 32) * 5 / 9;
//
//        System.out.println("Temperatura in grade Celsius: " + Celsius);

//
//
//        Scanner convertm = new Scanner(System.in);
//        System.out.println("Introdu o valoare in inch: ");
//        double inch = convertm.nextDouble();
//        double metri = inch * 0.0254;
//        System.out.println(inch + " inchi egal cu: " + metri + " metri ");
//
//
//        float timeSeconds;
//        float mps, kph, mph;
//
//        System.out.println("Introdu distanta in metrii");
//        float distanta = scanez.nextFloat();
//
//        System.out.println("Introdu ora: ");
//        float hr = scanez.nextFloat();
//
//        System.out.println("Introdu minutele: ");
//        float min = scanez.nextFloat();
//
//        System.out.println("Introdu secundele: ");
//        float sec = scanez.nextFloat();
//
//        timeSeconds = (hr * 3600) + (min * 60) + sec;
//        mps = distanta / timeSeconds;
//        kph = (distanta / 1000.0f) / (timeSeconds / 3600.0f);
//        mph = kph / 1.609f;
//
//        System.out.println("Viteza in metri/secunda: " + mph);
//        System.out.println("Viteza in km/ora: " + kph);
//        System.out.println("Viteza in mile/ora: " + mph);


    }


//    public static int adunare(int primulNumar, int alDoileaNumar) {
//        int resultat = primulNumar + alDoileaNumar;
//        return resultat;
//    }
//
//    public static int scadere(int primulNumar, int alDolieaNumar) {
//        int resultat = primulNumar - alDolieaNumar;
//        return resultat;
//    }
//
//    public static int inmultire(int primulNumar, int alDoileaNumar) {
//        int resultat = primulNumar * alDoileaNumar;
//        return resultat;
//    }
//
//    public static int impartire(int primulNumar, int alDoileaNumar) {
//        int resultat = primulNumar / alDoileaNumar;
//        return resultat;
//    }

    public static int product(int x, int y) {
        int resultat = x * y;
        return resultat;
    }

    public static int averege(int x, int y, int z) {
        int resultat = (x + y + z) / 3;
        return resultat;
    }

    public static int addition(int firstNumber, int secondNumber) {
        int resultat = firstNumber + secondNumber;
        return resultat;
    }

    public static int multiply(int firstNumber, int secondNumber) {
        int resultat = firstNumber * secondNumber;
        return resultat;
    }

    public static int substract(int firstNumber, int secondNumber) {
        int resultat = firstNumber - secondNumber;
        return resultat;
    }

    public static int divide(int firstNumber, int secondNumber) {
        int resultat = firstNumber / secondNumber;
        return resultat;
    }

    public static int remainder(int fisrtNumber, int secondNumber) {
        int resultat = fisrtNumber % secondNumber;
        return resultat;
    }


}













