import java.util.Scanner;
public class RockPaperScissor{
   public static void main(String[] args){
      //creating the scanner object
      Scanner scan = new Scanner(System.in);
      System.out.println(systemChoice());

      System.out.println("Let's play rock paper scissors \n when I say 'shoot', Choose: rock, paper or scissor.");
      System.out.println("Are you ready? Write 'yes' if you are ");
      String contest = scan.nextLine();
      //System.out.println(systemChoice());
      String systemPlay = systemChoice();
      
      if(ready(contest)){
         System.out.println("Great! \n rock - paper - scissors, shoot!");
         String userGame = scan.nextLine();
         System.out.println("you choose: "+userGame+"\nSystem Choose: "+systemPlay);
         switch(userGame){
            case "rock": 
                  switch(systemPlay){
                     case "rock": System.out.println("It's a tie"); break;
                     case "paper": System.out.println("You Lost"); break;
                     case "scissors": System.out.println("You Win"); break;
                     default: System.out.println("System error");

                  } break;
            case "paper":
                  switch(systemPlay){
                     case "rock": System.out.println("You won"); break;
                     case "paper": System.out.println("It's a tie"); break;
                     case "scissors": System.out.println("You Lost"); break;
                     default: System.out.println("System error");
                  } break;
            case "scissors":
                  switch(systemPlay){
                     case "rock": System.out.println("You Lost"); break;
                     case "paper": System.out.println("You won"); break;
                     case "scissors": System.out.println("Its a tie"); break;
                     default: System.out.println("System error");
                  } break;
            default: System.out.println("Please enter only 'rock' or 'paper' or 'scissors' ");
         }
         
     } else if (contest.equals("no")){
      System.out.println("Damm! Some other time");
     } else{
      System.out.println("Please enter only 'yes' or 'no' ");
     }

      scan.close();
   }

   public static boolean ready(String userChoice){
      return (userChoice.equals("yes"));
      
   }
   public static String systemChoice(){
      int systemRandomSelection = (int)(Math.random()*3+1);
      switch (systemRandomSelection){
      case 1: return "rock";
      case 2: return "paper";
      case 3: return "scissors";
      default: return "system Time out";
      }
   }
}