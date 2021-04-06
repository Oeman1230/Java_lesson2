package lession_pack;

import java.util.Scanner;

public class Main {


	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		StringBuffer name1 = new StringBuffer("Паша");
		StringBuffer name2 = new StringBuffer("Коля");
		StringBuffer name3 = new StringBuffer("Влад");
		StringBuffer roomName = new StringBuffer("Зоо магазин");
		StringBuffer food1 = new StringBuffer("Мясо");
		StringBuffer food2 = new StringBuffer("Листья");
		StringBuffer food3 = new StringBuffer("Яблоки");
		StringBuffer gender = new StringBuffer("male");
		objGiraffe giraffe = new objGiraffe(name2, 100, 15, food2);
		objHuman human = new objHuman(name1, gender, 5, 10, 20);
		objRoom room = new objRoom(roomName, 11, 52, 3);
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

		while (i != 1) {
			System.out.println("Кого вы хотите посмотреть?");
			System.out.println(lookHum);
			System.out.println(lookGir);
			System.out.println(lookRoom);
			System.out.println("Выход //из программы");
			keybuffer.delete(0, keybuffer.length());

			keybuffer.append(keyboard.nextLine());
			System.out.println(keybuffer);

//////////////////////////////////////////////////////////////////////////////
			if (keybuffer.toString().equals(lookGir.toString())) {
				while (j != 1) {
					System.out.println(giraffe.toString());

					System.out.println("Выберите действие:");
					System.out.println(lookGir);
					System.out.println("Дать имя жирафу:");
					System.out.println("Покормить жирафа");
					System.out.println("Поднять или опустить голову");
					System.out.println("Покатать на жирафе");
					System.out.println("Послушать жирафа");
					System.out.println("Выход");
					keybuffer.delete(0, keybuffer.length());
					keybuffer.append(keyboard.nextLine());
					if (keybuffer.toString().equals("Покатать на жирафе")) {
						giraffe.girRideGirrafe(human.humSize, human.humName);
					}
					if (keybuffer.toString().equals(DoExit.toString())) {
						j = 1;
						break;
					}
					if (keybuffer.toString().equals(lookGir.toString())) {
						System.out.println(giraffe.toString());
					}
					if (keybuffer.toString().equals("Послушать жирафа")) {
						giraffe.girMakeSound();
					}
					if (keybuffer.toString().equals("Поднять или опустить голову")) {
						giraffe.girHeadPosChange();
					}
					if (keybuffer.toString().equals("Покормить жирафа")) {
						System.out.println("Чем?");
						while (true) {
							System.out.println("Доступная еда:");
							System.out.println("Еда 1:" + food1);
							System.out.println("Еда 2:" + food2);
							System.out.println("Еда 3:" + food3);
							System.out.println("Выход");
							keybuffer.delete(0, keybuffer.length());
							keybuffer.append(keyboard.nextLine());
							if (keybuffer.toString().equals("Еда 1")) {
								giraffe.girFeedGiraffe(food1);
								break;
							}
							if (keybuffer.toString().equals("Еда 2")) {
								giraffe.girFeedGiraffe(food2);
								break;
							}
							if (keybuffer.toString().equals("Еда 3")) {
								giraffe.girFeedGiraffe(food3);
								break;
							}
							if (keybuffer.toString().equals(DoExit.toString())) {
								break;
							}
						}
					}
					if (keybuffer.toString().equals("Дать имя жирафу")) {
						while (true) {

							System.out.println("Доступные имена:");
							System.out.println("Имя 1:" + name1);
							System.out.println("Имя 2:" + name2);
							System.out.println("Имя 3:" + name3);
							System.out.println("Выход");
							keybuffer.delete(0, keybuffer.length());
							keybuffer.append(keyboard.nextLine());
							if (keybuffer.toString().equals("Имя 1")) {
								giraffe.girGiveName(name1);
								break;
							}
							if (keybuffer.toString().equals("Имя 2")) {
								giraffe.girGiveName(name2);
								break;
							}
							if (keybuffer.toString().equals("Имя 3")) {
								giraffe.girGiveName(name3);
								break;
							}
							if (keybuffer.toString().equals(DoExit.toString())) {
								break;
							}
						}
					}
				}
				continue;
			}
//////////////////////////////////////////////////////////////////////////////
			if (keybuffer.toString().equals(lookHum.toString())) {
				while (true) {
					System.out.println(human.toString());

					System.out.println("Выберите действие:");
					System.out.println("Покормить человека");
					System.out.println("Потренироваться");
					System.out.println("Погладить жирафа");
					System.out.println("Пойти в комнату");
					System.out.println("Выйти из комнаты");
					System.out.println("Выход");
					keybuffer.delete(0, keybuffer.length());
					keybuffer.append(keyboard.nextLine());
					if (keybuffer.toString().equals("Покормить человека")) {
						human.humGetFood();
					}
					if (keybuffer.toString().equals("Потренироваться")) {
						human.humDoTranning();
					}
					if(keybuffer.toString().equals("Погладить жирафа"))
					{
						human.humPetCreature(giraffe);
					}
					if (keybuffer.toString().equals(DoExit.toString())) {
						break;
					}
					if (keybuffer.toString().equals("Пойти в комнату")) {
						human.humGoToRoom(room);
					}
					if (keybuffer.toString().equals("Выйти из комнаты")) {
						human.humGoOutRoom(room);
					}

				}
				continue;
			}
//////////////////////////////////////////////////////////////////////////////
			if (keybuffer.toString().equals(lookRoom.toString())) {
				while (true) {
					System.out.println(room.toString());

					System.out.println("Выберите действие:");
					System.out.println("Загнать жирафа");
					System.out.println("Добавить окно");
					System.out.println("Выгнать жирафа");
					System.out.println("Добавить площадь");
					System.out.println("Устроить вечерику");
					System.out.println("Выход");
					keybuffer.delete(0, keybuffer.length());
					keybuffer.append(keyboard.nextLine());
					if (keybuffer.toString().equals(DoExit.toString())) {
						break;
					}
					if (keybuffer.toString().equals("Загнать жирафа")) {
						room.roomAddCreature(giraffe.girHeidth, giraffe.girSize, giraffe.girName);
					}
					if (keybuffer.toString().equals("Выгнать жирафа")) {
						room.roomWentOut(giraffe.girName);
					}
					if (keybuffer.toString().equals("Добавить окно")) {
						room.roomAddWindow(1);
					}
					if (keybuffer.toString().equals("Добавить площадь")) {
						System.out.println("Сколько?");
						room.roomAddArea(keyboard.nextInt());
					}
					if (keybuffer.toString().equals("Устроить вечерику")) {
						room.roomParty();
					}
				}
				continue;
			}
//////////////////////////////////////////////////////////////////////////////
				if (keybuffer.toString().equals(DoExit.toString())) {
					i = 1;
					break;
				}
				System.out.println("Неверная комманда");
		}
	}
}