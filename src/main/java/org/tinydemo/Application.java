package org.tinydemo;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.util.List;

public class Application {

    private static Logger logger = LogManager.getLogger(Application.class);
    
    public static void main(String[] args) {
        System.out.println("\n****** Start Tiny Application ******");

        RuntimeMXBean runtimeMxBean = ManagementFactory.getRuntimeMXBean();
        List<String> arguments = runtimeMxBean.getInputArguments();

        System.out.println("\n-----------------------");
        System.out.println("\nJVM Arguments:\n");
        for(String s : arguments)
            System.out.println(s);
        System.out.println("\n-----------------------\n");

        System.out.println();
        System.out.println("This is a tiny application which does nothing");
        System.out.println();
        System.out.println("****** Tiny Application Stopped ******");
    }
}
