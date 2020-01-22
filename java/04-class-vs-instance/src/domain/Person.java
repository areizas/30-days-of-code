package domain;

public class Person {
    int age;

    public Person(int age){
        if (age>=0){
            this.setAge(age);
        } else {
            System.out.println("Age is not valid, setting age to 0.");
            this.setAge(0);
        }
    }

    private void setAge(int age) {
        this.age = age;
    }
}
