package com.learn.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author wuminggao
 * @create 2020-07-19-下午11:53
 */
public class Test {
    @org.junit.Test
    public void test1() throws IOException {
        String configLocation = "dubbo-userservice-provider.xml";
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext(configLocation);
        context.start();


    }
}
