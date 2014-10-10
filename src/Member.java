/**
 * 6/18/14  4:29 PM
 * Created by JustinZhang.
 */
@DBTable(name = "MEMBER")
public class Member {
    @SQLString(30)
    String firstName;

    @SQLString(value = 30)
    String lastName;

    @SQLInteger
    Integer age;

    @SQLString(value = 30 , constraints = @Constraints(primaryKey = true))
    String handle;

    static  int memberCount;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return handle;
    }
}
