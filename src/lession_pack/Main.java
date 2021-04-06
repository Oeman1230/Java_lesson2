package lession_pack;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	StringBuffer name1 = new StringBuffer("kolya");
	StringBuffer name2 = new StringBuffer("Pasha");
	StringBuffer favFod = new StringBuffer("tres");
	Scanner keyboard = new Scanner(System.in);
	objGiraffe giraffe = new objGiraffe(name1, 100, 10, favFod);

	StringBuffer lookGir = new StringBuffer("Посмотреть жирафа");
	StringBuffer lookHum = new StringBuffer("Посмотреть человека");
	StringBuffer lookRoom = new StringBuffer("Посмотреть комнату");
	StringBuffer DoExit = new StringBuffer("Выход");
	giraffe.girGiveName(name2);
	StringBuffer keybuffer = new StringBuffer();
	Integer i;
	i = 0;
		System.out.println("Кого вы хотите посмотреть?");
		System.out.println(lookHum);
		System.out.println(lookGir);
		System.out.println(lookRoom);
		System.out.println("Выход");
		while(i != 1)
	{

		keybuffer.delete(0,keybuffer.length());

		keybuffer.append(keyboard.nextLine());
		System.out.println(keybuffer);


		if(keybuffer.toString().equals(lookGir.toString()))
		{
			System.out.println("giraffe actions");
			continue;
		}
		if(keybuffer.toString().equals(lookHum.toString()))
		{
			System.out.println("human actions");
			continue;
		}
		if(keybuffer.toString().equals(lookRoom.toString()))
		{
			System.out.println("room actions");
			continue;
		}
		if(keybuffer.toString().equals(DoExit.toString()))
		{
			i = 1;
			break;
		}
		System.out.println("Неверная комманда");
	}
    }
}
