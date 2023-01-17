import java.util.ArrayList;
import java.util.Scanner;

public class modelFB {
    private String setID;
    private String setUserName;
    private String setFullName;

    public modelFB() {

    }

    public String getSetID() {
        return setID;
    }

    public void setSetID(String setID) {
        this.setID = setID;
    }

    public String getSetUserName() {
        return setUserName;
    }

    public void setSetUserName(String setUserName) {
        this.setUserName = setUserName;
    }

    public String getSetFullName() {
        return setFullName;
    }

    public void setSetFullName(String setFullName) {
        this.setFullName = setFullName;
    }


    private void setFullName(String debby_gibson) {

    }

    private void setID(String s) {

    }
    private String ShowNumberOfPost() {
        return ShowNumberOfPost();
    }
    private void setUserName(String dbgb4a) {
    }

    private void setPosted(ArrayList<String> myPost) {
    }

    public static void main(String[] args) {
        int jumPost = 4;
        Scanner sc = new Scanner(System.in);
        modelFB user1 =  new modelFB();
        user1.setID("001");
        user1.setUserName("dbgb4a");
        user1.setFullName("Debby Gibson");
        ArrayList<String> myPost =  new ArrayList<>();
        for(int index=0; index<jumPost;index++){
            myPost.add(sc.nextLine());
        }
        user1.setPosted(myPost);
        System.out.println("Total Posted : " + user1.ShowNumberOfPost());

    }



}
