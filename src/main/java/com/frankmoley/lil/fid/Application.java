package com.frankmoley.lil.fid;

import com.frankmoley.lil.fid.config.ApplicationConfig;
import com.frankmoley.lil.fid.service.OutputService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) throws Exception {
        //Aqui será usado o application context
        //GreetingService greetingService = new GreetingService("Hello");
        //TimeService timeService = new TimeService(true);
        //OutputService outputService = new OutputService(greetingService, timeService);

        //Aqui o application  context
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        OutputService outputService = context.getBean(OutputService.class);

        for (int i = 0; i < 5; i++) {
            outputService.generateOutput();
            Thread.sleep(5000);
        }
    }
}
