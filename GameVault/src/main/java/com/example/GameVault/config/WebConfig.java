package com.example.GameVault.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import java.nio.file.Path;
import java.nio.file.Paths;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    //NOTA IMPORTANTE
    //en clase no cargaban las imagenes de juego, pero ahora al poner en comentarios este metodo si cargan
    //y otra cosa que me paso es que las imagenes no cargaban al subir un juego, pero al hacer una nueva ejecucion del proyecto ya cargaban
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        Path uploadDir = Paths.get("src/main/resources/static/uploads");
        String uploadPath = uploadDir.toFile().getAbsolutePath();

        registry.addResourceHandler("/uploads/**").addResourceLocations(uploadDir.toUri().toString());
//                .addResourceLocations("file:/" + uploadPath + "/");
    }
}
