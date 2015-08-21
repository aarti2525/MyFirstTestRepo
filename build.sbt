name := "TestApp"

version := "1.0-SNAPSHOT"


libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache
)   

  

play.Project.playScalaSettings


val libraryD = Seq(
       "junit" % "junit" % "4.12" % "test"
    )


val appDependencies = Seq(
  // Add your project dependencies here,
    "org.scalatest" % "scalatest_2.9.1" % "1.7.1"
)


