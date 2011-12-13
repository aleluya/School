public class LibraryTest
{
    public static void main (String [] args)
    {
        // Initializations
        System.out.println("****************************************");
        System.out.println("**********Hello to the Library**********");
        System.out.println("****************************************");
        
        System.out.println("Here you have the options:");
        Patron me = new Patron ("Adria");
        Book book1 = new Book ("Don Quijote de la Mancha", "Cervantes");
        Book book2 = new Book ("La fortaleza digital", "Dan Brown");
        Book book3 = new Book ("La fortaleza digital", "Dan Brown");

        // Borrowing   
        me.Borrow (book1);
        me.Borrow (book2);

        // Checking title
        System.out.println (me.getBook(1).getTitle());
        System.out.println (me.getBook(2).getTitle());

        // Comparing books
        book2.compareBooks(book1);
        
        // Return book
        me.Return (book1);
    }
}
