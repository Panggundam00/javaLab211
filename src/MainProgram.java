import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Stamp s1 = new Stamp() ;
        s1.addStamp(0);
        s1.addStamp(100);
        s1.addStamp(50.99);

        System.out.println(s1.getNumberOfStamp());
    }

}
