plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.5.0"
}
rootProject.name = "upstream"
include("upstream-core")
include("upstream-vertx")

