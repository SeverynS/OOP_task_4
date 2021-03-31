public class Animal {
    String food;
    String location;

    public Animal(){};

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    protected void makeNoise(){
        System.out.println(this + " воспроизводит звуки");
    }

    protected void eat(){
        System.out.println(this + " кушает");
    }

    protected void sleep(){
        System.out.println(this + " спит");
    }
}
