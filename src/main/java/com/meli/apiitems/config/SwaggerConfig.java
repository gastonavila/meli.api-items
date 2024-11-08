package com.meli.apiitems.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springdoc.core.models.GroupedOpenApi;

/**
 * Clase de configuración para Swagger.
 * 
 * Esta clase es responsable de la configuración de Swagger en la aplicación.
 * Aunque no es estrictamente necesaria para el funcionamiento de la API,
 * su inclusión permite una mejor organización y documentación de los endpoints
 * expuestos. Aquí se definen los grupos de endpoints para facilitar su visualización
 * en la interfaz de Swagger UI.
 */
@Configuration
public class SwaggerConfig {

    /**
     * Define un bean para la configuración de la API de Items.
     *
     * Este método devuelve un objeto GroupedOpenApi que agrupa todos los endpoints
     * de la API bajo el grupo "API Items". Esto permite que los usuarios de la API puedan encontrar 
     * y entender fácilmente los endpoints
     * relacionados con la gestión de ítems.
     *
     * @return Un objeto GroupedOpenApi que agrupa los endpoints de la API de Items.
     */
    @Bean
    public GroupedOpenApi apiItemsApi() {
        return GroupedOpenApi.builder()
                .group("API Items") // Nombre del grupo de endpoints para la documentación
                .pathsToMatch("/api/items/**") // Agrupa todos los endpoints que empiecen con /api/items
                .build();
    }
}
