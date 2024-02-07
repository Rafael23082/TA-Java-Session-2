public class Car{
    //Define necessary information
    private String model;
    private int year;
    private int maxspeed;

    // Declaring
    public Car(String model, int year, int maxspeed){
        this.model = model;
        this.year = year;
        this.maxspeed = maxspeed;
    }
    public static void main(String[] args){

        // Information that is being declared above
        Car MyCar = new Car("Fortuner", 2022, 100);

        // Running the methods
        MyCar.name();
        MyCar.year();
        MyCar.maxspeed();
        MyCar.displayall();
    }

    // Name method that displays the name
    public void name(){
        System.out.println("Name of car: " + model);
    }
    // Year method that displays the year
    public void year(){
        System.out.println("Year of make: " + year);
    }
    // MaxSpeed methods that displays the max speed
    public void maxspeed(){
        System.out.println("Max Speed of the car: " + maxspeed + "km/h");
    }
    // Display all method that displays all information
    public void displayall(){
        System.out.println("Name: " + model + " | Year: " + year + " | Max Speed: " + maxspeed + "km/h");
    }
}



