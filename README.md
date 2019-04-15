## Spring Cloud 实战
* jdk 1.80_201
* Spring Boot 1.5.18.RELEASE
* Spring Cloud Edgware.RELEASE
* Mysql 5.6
* RabbitMQ 3.7.4

### 模块
* spring-cloud-admin-server-turbine 集成Spring Boot Admin 以及Hystrix
  Turbine聚合监控
* spring-cloud-blog-service blog服务
* spring-cloud-common 公共服务
* spring-cloud-config-server 配置文件服务
* spring-cloud-eureka-server eureka服务
* spring-cloud-gateway-service 网关服务调用user-service和blog-service
* spring-cloud-log-service 日志服务
* spring-cloud-turbine-service Hystrix Turbine聚合监控服务
* spring-cloud-uaa-service 提供jwt授权服务
* spring-cloud-user-service 会员服务
* spring-cloud-zipkin-server 链路服务

## 启动
### 1.启动Mysql服务，初始化sql文件夹下数据
### 2.启动RabbitMQ服务
### 3.启动其他服务，按顺序执行
* eureka
* config 
* zipkin 
* uaa 
* user
* blog
* gateway
* log
* turbine
* admin

## swagger访问地址
* http://localhost:5000/userapi/swagger-ui.html

* http://localhost:5000/blogapi/swagger-ui.html