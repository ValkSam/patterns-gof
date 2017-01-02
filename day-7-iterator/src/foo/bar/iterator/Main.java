package foo.bar.iterator;

public class Main {

    public static void main(String[] args) {

        BooksCollection books = new BooksCollection();

        IIterator iterator = books.createIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
