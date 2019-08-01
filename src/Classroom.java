import java.util.ArrayList;

public class Classroom {

    private ArrayList<Students> stds ;
    private String coures ;
    private String sec ;

    public Classroom(String coures, String sec){
        this.coures = coures ;
        this.sec = sec ;
        this.stds = new ArrayList<>() ;
    }

    public void add(Students std){
        stds.add(std) ;

    }

    public String printStudent(){
       String allName = "" ;
       for (int i = 0; i < stds.size(); i++){
           allName += stds.get(i) +  "\n" ;
       }

       for (Students std: stds){
           allName += std + "\n" ;
       }

       return allName ;
    }

    public static void main(String[] args) {
//        Students[] stds = new Students[10] ;
        ArrayList<Students> stds = new ArrayList<>() ;

        stds.add(new Students("Pang", "6110400653", "m")) ;
        System.out.println(stds.size());
        stds.get(0) ;

        Classroom sec11 = new Classroom("01418211", "11") ;
        sec11.add(new Students("Pang", "6110400653", "m"));
        sec11.add(new Students("pond", "6123244", "m"));
        sec11.add(new Students("pun", "1255123", "f"));

        System.out.println(sec11.printStudent());
    }
}
