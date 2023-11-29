public class RectanglePlus {
    implements Relatable{
        public int width = 0;
        public int height = 0;
        public Point origin;

        public RectanglePlus(){
            origin = new Point(0,0)
        }
        public RectanglePlus(Point p){
            origin = p;

        }
        public RectanglePlus(int w,int h){
            origin = new Point(0,0);
            width = w;
            height = h;

        }
        public RectanglePlus(Point p , int w,int h){
            origin = p;
            width = w;
            height = h;
        }
        public void move (int x,int y){
            origin.x=x;
            origin.y = y;
        }
        public int getArea(){
            return width *height;
        }
        public int isLargerthan(Relatable other){
            RectanglePlus otherRect = (RectanglePlus)other;
            if(this.getArea() < otherRect.getArea())
        }
    }
}
