public class RestRoom {
    private boolean showerCabin = false;
    private int width = 0;
    private int length = 0;
    private String color = null;

    public void setShowerCabin(boolean option){
        showerCabin = option;
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

    public boolean getShowerCabin(){
        return showerCabin;
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
