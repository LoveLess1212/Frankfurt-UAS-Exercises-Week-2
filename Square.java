import java.util.Scanner;
class point{
    private
        int x,y;
     public point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public double distant(point p){
        return Math.sqrt(Math.abs(Math.pow(this.x - p.x,2) + Math.pow(this.y-p.y,2)));
    }
    public point add(point p){
        return new point ((this.x+p.x),(this.y+p.y));
    }
    public point minus(point p){
        return new point ((this.x-p.x),(this.y-p.y));
    }
    public void print(){
        System.out.printf("%d %d",this.x,this.y);
    }
}

    public class Square {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            point p1 = new point(scanner.nextInt(), scanner.nextInt());
            point p2 = new point(scanner.nextInt(), scanner.nextInt());
            point p3 = new point(scanner.nextInt(), scanner.nextInt());
            if(p1.distant(p2) == p1.distant(p3)) {
                p2.minus(p1).add(p3).print();
            } else if (p1.distant(p2) < p1.distant(p3)) {
                p1.minus(p2).add(p3).print();
            } else {
                p1.minus(p3).add(p2).print();
            }
        }
    }

