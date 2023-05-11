import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld beanTwo =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(beanTwo.getMessage());

        Cat cat1 = applicationContext.getBean("cat", Cat.class);
        Cat cat2 = applicationContext.getBean("cat", Cat.class);

        System.out.println("Ссылки на объекты HelloWorld одинаковы? :" + (bean == beanTwo));
        System.out.println("Ссылки на объекты Cat одинаковы? :" + (cat1 == cat2));
    }
}