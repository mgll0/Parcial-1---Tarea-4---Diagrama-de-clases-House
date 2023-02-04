package src;

public class Kitchen {
    private boolean stove = false;
    private boolean sink = false;
    private int windows = 0;
    private boolean refrigerator = false;
    private boolean oven = false;
    private int width = 0;
    private int length = 0;
    private String color = null;

    public void setStove(boolean newStove){
        stove = newStove;
    }
    public void setSink(boolean newSink){
        sink = newSink;
    }
    public void setWindows(int newWindows){
        windows = newWindows;
    }
    public void setRefrigerator(boolean newRefrigerator){
        refrigerator = newRefrigerator;
    }
    public void setOven(boolean newOven){
        oven = newOven;
    }
    public void setColor(String newColor){
        color = newColor;
    }
    public void setWidth(int newWidth){
        width = newWidth;
    }
    public void setLength(int newLength) {
        length = newLength;
    }

    public boolean getStove(){
        return stove;
    }
    public boolean getSink(){
        return sink;
    }
    public boolean getRefrigerator(){
        return refrigerator;
    }
    public int getWindows(){
        return windows;
    }
    public boolean getOven(){
        return oven;
    }
    public int getWidth(){
        return width;
    }
    public int getLength(){
        return length;
    }
    public String getColor(){
        return color;
    }
}
