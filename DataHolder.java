/*Purpose of class:store and hold the data
 *Author:Muskan Sandhay, Harshita, Simarjeet Kaur, Pooja, Ayush
 *Date
*/
import java.util.*;
public class DataHolder {

    //states
    private String pName;
    private int scores=0;
    //scanner variable declaration
    public static  Scanner yn= new Scanner(System.in);


    //constructors
    public DataHolder(String name){
          pName=name;
          
    }
    public DataHolder(){} 


    //counting scores
    public void countingScores(){
        int scores=this.scores;
        System.out.println("please enter if task is completed or ignored .\n by choosing\n 1)done \n 2)not done");
        String ans=yn.nextLine();
        if(ans.equals("done")){
            scores++;
        }
        this.scores=scores;


    }
 

    //getter for the states of DataHolder
    public int returnScores(){
        return this.scores;
    }
    public String returnName(){
        return this.pName;
    }


    
    // method to store questions for truth 
    public static String[]storeTruthQuestions(String que,int num){
        String []arr=new String[num];
        for(int i=0; i<num;i++){
            arr[i]=que;
        }
        System.out.println("question stored");
        return arr;
    }


    // method to store questions for dare 
    public static String[] storeDareQuestions(String que,int num){
        String []arr=new String[num];
        for(int i=0; i<num;i++){
            arr[i]=que;
        }
        System.out.println("question stored");
        return arr;
    }

    

    }
