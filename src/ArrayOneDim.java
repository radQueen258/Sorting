import java.util.*;

public class ArrayOneDim {
    public int[] array;

    public ArrayOneDim(){}
    public ArrayOneDim(int n){

        this.array = new int[n];
    }
    public ArrayOneDim(int[] array) {

        this.array = Arrays.copyOf(array, array.length);
    }

    public int[] getArray() {

        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }
    public int getElement(int i) {

        return this.array[i];
    }
    public void setElement (int i, int x) {

        this.array[i] = x;
    }

    public void writeArray() {
        Scanner radka = new Scanner (System.in);
        System.out.println("Array length: ");
        int n = radka.nextInt();
        System.out.println("Write the elements of the array: ");
        this.array = new int [n];
        for (int i = 0; i < this.array.length; i ++) {
            this.array[i] = radka.nextInt();
        }
    }
    public void rndArray () {
        Random any = new Random();
        for (int i = 0; i < this.array.length; i ++) {
            array[i] = any.nextInt(-10,20);
        }
    }

    public String toString() {

        return "The array " + Arrays.toString(array);
    }

    public int sumArray() {
        int sum = 0;
        for (int j : this.array) {
            sum += j;
        }
        return sum;
    }

    public int maxElem() {
        int max = this.array[0];
        for (int i = 1; i < this.array.length; i ++) {
            max = Math.max(max, this.array[i]);
        }
        return max;
    }

    public int minElemIndex() {
        int imin = 0;
        for(int i = 1; i < this.array.length; i ++) {
            imin = this.array[i] < this.array[imin] ? i : imin;
        }
        return imin;
    }

    public ArrayOneDim getPositiveElem () {
        int counter = 0;

        for (int j : this.array) {
            if (j > 0) counter++;
        }
        ArrayOneDim res = new ArrayOneDim(counter);

        for (int i = 0, k = 0; i < counter; i ++) {
            if (this.array[k] > 0) {
                res.array[i] = this.array[k];
                i++;
            }
        }
        return res;
    }

//    public ArrayOneDim getPositive() {
//        int counter = 0;
//
//        for (int j : this.array) {
//            if (j > 0) counter++;
//        }
//        ArrayOneDim res = new ArrayOneDim(counter);
//
//        for (int i = 0; i < this.array.length; i ++) {
//            for (int k = 0; k < counter; k ++) {
//                if (this.array[i] > 0) {
//                    res.array[k] = this.array[k];
//                    i ++;
//                }
//            }
//        }
//        return res;
//    }

    public int indexOf(int key){
        for (int i =0; i< this.array.length;i++){
            if (this.array[i]==key)
                return i;
        }
        return -1;
    }

    public void ascendArray(int keyValue) {
        for (int i = 1; i < this.array.length; i ++) {
            keyValue = array[i];
            int j = i - 1;
            while (j > 0 && array[j] > keyValue ) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = keyValue;
        }
        System.out.println(Arrays.toString(this.array));
    }

    public void elemByIndex () {
        Scanner radka = new Scanner (System.in);
        System.out.println("Index number: ");
        int i = radka.nextInt();
        System.out.println("Array element: " + this.array[i]);
    }

    public void changeIndex () {
        List <Integer> arr = new ArrayList<>();
        for (int num: this.array) {
            arr.add(num);
        }
        arr.set(5,100);
        System.out.println("Position 5 changed to 100: " + arr);

    }

    public int linearSearch(int x) {

        for (int i = 0; i < this.array.length; i ++) {
            if (this.array[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public void binarySearch() {
        int lo = 0, hi = this.array.length - 1;
        Scanner radka = new Scanner (System.in);
        System.out.print("Which element do you want ? ");
        int x = radka.nextInt();

        while (hi - lo > 1) {
            int mid = (hi + lo) / 2;
            if (this.array[mid] < x) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }
        if (this.array[lo] == x) {
            System.out.println(x + " Found at position: " + lo);
        } else if (this.array[hi] == x) {
            System.out.println(x + " Found at position: " + hi);
        } else {
            System.out.println(x + " Not Found");
        }
    }

    public void myVariant14() {
        int gap = this.array.length;

            int temp = this.array[0];
            for (int i = 0; i < gap - 1; i ++) {
                this.array[i] = this.array[i + 1];
            }
            temp = 0;
            this.array[gap - 1] = temp;

        System.out.println(Arrays.toString(this.array));
    }


}
