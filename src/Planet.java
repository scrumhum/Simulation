public class Planet {
    private String name;
    private double radius;
    private double mass;
    private double x;
    private double y;
    private double velX;
    private double velY;


    public Planet(double mass, double radius, double x, double y, double velX, double velY, String name){
        this.mass = mass;
        this.radius = radius;
        this.x = x;
        this.y = y;

        this.velX = velX;
        this.velY = velY;
        this.name = name;
    }

    public void moveTo(double newX, double newY){
        this.x = newX;
        this.y = newY;
    }

    public void setVelX(double newVelX){
        this.velX = newVelX;
    }
    public void setVelY(double newVelY){
        this.velY = newVelY;
    }

    public double getPosX() {
        return this.x;
    }

    public double getPosY() {
        return this.y;
    }

    public double getMass() {
        return this.mass;
    }
    public double getVelX(){
        return this.velX;

    }
    public double getVelY(){
        return this.velY;

    }

    @Override
    public String toString() {
        return String.format("%s: x:%f, y:%f", this.name,this.x, this.y);
    }
}
