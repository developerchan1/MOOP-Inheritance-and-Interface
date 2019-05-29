package Character;

public class BaseCharacter {
    public String name;
    public String description;
    
    public BaseCharacter(String name, String description){
    	this.name = name;
    	this.description = description;
    }
    
    public void getInfo() {
    	System.out.println(name+" "+description);
    }
    
}
