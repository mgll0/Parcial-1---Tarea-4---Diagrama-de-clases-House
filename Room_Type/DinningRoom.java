package src.Room_Type;

public class DinningRoom {
    private int chairsCapacity = 0;
    private int windows = 0;
    private boolean tv = false;
    private int width = 0;
    private int length = 0;
    private String color = null;

    public void setChairsCapacity(int newChairCapacity){
        chairsCapacity = newChairCapacity;
    }
    public void setTv(boolean newTv){
        tv = newTv;
    }
    public void setWindows(int newWindows){
        windows = newWindows;
    }
    public void setWidth(int newWidth){
        width = newWidth;
    }
    public void setLength(int newLength) {
        length = newLength;
    }
    public void setColor(String newColor){ color = newColor;}

    public int getChairsCapacity(){
        return chairsCapacity;
    }
    public boolean getTv(){
        return tv;
    }
    public int getWindows(){
        return windows;
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
