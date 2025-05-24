package com.service1.service1.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

//@Component
@Data
@ConfigurationProperties(prefix = "test.app")
public class CustomPropConfig {
    public String prop1;
    public String prop2;
    //without the getter and setter this configuration properties wont work so either this need to be uncommented or else need to enable @Data
//    public String getProp1(){
//        return prop1;
//    }
//    public void setProp1(String prop1){
//         this.prop1 = prop1;
//
//    }
//
//    public String getProp2(){
//        return prop2;
//    }
//    public void setProp2(String prop2){
//        this.prop2 = prop2;
//
//    }
}
