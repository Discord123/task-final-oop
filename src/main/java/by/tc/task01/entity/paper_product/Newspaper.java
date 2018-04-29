package by.tc.task01.entity.paper_product;

import by.tc.task01.entity.Product;

import java.io.Serializable;

public class Newspaper implements Product, Serializable {

    private static final long serialVersionUID = -1830436133822379731L;

    private String name = "Newspaper";
    private String title;
    private String periodicity;
    private String paidOrFree;

    public Newspaper() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPeriodicity() {
        return periodicity;
    }

    public void setPeriodicity(String periodicity) {
        this.periodicity = periodicity;
    }

    public String getPaidOrFree() {
        return paidOrFree;
    }

    public void setPaidOrFree(String paidOrFree) {
        this.paidOrFree = paidOrFree;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Newspaper newspaper = (Newspaper) o;

        if (title != null ? !title.equals(newspaper.title) : newspaper.title != null) return false;
        if (periodicity != null ? !periodicity.equals(newspaper.periodicity) : newspaper.periodicity != null)
            return false;
        return paidOrFree != null ? paidOrFree.equals(newspaper.paidOrFree) : newspaper.paidOrFree == null;
    }

    @Override
    public int hashCode() {
        int result = title != null ? title.hashCode() : 0;
        result = 31 * result + (periodicity != null ? periodicity.hashCode() : 0);
        result = 31 * result + (paidOrFree != null ? paidOrFree.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name + " : ");
        sb.append("TITLE=" + title + ", ");
        sb.append("PERIODICITY=" + periodicity + ", ");
        sb.append("PAID_OR_FREE=" + paidOrFree + ";");
        return sb.toString();
    }
}
