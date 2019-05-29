package Character;
import Interface.IChef;

public class Ibu extends BaseCharacter implements IChef{

	public Ibu(String name, String description) {
		super(name, description);
	}
	
	@Override
	public void Cook() {
		System.out.println(name+" bisa memasak");
	}

}
