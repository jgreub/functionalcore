import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	kotlin("jvm") version "1.4.31" apply false
	kotlin("plugin.jpa") version "1.4.31" apply false
	kotlin("plugin.spring") version "1.4.31" apply false
	id("org.springframework.boot") version "2.4.4" apply false
	id("io.spring.dependency-management") version "1.0.11.RELEASE" apply false
}

subprojects {
	repositories {
		mavenCentral()
	}

	tasks.withType<Test> {
		useJUnitPlatform()
	}

	tasks.withType<KotlinCompile> {
		kotlinOptions {
			freeCompilerArgs = listOf("-Xjsr305=strict")
			jvmTarget = "1.8"
		}
	}
}