# SpringBoot + Jpa 项目工程模板

## Maven archetype 导入坐标

``` xml
<groupId>com.emlog</groupId>
<artifactId>springboot-jpa-template-archetype</artifactId>
<version>1.0</version>
```

## 1. 检查 Coding Style

```shell script
mvn checkstyle:checkstyle
```

## 2. 运行 FindBugs

> 运行 Findbugs 需要先编译.

```shell script
 mvn clean package findbugs:findbugs
```

> 如果 Findbugs 发现代码存在问题, 可以通过如下命令查看:

```shell script
mvn findbugs:gui
```

## 3. 构建 archetype

```shell script
mvn clean archetype:create-from-project

cd target/generated-sources/archetype/

mvn install deploy
```
