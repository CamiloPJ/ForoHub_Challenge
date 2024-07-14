create table usuarios(

    id bigint not null auto_increment,
    nombre varchar(140) not null,
    email varchar(100) not null unique,
    contrasena varchar(200) not null,

    primary key(id)

);

-- Insertar un curso por defecto
INSERT INTO usuarios (nombre, email, contrasena) VALUES ('Admin', 'admin@example.com', '$2a$10$ejFsih34D0bzdXLWQGoZ2ua6sA.cGuO9E6tC4sCzdFvIeKmGhTZia');