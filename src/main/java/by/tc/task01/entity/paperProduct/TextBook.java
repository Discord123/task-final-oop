package by.tc.task01.entity.paperProduct;

public class TextBook extends PaperProduct {

    private String name = "TextBook";
    private String title;
    private String subject;
    private String author;
    private double numberOfPages;

    public String getTitle() {
        return title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(double numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TextBook textBook = (TextBook) o;

        if (Double.compare(textBook.numberOfPages, numberOfPages) != 0) return false;
        if (!name.equals(textBook.name)) return false;
        if (!title.equals(textBook.title)) return false;
        if (!subject.equals(textBook.subject)) return false;
        return author.equals(textBook.author);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name.hashCode();
        result = 31 * result + title.hashCode();
        result = 31 * result + subject.hashCode();
        result = 31 * result + author.hashCode();
        temp = Double.doubleToLongBits(numberOfPages);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name + " : ");
        sb.append("TITLE=" + title + ", ");
        sb.append("SUBJECT=" + subject + ", ");
        sb.append("AUTHOR=" + author + ", ");
        sb.append("NUMBER_OF_PAGES=" + numberOfPages + ";");
        return sb.toString();
    }
}
