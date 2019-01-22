# ssm-d
###error记录
mybatis：Invalid bound statement (not found)
编译是没有将mapper.xml文件复制到classes目录下，需在pom.xml文件中添加插件
<plugin>
    <artifactId>maven-resources-plugin</artifactId>
    <version>2.6</version>
    <executions>
        <execution>
            <id>copy-xmls</id>
            <phase>process-resources</phase>
            <goals>
                <goal>copy-resources</goal>
            </goals>
            <configuration>
                <outputDirectory>${basedir}/target/classes</outputDirectory>
                <resources>
                    <resource>
                        <directory>${basedir}/src/main/java</directory>
                        <includes>
                            <include>**/*.xml</include>
                        </includes>
                    </resource>
                </resources>
            </configuration>
        </execution>
    </executions>
</plugin>

