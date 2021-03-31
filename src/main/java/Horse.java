public class Horse extends Animal{

    boolean isRunningHorse;

    public Horse(String food, String location) {
        this.food = food;
        this.location = location;
    }

    protected void makeNoise(){
        System.out.println(this + " ржёт");
    }

    protected void eat(){
        System.out.println(" вдумчиво пережёвывает");
    }
}
