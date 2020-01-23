package domain;

public class Person {
    int age;

    public Person(int initialAge){
        if (initialAge>=0){
            this.setAge(initialAge);
        } else {
            System.out.println("Age is not valid, setting age to 0.");
            this.setAge(0);
        }
    }

    private void setAge(int age) {
        this.age = age;
    }

    public int getAge() { return age;  }

    public void yearPasses(){
        this.age += 1;
    }

    public void amIOld(){
        if(this.age<13){
            System.out.println("You are young.");
        } else if(this.age<18){
            System.out.println("You are a teenager.");
        } else {
            System.out.println("You are old.");
        }
    }
}
