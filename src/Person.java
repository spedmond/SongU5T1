public class Person {
    private String firstName;
    private String lastName;
    private int meetings;

    public Person(String firstName,String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void meet(Person person) {
        meetings++;
        person.meetings++;
        System.out.println("Hello, my name is " + firstName + ".");
        System.out.println("Hi, my name is " + person.firstName + ".");
    }

    public int getMeetings() {
        return meetings;
    }
}
