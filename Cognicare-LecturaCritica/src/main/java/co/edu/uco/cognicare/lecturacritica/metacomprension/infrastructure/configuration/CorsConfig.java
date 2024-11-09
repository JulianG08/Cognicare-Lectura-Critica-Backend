package co.edu.uco.cognicare.lecturacritica.metacomprension.infrastructure.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        // Permite solicitudes a cualquier endpoint bajo /api/*
        registry.addMapping("/api/**")
                // Permite solicitudes desde el origen especificado (en este caso, tu frontend)
                .allowedOrigins("http://127.0.0.1:5500")
                // Permite los métodos HTTP GET, POST, PUT, DELETE
                .allowedMethods("GET", "POST", "PUT", "DELETE")
                // Permite cualquier cabecera
                .allowedHeaders("*");
    }
}
