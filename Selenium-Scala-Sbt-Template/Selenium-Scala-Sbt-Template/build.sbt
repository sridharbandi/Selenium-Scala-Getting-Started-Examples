name := "selenium-scala-sbt-template"
version := "0.1"

scalaVersion := "2.12.6"

fork in Test := true

libraryDependencies ++= Seq(
  "org.seleniumhq.selenium" % "selenium-java" % "3.141.59",
  "org.scalatest" %% "scalatest" % "3.0.8" % Test,
  "io.github.bonigarcia" % "webdrivermanager" % "3.2.0"

)

testOptions in Test += Tests.Argument(TestFrameworks.ScalaTest, "-u", "target/reports")