import java.util.ArrayList;
import java.util.Scanner;

public class UAS1B {
    private String setID;
    private String setUserName;
    private String setFullName;

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

    public UAS1B(){

    }
    public UAS1B(){

    }
    private String ShowNumberOfPost() {
    }

    public static void main(String[] args) {
        int jumPost = 4;
        Scanner sc = new Scanner(System.in);
        UAS1B user1 =  new UAS1B();
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
