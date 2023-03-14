public class mainArrayOneDim {
    public static void main(String[] args) {
        ArrayOneDim x = new ArrayOneDim();
        x.writeArray();
        System.out.println("Array x: ");
        System.out.println(x);
        x.myVariant14();

        ArrayOneDim y = new ArrayOneDim(6);
        y.rndArray();
        System.out.println("Array y: ");
        System.out.println(y);

        ArrayOneDim z = new ArrayOneDim(new int[] {4,7,3,9,23,6});
        System.out.println("Array z: ");
        System.out.println(z);
        System.out.println("Element 2: " + z.getElement(2));
        System.out.println("Sum of array z: " + z.sumArray());

        ArrayOneDim w = new ArrayOneDim();
        w.rndArray();
        System.out.println("Array w: ");
        System.out.println(w);
        System.out.println("The max element: " + w.maxElem());
        ArrayOneDim p = w.getPositiveElem();
        System.out.println(p);
    }
}
