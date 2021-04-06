package lession_pack;

public class objHuman {
    objHuman(StringBuffer name, StringBuffer gender, Integer size, Integer heidth, Integer age)
    {
        humName.append(name.substring(0));
        humGender.append(gender.substring(0));
        humSize = size;
        humHeidth = heidth;
        humAge = age;
    }
    StringBuffer humName = new StringBuffer();
    StringBuffer humGender = new StringBuffer();
    Integer humSize;
    Integer humHeidth;
    Integer humAge;

    public void humDoTranning()
    {
        System.out.println(humName.substring(0) + "занимается физкультурой");
        humSize --;
    }
    public void humGetFood() {
        System.out.println(humName.substring(0) + "Плотно питается");
        humSize += 3;
    }
    public void humPetCreature(objGiraffe giraffe)
    {
        System.out.println("Жираф"+giraffe.girName.substring(0)+"получает поглаживания");
    }
    public void humGoToRoom(objRoom room)
    {
        room.roomAddCreature(humHeidth, humSize, humName);
    }
    public void humGoOutRoom(objRoom room)
    {
        room.roomWentOut(humName);
    }
}
