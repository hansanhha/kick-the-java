subprojects {
    apply(plugin = "java")

    repositories {
        mavenCentral()
    }

    dependencies {
        "testImplementation"("org.junit.platform:junit-platform-launcher:")
        "testImplementation"("org.junit.jupiter:junit-jupiter-api:5.12.2")
        "testImplementation"("org.junit.jupiter:junit-jupiter-engine:5.12.2")
    }

    plugins.withType<JavaPlugin> {
        the<JavaPluginExtension>().toolchain {
            languageVersion.set(JavaLanguageVersion.of(24))
        }
    }

    tasks.withType<Test> {
        useJUnitPlatform()
    }
}