import java.time.LocalDateTime;

public class Students {

    private String name ;
    private String id ;
    private String gender ;

    public Students(String name, String id, String gender) {
        this.name = name;
        this.id = id;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getId() {
        return id;
    }

    public void sleep(LocalDateTime time){

        System.out.println(time);

    }

    public String toString(){
        return "name:" + this.name + " id:" + this.id + " gender:" + this.gender ;
    }

}
