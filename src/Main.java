import java.util.Scanner;



public class Main {


    public static void main(String[] args) {


//Scanner scanez = new Scanner(System.in);
//        System.out.print("Introdu un int: ");
//int x = scanez.nextInt();
//        System.out.print("Introdu un String: ");
//String y = scanez.next();
//        System.out.print("Introdu un float: ");
//int z = scanez.nextInt();

//        System.out.println("Hello World");
//
//
//        System.out.println("Hello Raul!");
//
//        byte adunare = 7 + 8;
//        System.out.println(adunare);
//        System.out.println(" Rezultatul adunarii dintre 7 si 8 este: " + adunare);
//
//        byte impartire = 26 / 2;
//        System.out.println(impartire);
//        System.out.println(" Rezultatul impartirii dintre 26 si 2 este: " + impartire);
//
//        byte ecuatie1 = (-5 + 8 * 6);
//        System.out.println(ecuatie1);
//        System.out.println(" Rezultatul ecuatie 1 este: " + ecuatie1);
//
//        byte ecuatie2 = ((55 + 9) % 9);
//        System.out.println(ecuatie2);
//        System.out.println(" Rezultatul ecuatie 2 este: " + ecuatie2);
//
//        float ecuatie3 = (20 + (((-3) * 5) / 8));
//        System.out.println(ecuatie3);
//        System.out.println(" Rezultatul ecuatie 3 este: " + ecuatie3);
//
//        byte ecuatie4 = (5 + 15 / 3 * 2 - 8 % 3);
//        System.out.println(ecuatie4);
//        System.out.println(" Rezultatul ecuatie 4 este: " + ecuatie4)


//        int res = scadere(4, 2);
//        System.out.println(res);
//        System.out.println(scadere(5,5));
//        System.out.println(inmultire(4,5));
//        System.out.println(impartire(20,2));
//        System.out.println(adunare(16, 10));

        // exercitiul 1 //
        System.out.print("Rezultat ex1: ");
        System.out.println(product(26,26));

//        System.out.print("Rezultat ex2 ");
        System.out.println("    J    a   v     v   a   " );
        System.out.println("    J   a a   v   v   a a    ");
        System.out.println(" J  J  aaaaa   V V   aaaaa");
        System.out.println("  JJ  a     a   v   a     a");

        System.out.print("Rezultat ex3: ");
        System.out.println(average(10,20,30));

//        System.out.print("Rezultat ex4: ");
        System.out.println(" +\"\"\"\"\"+");
        System.out.println("[| o o |] ");
        System.out.println(" |  ^  | ");
        System.out.println(" | '-' | ");
        System.out.println(" +-----+  ");

        System.out.print("Rezultat ex5 adunare: ");
        System.out.println(addition(125,24));
        System.out.print("Rezultat ex5 inmultire: ");
        System.out.println(multiply(125,24));
        System.out.print("Rezultat ex5 scadere: ");
        System.out.println(subtract(125,24));
        System.out.print("Rezultat ex5 impartire: ");
        System.out.println(divide(125, 24));
        System.out.print("Rezultat ex5 rest: ");
        System.out.println(remainder(125,24));
        // exercitiul 6 //


    }
//
//
//    public static int scadere(int primulNumar, int alDoileaNumar) {
//        int resultat = primulNumar - alDoileaNumar;
//        return resultat;
//    }
//
//        public static int inmultire (int primulNumar , int alDoileaNumar){
//        int resultat = primulNumar * alDoileaNumar;
//                return resultat;
//    }
//
//    public static int impartire (int primulNumar, int alDoileaNumar) {
//        int resultat = primulNumar % alDoileaNumar;
//        return resultat;
//
//
//    public static int adunare (int primulNumar, int alDoileaNumar)
//    {
//        int resultat = primulNumar + alDoileaNumar;
//        return  resultat;
//    }

    public static int product(int firstNumber, int secondNumber)
    {
        int resultat = firstNumber * secondNumber;
        return resultat;
    }

    public static int average(int firstNumber, int secondNumber, int thirdNumber)
    {
        int resultat = (firstNumber + secondNumber + thirdNumber) / 3 ;
        return resultat;
    }
    // exercitiul 5 //
    public static int addition (int firstNumber, int secondNumber){
        int resultat = (firstNumber + secondNumber);
        return resultat;
    }
    public static int multiply (int firstNumber, int secondNumber){
        int resultat = (firstNumber * secondNumber);
        return resultat;
    }
    public static int subtract (int fisrtNumber, int secondNumber){
        int resultat = (fisrtNumber - secondNumber);
        return resultat;
    }
    public static int divide (int firstNumber, int secondNumber){
        int resultat = (firstNumber / secondNumber);
        return resultat;
    }
    public static int remainder (int firstNumber, int secondNumber){
        int resultat = (firstNumber % secondNumber);
        return resultat;
    }
    // exercitiul 6 //



    }









