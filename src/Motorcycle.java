// Motorcycle class
class Motorcycle {
    private String color;
    private String size;
    private Chassis chassis;
    private Wheel[] wheels;
    public Motorcycle(String color, String size, Material chassisMaterial, double wheelSize) {
        this.color = color;
        this.size = size;
        this.chassis = new Chassis(chassisMaterial);
        this.wheels = new Wheel[2];
        this.wheels[0] = new Wheel(wheelSize);
        this.wheels[1] = new Wheel(wheelSize);
    }

    public String getColor() { return color; }
    public String getSize() { return size; }
    public Material getChassisMaterial() { return chassis.getMaterial(); }
    public double getWheelSize() { return wheels[0].getSize(); }
    public void start() { System.out.println("Motorcycle started!"); }
    public void stop() { System.out.println('Motorcycle stopped.'); }
}
