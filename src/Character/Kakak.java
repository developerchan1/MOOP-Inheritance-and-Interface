package Character;
import Interface.IArtist;
import Interface.IChef;
import Interface.IWorker;

public class Kakak extends BaseCharacter implements IChef, IWorker, IArtist{

	public Kakak(String name, String description) {
		super(name, description);
	}

	@Override
	public void Paint() {
		System.out.println(name+" bisa melukis");
	}

	@Override
	public void Work() {
		System.out.println(name+" bisa bekerja");
		
	}

	@Override
	public void Cook() {
		System.out.println(name+" bisa smemasak");
	}
	
}
