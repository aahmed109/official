package TestCar;

/**
 * Created by Ahmed on 13/09/2015.
 */
public class Driver
{
    private String name;
    private int age;
    private String country;

    public Driver()
    {

    }

    public Driver(String name, int age, String country)
    {
        this.name=name;
        this.age=age;
        this.country=country;
    }

    public Driver(String name, int age)
    {
        this.name=name;
        this.age=age;
    }

    public String getName()
    {
        return this.name;
    }

    public int getAge()
    {
        return this.age;
    }

    void setCountry(String country)
    {
        this.country=country;
    }

    public String getCountry()
    {
        return this.country;
    }

    public void print()
    {
        System.out.println(name + " Age: " + age + " Country: " + country);
    }
}
