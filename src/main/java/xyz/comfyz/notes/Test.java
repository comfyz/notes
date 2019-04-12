package xyz.comfyz.notes;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;
import org.springframework.context.ApplicationContext;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.sql.*;

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
        Enhancer enhancer = new Enhancer();
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
