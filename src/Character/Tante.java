package Character;
import Interface.IChef;
import Interface.IDriver;

public class Tante extends BaseCharacter implements IChef,IDriver{
	
	public Tante(String name, String description) {
		super(name, description);
	}
	
	public void Cook() {
		System.out.println(name+" bisa memasak");
	}
	
	public void Drive() {
		System.out.println(name+" bisa menyetir");
	}
}
