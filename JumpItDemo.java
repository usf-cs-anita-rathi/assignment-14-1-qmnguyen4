public class JumpItDemo {

   public static void main(String[] args) {

       String testFiles[] = {"file1.txt", "file2.txt", "file3.txt"};

       for(int i = 0; i < testFiles.length; i++)

       {

           JumpIt game = new JumpIt(testFiles[i]);

           game.printGame();

           try{

               System.out.println("\nthe cost is " + game.play());

           }

           catch(BadInputException e)

           {

               System.out.println("\nbad input: "+e.getMessage());

           }

          

           System.out.println();

       }

   }

}