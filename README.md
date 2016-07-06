Spring Web应用开发

#Controller
* 里面放置控制器
##作用
* 控制数据流，连接html页面与数据库模型
* 实现业务逻辑代码的地方
* 映射url

#config
* 配置文件

#exception
* 页面异常处理（返回404等状态码的页面）

#interceptor
* 拦截器（在controller接收请求前拦截请求，符合要求则将请求导向下一个拦截器，全部拦截器通过后，访问controller的业务逻辑）

#model
* 放置POJO简单java对象的地方
* 放置与数据库中表对应的java对象