/*Purpose of class:functioning of game 
 *Author :Muskan Sandhay, Harshita, Simarjeet Kaur, Pooja, Ayush
*/

import java.util.Scanner;
import java.util.Random;


public class FunctionFiles {
    

    //constructors
    public FunctionFiles(){}

    //random object declaration
    public static Random random=new Random();

    //dHolder object declaration
    public static DataHolder dHolder=new DataHolder();

    //Scanner object declaration
    public static  Scanner yn= new Scanner(System.in);

    //states
    public static String[]arr1;
    public static String[] arr2;
    public static String[]arr3={"have you lied to parents?","have you ever stolen?","do you have crush on someone?"};
    public static String[]arr4={"go to rooftop","treat your friends with coffee","tell about your embarssing moments"};
    
   

    //method to call two different methods to store the question for truth/dare
    public void question(){
        System.out.println("choose whether you want to store question for truth or dare");
        String queType=yn.nextLine();
        if (queType.equalsIgnoreCase("truth")){
            storingTruth();
        }else if(queType.equalsIgnoreCase("dare")){
            storingDare();
        }else{
            System.out.println("not valid input please write either truth or dare");
            question();
        }

        if (queType.equalsIgnoreCase("truth")){
            storingDare();
        }else if(queType.equalsIgnoreCase("dare")){
            storingTruth();
        }else{
            System.out.println("not valid input please write either truth or dare");
            question();
        }
    }


    //method to ask the user for truth questions and calling another method to store that questions
    public void storingTruth(){
        System.out.println("now you can store the truth questions for game");
        System.out.println("please tell how many truth questions you want to store");
        int truthNo=yn.nextInt();
        yn.nextLine();
        for(int i=0;i<truthNo;i++){
            System.out.println("question please!!!");
            String que=yn.nextLine();
            arr1= DataHolder.storeTruthQuestions(que,truthNo);
        
        }System.out.println("all question stored");
    }

    //method to ask the user for dare questions and calling another method to store that questions
    public void storingDare(){
        System.out.println("now you can store the dare questions for game");
        System.out.println("please tell how many dare questions you want to store");
        int dareNo=yn.nextInt();
        yn.nextLine();
        for(int i=0;i<dareNo;i++){
            System.out.println("question please!!!");
            String que=yn.nextLine();
            arr2=DataHolder.storeDareQuestions(que,dareNo);
        
        }System.out.println("all question stored");

    }

    //method to display inbuilt questions
    public void showingStoredQue(){
        System.out.println("you can play with in-bulit questions!!!!!");
        System.out.println("Please choose between truth or dare");
        String queType = yn.nextLine();
        if(queType.equalsIgnoreCase("truth")){
            System.out.println(arr3[random.nextInt(arr3.length)]);
        }else if(queType.equalsIgnoreCase("dare")) {
            System.out.println(arr4[random.nextInt(arr4.length)]);
        }else{
            System.out.println("not valid input");
            showingStoredQue();
        }
    }


     //method to ask questions from players and counting the scores
     public void playingGame(){
        if(Game.ans.equalsIgnoreCase("yes")){
            for(int i=0;i<Game.players;i++){
                askQuestion();
                Game.dArray[i].countingScores();
            }
        }else{
            for(int i=0;i<Game.players;i++){
                showingStoredQue();
                Game.dArray[i].countingScores();
            }  
        }
        
    }
 


    //method to display question regarding the user's chosen option between truth/dare while playing
    public void askQuestion(){
        System.out.println("Please choose between truth or dare");
        String queType = yn.nextLine();
        if(queType.equalsIgnoreCase("truth")){
            System.out.println(arr1[random.nextInt(arr1.length)]);
        }else if(queType.equalsIgnoreCase("dare")) {
            System.out.println(arr2[random.nextInt(arr2.length)]);
        }

    }


    

    //method to ask the user to restart or end  the game 
    public void playing(){
        System.out.println("please tell if you want to \n1)restart\n2)end  ");
        String decision=yn.nextLine();
        if(decision.equalsIgnoreCase("restart")){
            Game.game();
            playing();
        }

    }
    

}
