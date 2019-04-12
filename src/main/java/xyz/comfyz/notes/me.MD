spring springmvc springboot
```
spring
    工作机制是IOC IOC是思想，依赖注入是实现
    1. 使用ioc最大程度解耦对象依赖
    2. 使用apo解耦模块和组件依赖
    3. 简化其他框架代码，是框架之间的润滑剂和粘合剂
    4. 无侵入式设计，无依赖设计

spring容器的作用
    spring的核心，实质是一个beanfactory，一个applicationContext的实例，
    控制bean的初始化，获取，销毁，实现依赖注入

spring容器初始化过程
    xml或注解、配置类加载配置初始化容器
    开启自动配置
    扫描包及目录扫描配置及需要加载的bean
    创建SpringApplication，传入启动类
    创建并初始化ApplicationInitializer列表 （spring.factories）
    创建并初始化ApplicationListener列表  （spring.factories）
    初始化主类mainApplicatioClass    (Bootstrap启动主类)
    运行run()
    计时器
    创建监听器
    配置环境
    创建ConfigurableApplicationContext
    准备context
    刷新context
        根据上下文环境初始化工厂类，加载bean，如果需要依赖查询容器内已有的bean并注入，如果没有该bean则先初始化被依赖bean
    监听器发布finish事件
    即使结束

IOC/DI实现原理
因为spring容器的核心机制，由容器来初始化，管理，销毁bean

spring初始化bean过程
    definition
        实例化 default constructor invoked
    pre-initialized
        设置属性值 依赖注入 autowired 
        设置beanName BeanNameAware.setBeanName()
        设置beanFactory BeanFactoryAware.setBeanFactory()
        初始化前 BeanPostProcessors.ProcessBeforeInitialization.postProcessBeforeInitialization()
        设置属性值后 InitializingBean.afterProPertiesSet()
        初始化方法 init-method
        初始化后 BeanPostProcessors.ProcessaAfterInitialization.postProcessAfterInitialization()
    ready
        执行应用业务逻辑
    destroyed
        容器关闭后
        DisposableBean.destroy()
        destroy-method
    ready
    destroyed

常用配置或者注解
AOP使用/常用配置或者注解
AOP实现原理
springboot如何0配置
与springmvc区别
如何自定义spring组件
```

mybatis
```
xml文件
解析到 configuration
ev
transactionMananger
dataSource
mappers
SqlsessionFactoryBuilder.build()
openSession()
sqlsession
getMapper()
transaction
作用
集成方式/使用方式/常见配置
工作原理
```
mysql 
```
已总结
```
mongo
```
作用
与mysql区别
如何使用
```
redis
```
部署集群
工作原理
使用方式
```
zookeeper/etcd
```
作用
部署集群
使用方式
工作原理
```
dubbo/rpc
```
作用
使用方式
工作原理
```
protobuf
ES
```
作用
使用方式
优化方式
```
rabbitMQ kafka nsq
```
作用，区别
工作原理
使用方式
```
tomcat
```
作用，工作原理
配置部署
```
nginx
```
作用
工作原理
配置部署
```