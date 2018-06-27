import java.util.ArrayList;
import java.util.LinkedList;

public class ClassTest {
    public int value;

    public ClassTest() {
        value = 0;
    }

}


interface A {
    public ArrayList<String> a = new ArrayList<>();
    public static int staticInt = 2;

    public default void fa() {
        System.out.println(staticInt);
    }
}

interface B {
    public static int staticInt = 1;

    public default void fb(){
        System.out.println(staticInt);
    }

}