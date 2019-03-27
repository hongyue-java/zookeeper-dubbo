先启动spring-boot-dubbo服务端，即运行ServerApplication，
会在控制台看到：[DUBBO] Notify urls for subscribe url provider://10.168.168.168:20880/com.jaycekon.dubbo.service.UserService
表现Dubbo服务端已成功部署


再运行spring-boot-consumer客户端，即运行ClientApplication
访问：http://localhost:8081/save，即可看到客户端成功消费了客户的提供的服务！
