package controller;

import Service.impl.StudentService;
import Service.studentService.IStudentService;

import java.util.List;
import java.util.concurrent.*;

public class StudentController {


    private static final ExecutorService executor = Executors.newFixedThreadPool(5); // 创建固定大小为5的线程池

    public static IStudentService studentService = new StudentService();

    public static void main(String[] args) {
        ShowInfo();
        collect();
        Search();
        Square();
        Sum();
        average();
    }

    /**
     * 打印学生信息
     */
   private  static  void ShowInfo(){
       System.out.println(studentService.failStudentName());
   }
    /**
     * 过滤和收集
     */
    private  static  void  collect(){
        System.out.println(studentService.filer());
    }
    /**
     * 查找
     */
    private  static  void  Search(){
        System.out.println(studentService.Search());
    }
    /**
     * 平方
     */
    private  static  void  Square(){
        studentService.square().forEach(a-> System.out.print(a+"\t"));
        System.out.println("");
    }
    private  static  void  Sum(){
        System.out.println(studentService.Sum());
    }
    private  static  void   average(){
        System.out.println(studentService.average());
    }
}

