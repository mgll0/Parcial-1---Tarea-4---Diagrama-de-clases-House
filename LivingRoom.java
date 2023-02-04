package src;

public class LivingRoom {
    private int windows = 0;
    private boolean tv = false;
    private boolean homeTheater = false;
    private int width = 0;
    private int length = 0;
    private String color = null;

    public void setWindows(int newWindows){
        windows = newWindows;
    }
    public void setTv(boolean newTv){
        tv = newTv;
    }
    public void setHomeTheater(boolean newHomeTheater){
        homeTheater = newHomeTheater;
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

    public boolean getTv(){
        return tv;
    }
    public boolean getHomeTheater(){
        return homeTheater;
    }
    public String getColor(){
        return color;
    }
    public int getWidth(){
        return width;
    }
    public int getLength(){
        return length;
    }
}
