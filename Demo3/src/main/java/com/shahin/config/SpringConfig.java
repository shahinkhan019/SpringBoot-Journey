package com.shahin.config;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;



// ({ "com.shahin.repository.imp1", "com.shahin.service.imp1" }) in enterprise level application there can be  a lots of
// packages so its will be difficult for me to write complete name of that particular package, now we can just write the main package name and spring will scan all the sub packages automatically
@ComponentScan({ "com.shahin" })  // what it does is it will scan the specified packages for classes annotated with @Component and register them as beans in the Spring application context.
@Configuration
public class SpringConfig {

}
