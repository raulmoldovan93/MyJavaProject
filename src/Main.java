import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Calculator calc = new Calculator();
        OperatiiLogice op = new OperatiiLogice();
        Grafice graf = new Grafice();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        op.printToHundred(n);

    }


//        op.sumAndAverageHundred();


//        int x = 2;
//        x += x +=x++ + ++x;
//        System.out.println(x);


//


//        Dog rex = new Dog();
//
//        rex.setNume("Rex");
//        rex.setVarsta(1);
//        rex.setCuloare("negru");
//        rex.setGreutate(15);
//        rex.setRasa("caine lup");
//
//        System.out.println(rex.getNume());
//        System.out.println(rex.getVarsta());
//        System.out.println(rex.getCuloare());
//        System.out.println(rex.getGreutate());
//        System.out.println(rex.getRasa());


////Given two numbers, see which one is the greatest and print it.
//        int x = 10;
//        int y = 15;
//
//        if (x < y) {
//            System.out.println("y mai mare ca x");
//        } else if (x > y) {
//            System.out.println("y mai mic ca y");
//        }
//
//
////Given a text input, if it is “FastTrack”, then print “Learning text comparison”. If not, print “Got to try some more”.
//        String a = "FastTrack";
//        String b = "Learning text comparison";
//        String c = "Got to try some more";
//
//        if (!a.contains("FastTrack")) {
//            System.out.println("Learning text comparison");
//        } else if (b.contains("Learning text comparison")) {
//            System.out.println("Got to try some more");
//        } else if (c.equals("Got to try some more")) {
//            System.out.println("Got to try some more");
//        }

////Given a number, if it’s equal to or higher than 2 and equal to or lower than 8, print the number.
//        int z = 20;
//
//        if (z >= 2) {
//            System.out.println("z mai mare sau egal cu 2");
//        } else if (z <= 8) {
//            System.out.println("z mai mic sau egal cu 8");
//        }
//
////     Given a text input and a number input, if the text is equal to “FastTrack” AND the number is equal to or lower than 3,
////     print the text and the number. If the text is not “FastTrack” AND the number is equal to or higher than 4, print the number
////     and the text, in this order.
//
//        String text = "Peaky Blinders";
//        int number = 1919;
//
//        if (!text.equals("FastTrack")) {
//            System.out.println(text);
//        } else if (number <= 3) {
//            System.out.println(number);
//        }
//        if (text.equals("FastTrack")) {
//            System.out.println(text);
//        } else if (number >= 4) {
//            System.out.println(number);
//        }
//
////Given a number input, if it is higher than 8 OR equal to 6, print “The amount of snow
////this winter was(cm):” and the given number. Else print “The forecast snow is(cm):”.
//
//        int a = 10;
//        if (a >= 6) {
//            System.out.println("The amount of snow this winter was (cm):" + a);
//        } else {
//            System.out.println("The forecast snow is (cm)");
//        }
//// Given a number input, if the number is greater than 3 but not equal to 4, print “The
////number is greater than 3 and not equal to 4”. Else if the number is equal to 4 print
////”The number is equal to 4”. Else if the number is lower than 3 print “The number is
////lower than 3”.
//
//        int x = 5;
//        if (x >= 3) {
//            System.out.println("The number is greater than 3 and not equal to 4");
//        } else if (x == 4) {
//            System.out.println("The number is equal to 4");
//        } else if (x < 3) {
//            System.out.println("The number is lower than 3");
//        }
//
////If the user pressed number keys( from 0 to 9), the program will tell the number that is
////pressed, otherwise, program will show "Not allowed”. (use a switch case for this).
//
//        System.out.println("Tasteaza un numar");
//        int numar = scanner.nextInt();
//        switch (numar) {
//            case 0:
//                System.out.println("0");
//                break;
//            case 1:
//                System.out.println("1");
//                break;
//            case 2:
//                System.out.println("2");
//                break;
//            case 3:
//                System.out.println("3");
//                break;
//            case 4:
//                System.out.println("4");
//                break;
//            case 5:
//                System.out.println("5");
//                break;
//            case 6:
//                System.out.println("6");
//                break;
//            case 7:
//                System.out.println("7");
//                break;
//            case 8:
//                System.out.println("8");
//            case 9:
//                System.out.println("9");
//                break;
//        }


}


//    int x = 3;
//    int z = 4;
//
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
//
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

//        System.out.println("   J   a  v     v  a");
//        System.out.println("   J  a a  v   v  a a");
//        System.out.println("J  J aaaaa  V V  aaaaa");
//        System.out.println(" JJ a     a  V  a     a");

//        System.out.println("  +\"\"\"\"\"+ ");
//        System.out.println(" [| o o |] ");
//        System.out.println("  |  ^  |");
//        System.out.println("  | '-' |");
//        System.out.println("  +-----+");

//        Scanner convertg = new Scanner(System.in);
//        System.out.println("Introdu o temperatura in grade Fahrenheit: ");
//        float fahrenheit = convertg.nextFloat();
//        float Celsius = (fahrenheit - 32) * 5 / 9;
//
//        System.out.println("Temperatura in grade Celsius: " + Celsius);
//
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
















