# 项目工程模板

> * 自定义常用架构 Maven archetype 
> * 建立统一父工程用于统一版本管理, 使用者只需要添加依赖, 无需版本管理

## 1. 结构
> 统一父工程进行版本管理, 建立如下 Maven 脚手架
> * SpringBoot + Jpa
> * SpringBoot + Mybatis Plus
> * Spring Cloud + Spring Cloud Alibaba 多模块项目

## 2. 已集成组件

### 2.1 SpringBoot + Jpa
* SpringBoot
* Spring Data Jpa
* Redis
* Dockerfile
* Google Style Checker
* Findbugs
* Swagger
* PostgreSql
* Lombok

## 3. 构建
### 3.1 检查 Coding Style Checker

```shell script
mvn checkstyle:checkstyle
```

### 3.2 运行 FindBugs

> 运行 Findbugs 需要先编译.

```shell script
 mvn clean package findbugs:findbugs
```

> 如果 Findbugs 发现代码存在问题, 可以通过如下命令查看:

```shell script
mvn findbugs:gui
```
