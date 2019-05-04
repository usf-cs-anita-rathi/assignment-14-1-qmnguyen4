public class BadInputException extends Exception {

   public BadInputException()

   {

       super("The first int should be 0");

   }

  

   public BadInputException(String message)

   {

       super(message);

   }

}