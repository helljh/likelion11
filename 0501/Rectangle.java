public class Rectangle {
    private int width;
    private int height;

    public Rectangle(){

    }
    public Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }

    int area(int width, int height){
        return width * height;
    }
}
