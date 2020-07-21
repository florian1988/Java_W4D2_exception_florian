
public class A2Basic {


    public static void main(String[] args) {

        try{
            System.out.println(5/0);
        } catch ( ArithmeticException e){

            throw new ArithmeticException("shit");

        }finally {

            System.out.println("Caught runtime exception: java.lang.ArithmeticException: / by zero");

        }

    }
}

