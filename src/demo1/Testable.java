package demo1;

/**
 * 6/9/14  5:22 PM
 * Created by JustinZhang.
 */
public class Testable {
    public void execute(){
        System.out.println("Executing...");
    }
    @Test
    void textExecute(){execute();}

}
