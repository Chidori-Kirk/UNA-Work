public class OctagonTest {
    public static void main(String[] args) throws CloneNotSupportedException{
        Octagon oct = new Octagon(5);
        Octagon oct2 = (Octagon)oct.clone();

        System.out.printf("Area of the octagon with side value %,.2f is %,.2f\n", oct.getSide(), oct.getArea());
        System.out.printf("Perimeter of the octagon with side value %,.2f is %,.2f\n", oct.getSide(), oct.getPerimeter());
        System.out.printf("Comparison result between an octagon and its clone: " + oct.compareTo(oct2));
    }
}
