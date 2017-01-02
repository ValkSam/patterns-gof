package model;

/**
 * Created by ValkSam on 16.10.2016.
 */
public class Currency {
    int id;

    public Currency(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Currency{" +
                "id=" + id +
                '}';
    }
}
