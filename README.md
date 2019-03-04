# Scala SBT template (Library)

This [giter8][1] template will write SBT build files for a Scala library.

It places source code into a subdirectory to ensure that a solution can quickly be converted to a multi-module project if required.

If necessary, the referenced assembly plugin may be used to produce an 'uber-jar' of the library together with its dependencies.

## default.properties

~~~
name=my-project
description=This g8 template create a simple sbt build file for a scala library.
organization=com.example
package=com.example.project
library=mylib
version=0.0.1
scala_version=2.11.0
~~~

## Usage

```sbt new yangwn/sbt-library-template.g8```
```sbt compile``` and ```sbt publish-local``` will compile and then publish to the local repository as expected.
```sbt assembly``` will create a 'bin' directory within the project folder and write the '$appname-jar' to that location.
```sbt assemblyPackageDependency``` will create a 'bin' directory within the project folder and write the dependencies 'jar' to that location. '$appname$-depn-jar'

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
