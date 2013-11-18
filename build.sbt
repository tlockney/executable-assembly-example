import AssemblyKeys._

name := "AssemblyTest"

version := "0.1"

organization := "net.lockney"

assemblySettings

assemblyOption in assembly ~= { _.copy(makeExecutable = true) }

mainClass in assembly := Some("net.lockney.Main")

jarName in assembly := "myMain"
