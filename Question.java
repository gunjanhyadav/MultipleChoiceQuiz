import java.util.ArrayList;
import java.util.Collections;

public class Question {
    private String question;
    private ArrayList<String> choices;
    private String answer;
    //constructor
    public Question(String question,String[] choices, String answer){
        this.question = question;
        this.choices = new ArrayList<String>();
        for(int i = 0; i < choices.length; i++){
            this.choices.add(choices[i]);
        }
        //each Game shows questions in different order or shuffle questions
        Collections.shuffle(this.choices);
        this.answer = answer;
    }
    //method which return the  instance value
    public String getQuestion(){
        return question;
    }
    //method for choices
    public ArrayList<String> getChoices(){
        return choices;
    }
    //method for answer instance variable
    public String getAnswer(){
        return answer;
    }
}
