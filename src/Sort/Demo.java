package Sort;
/* Not part of assignment 7, in class example for Generics */
public class Demo <T extends Number> {
    // <T extends Number> makes sure T is a number
    T t;

    public T getT() {
        
        return t;
    }


    public static void main(String [] args) {
        Demo<Float> demo = new Demo<>();
        Demo<Integer> demo2 = new Demo<>();

        // Demo<Demo<Integer>> demo3 = new Demo<>();
    }
}
