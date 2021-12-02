import java.util.Scanner;

class Main {
public static void main(String[] args) {
    int x; // First operand
    int y; // Second operand
    int result; // Store the result of the operations in here
    char operator; // + , - , * , or /
    boolean game = true; // Keeps track of the game loop


    Scanner scan = new Scanner(System.in); // Takes input from the user through Scanner class

    Calculator calc = new Calculator(); // Creates a calculator class object named 'calc'


    System.out.println("Welcome to Java Calculator!");

    
    // Initiates a game loop
    while (game != false)
    {
      System.out.println("Enter what operator you would like to use: +, -, *, /");
    // Grabs the operator needed from the user (this line is only used to grab a char datatype)
    operator = scan.next().charAt(0); 

    switch (operator)
    {
      case '+':
      System.out.println("Enter 1st number you would like to Add");
      x = scan.nextInt();
  
      System.out.println("Enter 2nd number you would like to Add");
      y = scan.nextInt();
      
      int addResult = calc.add(x,y);
      
      System.out.println("Addition result is "+addResult);
      
      break;


      case '-':
      System.out.println(" Enter 1st number you would like to Subtract");
      x = scan.nextInt();

      System.out.println("Enter 2nd number you would like to Subtract");
      y = scan.nextInt();

      int subResult = calc.sub(x,y);

      System.out.println("Subtraction result is "+subResult);
      break;

      case '*':
      System.out.println("Enter 1st number you would like to Multiply");
      x = scan.nextInt();

      System.out.println("Enter 2nd number you would like to Multiply");
      y = scan.nextInt();

      int multResult = calc.mult(x,y);
      System.out.println("Multiplication result is "+multResult);

      break;

      case '/':
      System.out.println("Enter 1st number you would like to Divide");
      x = scan.nextInt();

      System.out.println("Enter 2nd number you would like to Divide");
      y = scan.nextInt();

       float divResult = calc.div(x,y);
      System.out.println("Division Result is "+divResult);

      break;

      default:
      System.out.println("Error! Wrong symbol (char) entered");
    }

    /*
      This code below is the magic of the game loop, it allows a user to continue playing the game over and over until they get tired on only one run.
    */
    System.out.println("Would you like to calculate something else? If yes, enter 1: ");

    System.out.println("Otherwise, enter any other number");

     int check = scan.nextInt();

     if (check == 1)
     {
       game = true;
     }    
     else
     {
       System.out.println("Goodbye...");
       game = false;
     }

    }
  }
}
