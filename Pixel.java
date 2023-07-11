public class Pixel {
public final static int ORIGIN = 0;
private int x;
private int y;
public Pixel(int x, int y) {
this.x = x;
this.y = y;
}
public void reset() {
x = ORIGIN;
y = ORIGIN;
}
public void printOnScreen() {
System.out.println("("+x+","+y+")");
}
public static boolean same(Pixel p1, Pixel p2) {
return (p1.x==p2.x) && (p1.y==p2.y);
}
public static void main(String[] args) {
Pixel p0 = new Pixel(0,0);
Pixel p1 = new Pixel(1,3);
p1.printOnScreen(); // (1,3)
System.out.println(same(p0,p1)); // false
p1.reset();
System.out.println(same(p0,p1)); // true
}
}