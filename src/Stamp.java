public class Stamp {
    private int numberOfStamp ;

    public Stamp(){
        this.numberOfStamp = 0 ;
    }

    public int getNumberOfStamp() {
        return numberOfStamp;
    }

   public void addStamp(double cost){
        this.numberOfStamp += cost/50 ;
   }
}
