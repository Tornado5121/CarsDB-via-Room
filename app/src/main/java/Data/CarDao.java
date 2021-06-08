package Data;

import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.RawQuery;
import androidx.room.Update;

import java.util.List;

import Model.Car;

public interface CarDao {

    @Insert
    long insertCar(String name, String price);

    @Query("SELECT * FROM car")
    Car getCar(long id);

    @Query("SELECT * FROM car")
    List<Car> getAllCars();

    @Update
    int updateCar(Car car);

    @Delete
    void deleteCar(Car car);
}
