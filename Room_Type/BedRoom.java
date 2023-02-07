package src.Room_Type;

public class BedRoom {
    BedSize bedSize;
    private boolean tv = false;
    private int width = 0;
    private int length = 0;
    private String color = null;

    public void setBedSize(BedSize newBedSize){
        bedSize = newBedSize;
    }
    public void setTv(boolean newTv){
        tv = newTv;
    }
    public void setWidth(int newWidth){
        width = newWidth;
    }
    public void setLength(int newLength) {
        length = newLength;
    }
    public void setColor(String newColor){ color = newColor;}

    public BedSize getBedSize(){
        return bedSize;
    }
    public boolean getTv(){
        return tv;
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
