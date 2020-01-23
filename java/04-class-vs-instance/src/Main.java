import domain.Person;

public class Main {

    public static void main(String[] args) {
        int[] ages = new int[]{-1,10,16,18};

        for (int i : ages){
            Person person = new Person(i);
            person.amIOld();
            for (int j=0; j<3; j++){
                person.yearPasses();
            }
            person.amIOld();
            System.out.println();
        }
    }
}
