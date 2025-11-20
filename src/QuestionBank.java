import java.util.ArrayList;

public class QuestionBank {

    private ArrayList<Questions> questions;

    public QuestionBank(){
        questions = new ArrayList<Questions>();
        loadQuestions();
    }

    private void loadQuestions()
    {
        questions.add(new Questions("What is the first element in a Java array?",
                new String[]{"0", "1", "-1", "it depends"}, 0,
                "arrays", "arrays start counting the index from 0" ));
    }

    public ArrayList<Questions> getQuestionsByTopic(String topic)
    {
        ArrayList<Questions> result;
        result = new ArrayList<Questions>();

        for(Questions q: questions){

            if(topic.equals("all")){

                result.add(q);
            }

        }

        return result;
    }
}
