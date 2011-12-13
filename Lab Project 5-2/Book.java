public class Book
{
    // Variables
    private String title;
    private String author;
    static int counter = 0;

    // Methods
    public Book (String tl, String at)
    {
        title = tl;
        author = at;
        counter++;
    }

    public String getTitle ()
    {
        return title;
    }

    public String getAuthor ()
    {
        return author;
    }

    public int compareBooks (Book bk)
    {
        // Title
        if (this.title.compareTo(bk.title) < 0)
        {
            System.out.println (this.title + " comes before " + bk.title);
            return -1;
        }
        if (this.title.compareTo(bk.title) > 0)
        {
            System.out.println (this.title + " comes after " + bk.title);
            return 1;
        }
        //Author
        if (this.author.compareTo(bk.author) < 0)
        {
            System.out.println (this.author + " comes before " + bk.author);
            return -1;
        }
        if (this.author.compareTo(bk.author) > 0)
        {
            System.out.println (this.author + " comes after " + bk.author);
            return 1;
        }
        System.out.println (this.author + " is the same as " + bk.author);
        return 0;
    }

    public String ToString ()
    {
        return title + " " + author;
    }
}