public class Employee {
    String name;
    String post;
    String email;
    String telephone;
    int salary;
    int age;

    public Employee(String name, String post, String email, String telephone, int salary, int age) {
        this.name = name;
        this.post = post;
        this.email = email;
        this.telephone = telephone;
        this.salary = salary;
        this.age = age;
    }

    public void print(){
        System.out.println(name + ", " + post + ", " + email + ", " +
                telephone + ", " + salary + ", " + age );
    }


}
