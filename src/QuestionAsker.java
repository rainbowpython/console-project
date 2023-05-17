
import java.util.*;

public class QuestionAsker {
  private Scanner scanner;
  private ArrayList<Question> questions = new ArrayList<Question>();
  private ArrayList<Integer> difficulties = new ArrayList<Integer>();
  
  public QuestionAsker(){
    scanner = new Scanner(System.in);
    addQuestion("Would a superclass be a parent or a child", 3);
    addQuestion("What is 200 to the power of 2", 0);
    addQuestion(null, 0, null);
  }
  
  public void question(int difficulty){
        
  }
  private void addQuestion(String question, int diffculty){
      
  }
  private void addQuestion(String question, int diffculty, String catagory){
      
  }
  public void sort(){
    
    for(int i = 0; i < difficulties.size(); i++){
      int index = i;
      for(int j = i + 1; j < difficulties.size(); j++){
        if(difficulties.get(index) > difficulties.get(j)){
          index = j;
        }
      }
      String stringTemp = questions.get(i).getQuery();
      int intTemp = difficulties.get(i);
      questions.set(i, questions.get(index));
      difficulties.set(i, difficulties.get(index));
      questions.set(index, questions.get(i));
      difficulties.set(index, difficulties.get(i));
    }
    
  }
  

}