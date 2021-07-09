public class HomeWork5 {
    public static void main(String[] args) {

        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Иванов Иван Иавнович", "Директор",
                "ivanov@mail.com", "+79111111111",100000, 54);
        employees[1] = new Employee("Петров Петр Петрович", "Заместитель директора",
                "petrov@mail.com","+79222222222", 90, 43);
        employees[2] = new Employee("Кузьмин Кузьма Кузьмич","Старший менеджер",
                "kyzmin@mail.com","+79333333333", 80000, 41);
        employees[3] = new Employee("Максимов Максим Максимович", "Менеджер",
                "Макsimov@mail.com","+79444444444",70000,38);
        employees[4] = new Employee("Юрьев Юрий Юрьевич", "Cтажер",
                "Yri@mail.com", "+79555555555", 60000, 30);

        for(int i=0; i<employees.length;i++){
            if(employees[i].age>40){
                employees[i].print();
            }
        }

    }
}
