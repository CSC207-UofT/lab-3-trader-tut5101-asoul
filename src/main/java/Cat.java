public class Cat implements Domesticatable, Tradable{
    /**
     * Provides the sound of cat.
     */
    @Override
    public String sound(){return "nya!"; }

    @Override
    public int getPrice(){return 1000; }
}
