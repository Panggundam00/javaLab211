public class Monster {
    private String name ;
    private int maxHp ;
    private int hp ;
    private int atk ;
    private int def ;
    private boolean readyToAtk ;

    public Monster(String name, int hp, int atk, int def){
        this.name = name ;
        if(hp < 1){
            hp = 1 ;
        }
        this.hp = hp ;
        this.maxHp = hp ;
        if(atk < 0){
            atk = 0 ;
        }
        this.atk = atk ;
        if(def < 0){
            def = 0 ;
        }
        this.def = def ;
        readyToAtk = true ;
    }

    public String getName(){
        return name ;
    }

    public int getAtk() {
        return atk;
    }

    public int getDef() {
        return def;
    }

    public int getHp() {
        return hp;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public boolean isReadyToAtk(){
        return readyToAtk ;
    }

    public void attack(Monster otherMoster){
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
        if(restore < 0){
            restore = 0 ;
        }
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
