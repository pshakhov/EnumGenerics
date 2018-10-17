import java.util.Arrays;

 class Array<T>{

    private T val;

    public Array(T arg) {
        val = arg;
    }

    public String toString() {
        return "{" + val + "}";
    }

    public T getValue() {
        return val;
    }
}

 class Printer {

    public static void main(String[] args) {
        Object[] array = {1, 2, 3, 4, 5};

        for (Object element: array) {
            System.out.println(element);
        }
    }
    /* public static void main(String[] arg) {

        int size = 10;
        Object[] arr = new Object[size];

        Printer printer = new Printer();
        //String[] colors = {"red", "orange", "yellow", "green", "blue"};
        //Integer[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        //printer.print(arr[1]);

        //printer.<Object>print(arr);
        //printer.<Integer>print(numbers);
    } */
}

/*class Printer{

    public <T> void print(T[] items){
        for(T item: items){
            System.out.println(Arrays.toString(item));

        }
    } */