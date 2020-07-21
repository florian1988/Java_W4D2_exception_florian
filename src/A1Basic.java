

public class A1Basic {

    int[] myNumbers = {1, 2, 3};

    public void test(){
        try{
            System.out.println(myNumbers[10]);
        }catch (Exception e){
            System.out.println(" Exception!!  there are only " + myNumbers.length + " numbers");
        }
    }


    public static void main(String[] args) {
        A1Basic obj = new A1Basic();
        obj.test();
    }

}
