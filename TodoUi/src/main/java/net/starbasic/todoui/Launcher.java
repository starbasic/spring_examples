package net.starbasic.todoui;

import 
  org.springframework.context.support.ClassPathXmlApplicationContext;


public class Launcher {
    public void launch() {
        String[] contextPaths = new String[] {"newSpringXMLConfig.xml"};
        new ClassPathXmlApplicationContext(contextPaths);
    }
}