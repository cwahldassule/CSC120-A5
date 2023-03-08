    /**
    *creates instances of engine
    *@param none
    *@return none
    */
public class Engine {
    private FuelType fuel;
    private double current_fuel;
    private double max_fuel;

    /**
    *creates instances of engine
    *@param fuel information
    *@return none
    */
    public Engine(FuelType fuel_type, double num){
        this.fuel = fuel_type;
        this.current_fuel = num;
        this.max_fuel = num;}

    /**
    *accessor for the amount of fuel
    *@param none
    *@return the amount of fuel left for that instance
    */
    public double getcurrent_fuel(){
        return this.current_fuel;}
    
    /**
    *accessor for maximum fuel
    *@param none
    *@return max fuel for that instance
    */
    public double getmax_fuel(){
        return this.max_fuel;}
    
    /**
    *refuels the engine
    *@param none
    *@return none
    */
    public void refuel(){
        this.current_fuel = this.max_fuel;}

    /**
    *makes the train "go" by removing fuel and then prints information
    *@param none
    *@return none
    */
    public void go(){
        if(current_fuel > 0){
            current_fuel = current_fuel -1;
        System.out.println("Fuel Type: "+fuel);
        System.out.println("Current fuel: "+current_fuel);
        System.out.println("Max fuel: "+max_fuel);
        System.out.println("");}
        else{
            throw new RuntimeException("Out of fuel :()");}}

      public static void main(String[] args) {
          Engine myEngine = new Engine(FuelType.ELECTRIC, 100.0);
          try {while (true) 
            {myEngine.go();}} catch (Exception e) {
              System.err.println(e.getMessage()); }}

}