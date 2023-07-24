package lexicon.se;

public class person {
    String firstName;
    String lastName;
    int age;
    String hobby;
    public String getInformation(){
        return firstName + " " + lastName + "is" + age + "years old and likes" + hobby;
    }


}
