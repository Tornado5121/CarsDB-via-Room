package Model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Car {
    @PrimaryKey
    private long id;

    @ColumnInfo(name = "name")
    private String name;

    @ColumnInfo(name = "price")
    private String price;

    public Car() {
    }

    public Car(long id, String name, String price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Car(String name, String price) {
        this.name = name;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
