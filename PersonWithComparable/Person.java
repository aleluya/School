
/**
 * Person created to test Comparable by first names (& toString)
 * 
 * @author Stevie Lord
 * @version July 2007
 */
public class Person implements Comparable
{
    static int counter = 0;
    private String first;
    private String middle;
    private String last;
    private int height;
    private int weight;
    private int age;
    private String school;

    public Person ()
    {
        first = "z";
        middle = "zz";
        last = "zzz";
        height = 12;
        weight = 20;
        age = 1;
        school = "none";
        counter++;
    }

    public Person (String f, String m, String l, int h, int w, int a, String sch)
    {
        first = f;
        middle = m;
        last = l;
        height = h;
        weight = w;
        age = a;
        school = sch;
        counter++;
    }

    public boolean equals (Object other)
    {
        Person o = (Person) other;
        if ( ! this.first.equals(o.first) )
            return false;
        if ( ! this.last.equals(o.last) )
            return false;
        if ( ! this.middle.equals(o.middle) )
            return false;
        return true;

        // return this.compareTo(other) == 0;
    }

    // comparing by first names (then last, then middle)
    public int compareTo(Object other)
    {
        Person o = (Person) other;
        if ( this.first.compareTo(o.first) < 0)
            return -1;                              // canÕt just return results of ifÕs test
        if ( this.first.compareTo(o.first) > 0)
            return 1;   

        // first names are equal (or else would already have returned out of method         
        if ( this.last.compareTo(o.last) < 0)
            return -1;                              
        if ( this.last.compareTo(o.last) > 0)
            return 1;                   

        // first and names are equal (or else would already have returned out of method     
        if ( this.middle.compareTo(o.middle) < 0)
            return -1;                              
        if ( this.middle.compareTo(o.middle) > 0)
            return 1;   
            
        if ( this.age < (o.age))
            return -1;                              // canÕt just return results of ifÕs test
        if ( this.age > (o.age))
            return 1;
        // first, middle and last are all equal
        return 0;               
    }

    public String toString()
    {
        return first + " " + middle + " " + last;
    }

}
