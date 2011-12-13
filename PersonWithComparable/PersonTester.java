/**
 *  PersonTester to test the person class's Comparable interface and toString()
 * 
 * @author Stevie Lord
 * @version July 2007
 */
public class PersonTester
{
    public static void main (String [] args)
    {
        Person al1 = new Person ("Al", "B", "Jones", 66, 140, 18, "BHS");
        Person al2 = new Person ("Al", "B", "Jones", 66, 140, 17, "BHS");
        Person al3 = new Person ("al", "B", "Jones", 66, 140, 16, "BHS");
        Person al4 = new Person ("Al", "b", "Jones", 66, 140, 15, "BHS");
        Person al5 = new Person ("Al", "B", "Smith", 66, 140, 15, "BHS");
        System.out.println (al1 + " " + al1.compareTo(al2) + " " + al2);
        System.out.println (al1 + " " + al1.compareTo(al3) + " " + al3);
        System.out.println (al1 + " " + al1.compareTo(al4) + " " + al4);
        System.out.println (al5 + " " + al5.compareTo(al1) + " " + al1);
        System.out.println (al5 + " " + al5.compareTo(al4) + " " + al5);
        System.out.println (al1.counter);
    }
}

