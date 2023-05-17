
import java.util.*;

public class QuestionAsker {
  private Scanner scanner;
  private ArrayList<Question> questions = new ArrayList<Question>();
  private int points;
  public QuestionAsker(){
    scanner = new Scanner(System.in);
    points = 0;
    addQuestion("Would a superclass be a parent or a child", 3, "Coding");
    addQuestion("What is 200 to the power of 2", 4,"Math");
    addQuestion("What minecraft version drastically changed combat", 2, "Video games");
    
    sort();
  }

  public void addPoint(){
    points++;
  }
  
  public int getPoints(){
    return points;
  }

  public void question(int difficulty){
        
  }

  public void addQuestion(String question, int diffculty){
      questions.add(new Question(question,diffculty));
  }

  public void addQuestion(String question, int diffculty, String catagory){
      questions.add(new Question(question,diffculty,catagory));
  }
  
  private void sort(){
    
    for(int i = 0; i < questions.size(); i++){
      int index = i;
      for(int j = i + 1; j < questions.size(); j++){
        if(difficulties.get(index) > difficulties.get(j)){
          index = j;
        }
      }
      String stringTemp = questions.get(i).getQuery();
      questions.set(i, questions.get(index));
      questions.set(index, questions.get(i));
    }
    
  }
  
}