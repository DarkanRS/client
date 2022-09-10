plugins {
    id("com.github.johnrengelman.shadow") version "6.0.0"
    java
    application
}

group = "darkan"
version = "1.0.1"
description = "Darkan Client"

application {
    mainClass.set("com.Loader")
}

project.setProperty("mainClassName", "com.Loader")

repositories {
    mavenLocal()
    mavenCentral()
}

dependencies {

}

tasks {
    java {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    withType<JavaCompile> {
        options.encoding = "UTF-8"
    }

    jar {
        manifest {
            attributes(mutableMapOf("Main-Class" to "com.Loader"))
        }
    }

    shadowJar {
        archiveName = "darkan-client-shaded.jar"
    }
}

tasks {
	build {
		dependsOn(shadowJar)
	}
}