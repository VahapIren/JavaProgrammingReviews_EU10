package week21_01_28_2023;

public class Country {
    public String name,continent;
    public long population;
    public boolean nearWater;

    public Country(String name,String continent){
        this.name=name;
        this.continent=continent;
    }
    public Country(String name,String continent,long population){
        this(name,continent);
        this.population=population;

    }
    public Country(String name,String continent,long population,boolean nearWater){
        this(name,continent,population);
        this.nearWater=nearWater;

    }


}
