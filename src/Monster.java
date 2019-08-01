public class Monster {
    private String name ;
    private int maxHp ;
    private int hp ;
    private int atk ;
    private int def ;
    private boolean readyToAtk ;

    public Monster(String name, int hp, int atk, int def){
        this.name = name ;
        this.hp = hp ;
        this.maxHp = hp ;
        this.atk = atk ;
        this.def = def ;
        readyToAtk = true ;
    }

    public boolean isReadyToAtk(){
        return readyToAtk ;
    }

    public void attack(Monster otherMonster){
        otherMonster.attacked(otherMonster);
    }

    private void attacked(Monster otherMoster){
        int damage ;
        damage = this.atk - otherMoster.def ;
        if (damage < 0 ){
            damage = 0 ;
        }
        otherMoster.hp -= damage ;
        if(otherMoster.hp < 0){
            otherMoster.hp = 0 ;
        }
    }

    public void heal(int restore){
        this.hp += restore ;
        if (this.hp > this.maxHp){
            this.hp = this.maxHp ;
        }
        this.readyToAtk = false ;
    }

   public void rest(){
        this.readyToAtk = true ;
   }
}
