## Descripción del Proyecto

El proyecto consiste en una aplicación Java simple que imprime un saludo a cada uno de los nombres de una lista y tiene algunas funciones de utilidad en la clase `StringUtils`. El proyecto está construido con Maven y tiene un conjunto de pruebas unitarias.

## Decisiones de Diseño

En este proyecto se han tomado las siguientes decisiones de diseño:

- **Herramienta de construcción:** Se ha optado por utilizar Maven como herramienta de construcción para este proyecto debido a su popularidad y facilidad de uso.

- **Pruebas unitarias:** Se han incluido algunas pruebas unitarias sencillas para asegurarse de que la aplicación funciona como se espera.

- **Flujo de trabajo de CI/CD:** Se ha utilizado una instancia alojada en un servidor en la nube de Jenkins para permitir un despliegue continuo de la aplicación. Se han utilizado dos nodos externos que ejecutan agentes Docker para manejar las tareas de compilación y pruebas de Jenkins. Se ha definido un flujo de trabajo de CI/CD que incluye etapas para compilar el código fuente, ejecutar pruebas, analizar el código y crear un artefacto para su despliegue.

- **Tarea periódica de ejecución de pruebas:** Se ha configurado una tarea periódica para ejecutar las pruebas cada 30 minutos en la rama `main`. Se ha utilizado la función `cron` de Jenkins para definir esta tarea periódica.

- **Contenedores Docker:** Se ha optado por utilizar contenedores Docker para ejecutar los agentes de Jenkins, ya que esto permite una mayor flexibilidad y escalabilidad en la gestión de los recursos de Jenkins.

- **Análisis estático de código:** Se ha utilizado la herramienta de análisis estático de código Checkstyle y PMD para asegurar que el código cumple con los estándares de calidad requeridos.

## Beneficios e Inconvenientes

Las decisiones de diseño tomadas para este proyecto tienen los siguientes beneficios e inconvenientes:

- **Maven:** Maven es una herramienta popular y fácil de usar que facilita el proceso de construcción del proyecto. Sin embargo, puede tener problemas de rendimiento con proyectos muy grandes.

- **Pruebas unitarias:** Las pruebas unitarias son una buena práctica de desarrollo de software que ayuda a garantizar la calidad del código. Sin embargo, pueden requerir una inversión significativa de tiempo y recursos.

- **Flujo de trabajo de CI/CD:** Un flujo de trabajo de CI/CD bien definido puede mejorar significativamente la eficiencia del proceso de desarrollo y aumentar la calidad del código. Sin embargo, la configuración y mantenimiento de un flujo de trabajo de CI/CD puede requerir una inversión significativa de tiempo y recursos.

- **Tarea periódica de ejecución de pruebas:** La ejecución periódica de pruebas puede ayudar a garantizar la calidad del código y detectar problemas temprano en el proceso de desarrollo. Sin embargo, puede ser necesario dedicar recursos adicionales para ejecutar
