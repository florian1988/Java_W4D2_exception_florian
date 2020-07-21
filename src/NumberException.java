
public class NumberException extends Exception{

    public NumberException(){
        super("Invalide number you moron");
    }

    public NumberException(String message){
        super(message);
    }
}
