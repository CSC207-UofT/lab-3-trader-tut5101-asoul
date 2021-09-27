

public class Bus implements Drivable, Tradable{
    private int maxSpeed;
    private int price;

    /**
     * Construct a Bus, with the given max speed and price.
     *
     * @param maxSpeed The maximum speed of the bus.
     * @param price The price of the bus.
     *
     */

    public Bus(int maxSpeed, int price){
        this.maxSpeed = maxSpeed;
        this.price = price;
    }

    /**
     * Increase the maximum speed of this Vehicle by 100.
     **/
    @Override
    public void upgradeSpeed() {
        maxSpeed = maxSpeed + 100;
    }

    /**
     * Decrease the maximum speed of this Vehicle by 100.
     **/
    @Override
    public void downgradeSpeed() {
        maxSpeed = maxSpeed - 100;
    }

    /**
     * @return Return the max.
     */
    @Override
    public int getMaxSpeed() {
        return maxSpeed;
    }

    /**
     *
     * @return The price of the bus.
     */
    @Override
    public int getPrice() {
        return price;
    }
}
