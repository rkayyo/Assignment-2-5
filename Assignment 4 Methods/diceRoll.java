import java.util.Scanner;

class diceRoll{
    public static void Main(String[] args){
      Scanner s = new Scanner (System.in);
      
        int sides = 0;
        int roll = 0; // current value of die
        int total = 0;
        int numRolls = 0; //how many dice thrown
        String repeat = "y";
        
       while(repeat.equals("y")){ 
       System.out.print("How many sides do your die have?");
       sides = s.nextInt();
       System.out.print("How many times would you like to roll");
       numRolls = s.nextInt();
       
       System.out.print("You rolled: ");
       for (int i = 0; i < numRolls; i++){
       
            roll = dieRoll(sides);
            total = total + roll;
            System.out.print(roll + " ");
        
    }
    
    System.out.println("Total: " + total);
    
      System.out.print("Again? [y,n] ");
       repeat = s.next();
       total = 0;
    
}
System.out.println("bye");
    
    
    
    
}
public static int dieRoll(int sides){
    return (int) (Math.random()*sides) + 1;
    
}



}