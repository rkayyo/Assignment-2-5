import java.util.Scanner;


class displayBox{
  
 public static void Main (String[] args){
 Scanner s = new Scanner(System.in);

 displayBox(4,7);
 
 
}
    public static void displayBox(double width, double height){
        String Character = "$";
        for (int i = 0; i < width; i++){
            for(int j = 0; j < height; j++){
                System.out.print(Character);
                
            }
            System.out.println("");
        }
        
    }
    
    
}