import java.sql.Array;
import java.sql.SQLOutput;
import java.util.*;

class Employee {
    String firstName;
    String secondName;
    String address;
    Long Salary;
    int age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getSalary() {
        return Salary;
    }

    public void setSalary(Long salary) {
        Salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", address='" + address + '\'' +
                ", Salary=" + Salary +
                ", age=" + age +
                '}';
    }

    public Employee(String firstName, String secondName, String address, Long salary, int age) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.address = address;
        Salary = salary;
        this.age = age;
    }
}



public class EmployeeTest {
    public static void main(String[] args) {
        List<Employee> list3 = new ArrayList<>();
        list3.add(new Employee("Pavan","Reddy","Hyd",40000l,25));
        list3.add(new Employee("Manoj","Goud","Mbnr",45000l,23));
        list3.add(new Employee("Ranjith","Reddy","Vizag",46000l,26));
        list3.add(new Employee("Raghav","Yadav","Hyd",47000l,27));
        list3.add(new Employee("Venkatesh","Victory","Machilipatnam",30000l,28));
        list3.add(new Employee("Balakrishna","Nandamuri","Kurnool",60000l,29));
        list3.add(new Employee("PawanKalyan","Konidela","Kadapa",90000l,23));
        list3.add(new Employee("Chiranjivi","Megastar","Mbnr",10000l,21));
        list3.add(new Employee("Ram Charan","Tej","Medak",60000l,25));
        list3.add(new Employee("Vijay","Devarakonda","Chennai",70000l,29));
        list3.add(new Employee("Sri Ram","Pulipati","Vizag",90000l,34));
        list3.add(new Employee("Tinku","Reddy","Mbnr",420000l,35));
        list3.add(new Employee("Suresh","Naidu","Hyd",470000l,55));

        System.out.println("find employees whose salaries are above 10000");
        list3.stream().filter(emp->emp.getSalary() > 60000).forEach(System.out::println);


        System.out.println("find employees age greater then 30");
        list3.stream().filter(emp->emp.getAge()>=30).forEach(System.out::println);

        System.out.println("sorting based on salries");
        Collections.sort(list3, Comparator.comparingDouble(Employee::getSalary));
        list3.forEach(System.out::println);

        System.out.println("sorting based on names");
        Collections.sort(list3,Comparator.comparing(Employee::getFirstName));
        list3.forEach(System.out::println);

        System.out.println("Second Highest Salaries");
        Optional<Employee> secondHighest=  list3.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(1).findFirst();
        System.out.println(secondHighest.get());

        System.out.println("Getting first 3 digits");
        list3.stream().limit(3).forEach(System.out::println);

        System.out.println("Getting second name Reddy persons");
        list3.stream().filter(e->e.getSecondName().endsWith("Reddy")).forEach(System.out::println);

        System.out.println("how to add extra 10000 salary to all employees");
        list3.stream().map(e->e.getSalary()+10000l).forEach(System.out::println);

        System.out.println("sum of employee salaries");
        int sum =list3.stream().map(e->e.getSalary()+10000).mapToInt(Long::intValue).sum();
        System.out.println("Sum of salaries:: "+sum);

    }
}
