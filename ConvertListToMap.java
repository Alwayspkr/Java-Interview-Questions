import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

class Student {
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name=" + name +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


public class ConvertListToMap {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(1,"Pavan"));
        list.add(new Student(2,"Kumar"));
        list.add(new Student(3,"Reddy"));
        list.add(new Student(4,"Bharath"));

   HashMap<Integer, String> map=list.stream().
                                 collect(Collectors
                                         .toMap(Student::getId,Student::getName,
                                                 (x,y)->x+" "+y, HashMap::new));
        System.out.println(map);
    }
}
