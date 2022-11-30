
public class Sun {

    private String name;
    private double Radius;
    private double Mass;

    private double x;
    private double y;
    private double velX;
    private double velY;
    private final double[] planet;
    public Sun(double[] planet, double mass, double radius, String name, double x, double y){

        this.planet = planet;
        Mass = mass;
        Radius = radius;
        this.name = name;
        this.x = x;
        this.y = y;
    }
    public double getPosX() {
        return this.x;
    }

    public double getPosY() {
        return this.y;
    }
    public double getMass() {
        return this.Mass;
    }
    public double getVelX(){
        return this.velX;

    }
}
