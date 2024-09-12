/*
 * This file was generated by the Gradle 'init' task.
 *
 * This is a general purpose Gradle build.
 * To learn more about Gradle by exploring our Samples at https://docs.gradle.org/8.3/samples
 */
 plugins {
	java
	application
 }
 application{
    mainClass.set("com.gradlehero.languageapp.SayHello")
 }

 tasks.named<Jar>("jar"){
	manifest {
		attributes["Main-Class"] = "com.gradlehero.languageapp.SayHello"
	}
 }

 repositories{
	mavenCentral()
 }

 dependencies{
	testImplementation("org.junit.jupiter:junit-jupiter:5.10.0")
 }

tasks.named<Test>("test"){
	useJUnitPlatform()
 }

tasks.named<JavaExec>("run") {
    // Set the default argument; you can change this as needed
    args = listOf("en")
}

tasks.register("buildAndRun") {
    dependsOn("build")
    doLast {
				tasks.named<JavaExec>("run") {
					// Set the default argument; you can change this as needed
					args = listOf("en")
				}.get().exec()
    }
}
 
tasks.register("BuildandTest") {
    dependsOn("build")
    doLast {
				tasks.named<Test>("test"){
					useJUnitPlatform()
				}.get()
    }
}
 
