package lession_pack;

public class objGiraffe {
    objGiraffe(StringBuffer name, Integer heidth, Integer size, StringBuffer favoriteFood)
    {

        girName.append(name.substring(0));
        girHeidth = heidth;
        girSize = size;
        girFavoriteFood.append(favoriteFood.substring(0));
        headUp = true;
    }
    StringBuffer girName = new StringBuffer();
    Integer girHeidth;
    Integer girSize;
    boolean headUp;
    StringBuffer girFavoriteFood = new StringBuffer() ;
    public void girGiveName(StringBuffer newName)
    {
        girName = new StringBuffer(newName);
        System.out.println("Теперь жирафа зовут:");
        System.out.println(girName);

    }
    public void girFeedGiraffe(StringBuffer food)
    {
        if(food == girFavoriteFood)
        {
            System.out.println("Жирафу нравится еда");
            girSize+=2;
        }
        else
        {
            System.out.println("Жираф кушает");
            girSize++;
        }
    }
    public void girHeadPosChange()
    {
        if(headUp = true)
        {
            System.out.println("Жираф опустил голову");
            headUp = false;
            girHeidth /= 2;
        }
        else
        {
            System.out.println("Жираф поднял голову");
            headUp = true;
            girHeidth *= 2;
        }
    }
    public void girRideGirrafe(Integer craatureSize, StringBuffer name)
    {
        if(girSize < craatureSize)
        {
            System.out.println("Жираф катает на себе существо:"+name);
        }
        else
        {
            System.out.println("Жираф не может поднять это");
        }
    }
    public void girMakeSound()
    {
        System.out.println("Жираф мычит");
    }
}
