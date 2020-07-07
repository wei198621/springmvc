b站  编程不良人 

springmvc 从入门到精通   https://www.bilibili.com/video/BV1pE411E7fv

ss 环境搭建   spring  springMvc     20200706

搭建环境：
1.  webapp/WEB-INF/web.xml
           配置springmvc核心servlet  DispatcherServlet
           配置contextConfigLocation 为  classpath:springmvc.xml
2.  resources/springmvc.xml
         1.  <!--开启注解扫描-->
         2. <!--springMvc基础配置1 ： 注册处理器映射器 -->
            <!--springMvc基础配置2 ： 注册处理器适配器-->    1,2.两个被 <mvc:annotation-driven></mvc:annotation-driven> 替换
            <!--springMvc基础配置3 ： 注册视图解析器-->
3. edit Configuration
4. 启动tomcat
       1. http://localhost:8080/springMvcDay1/         默认页面为     webapp/index.jsp
       2. http://localhost:8080/springMvcDay1/hello/hello   切换到这个目录
5.测试切换目录
     如下示例看效果，看打印的内容即可
     http://localhost:8080/springMvcDay1/forwardAndRedirect/forward2PageIndex

     http://localhost:8080/springMvcDay1/forwardAndRedirect/redirect2PageIndex

     http://localhost:8080/springMvcDay1/forwardAndRedirect/forward2Controller

     http://localhost:8080/springMvcDay1/forwardAndRedirect/redirect2Controller

     http://localhost:8080/springMvcDay1/forwardAndRedirect/redirect2OtherController

6.测试参数传递
    如下示例看效果，看打印的内容即可
    http://localhost:8080/springMvcDay1/param/eachParam?name=张三&age=18&sex=0&bir=2020/01/01
     用来测试零散类型参数接收

    http://localhost:8080/springMvcDay1/param/paramObject?name=张三&age=18&sex=0&bir=2020/01/01
    用来测试对象类型的参数接收

    http://localhost:8080/springMvcDay1/param/parmArray?qqs=111&qqs=222&qqs=333
    用来测试数组类型参数接收

    http://localhost:8080/springMvcDay1/param/paramList?lists=999&lists=8888&lists=777
    集合不可以作为参数，这个传递是接受不到数据的，

    http://localhost:8080/springMvcDay1/param/paramListInObject?lists=111&lists=222&lists=333
    用来测试集合类型参数接收 list

    http://localhost:8080/springMvcDay1/param/paramListInObject02?maps['aaa']=zs&maps['bbb']=lisi&maps['ccc']=wangwu
    用来测试集合类型参数接收 map


7.  将jsp页面数据post方式传递到 controller/action  看效果

    http://localhost:8080/springMvcDay1/param.jsp
    将jsp页面数据get方式传递到 controller/action  看效果
    <form action="${pageContext.request.contextPath}/param/paramObject" method="get">


    http://localhost:8080/springMvcDay1/param.jsp
    将jsp页面数据post方式传递到 controller/action  看效果
    <form action="${pageContext.request.contextPath}/param/paramObject" method="post">


    自始至终，没有解决中文乱码问题啊