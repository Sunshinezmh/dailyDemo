package lambda;

import org.junit.Test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @Class_NAME LambdaDemo
 * @Auther 张明慧
 * @Date 2019/3/7 09:02
 */
public class LambdaDemo {

    /**
     *  文章链接
        https://www.cnblogs.com/coprince/p/8692972.html
     */

    /**
     * 功能描述 用lambda表达式实现Runnable
     * @auther 张明慧
     * @since 1.0.0 2019/3/7 9:29
     */
    @Test
    public void test1() {
        //java8之前
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("befor java8,too much code for too little to do");
            }
        }).start();

    //    java8 方式
       new Thread(() -> System.out.println("In java8,lambda expression rocks !!")).start();

       //Lambda的语法
        /**
         *   (params) -> expression
             (params) -> statement
             (params) -> { statements }
         */
        /**
         *   1.无参
             () -> System.out.println("Hello Lambda Expressions");
             2.有参
             (int even, int odd) -> even + odd
         */

    }

    /**
     * 功能描述 使用Java 8 lambda表达式进行事件处理
     * @auther 张明慧
     * @since 1.0.0 2019/3/7 9:30
     */
    @Test
    public void test2(){
    //    java8 之前
        JButton show=new JButton("Show");
        show.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Event handing without lambda expression is boring");
            }
        });

    //    java 8方式
        show.addActionListener((e -> {
            System.out.println("Light,Camera,Action !! Lambda expressions Rocks");
        }));
    }

    /**
     * 功能描述 使用lambda表达式对列表进行迭代
     * @auther 张明慧
     * @since 1.0.0 2019/3/7 9:39
     */
    @Test
    public void test3(){
    // java 8 之前
        List<String> features= Arrays.asList("Lambdas","Default Method","Stream API","Date and Time API");
        for (String feature:features) {
            System.out.println("java8 之前---------->"+feature);
        }

    // Java 8之后：
        List<String> features1= Arrays.asList("Lambdas","Default Method","Stream API","Date and Time API");
        features1.forEach(n -> System.out.println("java8之后--------->"+n));
        features1.forEach(System.out :: println);
    }

    /**
     * 使用lambda表达式和函数式接口Predicate
     */
    @Test
    public void test4(){
        List list=Arrays.asList("Java","Scala","C++","Lisp");
        System.out.println("Languages which starts with J:");
        //filter(list,(str) ->str.startsWith("J"));

        System.out.println("Languages which ends with a ");
        //filter(list, (str)->str.endsWith("a"));

        System.out.println("Print all languages :");
        filter(list, (str)->true);

        System.out.println("Print no language : ");
        filter(list, (str)->false);

        System.out.println("Print language whose length greater than 4:");
        //filter(list, (str)->str.length() > 4);
    }

    //方法1
    public static void filter (List<String> names, Predicate condition){
        for (String name: names) {
            if (condition.test(name)) {
                System.out.println(name+"");
            }
        }
    }
    // 方法2
    public static void filter1(List<String> names, Predicate condition){
         names.stream().filter((name) ->(condition.test(name))).forEach((name)->{
             System.out.println(name+"");
         });
    }

    /**
     * 如何在lambda表达式中加入Predicate
     */
    @Test
    public void test5(){
        // 甚至可以用and()、or()和xor()逻辑函数来合并Predicate，
        // 例如要找到所有以J开始，长度为四个字母的名字，你可以合并两个Predicate并传入
        Predicate<String> startsWithJ=(n) ->n.startsWith("J");
        Predicate<String> fourLetterLong=(n)->n.length()==4;
        List list=Arrays.asList("Java","Scala","C++","Lisp");
        list.stream().filter(startsWithJ.and(fourLetterLong))
                .forEach((n)-> System.out.println("nName, which starts with 'J' and four letter long is : " + n));
    }

    /**
     * 例6、Java 8中使用lambda表达式的Map和Reduce示例
     */
    @Test
    public void test6(){
        // 不使用lambda表达式为每个订单加上12%的税
        List<Integer> costBeforeTax=Arrays.asList(100,200,300,400,500);
        for (Integer cost:costBeforeTax) {
            double price=cost+.12*cost;
            System.out.println(price);
        }
        // 使用lambda表达式
        List<Integer> costBeforeTax1 = Arrays.asList(100, 200, 300, 400, 500);
        costBeforeTax1.stream().map((cost) -> cost + .12 * cost).forEach(System.out::println);
    }
    /**
     * 例6.2、Java 8中使用lambda表达式的Map和Reduce示例
     */
    @Test
    public void test62(){
        // 为每个订单加上12%的税
        // 老方法：
        List<Integer> costBeforeTax = Arrays.asList(100, 200, 300, 400, 500);
        double total = 0;
        for (Integer cost : costBeforeTax) {
            double price = cost + .12*cost;
            total = total + price;
        }
        System.out.println("Total : " + total);

            // 新方法：
        List<Integer> costBeforeTax1 = Arrays.asList(100, 200, 300, 400, 500);
        double bill = costBeforeTax1.stream().map((cost) -> cost + .12*cost).reduce((sum, cost) -> sum + cost).get();
        System.out.println("Total : " + bill);
    }


    /**
     * 例7、通过过滤创建一个String列表
     */
    @Test
    public void test7(){
        List<String> strList=new ArrayList<>();
        // 创建一个字符串列表，每个字符串长度大于2
        List<String> filtered=strList.stream().filter(x->x.length()>2).collect(Collectors.toList());
        System.out.printf("Original List : %s, filtered list : %s %n", strList, filtered);
        //关于 filter() 方法有个常见误解。在现实生活中，做过滤的时候，通常会丢弃部分，但使用filter()方法则是获得一个新的列表，且其每个元素符合过滤原则。
    }

    /**
     * 例8、对列表的每个元素应用函数
     */
    @Test
    public void test8(){
        // 将字符串换成大写并用逗号链接起来
        List<String> G7 = Arrays.asList("USA", "Japan", "France", "Germany", "Italy", "U.K.","Canada");
        String G7Countries=G7.stream().map(x -> x.toUpperCase()).collect(Collectors.joining(", "));
        System.out.println(G7Countries);
    }

    /**
     * 例9、复制不同的值，创建一个子列表
     */
    @Test
    public void test9(){
        // 用所有不同的数字创建一个正方形列表
        List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 3, 4);
        List<Integer> distinct=numbers.stream().map(i ->i *i).distinct().collect(Collectors.toList());
        System.out.printf("Original List : %s,  Square Without duplicates : %s %n", numbers, distinct);
    }

    /**
     * 例10、计算集合元素的最大值、最小值、总和以及平均值
     */
    @Test
    public void test10(){
        //获取数字的个数、最小值、最大值、总和以及平均值
        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
        IntSummaryStatistics stats = primes.stream().mapToInt((x) -> x).summaryStatistics();
        System.out.println("Highest prime number in List : " + stats.getMax());
        System.out.println("Lowest prime number in List : " + stats.getMin());
        System.out.println("Sum of all prime numbers : " + stats.getSum());
        System.out.println("Average of all prime numbers : " + stats.getAverage());
    }
}
