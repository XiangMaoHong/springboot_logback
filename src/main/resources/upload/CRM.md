# CRM技术架构

视图层(view)展示数据,跟用户交互

​	html,css,js,jquery,bootstrao(ext|easyUI),jsp

控制层(Controller):控制业务处理流程(接受请求,接收参数,封装参数;根据不用的请求调用业务)

​	(servlet,)springMVC,(struts1,struts2)

业务层(Service):处理业务逻辑(处理业务的步骤以及操作的原子性)

​	JavaSE

​	....

持久层(Dao/Mapper):操作数据库

​	(jdbc),mybatis,(hibernate)

整合层:维护类资源,维护数据库资源

​	spring(IOC,AOP),(ejb)

# 软件开发的生命周期

1. 招标:

   投标:-----标书

   甲方

   乙方

2. 可行性分析:------可行性分析报告

   1. 技术
   2. 经济...

3. 需求分析:-------需求文档

   1. 产品经理,需求调研
   2. 项目原型:容易确定需求

4. 分析与设计:

   架构设计:-------架构设计文档

   ​	物理架构设计

   ​		应用服务器:tomcat(apache),weblogic(bea-oracle),websphere(ibm),jboos(red-hat)

   ​			web javaEE:13中协议

   ​				servlet,jsp,xml,jdbc....

   ​		数据库服务器:mysql,oracle,DB2,sqlserver,达梦

   ​		逻辑架构设计:代码分层

   ​			视图层-->控制层-->业务层-->持久层-->数据库

   ​		技术选型:java...

   ​	项目设计:-------项目设计文档

   ​		物理模型设计:哪些表,哪些字段,字段的类型和长度,以及表和表之间的关系

   ​			powerdesigner-----xxx.pdm

   ​		逻辑模型设计:哪些类,哪些属性,方法的参数和返回值,以及类和类之间关系

   ​			tational rose-------xxx.pd;

   ​	界面设计:------项目原型

   ​			企业级应用 朴素

   ​			互联网应用 炫酷

   ​	算法设计:------算法设计文档

5. 搭建开发环境:--------技术架构文

   创建项目,添加jar包,添加配置文件,添加静态页面,添加公共类以及其他资源;能够正常启动运行

6. 编码实现:---------注释

7. 测试:------------测试用例

8. 试运行:-------------实施手册

9. 上线:-------------实施文档

10. 运维:----------------运维手册

11. 文档编纂:

