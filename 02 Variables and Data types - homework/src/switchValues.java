

public class switchValues {

    public static void main(String[] args) {
        //Homework - Task 4*
        int a = 5;
        int b = 11;
        System.out.println("Before switching of values");
        System.out.println("a: " + a);
        System.out.println("b: " + b);

        int c = a;
        a = b;
        b = c;
        System.out.println("After switching of values");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }

}
