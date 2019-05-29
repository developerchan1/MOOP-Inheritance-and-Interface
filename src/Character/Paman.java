package Character;
import Interface.IArtist;
import Interface.IChef;
import Interface.IDriver;
import Interface.IWorker;

public class Paman extends BaseCharacter implements IChef,IDriver,IWorker,IArtist{
	
	public Paman(String name, String description) {
		super(name,description);
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
	public void Drive() {
		System.out.println(name+" bisa menyetir");
	}

	@Override
	public void Cook() {
		System.out.println(name+" bisa memasak");
	}
	
	
	
}
