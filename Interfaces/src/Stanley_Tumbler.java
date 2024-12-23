interface Water_Bottle {
    int getVolume();
    String getColour();
    boolean hasStraw();
    boolean isLeakproof();

    void open();
    void close();
}

public class Stanley_Tumbler implements Water_Bottle {
    private int volume;
    private String colour;
    private boolean straw;
    private boolean leakproof;

    public Stanley_Tumbler(int volume, String colour, boolean straw, boolean leakproof){
        this.volume = volume;
        this.colour = colour;
        this.straw = straw;
        this.leakproof = leakproof;
    }

    public int getVolume(){
        return volume;
    }

    public String getColour(){
        return colour;
    }

    public boolean hasStraw(){
        return straw;
    }

    public boolean isLeakproof(){
        return leakproof;
    }

    public void open(){
        System.out.println("bottle is now open");
    }

    public void close(){
        System.out.println("bottle is now closed");
    }
}
