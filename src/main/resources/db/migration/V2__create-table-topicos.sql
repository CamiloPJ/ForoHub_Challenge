create table topicos(
id bigint not null auto_increment,
    titulo varchar(100) not null,
    mensaje varchar(255) not null,
    id_usuario bigint not null,
    nombre_curso varchar(255) not null,
    fecha_creacion datetime not null,
    estado varchar(40) not null,
    primary key(id),
    constraint fk_topicos_id_usuario foreign key(id_usuario) references usuarios(id),
    constraint unique_titulo_mensaje UNIQUE (titulo, mensaje)
);