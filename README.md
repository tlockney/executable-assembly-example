# Building a "really" executable Jar

This is just a quick example of building an executable Jar without requiring the 'java -jar' nonsense. It's a simple hack and I've submitted a small pull request to sbt-assembly to enable it. This project pulls my forked version and builds using it. To see it in action, run:

    sbt clean assembly && ./target/scala-2.10/myMain

It's the small things that make me happy. Anyway, the idea was not original and it was shamelessly _borrowed_ from [this](http://skife.org/java/unix/2011/06/20/really_executable_jars.html) blog post. 