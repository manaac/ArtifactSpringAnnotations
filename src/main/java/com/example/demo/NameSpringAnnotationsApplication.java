package com.example.demo;

import com.example.demo.controller.MyController;
import com.example.demo.controller.PizzaController;
import com.example.demo.lazy.LazyLoader;
import com.example.demo.propertysource.PropertySourceDemo;
import com.example.demo.repository.MyRepository;
import com.example.demo.scope.PrototypeBean;
import com.example.demo.scope.SingletonBean;
import com.example.demo.service.MyService;
import com.example.demo.service.VegPizza;
import com.example.demo.value.ValueAnnotationDemo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NameSpringAnnotationsApplication {

    public static void main(String[] args) {

        var context = SpringApplication.run(NameSpringAnnotationsApplication.class, args);//this run method returns application context object. Here application context act as a spring IOC container
//		PizzaController pizzaController = context.getBean(PizzaController.class);
//		PizzaController pizzaController = (PizzaController) context.getBean("pizzaController");
//      PizzaController pizzaController = (PizzaController) context.getBean("pizza");
        PizzaController pizzaController = (PizzaController) context.getBean("pizzaController");
        System.out.println(pizzaController.getPizza());

//        VegPizza vegPizza = context.getBean(VegPizza.class);
        VegPizza vegPizza = (VegPizza) context.getBean("vegPizzaBean");
        System.out.println(vegPizza.getPizza());

        MyController myController = context.getBean(MyController.class);
        System.out.println(myController.hello());

        MyService myService = context.getBean(MyService.class);
        System.out.println(myService.hello());

        MyRepository myRepository = context.getBean(MyRepository.class);
        System.out.println(myRepository.hello());

        LazyLoader lazyLoader = context.getBean(LazyLoader.class);

        SingletonBean singletonBean1 = context.getBean(SingletonBean.class);
        System.out.println(singletonBean1.hashCode());

        SingletonBean singletonBean2 = context.getBean(SingletonBean.class);
        System.out.println(singletonBean2.hashCode());

        SingletonBean singletonBean3 = context.getBean(SingletonBean.class);
        System.out.println(singletonBean3.hashCode());

        PrototypeBean prototypeBean1 = context.getBean(PrototypeBean.class);
        System.out.println(prototypeBean1.hashCode());

        PrototypeBean prototypeBean2 = context.getBean(PrototypeBean.class);
        System.out.println(prototypeBean2.hashCode());

        PrototypeBean prototypeBean3 = context.getBean(PrototypeBean.class);
        System.out.println(prototypeBean3.hashCode());

        ValueAnnotationDemo valueAnnotationDemo = context.getBean(ValueAnnotationDemo.class);
        System.out.println(valueAnnotationDemo.getDefaultName());
        System.out.println(valueAnnotationDemo.getHost());
        System.out.println(valueAnnotationDemo.getEmail());
        System.out.println(valueAnnotationDemo.getPassword());
        System.out.println(valueAnnotationDemo.getJavaHome());
        System.out.println(valueAnnotationDemo.getPathVariable());

        PropertySourceDemo propertySourceDemo = context.getBean(PropertySourceDemo.class);
        System.out.println(propertySourceDemo.getHost());
        System.out.println(propertySourceDemo.getEmail());
        System.out.println(propertySourceDemo.getPassword());
    }

}
