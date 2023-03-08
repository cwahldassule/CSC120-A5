import java.util.ArrayList;
/**
*Creates train instances with an engine and cars
*@param none
*@return none
*/
public class Train {

    private final Engine engine;
    private ArrayList<Car> cars;
    
    /**
    *Creates a train instance
    *@param fuel information and car information
    *@return none
    */
    public Train(FuelType fuelType, double fuelCapacity, int nCars, int passengerCapacity){
        this.engine = new Engine(fuelType, fuelCapacity);
        this.cars = new ArrayList<>(nCars);
        for(int a = 0; a <nCars; a++){
            this.cars.add(new Car(passengerCapacity));}}
    /**
    *accessor for engine
    *@param none
    *@return engine instance
    */
    public Engine getEngine(){
        return this.engine;}
    
    /**
    *accessor for cars
    *@param index of car
    *@return car instance
    */
    public Car getCar(int i){
        return this.cars.get(i);}
    /**
    *max capacity for the whole train
    *@param none
    *@return max capacity for the whole train
    */
    public int getMaxCapacity(){
        int temp = 0;
        for(int a = 0; a <this.cars.size(); a++){
            temp += this.cars.get(a).getCapacity();}
        return temp;}
    /**
    *seats remaining on the whole train
    *@param none
    *@return number of seats remaining
    */
    public int seatRemaining(){
        int temp = 0;
        for(int a = 0; a <this.cars.size(); a++){
            temp += this.cars.get(a).seatsRemaining();}
        return temp;}
    
    /**
    *prints all the passenger names by car
    *@param none
    *@return none
    */
    public void printManifest(){
        for(int a = 0; a <this.cars.size(); a++){
            System.out.println("Car "+ a + ":");
            try{this.cars.get(a).printManifest();;}
            catch(RuntimeException e){System.err.println(e.getMessage());}}} 

    public static void main(String[] args) {
        Train myTrain = new Train(FuelType.STEAM, 100.0, 10, 50); //why mad :/
        Passenger coolguy = new Passenger("coolguy");
        System.out.println(myTrain.engine.getcurrent_fuel());
        myTrain.engine.go();
        myTrain.printManifest();
        System.out.println(myTrain.seatRemaining());
        System.out.println(myTrain.getMaxCapacity());
        myTrain.getCar(0).addPassenger(coolguy);
        myTrain.printManifest();
        myTrain.getCar(0).removePassenger(coolguy);}
}