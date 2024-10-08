package Service.impl;

import Service.studentService.IStudentService;
import entity.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StudentService implements IStudentService {

    @Override
    public List<String> failStudentName() {
        List<Student> list = new ArrayList<>();
        Student student1 = new Student(1, "张三1", "李四1", "王五1");
        Student student2 = new Student(8, "张三2", "李四2", "王五2");
        Student student3 = new Student(9, "张三3", "李四3", "王五3");
        Student student4 = new Student(4, "张三4", "李四4", "王五4");
        Student student5 = new Student(5, "张三5", "李四5", "王五5");
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        list.add(student5);
        return list.stream().sorted(Comparator.comparing(Student::getFailCount).reversed()).map(a -> a.getChineseTeacher()).limit(3).collect(Collectors.toList());

    }

    @Override
    public List<Integer> filer() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> newNumber = numbers.stream().filter(a -> a % 2 == 0).collect(Collectors.toList());
        return newNumber;
    }

    @Override
    public List<Integer> Search() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> newNumber = numbers.stream().filter(a -> a % 4 == 0).collect(Collectors.toList());
        return newNumber;
    }

    @Override
    public List<Integer> square() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> newNumber = numbers.stream().map(n->n*n).collect(Collectors.toList());
        return newNumber;
    }

    @Override
    public List<Integer> Sum() {
        List<Integer> numbers = new ArrayList<>( Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
       Integer newNumber = numbers.stream().reduce(0,Integer::sum);
       numbers.clear();
       numbers.add(newNumber);
        return numbers;
    }

    @Override
    public Double average() {
        List<Integer> numbers = new ArrayList<>( Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        double newNumber = numbers.stream().mapToInt(Integer::intValue).average().orElse(Double.NaN);
        return newNumber;
    }
}
