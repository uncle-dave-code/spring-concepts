package com.dscfgos.spring_concepts.dependency_injection;

import com.dscfgos.spring_concepts.dependency_injection.utils.Configuration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {
    public static void main(String... args) {
        // No DI
     /* NoDIService noDIService = new NoDIService();
      noDIService.generateReport();*/

        // Constructor DI
      /*ConstructorDIService constructorDIService = new ConstructorDIService(new PdfReport(), new DataUtils());
      ConstructorDIService constructorDIService = new ConstructorDIService(new XlsReport(), new DataGeneratorB());
      constructorDIService.generateReport();*/

        // Setters DI
      /*SettersDIService settersDIService = new SettersDIService();
      settersDIService.setReport(new PdfReport());
      settersDIService.setDataGenerator(new DataGeneratorA());
      settersDIService.generateReport();*/

        // Interface DI
        /*InterfaceDIService interfaceDIService = new InterfaceDIService();
        interfaceDIService.setReport(new XlsReport());
        interfaceDIService.setDataGenerator(new DataGeneratorB());
        interfaceDIService.generateReport();*/

        var context = getSpringContext("pdf-report");
        SpringWaysDIService springWaysDIService = context.getBean(SpringWaysDIService.class);
        springWaysDIService.generateReport();
        context.close();
    }

    private static AnnotationConfigApplicationContext getSpringContext(String profile) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.getEnvironment().setActiveProfiles(profile);
        context.register(Configuration.class);
        context.refresh();
        return context;
    }
}
