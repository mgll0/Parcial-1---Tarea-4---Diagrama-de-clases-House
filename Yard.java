public class Yard {
    private boolean grass = false;
    private int width = 0;
    private int length = 0;
    private String color = null;

    public void setGrass(boolean option){
        grass = option;
    }
    public void setColor(String newColor){
        color = newColor;
    }
    public void setWidth(int newWidth){
        width = newWidth;
    }
    public void setLength(int newlength) {
        length = newlength;
    }

    public boolean getGrass(){
        return grass;
    }
    public String getColor(){
        return color;
    }
    public int getWidth(){
        return width;
    }
    public int getlength(){
        return length;
    }

}
