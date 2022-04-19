### Creacion y uso de la base de datos
CREATE DATABASE tiendajuan;

USE tiendajuan;

### Modulo de login y usuarios
CREATE TABLE usuarios(
	cedula_usuario BIGINT PRIMARY KEY,
    email_usuario VARCHAR(255) NOT NULL,
    nombre_usuario VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL,
    usuario VARCHAR(255) NOT NULL
);

INSERT INTO usuarios VALUES(001, 'juanpcs13683@hotmail.com', 'Juan Cañon', 'admin123456', 'admininicial0');
INSERT INTO usuarios VALUES(002, 'juanpcs13683@hotmail.com', 'Juan Cañon', 'pass', 'user');
INSERT INTO usuarios VALUES(003, 'juanpcs13683@hotmail.com', 'Juan Cañon', 'pass2', 'user2');

DROP TABLE usuarios;

DELETE FROM usuarios WHERE cedula_usuario = 001;

UPDATE usuarios SET email_usuario = '',
					nomnre_usuario = '',