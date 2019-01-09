import Dependencies._
import Settings._

lazy val $appname$ = (project in file("$appname$")).
  settings(Settings.settings: _*).
  settings(Settings.$appname$Settings: _*).
  configs(Test)
