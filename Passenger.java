public class Passenger {
    
    private String name;

    public Passenger(String name) {
        this.name = name;}
    
    public String getName(){
        return this.name;}
    
    public void boardcar(Car c){
        try{c.addPassenger(this);}
        catch(RuntimeException e){
            System.err.println(e.getMessage());}}
    
    public void getOffCar(Car c){
        try{c.removePassenger(this);}
        catch(RuntimeException e){
            System.err.println(e.getMessage());}}

}
