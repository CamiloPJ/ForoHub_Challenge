# Practicando Spring Framework: Challenge Foro Hub (Alura)
![image](https://github.com/user-attachments/assets/e17c9e47-aba1-4835-b9f1-1f119be759e3)

## Descripcion del programa 

Un foro es un espacio donde todos los participantes de una plataforma pueden plantear sus preguntas sobre determinados tópicos.

Este es nuestro desafío, llamado ForoHub: en él, vamos a replicar este proceso a nivel de back end y, para eso, crearemos una API REST usando Spring.

Nuestra API se centrará específicamente en los tópicos, y debe permitir a los usuarios:

* Crear un nuevo tópico
* Mostrar todos los tópicos creados
* Mostrar un tópico específico
* Actualizar un tópico
* Eliminar un tópico

Es lo que normalmente conocemos como CRUD* (CREATE, READ, UPDATE, DELETE) y es muy similar a lo que desarrollamos en LiterAlura, pero ahora de forma completa, agregando las operaciones de UPDATE y DELETE, y usando un framework que facilitará mucho nuestro trabajo.

## Funcionalidades
Esta aplicación es una API REST para un foro, donde los usuarios pueden interactuar creando, listando, actualizando y eliminando tópicos. A continuación se describen las principales funcionalidades de la API:
* Autenticación de Usuarios (Login): Permite a los usuarios registrados autenticarse y obtener un token JWT.
* Listar Tópicos: Permite obtener una lista de todos los tópicos creados por los usuarios.
* Crear Tópico: Permite a los usuarios autenticados crear nuevos tópicos.
* Eliminar Tópico: Permite a los usuarios autenticados eliminar un tópico existente.
* Actualizar Tópico:  Permite a los usuarios autenticados actualizar un tópico existente.

![image](https://github.com/user-attachments/assets/4065e8f1-8a21-44a2-a759-b9d88bc34060)


## Modo de uso
1. Al iniciar la aplicacion el primer request el cual es obligatorio llevarlo a cabo, es el de autenticación de usuario. Para esto se debe hacer una requisición en formato JSON como la que se muestra acontinuación:

  ![image](https://github.com/user-attachments/assets/a88b0c23-7103-46f3-b629-b5388656c1e3)

Seguidamente se hace click en el boton "Send" y obtendremos una respuesta encriptada (token) que nos permitir a acceder a las demas requisiciones.

![image](https://github.com/user-attachments/assets/edeb722f-a53f-4b25-b698-b6ff5c06c503)

2. Copiamos el token obtenido y damos paso a la creacion de los topicos, para esto pegamos el token en la sección "Auth".

![image](https://github.com/user-attachments/assets/d07da621-bfa0-4029-b7c3-f50dff4585fc)

3. Para crear el topico tenemos que ingresar un body que contenga el id del usuario, el mensaje explicando la duda o sugerencia, el nombre del curso con el que está relacionado el topico y el titulo del mismo.
A continuación se muestra un ejemplo:

![image](https://github.com/user-attachments/assets/681536f7-1bc6-4bf0-808b-2ee62a249a48)

4. Para listar los topicos que se han creado tambien se autentica con el token para acceder a la requisición y luego se hace clic en "Send".

![image](https://github.com/user-attachments/assets/29d56ad0-e9a0-438a-a85d-468c9f32e1fa)

5. Si solo queremos obtener un unico topico, se añade al enlace el id del topico que queremos ver (/topicos/id).
A continuación se muestra un ejemplo:

![image](https://github.com/user-attachments/assets/63ca9492-ade0-435b-a265-3b39bdd656fb)

6. Para actualizar o cambiar el estado de un topico se usa un request del tipo "PUT", en el cual se requiere el id del topico a editar y del atributo que se desea actualizar.
A continuación se muestra un ejemplo:

![image](https://github.com/user-attachments/assets/5208ea95-ca3e-4c11-8c8b-5453746d4faf)

7. Por ultimo para eliminar un topico usamos el metodo "Delete", esto se hace añadiendo al enlace el id del topico que queremos eliminar (/topicos/id).
A continuación se muestra un ejemplo:

![image](https://github.com/user-attachments/assets/ec84ca2c-7137-4ded-8039-ff2993b4ca38)



## Requisitos
* Java 17 para el desarrollo con ayuda del IDE de Intellij
* Spring Boot para la creación de la API Rest
* MySQL servidor de bases de datos
* Insomnia para las respectivas pruebas a la API.

## Autor
[<img src="https://avatars.githubusercontent.com/u/126632936?v=4" width=115><br><sub>Camilo Paternina Jiménez</sub>](https://github.com/CamiloPJ)

