public class Question {
    private String query;
    private int diffculty;
    private String catagory;
    public static final String[] catagories = {"Coding", "Video Games", ""}; 
    public Question(String q, int d){
        query = q;
        diffculty = d;
        catagory = "none";
    }
    public Question(String q, int d, String c){
        query = q;
        diffculty = d;
        catagory = c;
    }
    public String getQuery(){
        return query;
    }
}
