import java.util.Scanner;

public class mainArrayOneDim {
    public static void main(String[] args) {
        try {

        Scanner radka = new Scanner(System.in);

        ArrayOneDim x = new ArrayOneDim();
        x.writeArray();
        System.out.println("Array x: ");
        System.out.println(x);
        x.elemByIndex();
        System.out.println("Shell method: ");
        x.myVariant14();

        System.out.println();

        ArrayOneDim y = new ArrayOneDim(8);
        y.rndArray();
        System.out.println("Array y: ");
        System.out.println(y);
        y.minElemIndex();
        y.indexOf(4);
        y.changeIndex();

        System.out.println();
        ArrayOneDim z = new ArrayOneDim(new int[]{4, 7, 3, 9, 23, 6});
        System.out.println("Array z: ");
        System.out.println(z);
        System.out.println("Element 2: " + z.getElement(2));
        System.out.println("Sum of array z: " + z.sumArray());
        System.out.println("3 is found at: "+ z.linearSearch(3));
        z.binarySearch();

        System.out.println();
        System.out.println("Array 'w' length: ");
        int m = radka.nextInt();
        ArrayOneDim w = new ArrayOneDim(m);
        w.rndArray();
        System.out.println("Array w: ");
        System.out.println(w);
        System.out.println("The max element: " + w.maxElem());
        w.ascendArray(3);
       }

        catch (IndexOutOfBoundsException e) {
            System.out.println("There is a problem with the length of the array");
        }
        catch (IllegalArgumentException e) {
            System.out.println("What you wrote is not a number, please try again with integer");
        }
        catch (Exception e) {
            System.out.println("Unknown Error :(");
        }
        finally {
            System.out.println("---------END OF PROGRAM :) -----------");
        }
    }
}
