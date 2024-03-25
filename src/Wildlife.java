public class Wildlife {

    // code snippets would be nice to see in the task

    private String name;
    private int healthPoints;
    private int speed;
    private boolean endangered;

    public Wildlife(String name, int healthPoints, int speed, boolean endangered) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.speed = speed;
        this.endangered = endangered;
    }

    public String getName() {
        return name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isEndangered() {
        return endangered;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setEndangered(boolean endangered) {
        this.endangered = endangered;
    }

    public void printInfo() {
        System.out.println("Name: " + name + " Health: " + healthPoints + " Speed: " + speed + " Endangered: " + endangered);
    }

    public void interact(Wildlife friend) {
        System.out.println(name + " says Hi to " + friend.getName());
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the Wildlife Tracker!");

        // Exercise 1 and 2
        String name = "Snö Rhino";
        int healthPoints = 100;
        int speed = 50;
        boolean endangered = true;
        System.out.println("Name: " + name + " Health: " + healthPoints + " Speed: " + speed + " Endangered: " + endangered);

        name = "Polar Bear";
        healthPoints = 80;
        speed = 40;
        endangered = true;
        System.out.println("Name: " + name + " Health: " + healthPoints + " Speed: " + speed + " Endangered: " + endangered);

        name = "Penguin";
        healthPoints = 60;
        speed = 30;
        endangered = false;
        System.out.println("Name: " + name + " Health: " + healthPoints + " Speed: " + speed + " Endangered: " + endangered);

        name = "Panda";
        healthPoints = 40;
        speed = 20;
        endangered = true;
        System.out.println("Name: " + name + " Health: " + healthPoints + " Speed: " + speed + " Endangered: " + endangered);

        name = "Ant";
        healthPoints = 20;
        speed = 10;
        endangered = false;
        System.out.println("Name: " + name + " Health: " + healthPoints + " Speed: " + speed + " Endangered: " + endangered);

        // Exercise 3 and 4

        Wildlife snöRhino = new Wildlife("Snö Rhino", 100, 50, true);
        System.out.println("Name: " + snöRhino.getName() + " Health: " + snöRhino.getHealthPoints() + " Speed: " + snöRhino.getSpeed() + " Endangered: " + snöRhino.isEndangered());

        Wildlife polarBear = new Wildlife("Polar Bear", 80, 40, true);
        System.out.println("Name: " + polarBear.getName() + " Health: " + polarBear.getHealthPoints() + " Speed: " + polarBear.getSpeed() + " Endangered: " + polarBear.isEndangered());

        Wildlife penguin = new Wildlife("Penguin", 60, 30, false);
        System.out.println("Name: " + penguin.getName() + " Health: " + penguin.getHealthPoints() + " Speed: " + penguin.getSpeed() + " Endangered: " + penguin.isEndangered());

        Wildlife panda = new Wildlife("Panda", 40, 20, true);
        System.out.println("Name: " + panda.getName() + " Health: " + panda.getHealthPoints() + " Speed: " + panda.getSpeed() + " Endangered: " + panda.isEndangered());

        Wildlife ant = new Wildlife("Ant", 20, 10, false);
        System.out.println("Name: " + ant.getName() + " Health: " + ant.getHealthPoints() + " Speed: " + ant.getSpeed() + " Endangered: " + ant.isEndangered());

        // Exercise 7
        snöRhino.printInfo();

        // Exercise 8
        snöRhino.interact(polarBear);
    }
}