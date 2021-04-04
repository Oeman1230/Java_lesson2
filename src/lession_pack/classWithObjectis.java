package lession_pack;

public class classWithObjectis {
    public class objRoom
    {
        objRoom(){
            roomName = new StringBuffer();
        }

        StringBuffer roomName;
        Integer roomArea;
        Integer roomHeidth;
        Integer roomWindowsCount;
        Integer roomCreaturesCount;

        void roomAddCreature(Integer creatureHeidth, Integer creatureSize, StringBuffer CreatureName)
        {
            if(creatureHeidth < roomHeidth && creatureSize < roomArea)
            {
                roomCreaturesCount ++;
                System.out.println("В комнату пришел(а)");
                System.out.println(CreatureName);
            }
        }
        void roomAddWindow(Integer winCount){
            roomWindowsCount += winCount;
            System.out.println("добавлено" + winCount+ "окон" );
        }
        void roomAddArea(Integer addArea){
            roomArea += addArea;
            System.out.println("Добавлено" + addArea +"Квадратных метров");
        }
        void roomParty()
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
        void roomWentOut(StringBuffer CreatureName)
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
    }
}
