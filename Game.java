

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Game {
    private ArrayList<Question> questionSet;
    //constructor
    public Game(){
        //set up arrayList for questionset
        questionSet = new ArrayList<Question>();
        String q = "Where does the sun rise?";
        String[] a = {"East","South","West","North"};
        questionSet.add(new Question(q,a,"East")); //add method to pertain array class
        q = "Who invented the telephone?";
        //must reuse variable with new string[]
        //array constants can only be used during intialization
         a = new String[]{"Thomas Edison","Michael faraday","James Watt","Alexander Bell"};
        questionSet.add(new Question(q,a,"Alexander Bell"));
        q = "Where is the capital of India?";
         a = new String[]{"New Delhi","Alwar","Mumbai","Jaipur"};
        questionSet.add(new Question(q,a,"New Delhi"));
        Collections.shuffle(questionSet,new Random());

    }
    //staring the game
    public void start(){
        Scanner scan = new Scanner(System.in);
        int numCorrect = 0;
        //show questions from questionSet
        for( int question = 0; question < questionSet.size();question++){
            System.out.println(questionSet.get(question).getQuestion());
            int numChoices = questionSet.get(question).getChoices().size();
            //show choices from questions in questionSet for particular question
            for( int choice = 0; choice < numChoices ;choice++){
                System.out.println((choice +1) +":" +
                        questionSet.get(question).getChoices().get(choice));
            }
            int playerAnswer  = scan.nextInt();
            ArrayList<String> choiceSet = questionSet.get(question).getChoices(); //set choice for particular question
            String correctAnswer = questionSet.get(question).getAnswer();
            int correctAnswerIndex = choiceSet.indexOf(correctAnswer);
            if(playerAnswer == correctAnswerIndex + 1){
                numCorrect++;// increase if answer is correct
                // if answer is correct
            }

        }
        scan.close();
        System.out.println("You got " + numCorrect + " correct answer(s)"); // print number of correct answer by user
    }
}
