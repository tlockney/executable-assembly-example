//addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.10.1")
lazy val root = project.in( file(".") ).dependsOn( assemblyPlugin )
lazy val assemblyPlugin = uri("git://github.com/tlockney/sbt-assembly#8e517c15")
