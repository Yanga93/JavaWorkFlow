public class Centipede extends Animal {

    public Centipede() {
        super(100);
        this.name = "Centipede";
    }



    @Override
    public String getNoise() {
        return "Centipedes don't make noise.";
    }
}
