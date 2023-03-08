    /**
    *creates instances of passengers
    *@param none
    *@return none
    */
public class Passenger {
    
    private String name;

    /**
    *creates instances of passengers
    *@param String name of passenger
    *@return none
    */
    public Passenger(String name) {
        this.name = name;}

    /**
    *accessor for name
    *@param none
    *@return name of the passenger instance
    */
    public String getName(){
        return this.name;}
    
    /**
    *adds passenger to a car
    *@param car the passenger is baording
    *@return none
    */
    public void boardcar(Car c){
        try{c.addPassenger(this);}
        catch(RuntimeException e){
            System.err.println(e.getMessage());}}
    
    /**
    *removes passenger from car
    *@param Car the passenger wants to be removed from
    *@return none
    */
    public void getOffCar(Car c){
        try{c.removePassenger(this);}
        catch(RuntimeException e){
            System.err.println(e.getMessage());}}

}
