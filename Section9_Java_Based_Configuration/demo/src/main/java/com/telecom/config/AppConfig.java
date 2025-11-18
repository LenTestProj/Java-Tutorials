package com.telecom.config;

import com.telecom.Alien;
import com.telecom.Computer;
import com.telecom.Desktop;
import com.telecom.Laptop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan("com.telecom")
public class AppConfig {
    
}

// public class AppConfig {
    
//     @Bean
//     // public Alien alien(@Qualifier("desktop") Computer com){  //Qualifier used in case of confusion when two objects of sme class are defined alternative is primary
//     public Alien alien(Computer com){
//         Alien obj = new Alien();
//         obj.setAge(21);
//         obj.setCom(com);
//         return obj;
//     }

//     // @Bean(name={"com2","desktop","Beast"})
//     @Bean()
//     // @Scope("prototype") //by default it is singleton
//     public Desktop desktop(){
//         return new Desktop();
//     }

//     @Bean()
//     @Primary
//     public Laptop laptop(){
//         return new Laptop();
//     }
// }
