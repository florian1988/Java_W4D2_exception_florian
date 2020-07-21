import java.util.*;


public class A5Intermediate {




    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number ");
        int number = scan.nextInt();


        try{

            if (number > 1 || number  < 10 ){
                System.out.println(number);
                throw new NumberException();
            }
        } catch( NumberException e){
            System.out.println(e.getMessage());
        }



    }
}
