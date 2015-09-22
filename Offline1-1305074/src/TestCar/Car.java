package TestCar;

/**
 * Created by Ahmed on 13/09/2015.
 */
public class Car
{
    private String name;
    private String manufacturer;
    private Driver driver;
    private int fuelCapacity;

    public Car(String name, String manufacturer, Driver driver, int fuelCapacity) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.driver = driver;
        this.fuelCapacity = fuelCapacity;
    }

    public Car(String name, String manufacturer) {
        this.name = name;
        this.manufacturer = manufacturer;
    }

    public String getName() {
        return this.name;
    }

    public String getManufacturer() {
        return this.manufacturer;
    }

    public Driver getDriver() {
        return this.driver;
    }

    public int getFuelCapacity() {
        return this.fuelCapacity;
    }

    public void refuel(int fuel) {
        fuelCapacity += fuel;
    }

    public void drive(int litres) {
        if (fuelCapacity >= litres) {
            fuelCapacity -= litres;
        }
        else System.out.println("Driving distance exceeds the car's fuel capacity!");
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public void print() {
        System.out.println(name + " Manufacturer: " + manufacturer + " Driver: " + driver.getName() + " FuelCapacity: " + fuelCapacity);
    }
}