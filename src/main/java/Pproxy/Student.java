package Pproxy;

/**
 * @Class_NAME Student
 * @Auther 张明慧
 * @Date 2019/4/2 09:29
 */
public class Student implements Person {

    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void giveMoney() {
        System.out.println(name+"上交班费80元");
    }
}
