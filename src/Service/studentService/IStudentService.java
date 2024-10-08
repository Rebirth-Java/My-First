package Service.studentService;

import entity.Student;

import java.util.List;

public interface IStudentService {
List<String> failStudentName();
/**
 * 过滤和收集：
 *
 *     给定一个整数列表 List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);，使用 Stream API 过滤出所有的偶数，并将它们收集到一个新的列表中。
 */
List<Integer> filer();
List<Integer>Search();

    /**
     * 进行平方根操作
     * @return
     */
    List<Integer>square();
    /**
     *
     *     使用 Stream API 计算上述列表中所有数字的总和。
     *     计算列表中所有数字的平均值。
     */
    List<Integer> Sum();
    Double average();
}
