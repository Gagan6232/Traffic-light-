public class TrafficLight {
    private String color;
    private int duration;
    public TrafficLight(String color, int duration) {
        this.color = color;
        this.duration = duration;
    }
    public void changeColor(String newColor, int newDuration) {
        this.color = newColor;
        this.duration = newDuration;
    }
    public void displayState() {
        System.out.println("The traffic light is " + color + " for " + duration + " seconds.");
    }
    public boolean isRed() {
        return color.equalsIgnoreCase("Red");
    }
    public boolean isGreen() {
        return color.equalsIgnoreCase("Green");
    }
    public static void main(String[] args) {
        TrafficLight light = new TrafficLight("Red", 30);
        light.displayState();  
        light.changeColor("Green", 40);
        light.displayState();  
        if (light.isRed()) {
            System.out.println("Stop! The light is red.");
        } else if (light.isGreen()) {
            System.out.println("Go! The light is green.");
        }
    }
}
