public class Car {
    private String make;
    private String model;
    private int year;
    private double mileage;
    private double fuelLevel;

    //constructor
    public Car(String make, String model, int year, double mileage, double fuelLevel){
        setMake(make);
        setModel(model);
        setYear(year);
        setMileage(mileage);
        setFuelLevel(fuelLevel);
    }

    public String getMake(){
        return make;
    }

    public void setMake(String make){
        if (make == null || make.trim().isEmpty())
            System.out.println("Make of the car cannot be empty!");
        else
            this.make = make;
    }

    public String getModel(){
        return model;
    }

    public void setModel(String model){
        if (model == null || model.trim().isEmpty())
            System.out.println("Model of the car cannot be empty!");
        else
            this.model = model;
    }

    public int getYear(){
        return year;
    }

    public void setYear(int year){
        if (year < 1886)
            System.out.println("Dude cars weren't even invented back then..");
        else if (year > 2024)
            System.out.println("Dude are you from the future or what?");
        else
            this.year = year;
    }

    public double getMileage(){
        return mileage;
    }

    public void setMileage(double mileage){
        if (mileage < this.mileage)
            System.out.println("bro how can mileage decrease lol");
        else
            this.mileage = mileage;
    }

    public String getFuelLevel(){
            return String.format("%.0f%%", fuelLevel);
    }

    public void setFuelLevel(double fuelLevel){
        if (fuelLevel < 0 || fuelLevel > 100)
            System.out.println("bro fuel level needs to be between 0 and 100");
        else
            this.fuelLevel = fuelLevel;
    }
}
