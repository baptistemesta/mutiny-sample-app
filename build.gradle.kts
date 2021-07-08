plugins {
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("io.smallrye.reactive:mutiny:0.19.2")
    testImplementation("org.junit.jupiter:junit-jupiter:5.7.1")
}

application {
    mainClass.set("mutiny.sample.app.App")
}

tasks.test {
    useJUnitPlatform()
}
