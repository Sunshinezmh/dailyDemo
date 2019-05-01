package Pproxy;

/**
 * 学生代理类，也实现了Person接口，保存一个学生实体，这样既可以代理学生产生行为
 *
 * @Class_NAME StudentsProxy
 * @Auther 张明慧
 * @Date 2019/4/2 09:31
 */
public class StudentsProxy implements Person {

    Student student;

    public StudentsProxy(Person student) {
        if (student.getClass()== Student.class) {
            this.student = (Student) student;
        }
    }
    //代理上交班费，调用被代理学生的上交班费行为
    @Override
    public void giveMoney() {
        student.giveMoney();
    }
}
