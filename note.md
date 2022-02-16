## 常用依赖
```xml
<dependencies>
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-webmvc</artifactId>
            <version>5.3.15</version>
        </dependency>
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.13.1</version>
            <scope>test</scope>
        </dependency>
</dependencies>
```
## 注解说明
- @Autowired: 自动装配通过 type->name
    如果Autowired不能唯一自动装配上属性, 则需要通过@Qualifier(value="xxx")
- @Nullable : 字段标记了这个注解, 说明这个字段可以为null
- @Resource : 自动装配通过 name->type
- @Component: 组件, 放在类上, 说明这个类呗Spring管理了 就是bean. 等价于 <bean id="user" class="com.Haven.pojo.User"/>