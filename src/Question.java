public class Question {
    private String query;
    private int difficulty;
    private String catagory;
    public static final String[] catagories = {"Coding", "Video Games", "Math"}; 
    public Question(String q, int d){
        query = q;
        difficulty = d;
        catagory = "none";
    }

    public Question(String q, int d, String c){
        query = q;
        difficulty = d;
        catagory = c;
    }
    public Question(String q, int d, String c, String ){
        query = q;
        difficulty = d;
        catagory = c;
    }
    public String getQuery(){
        return query;
    }
    public int getDifficulty(){
        return difficulty;
    }
}
