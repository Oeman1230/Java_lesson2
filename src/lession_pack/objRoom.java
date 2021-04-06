package lession_pack;

public class objRoom
{
    objRoom(StringBuffer name, Integer area, Integer heidth, Integer windows){
        roomName.append(name.substring(0));
        roomArea = area;
        roomHeidth = heidth;
        roomWindowsCount = windows;
        roomCreaturesCount = 0;
    }


    StringBuffer roomName = new StringBuffer();
    Integer roomArea;
    Integer roomHeidth;
    Integer roomWindowsCount;
    Integer roomCreaturesCount;
    public void roomAddCreature(Integer creatureHeidth, Integer creatureSize, StringBuffer CreatureName)
    {
        if(creatureHeidth < roomHeidth && creatureSize < roomArea)
        {
            roomCreaturesCount ++;
            System.out.println("В комнату пришел(а)");
            System.out.println(CreatureName);
        }
    }
    public void roomAddWindow(Integer winCount){
        roomWindowsCount += winCount;
        System.out.println("добавлено" + winCount+ "окон" );
    }
    public void roomAddArea(Integer addArea){
        roomArea += addArea;
        System.out.println("Добавлено" + addArea +"Квадратных метров");
    }
    public void roomParty()
    {
        if(roomWindowsCount > 2)
        {
            System.out.println("Вечеринка началась с "+ roomWindowsCount+ "существами");
        }
        else
        {
            System.out.println("недостаточно существ для вечеринки");
        }
    }
    public void roomWentOut(StringBuffer CreatureName)
    {
        if(roomCreaturesCount >= 1)
        {
            System.out.println("Вышел из комнаты:");
            System.out.println(CreatureName);
            roomCreaturesCount --;
        }
        else
        {
            System.out.println("здесь никого нет");
        }
    }

    @Override
    public String toString() {
        return "objRoom{" +
                "roomName=" + roomName +
                ", roomArea=" + roomArea +
                ", roomHeidth=" + roomHeidth +
                ", roomWindowsCount=" + roomWindowsCount +
                ", roomCreaturesCount=" + roomCreaturesCount +
                '}';
    }
}