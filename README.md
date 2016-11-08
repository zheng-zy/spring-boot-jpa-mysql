## 参考文档
http://docs.spring.io/spring-boot/docs/current/reference/html/boot-features-sql.html

## 配置pom
```
<dependency>
    <groupId>mysql</groupId>
    <artifactId>mysql-connector-java</artifactId>
    <version>5.1.38</version>
</dependency>
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-data-jpa</artifactId>
</dependency>
```
## springboot使用jpa配置mysql数据库
```
# mysql
spring.datasource.url=jdbc:mysql://127.0.0.1:3306/test?autoReconnect=true&useSSL=false
spring.datasource.username=root
spring.datasource.password=666666
spring.datasource.driver-class-name=com.mysql.jdbc.Driver
# Specify the DBMS
spring.jpa.database = MYSQL
# Show or not log for each sql query
spring.jpa.show-sql = true
# Hibernate ddl auto (create, create-drop, update)
spring.jpa.hibernate.ddl-auto = update
# Naming strategy
spring.jpa.hibernate.naming.strategy = org.hibernate.cfg.ImprovedNamingStrategy
# stripped before adding them to the entity manager)
spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.MySQL5Dialect
```



