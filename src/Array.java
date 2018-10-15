import java.util.Arrays;

public class Array{

    public static void main(String[] args) {

        Printer printer = new Printer();
        String[] colors = {"red", "orange", "yellow", "green", "blue"};
        Integer[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        printer.<String>print(colors);
        printer.<Integer>print(numbers);
    }
}

class Printer{

    public <T> void print(T[] items){
        for(T item: items){
            System.out.println(Arrays.toString(items));
        }
    }
}