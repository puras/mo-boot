Mo Boot
----

基于SpringBoot+MyBatis的程序骨架.

tags:
* Spring Boot
* MyBatis
* MyBatis Spring Boot Starter
* Druid

## 操作步骤
1. 下载最新的源代码
1. 生成骨架`mvn archetype:create-from-project`
1. 进入`target/generated-sources/archetype`下安装骨架`mvn install`
1. 查看~/.m2下的`archetype-catalog.xml`文件中,是否生成该骨架的内容,如:

        <?xml version="1.0" encoding="UTF-8"?>
        <archetype-catalog xsi:schemaLocation="http://maven.apache.org/plugins/maven-archetype-plugin/archetype-catalog/1.0.0 http://maven.apache.org/xsd/archetype-catalog-1.0.0.xsd"
            xmlns="http://maven.apache.org/plugins/maven-archetype-plugin/archetype-catalog/1.0.0"
            xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">
          <archetypes>
            <archetype>
              <groupId>me.puras.boot</groupId>
              <artifactId>mo-boot-archetype</artifactId>
              <version>0.1.0</version>
              <description>mo-boot-archetype</description>
            </archetype>
          </archetypes>
        </archetype-catalog>

1. 使用命令行或Eclipse使用该骨架生成新的工程

## 生成后操作步骤
1. 修改`bootstrap.yml`文件中的`application.name`
1. 根据需要修改`pom.xml`文件中的内容,如`parent`和`description`及其他内容
1. 修改服务端口
1. 修改README.md文件,对生成的工程进行描述