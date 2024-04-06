//package com.config;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.CorsRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
///**
// * @Author Jsxs
// * @Date 2024/4/6 12:06
// * @PackageName:com.config
// * @ClassName: CrosConfig
// * @Description: TODO
// * @Version 1.0
// */
//@Configuration
//public class CrosConfig implements WebMvcConfigurer {
//    @Override
//    public void addCorsMappings(CorsRegistry registry) {
//        registry.addMapping("/**")
//                .allowedOrigins("*")
//                .allowedMethods("GET", "HEAD", "POST", "PUT", "DELETE", "OPTIONS")
//                .allowCredentials(false)
//                .maxAge(3600)
//                .allowedHeaders("*");
//    }
//}