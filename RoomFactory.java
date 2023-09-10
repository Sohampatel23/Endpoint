package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RoomFactory {

    public RoomFactory() {
        System.out.println("configuration does create object as well!!!!");
    }

//    @Bean
//    public House createSmallRoom()
//    {
//        System.out.println("testing configuration class methods!!!!!!");
//        return new House("Temple");
//    }
}
