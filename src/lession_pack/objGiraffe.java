package lession_pack;

public class objGiraffe {
    objGiraffe(StringBuffer name, Integer heidth, Integer size, Integer age, StringBuffer favoriteFood)
    {

        girName.append(name.substring(0));
        girHeidth = heidth;
        girSize = size;
        girAge = age;
        girFavoriteFood.append(favoriteFood.substring(0));
    }
    StringBuffer girName = new StringBuffer();
    Integer girHeidth;
    Integer girSize;
    Integer girAge;
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
}
