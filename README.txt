极简Spring Cloud Demo
本实例展示了一个极小的Spring cloud框架搭建，适合spring cloud的快速上手。包括以下功能：
服务注册
服务发现
服务调用

是要到的spring cloud组件包括：
eureka
feign
spring-web

系统启动和通信过程：
1. 启动discovery-eureka；
2. 启动echo-service, echo-service向discovery-eureka注册名为 “echo-service”的服务；
3. 启动echo-client, echo-client初始化FeignClient，FeignClient向discovery-eureka查询“echo-service"的注册信息；
4. 客户端向echo-client发送http请求： curl 'http://localhost:8080/hello?msg=ahuazhu'；
5. echo-client使用FeignClient向echo-service发请求；
6. echo-client向客户端返回经过包装后的结果，服务调用关系如下：
               
                             ┏━━━━━━━━━━━━━┓                           ┏━━━━━━━━━━━━━━┓
--------- ahuazhu ---------->┃               ┃ --------- ahuazhu ------> ┃               ┃
                             ┃ echo-client   ┃                           ┃ echo-service  ┃
<--- hello world ahuazhu ----┃               ┃ <---- world ahuazhu ----- ┃               ┃
                             ┗━━━━━━━━━━━━━┛                           ┗━━━━━━━━━━━━━━┛

Usage:

$ cd discovery-eureka; mvn spring-boot:run; cd ..
$ cd echo-service; mvn spring-boot:run; cd ..
$ cd echo-client; mvn spring-boot:run; cd ..

浏览器打开 http://localhost:8761/ 可以看到 echo-service, echo-client注册信息
浏览器输入 http://localhost:8080/hello?msg=ahuazhu  应返回 hello world ahuazhu

后续：
此项目力求精简，以降低spring-cloud的上手难度。spring-cloud作为一个庞大的技术栈，设计非常多的周边套件，如Hystrix、Config等，可以根据需要在实际项目中使用。本Demo后续会采用分支的形式step by step添加其他套件。欢迎Pull Request。
