package Character;
import Interface.IWorker;

public class Ayah extends BaseCharacter implements IWorker{

	public Ayah(String name, String description) {
		super(name, description);
	}
	
	@Override
	public void Work() {
		System.out.println(name+" bisa bekerja");
	}

}
