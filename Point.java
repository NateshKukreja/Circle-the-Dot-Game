public class Point {
    int x;
    int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return this.x;
    }
    
    public int getY(){
        return this.y;
    }

    public void reset(int x, int y){

        this.x = 0;
        this.y = 0;
    }
}
