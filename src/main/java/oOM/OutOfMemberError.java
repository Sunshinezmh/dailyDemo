package oOM;

/**
 * @Class_NAME OutOfMemberError
 * @Auther 张明慧
 * @Date 2019/3/29 10:42
 */
public class OutOfMemberError {
    int depth = 0;

    public void sofMethod(){
        depth ++ ;
        sofMethod();
    }

    public static void main(String[] args) {
        OutOfMemberError test = null;
        try {
            test = new OutOfMemberError();
            test.sofMethod();
        } finally {
            System.out.println("递归次数："+test.depth);
        }
    }

}
