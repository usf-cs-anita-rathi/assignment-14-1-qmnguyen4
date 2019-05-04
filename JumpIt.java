import java.io.File;

import java.io.FileNotFoundException;

import java.util.Scanner;

public class JumpIt {

   private String fileName; //name of file

   private int count = 0; // number of valid integers in the file

   private final int MAX_SIZE = 15; //the size of the array

   private int row[]; //the numbers array for the game

   public JumpIt(String theName)

   {

       this.fileName = new String(theName);

       row = new int[MAX_SIZE];

       loadFile();

   }

  

   public int play() throws BadInputException

   {

       System.out.print("\nplay game");

       if(row[0] != 0)

       {

           throw new BadInputException();

       }

       return play(row, 0, count-1);

   }

  

   private int play(int[] a, int first, int last)

   {

       if(last < first )

           return 0;

       if(first == last)

           return a[first];


       int cost1 = play(a, first, last-1) + a[last]; 
       int cost2 = play(a, first, last-2) + a[last]; 
       if(cost1 < cost2) 

           return cost1;

       else

           return cost2;

   }


   public void printGame()

   {

       System.out.print("\nFile has " + count + " ints ");

       for(int i = 0 ; i < count; i++)

       {

           if(i % 11 == 0)

               System.out.println();

      

           System.out.print(row[i]+ " ");

       }

   }

  

   private void loadFile()

   {

       try {

           System.out.print("\nopening file " + fileName);

           Scanner infile = new Scanner(new File(fileName));

           count = 0;

           while(infile.hasNext() && count < MAX_SIZE)

           {

               try

               {

                   row[count] = Integer.parseInt(infile.next());

                   count++;

               }

               catch(NumberFormatException e)

               {

                   System.out.print("\nFile contains a incorrectly written int");

               }

           }

          

           if(infile.hasNext())

           {

               System.out.print("\nThe file has more than " + MAX_SIZE +" ints. " );

               System.out.print("Only the first " + MAX_SIZE + " ints are considered");

           }

          

          

       } catch (FileNotFoundException e) {

           System.out.println("\n"+e.getMessage());

       }

      

   }

}