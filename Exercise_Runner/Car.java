public class Car {

    // create the fields for car class
    private boolean previouslyOwned;
    private int numWheels;
    private int mileage;
    private  String type;

    public String colour;

    public Car(boolean previouslyOwned) {
        this.previouslyOwned = previouslyOwned;

        if (true){
            this.mileage = 20000;
        }else{
            this.mileage = 0;
        }
    }

    public boolean getPreviouslyOwned() {
        return previouslyOwned;
    }

    public void setPreviouslyOwned(boolean previouslyOwned) {
        this.previouslyOwned = previouslyOwned;
    }

    public int getNumWheels() {
        if (this.type == "Reliant Robin"){
            setNumWheels(3);
        }
        else{
            setNumWheels(4);
        }
        return numWheels;
    }

    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
      this.type = type;
    }
}
