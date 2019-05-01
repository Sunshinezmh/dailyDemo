package PobserverPattern;

/**
 * @Class_NAME ConcreteSubject
 * @Auther 张明慧
 * @Date 2019/3/29 18:04
 */
public class ConcreteSubject extends Subject {

    private String subjectState;
    public String SubjectState;

    //具体观察者的状态


    public String getSubjectState() {
        return subjectState;
    }

    public void setSubjectState(String subjectState) {
        this.subjectState = subjectState;
    }
}
