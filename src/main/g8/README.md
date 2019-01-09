## 使用说明

```sbt compile``` 解释:编译
```sbt publish-local``` 解释:发布到本地的仓库
```sbt assmebly``` 解释:在工程的根目录下生成一个bin目录，并将工程打包 '$appname$-jar' 后放在该处。
```sbt assemblyPackageDependency``` 解释:在工程的根目录下生成一个bin目录，并将工程所有依赖的lib打成统一个包 '$appname$-depn-jar' 后放在该处。

## Directory Layout

~~~
+-- name
|  +-- build.sbt
|  +-- library
|    +-- src
|      +-- com
|        +-- example
|          +-- project
|            +-- library
|              +-- MyLib.scala
|  +-- project
|    +-- Dependencies.scala
|    +-- Settings.scala
|    +-- build.properties
|    +-- plugins.sbt
~~~
