package org.softee.management.samples;

import static org.softee.management.annotation.MBean.AutomaticType.ATTRIBUTE;
import static org.softee.management.annotation.MBean.AutomaticType.OPERATION;

import org.softee.management.annotation.MBean;

@MBean(objectName="org.softee:type=Demo,name=AutomaticMBean", automatic={ATTRIBUTE, OPERATION})
public class AutomaticMBean {
    String one = "one";
    String two = "two";

    public String getOne() {
        return one;
    }

    public String getTwo() {
        return two;
    }

    public void setOne(String nextOne) {
        one = nextOne;
    }

    // not a bean getter
    protected String getProtected() {
        return null;
    }

    public void start() {
        System.out.println("start()");
    }

    public void stop() {
        System.out.println("stop()");
    }

    // not a public operation
    protected void protectedOperation() {

    }
}
