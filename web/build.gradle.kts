import io.spring.gradle.dependencymanagement.dsl.DependencyManagementExtension
import org.springframework.boot.gradle.plugin.SpringBootPlugin

plugins {
	kotlin("jvm")
	kotlin("plugin.spring")
	id("org.springframework.boot") apply false
	id("io.spring.dependency-management")
}

the<DependencyManagementExtension>().apply {
	imports {
		mavenBom(SpringBootPlugin.BOM_COORDINATES)
	}
}

dependencies {
	implementation(project(":core"))

	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
	implementation("org.jetbrains.kotlin:kotlin-reflect")
	implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

	testImplementation("org.springframework.boot:spring-boot-starter-test")
}
