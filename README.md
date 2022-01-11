
## custom-boot-starter
 父模块,可以不需要的，比如新建一个 Empty Project， 然后去建 autoconfigure 和 starter 模块
 我这里是参考了 mybatis 的写法


## qiuguan-spring-boot-autoconfigure 
 自动装配核心代码(写逻辑的）


## qiuguan-spring-boot-starter
  * 管理jar包（依赖 qiuguan-spring-boot-autoconfigure)
  * 命名规则：
     >> 官方：spring-boot-starter-xxx  <br>
        自定义：xxx-spring-boot-starter


## service 
  * service 模块就是业务模块，用来测试 starter 模块的功能
  * 如何使用？
  >> 1.放到 spring.factories 文件中，那么只需要导入依赖即可使用，这是开箱即用，零侵入,可插拔<br>
     2.不放到 spring.factories 文件中，利用自定义注解，参考 @EnableDateUtil <br>
     3.不放到 spring.factories 文件中，可以在service 模块中使用 @Import(DateAutoConfiguration.class) <br>
  