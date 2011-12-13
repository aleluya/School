public class Patron
{
    // Variables
    String name;
    Book book1, book2, book3;
    static int counter = 0;

    // Methods
    public Patron (String nm)
    {
        name = nm;
        counter++;
    }

    public void Borrow (Book nm)
    {
        if (book1 == null)
            book1 = nm;
        else if (book2 == null)
            book2 = nm;
        else if (book3 == null)
            book3 = nm;
        else
            System.out.println ("This user has three books borrowed already. Please, return at least one");
    }

    public void Return (Book nm)
    {
        if (nm == null)
            System.out.println ("This book does not exist");
        else
        {
            if (book1 == nm)
                book1 = null;
            else if (book2 == nm)
                book2 = null;
            else if (book3 == nm)
                book3 = null;
            else
                System.out.println ("This user does not own this book");
        }
    }

    public Book getBook (int bk)
    {
        if (bk == 1)
            return book1;
        if (bk == 2)
            return book2;
        if (bk == 3)
            return book3;
        return null;
    }

    public String toString ()
    {
        if (book1 == null)
            return null;
        if (book2 == null)
            return name + " " + book1;
        if (book3 == null)
            return name + " " + book1 + " " + book2;
        return name + " " + book1 + " " + book2 + " " + book3;
    }
}