import java.util.*;

import Character.Adik;
import Character.Ayah;
import Character.BaseCharacter;
import Character.Ibu;
import Character.Kakak;
import Character.Paman;
import Character.Tante;
import Interface.IArtist;
import Interface.IChef;
import Interface.IDriver;
import Interface.IWorker;


public class Main {
	
	public void cetak() {
		System.out.println("Karakter tidak bisa melakukan aksi");
	}
	
	public boolean validInput(String S) {
		boolean flag = true;
		
		if(S.length()%2 == 0){
			flag = false;
		}
		else
		{
			int temp = 0;
			for(int i=0; i < S.length();i++) {
				temp = (int) S.charAt(i) - 48;
				
				if(i%2 == 0 && (temp < 0  || temp > 5)) {
					flag = false;
				}
				else
				if(i%2 == 1 && S.charAt(i) != ',') {
					flag = false;
				}
			}
		}
		
		return flag;
	}
	
	public Main() {
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<BaseCharacter> character = new ArrayList<>();
		
		character.add(new Ayah("Ayah","seorang yang bisa bekerja"));
		character.add(new Ibu("Ibu","seorang yang bisa memasak"));
		character.add(new Paman("Paman","seorang yang bisa memasak, menyetir, bekerja, dan melukis"));
		character.add(new Tante("Tante","seorang yang bisa memasak dan menyetir"));
		character.add(new Kakak("Kakak","seorang yang bisa memasak, bekerja, dan melukis"));
		character.add(new Adik("Adik", "seorang yang tidak memiliki kemampuan apapun"));
		
		boolean exit = false;
		String actionName = "", CharacterId = "", input="";
		do {
			System.out.println("Simulasi kelompok kemampuan");
			System.out.println("0:Ayah");
			System.out.println("1:Ibu");
			System.out.println("2:Paman");
			System.out.println("3:Tante");
			System.out.println("4:Kakak");
			System.out.println("5:Adik");
			System.out.println("Ketik 'Exit' untuk keluar");
			
			do {
				System.out.print("Input : ");
				input = scanner.nextLine();
				
				if(input.equals("Exit")) {
					exit = true;
					break;
				}
				else {
					try {
						actionName = input.substring(0,input.indexOf(" "));
						CharacterId = input.substring(input.indexOf(" ")+1,input.length());
					}catch(Exception e) {
						actionName = "";
						CharacterId = "";
					}
					
				}
				
			}while(!actionName.equalsIgnoreCase("Info") && !actionName.equalsIgnoreCase("Cook") && !actionName.equalsIgnoreCase("Drive") && !actionName.equalsIgnoreCase("Work") && !actionName.equalsIgnoreCase("Paint") || !validInput(CharacterId));
			
			
			if(!exit) {
				for(int i = 0 ; i < CharacterId.length();i = i+2) {
					int index = (int) CharacterId.charAt(i) - 48;
					
					if(actionName.equalsIgnoreCase("Info")){
						character.get(index).getInfo();
					}
					else
					if(actionName.equalsIgnoreCase("Cook")) {
						if(character.get(index) instanceof IChef) {
							((IChef) character.get(index)).Cook();
						}
						else
						{
							cetak();
						}
					}
					else
					if(actionName.equalsIgnoreCase("Drive")) {
						if(character.get(index) instanceof IDriver) {
							((IDriver)character.get(index)).Drive();
						}
						else
						{
							cetak();
						}
					}
					else
					if(actionName.equalsIgnoreCase("Work")) {
						if(character.get(index) instanceof IWorker) {
							((IWorker)character.get(index)).Work();
						}
						else
						{
							cetak();
						}
					}
					else
					if(actionName.equalsIgnoreCase("Paint")) {
						if(character.get(index) instanceof IArtist) {
							((IArtist)character.get(index)).Paint();
						}
						else
						{
							cetak();
						}
					}
					
				}	
				System.out.println("Press Enter to Continue...");
				scanner.nextLine();
			}
			else
			{
				System.out.println("Thank you...");
			}
		}while(!exit);
	}

	public static void main(String[] args){
		new Main();
	}
}
