package foo.bar.iterator;

public class BooksCollection implements IContainer {

    private String titles[] = { "Design Patterns", "1", "2", "3", "4" };

    public IIterator createIterator() {
        return new BookIterator();
    }

    private class BookIterator implements IIterator {
        private int position = 0;

        public boolean hasNext() {
            return (position < titles.length);
        }

        public Object next() {
            if (this.hasNext()) {
                return titles[position++];
            } else {
                return null;
            }
        }
    }
}
