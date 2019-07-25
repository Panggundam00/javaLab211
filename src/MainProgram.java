import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Fraction f1 = new Fraction(10, 20) ;
        Fraction f2 = new Fraction(50, 60) ;
        Fraction f3 = f1.add(f2) ;

        System.out.println(f1+" + "+f2+" = "+f3);
    }

}
