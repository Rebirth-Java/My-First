package entity;

public class Student {
    private int failCount;
    private  String name;
    private  String chineseTeacher;

    public Student(int failCount, String name, String chineseTeacher, String classTeacher) {
        this.failCount = failCount;
        this.name = name;
        this.chineseTeacher = chineseTeacher;
        this.classTeacher = classTeacher;
    }

    public int getFailCount() {
        return failCount;
    }

    public Student() {
    }

    public void setFailCount(int failCount) {
        this.failCount = failCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getChineseTeacher() {
        return chineseTeacher;
    }

    public void setChineseTeacher(String chineseTeacher) {
        this.chineseTeacher = chineseTeacher;
    }

    public String getClassTeacher() {
        return classTeacher;
    }

    public void setClassTeacher(String classTeacher) {
        this.classTeacher = classTeacher;
    }

    private String classTeacher;


}
