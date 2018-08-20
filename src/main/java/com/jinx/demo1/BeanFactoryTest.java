package com.jinx.demo1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * @author jinx
 * @date 2018/08/21 00:30
 * Desc:
 */
public class BeanFactoryTest {
    public static void main(String[] args) {
        BeanFactory bf = new XmlBeanFactory(new ClassPathResource("beanFactoryTest.xml"));
        MyTestBean myTestBean = (MyTestBean) bf.getBean("myTestBean");
        System.out.println(myTestBean.getTestStr());
    }
}
