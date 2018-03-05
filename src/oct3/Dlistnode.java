package oct3;

/**
 * Created by brahmanandakar on 04/10/17.
 */
public class Dlistnode {

    Dlistnode prev,next;
    String key ;
    Integer value;


    public Dlistnode(){
        prev=next=this;
    }

    public Dlistnode(String key,Integer value){
        super();
        this.key=key;
        this.value=value;

    }




}
