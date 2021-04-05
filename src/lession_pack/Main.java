package lession_pack;

public class Main {

    public static void main(String[] args) {
	StringBuffer name1 = new StringBuffer("kolya");
	StringBuffer name2 = new StringBuffer("Pasha");
	StringBuffer favFod = new StringBuffer("tres");
	objGiraffe giraffe = new objGiraffe(name1, 100, 10, favFod);
	giraffe.girGiveName(name2);
    }
}
