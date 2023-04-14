public class Mots {
    protected String mot;
    protected String direction;

    protected int coordX;
    protected int coordY;

    public Mots(String mot, String direction, int coordX, int coordY) {
        this.mot = mot;
        this.direction = direction;
        this.coordX = coordX;
        this.coordY = coordY;
    }

    public String getMot() {
        return mot;
    }
    
}
