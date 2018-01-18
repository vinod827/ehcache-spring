package com.product.test;

import com.product.service.IProductInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App {
    private static final Logger log = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        IProductInfo obj = (IProductInfo) context.getBean("iProductInfo");
        log.debug("Result : {}", obj.getProductById(100));
        log.debug("Result : {}", obj.getProductById(100));
        log.debug("Result : {}", obj.getProductById(100));

        //shut down the Spring context.
        ((ConfigurableApplicationContext)context).close();

    }
}
