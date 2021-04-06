package lession_pack;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

	Scanner keyboard = new Scanner(System.in);
		StringBuffer name1 = new StringBuffer("Паша");
		StringBuffer name2 = new StringBuffer("Коля");
		StringBuffer name3 = new StringBuffer("Влад");
		StringBuffer food1 = new StringBuffer("Мясо");
		StringBuffer food2 = new StringBuffer("Листья");
		StringBuffer food3 = new StringBuffer("Яблоки");

	objGiraffe giraffe = new objGiraffe(name2,100,15, food2);

	StringBuffer lookGir = new StringBuffer("Посмотреть жирафа");
	StringBuffer lookHum = new StringBuffer("Посмотреть человека");
	StringBuffer lookRoom = new StringBuffer("Посмотреть комнату");
	StringBuffer DoExit = new StringBuffer("Выход");
	StringBuffer keybuffer = new StringBuffer();
	Integer i;
	Integer j;
	Integer key;
	j = 0;
	i = 0;

		while(i != 1)
	{
		System.out.println("Кого вы хотите посмотреть?");
		System.out.println(lookHum);
		System.out.println(lookGir);
		System.out.println(lookRoom);
		System.out.println("Выход //из программы");
		keybuffer.delete(0,keybuffer.length());

		keybuffer.append(keyboard.nextLine());
		System.out.println(keybuffer);

///////////////////////////////////////
		if(keybuffer.toString().equals(lookGir.toString()))
		{
			System.out.println("giraffe actions");
			while (j!=1)
			{
				System.out.println(giraffe.toString());

				System.out.println("Выберите действие:");
				System.out.println(lookGir);
				System.out.println("Дать имя жирафу:");
				System.out.println("Покормить жирафа");
				System.out.println("Поднять или опустить голову");
				System.out.println("Покатать кого нибудь на жирафе");
				System.out.println("Послушать жирафа");
				System.out.println("Выход");
				keybuffer.delete(0,keybuffer.length());
				keybuffer.append(keyboard.nextLine());
				if(keybuffer.toString().equals(DoExit.toString()))
				{
					j = 1;
					break;
				}
				if(keybuffer.toString().equals(lookGir.toString()))
				{
					System.out.println(giraffe.toString());
				}
				if(keybuffer.toString().equals("Покормить жирафа"))
				{
					System.out.println("Чем?");
					while (true)
					{
						System.out.println("Доступная еда:");
						System.out.println("Еда 1:"+food1);
						System.out.println("Еда 2:"+food2);
						System.out.println("Еда 3:"+food3);
						System.out.println("Выход");
						keybuffer.delete(0,keybuffer.length());
						keybuffer.append(keyboard.nextLine());
						if(keybuffer.toString().equals("Еда 1"))
						{
							giraffe.girFeedGiraffe(food1);
							break;
						}
						if(keybuffer.toString().equals("Еда 2"))
						{
							giraffe.girFeedGiraffe(food2);
							break;
						}
						if(keybuffer.toString().equals("Еда 3"))
						{
							giraffe.girFeedGiraffe(food3);
							break;
						}
						if(keybuffer.toString().equals(DoExit.toString()))
						{
							break;
						}
					}
				}
				if(keybuffer.toString().equals("Дать имя жирафу")) {
					while (true)
					{

						System.out.println("Доступные имена:");
						System.out.println("Имя 1:"+name1);
						System.out.println("Имя 2:"+name2);
						System.out.println("Имя 3:"+name3);
						System.out.println("Выход");
						keybuffer.delete(0,keybuffer.length());
						keybuffer.append(keyboard.nextLine());
						if(keybuffer.toString().equals("Имя 1"))
						{
							giraffe.girGiveName(name1);
							break;
						}
						if(keybuffer.toString().equals("Имя 2"))
						{
							giraffe.girGiveName(name2);
							break;
						}
						if(keybuffer.toString().equals("Имя 3"))
						{
							giraffe.girGiveName(name3);
							break;
						}
						if(keybuffer.toString().equals(DoExit.toString()))
						{
							break;
						}
					}
				if(keybuffer.toString().equals("Послушать жирафа"))
				{
					giraffe.girMakeSound();
					break;
				}


				}
				break;
			}
			continue;
		}
///////////////////////////////////////
		if(keybuffer.toString().equals(lookHum.toString()))
		{
			System.out.println("human actions");
			continue;
		}
///////////////////////////////////////
		if(keybuffer.toString().equals(lookRoom.toString()))
		{
			System.out.println("room actions");
			continue;
		}
///////////////////////////////////////
		if(keybuffer.toString().equals(DoExit.toString()))
		{
			i = 1;
			break;
		}
		System.out.println("Неверная комманда");
	}
    }

}