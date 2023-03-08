    import java.util.ArrayList;
/**
*creates cars
*@param none
*@return none
*/
public class Car {
    private int car_cap;
    private ArrayList<Passenger> Passengers = new ArrayList<>(car_cap);

    /**
    *car constructor for new instances
    *@param car capacity
    *@return none
    */
    public Car(int car_cap){
        this.car_cap = car_cap;}

    /**
    *gets the capacity for that car
    *@param none
    *@return car capacity
    */
    public int getCapacity(){
        return this.car_cap;}
    
    /**
    *number of seats remaining
    *@param none
    *@return number of seats remaining
    */
    public int seatsRemaining(){
        return this.car_cap - Passengers.size();}

    /**
    *takes a passenger out of the car
    *@param passenger that it being removed
    *@return none
    */
    public void removePassenger(Passenger p){
        if(Passengers.contains(p)){
            Passengers.remove(p);
            System.out.println("Passenger "+p.getName()+" has been removed :)");}
        else{
            throw new RuntimeException("Passenger " + p.getName() + " is not onboard :()");}}
    
    /**
    *adds passenger onto train
    *@param passenger being added
    *@return none
    */        
    public void addPassenger(Passenger p){
        if(Passengers.contains(p)){
            throw new RuntimeException("Passenger "+p.getName()+" is already onboard or the car is full :()");}
        else{
            Passengers.add(p);
            System.out.println("Passenger "+p.getName()+" is now onboard :)");}}
    
    /**
    *prints all the passengers on the train
    *@param none
    *@return none
    */
    public void printManifest(){
        if(Passengers.isEmpty()){
            throw new RuntimeException("This car is EMPTY :/");}
        else{
            for(int a = 0; a <Passengers.size(); a ++){
                System.out.println(Passengers.get(a).getName());}}}

}