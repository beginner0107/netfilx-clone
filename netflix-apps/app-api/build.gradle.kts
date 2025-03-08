dependencies {
    implementation(project(":netflix-core:core-usecase"))
    runtimeOnly(project(":netflix-core:core-service"))

    implementation(project(":netflix-core:core-port"))
    runtimeOnly(project(":netflix-adapters:adapter-http"))

    implementation("org.springframework.boot:spring-boot-starter-web")
}
