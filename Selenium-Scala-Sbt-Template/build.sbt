name := "Selenium-Scala-Sbt-Template"

version := "0.1"

scalaVersion := "2.13.0"

fork in Test := true

libraryDependencies ++= Seq(
  "org.seleniumhq.selenium" % "selenium-java" % "3.141.59",
  "org.scalatest" %% "scalatest" % "3.0.5" % Test,
  "io.github.bonigarcia" % "webdrivermanager" % "3.2.0"

)

testOptions in Test += Tests.Argument(TestFrameworks.ScalaTest, "-u", "target/reports")