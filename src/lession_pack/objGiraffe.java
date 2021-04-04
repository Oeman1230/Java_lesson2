package lession_pack;

public class objGiraffe {
    objGiraffe(StringBuffer name, Integer heidth, Integer size, Integer age, StringBuffer favoriteFood)
    {
        girName.append(name);
        girHeidth = heidth;
        girSize = size;
        girAge = age;
        girFavoriteFood.append(favoriteFood);
    }
    StringBuffer girName;
    Integer girHeidth;
    Integer girSize;
    Integer girAge;
    StringBuffer girFavoriteFood;
    void girGiveName(StringBuffer newName)
    {
        girName = new StringBuffer(newName);
        System.out.println("Теперь жирафа зовут:");
        System.out.println(girName);

    }

}
