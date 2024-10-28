plugins {
    kotlin("jvm") version "1.9.23"
}

group = "com.github.multilinker"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}
