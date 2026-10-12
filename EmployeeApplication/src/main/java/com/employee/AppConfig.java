
package com.employee;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.employee")
@EnableAspectJAutoProxy
public class AppConfig {

}
