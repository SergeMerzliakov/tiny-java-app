package org.tinydemo;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

public class Application {

    private static Logger logger = LogManager.getLogger(Application.class);
    
    public static void main(String[] args) {
        System.out.println("\n****** Start Tiny Application ******");
        File f = new File("/usr/home/blah");
        System.out.println(f.getPath());
        
        List<String> items = new LinkedList<>();
        items.add("Hello");
        items.add("World");

        System.out.println(logger.getName());
        System.out.print(items.get(0));
        System.out.print(" ");
        System.out.println(items.get(1));

        System.out.println("****** Tiny Application Stopped ******");
    }
}
