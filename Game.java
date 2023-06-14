/*Purpose of class:asking user to 
 *Author :Muskan Sandhay, Harshita, Simarjeet Kaur, Pooja, Ayush
*/
import java.util.*;
public class Game {
    public static Scanner yn = new Scanner(System.in);
    public static FunctionFiles ff= new FunctionFiles();
    public static int players;
    public static DataHolder []dArray;
    public static String ans;

    public static void game(){
            
       
        System.out.println("  Hi !!!!!!!!\n Welcome to ' truth and dare game'");
      
      
      //number and  name of players 
        System.out.println("please tell how many of you are playing.......");
        players=yn.nextInt();
        yn.nextLine();
        dArray=new DataHolder[players];
        
       
        for(int i=0;i<players;i++){
            System.out.println("player "+ (i+1));
            dArray[i]=new DataHolder(yn.nextLine());
            
        }

        

        //calling the method to ask the user whether he want to store his own questions or use in-built ones.
        askToStore(); 
        
        //asking user to continue the next round of game or end the game before the next one.
        askingToContinue();
      

        
    
    }


    
    //method to ask the user whether he want to store his own question or use in-built questions
    public static void askToStore(){
        System.out.println("do you want to store your questions ?\n1)yes\n2)no");
        ans=yn.nextLine();
        if(ans.equalsIgnoreCase("yes")){
            ff.question();//method to store the questions
            ff.playingGame();// method to play the game
        }else if(ans.equalsIgnoreCase("no")){
            ff.showingStoredQue();//method to use in-built questions

            ff.playingGame();//method to play the game
        }else{
            System.out.println("not valid input");
            askToStore();
        }
    
    }   
                
        
    


    //method to ask the user to continue for next round of game
     public static void askingToContinue(){
        String y="y";
        System.out.println("y or n");
        y=yn.nextLine();
        if(y.charAt(0)=='y'){//continuing the game 
           ff.playingGame();
           askingToContinue();
        
        }else {//ending the game and give name of winner 
            System.out.println("Game gets completed .\n So the winner is ");
            int index=0;
            for(int i=0;i<players;i++){
                int max=0;
                int scores=dArray[i].returnScores();
                if(max<scores){
                    index=i;
                }

            }
            System.out.println(dArray[index].returnName());
            

        }

        
    }



        


}

