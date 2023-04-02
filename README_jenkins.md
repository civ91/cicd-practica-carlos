# Configuración de Jenkins

En este proyecto se ha utilizado la versión de Jenkins 2.289.3. Se han instalado los siguientes plugins:

- GitHub
- Checkstyle
- PMD
- Credentials

Además, se han definido los siguientes secretos en Jenkins:

- Credenciales para acceder al repositorio de GitHub
- Credenciales para acceder al registro de Docker
- Clave SSH para acceder a los nodos externos de Jenkins

Para la configuración de Jenkins se han realizado las siguientes acciones:

- Se han definido los nodos externos de Jenkins que ejecutan agentes Docker
- Se ha configurado el agente de Jenkins en el nodo de construcción principal
- Se ha configurado el archivado de artefactos después de la compilación
