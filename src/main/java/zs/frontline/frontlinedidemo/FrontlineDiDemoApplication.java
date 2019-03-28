package zs.frontline.frontlinedidemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import zs.frontline.frontlinedidemo.controllers.ConstructorInjectedController;
import zs.frontline.frontlinedidemo.controllers.GetterInjectedController;
import zs.frontline.frontlinedidemo.controllers.MyController;
import zs.frontline.frontlinedidemo.controllers.PropertyInjectedController;
import zs.frontline.frontlinedidemo.services.SomeClassExtendsAbstract;

@SpringBootApplication
public class FrontlineDiDemoApplication {
    
    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(FrontlineDiDemoApplication.class, args);
        
        MyController controller = (MyController) ctx.getBean("myController");
        System.out.println(controller.hello());
        
        System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
        System.out.println(ctx.getBean(GetterInjectedController.class).sayHello());
        System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
        
        SomeClassExtendsAbstract someClassExtendsAbstract = ctx.getBean(SomeClassExtendsAbstract.class);
        System.out.println(someClassExtendsAbstract.add(2, 2));
    }
}

