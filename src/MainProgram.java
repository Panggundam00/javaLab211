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
        int recovery ;

        Monster m1 = new Monster(name, hp, atk, def) ;

        System.out.println("Please input monster2 name hp atk def :");
        name = input.next() ;
        hp = input.nextInt() ;
        atk = input.nextInt() ;
        def = input.nextInt() ;

        Monster m2 = new Monster(name, hp, atk, def) ;

        int i = 1 ;
        while(true){
            System.out.println("Round : "+i);
            System.out.println(">>> Monster 1 turn <<<");
            if (m1.isReadyToAtk()){
                System.out.println("Please enter skill A=attack H=heal");
                skill = input.next() ;
                if (skill.equals("a") || skill.equals("A")){
                    m1.attack(m2);
                }
                if (skill.equals("h") || skill.equals("H")){
                    System.out.println("Please enter recovery hp : ");
                    recovery = input.nextInt() ;
                    m1.heal(recovery);
                }
                System.out.println("Monster "+m1.getName()+" atk : "+m1.getAtk()+" def : "+m1.getDef()+" hp : "+m1.getHp()+"/"+m1.getMaxHp());
                System.out.println("Monster "+m2.getName()+" atk : "+m2.getAtk()+" def : "+m2.getDef()+" hp : "+m2.getHp()+"/"+m2.getMaxHp());
            }
            else{
                System.out.println("Monster 1 Can't use skill");
                m1.rest();
            }

            if (m2.getHp() < 1){
                System.out.println("");
                System.out.println("The Winner Is ..........");
                System.out.println("Monster "+m1.getName()+" atk : "+m1.getAtk()+" def : "+m1.getDef()+" hp : "+m1.getHp()+"/"+m1.getMaxHp());
                break;
            }

            System.out.println(">>> Monster 2 turn <<<");
            if (m2.isReadyToAtk()){
                System.out.println("Please enter skill A=attack H=heal");
                skill = input.next() ;
                if (skill.equals("a") || skill.equals("A")){
                    m2.attack(m1);
                }
                if (skill.equals("h") || skill.equals("H")){
                    System.out.println("Please enter recovery hp : ");
                    recovery = input.nextInt() ;
                    m2.heal(recovery);
                }
                System.out.println("Monster "+m1.getName()+" atk : "+m1.getAtk()+" def : "+m1.getDef()+" hp : "+m1.getHp()+"/"+m1.getMaxHp());
                System.out.println("Monster "+m2.getName()+" atk : "+m2.getAtk()+" def : "+m2.getDef()+" hp : "+m2.getHp()+"/"+m2.getMaxHp());
            }
            else{
                System.out.println("Monster 2 Can't use skill");
                m2.rest();
            }

            if (m1.getHp() < 1){
                System.out.println("");
                System.out.println("The Winner Is ..........");
                System.out.println("Monster "+m2.getName()+" atk : "+m2.getAtk()+" def : "+m2.getDef()+" hp : "+m2.getHp()+"/"+m2.getMaxHp());
                break;
            }

            System.out.println("");
            i++ ;
        }
    }
}

