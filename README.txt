理工头条项目的准备阶段:
1.java基础+前后端连接+freemarker模板继承
freemarker模板继承:
(1)首先添加依赖,rapid-core,commons-lang在application.yml中配置(虽然没有配置依然好使,但是先留着吧,以后也许会发现它的作用的)
spring:
  freemarker:
    charset: UTF-8
    check-template-location: true
    template-loader-path: classpath:/templates
(2)配置configration类,配置extends,blocks,override
代码在src/com.lee.hust_prepared.config/FreemarkerConfig.java
(3)将freemarker重复代码抽取到base.ftl
