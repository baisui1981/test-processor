学习javax.annotation.processing中对注解的处理
## 继承javax.annotation.processing.AbstractProcessor类

 覆写process()方法，可以实现编译器对任意Annotion的读取
 
## hudson 插件的基石

 hudson利用 [sezpoz](https://github.com/jglick/sezpoz) 实现了优雅地实现了插件化
 
## 注意点

``` xml
<plugin>
                <artifactId>maven-compiler-plugin</artifactId>
                <version>2.3.2</version>
                <configuration>
                    <source>1.6</source>
                    <target>1.6</target>
                    <!-- Disable annotation processing for ourselves. -->
                    <compilerArgument>-proc:none</compilerArgument>
                </configuration>
            </plugin>
```

 项目本身编译的时需要加上‘-proc:none’ 参数告诉java编译器不要执行annotion过滤器，不然会出错