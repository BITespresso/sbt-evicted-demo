name := "sbt-evicted-demo"

version := "0.1"

scalaVersion := "2.12.12"

resolvers += Resolver.jcenterRepo

libraryDependencies ++= Seq(
  "com.nimbusds" % "oauth2-oidc-sdk" % "8.22",
  "com.nimbusds" % "nimbus-jose-jwt" % "8.20.1"
)
