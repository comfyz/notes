package xyz.comfyz.notes;

import com.sun.corba.se.spi.orbutil.threadpool.WorkQueue;
import org.springframework.aop.*;
import org.springframework.aop.framework.AopProxy;
import org.springframework.aop.framework.DefaultAdvisorChainFactory;
import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.aop.framework.ReflectiveMethodInvocation;
import org.springframework.aop.support.AopUtils;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.aop.support.JdkRegexpMethodPointcut;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.HierarchicalBeanFactory;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanDefinitionHolder;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.web.context.WebApplicationContext;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.sql.*;
import java.util.concurrent.*;

/**
 * @author :    comfy
 * @date :      2019-04-11 16:02:07
 * @since :     1.8
 */
public class Test {

    private String text;

    public static void main(String[] args) throws IllegalAccessException, SQLException {
        ApplicationContext context;
        BeanPostProcessor beanPostProcessor;
        BeanFactory beanFactory;
        HierarchicalBeanFactory hierarchicalBeanFactory;
        ConfigurableBeanFactory configurableBeanFactory;
        ApplicationContext context1;
        Resource resource;
        ResourceLoader resourceLoader;
        BeanDefinition beanDefinition;
        BeanDefinitionHolder beanDefinitionHolder;
        BeanDefinitionRegistry beanDefinitionRegistry;
        WebApplicationContext webApplicationContext;
        ConfigurableApplicationContext configurableApplicationContext;
        DefaultListableBeanFactory defaultListableBeanFactory;

        BeforeAdvice beforeAdvice;
        AfterAdvice afterAdvice;
        AfterReturningAdvice afterReturningAdvice;
        ThrowsAdvice throwsAdvice;
        Pointcut pointcut;
        JdkRegexpMethodPointcut jdkRegexpMethodPointcut;
        Advisor advisor;
        DefaultPointcutAdvisor defaultPointcutAdvisor;
        Proxy proxy;
        ProxyFactoryBean proxyFactoryBean;
        AopProxy aopProxy;
        ReflectiveMethodInvocation reflectiveMethodInvocation;
        AopUtils aopUtils;
        DefaultAdvisorChainFactory defaultAdvisorChainFactory;
        Enhancer enhancer = new Enhancer();
        ForkJoinPool.commonPool();
        ForkJoinPool forkJoinPool;
        WorkQueue workQueue;
        ForkJoinTask forkJoinTask;
        RecursiveTask task;
        ForkJoinWorkerThread forkJoinWorkerThread;
        Executors.newFixedThreadPool()
//        enhancer.setSuperclass();
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                return null;
            }
        });
        Test test = new Test();
        for (Field field : test.getClass().getDeclaredFields()) {
            field.setAccessible(true);
            field.set(test, "123");
            System.out.println(field.get(test));
        }

        Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mi_user","username", "password");
        Statement r = con.createStatement();
        ResultSet list = r.executeQuery("");
        ResultSetMetaData md = list.getMetaData();
    }

}
