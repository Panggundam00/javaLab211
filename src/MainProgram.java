import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args){
        System.out.println("!!!   MONSTER FIGHT   !!!");
        System.out.println("Please input monster1 name hp atk def :");

        Scanner input = new Scanner(System.in) ;
        String name = input.next() ;
        int hp = input.nextInt() ;
        int atk = input.nextInt() ;
        int def = input.nextInt() ;
        String skill ;

        Monster m1 = new Monster(name, hp, atk, def) ;

        System.out.println("Please input monster2 name hp atk def :");
        name = input.next() ;
        hp = input.nextInt() ;
        atk = input.nextInt() ;
        def = input.nextInt() ;

        int i = 1 ;
        while(true){
            System.out.println("Round : "+i);
            System.out.println(">>> Monster 1 turn <<<");
            System.out.println("Please enter skill A=attack H=heal");
            skill = input.nextLine() ;

            i++ ;
        }
    }
}
