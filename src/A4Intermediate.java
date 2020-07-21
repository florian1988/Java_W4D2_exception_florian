
import java.beans.ExceptionListener;
import java.lang.reflect.Array;
import java.util.*;


public class A4Intermediate {


    public void g() {
        String[] d = {"a", "b", "c"} ;

        System.out.println(d[5]);
    }

    public void f() {

        try {
            g();
        } catch (Exception e) {

          throw new ArrayIndexOutOfBoundsException("Shit shit shit");


        }finally {
            try {
                throw new CloneNotSupportedException("oh shit");

            } catch (CloneNotSupportedException cloneNotSupportedException) {

                cloneNotSupportedException.printStackTrace();
            }

        }

    }

    public static void main(String[] args) throws Exception {

        A4Intermediate test = new A4Intermediate();
        test.f();


    }
}
