package api;

class Person extends Object{
    private String name;
    private int age;
    private final String SSN;

    public Person(String name, int age, String ssn){
        this.name = name;
        this.age = age;
        this.SSN = ssn;
    }

    @Override
    public boolean equals(Object obj){
        if(obj instanceof Person){
            Person person = (Person)obj;

            boolean bool = this.name.equals(person.name) && this.age == person.age
                    && this.SSN.equals(person.SSN);
            return bool;
        }else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return (name + age + SSN).hashCode();
    }

    @Override
    public String toString(){
        return "이름: " + name + "\n나이: " + age + "\n주민번호: " + SSN;
    }

}

public class Ex01 {
    public static void main(String[] args) {
        Person person1 = new Person("홍길동", 20, "123456-1234567");
        Person person2 = new Person("홍길동", 20, "123456-1234567");

        System.out.println(person1.equals(person2));

        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());

        System.out.println(person1.toString());
    }
}
