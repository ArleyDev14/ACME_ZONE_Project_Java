CREATE DATABASE ACME_ZONE;

USE ACME_ZONE;


CREATE TABLE estados(
    id_estado INT PRIMARY KEY,
    nombre VARCHAR(255)
);


CREATE TABLE tipos_procesos(
    id_tipo_proceso INT PRIMARY KEY,
    nombre VARCHAR(255)
);


CREATE TABLE tipos_logs(
    id_tipo_log INT PRIMARY KEY,
    nombre VARCHAR(255)
);


CREATE TABLE tipos_usuarios(
    id_tipo_usuario INT PRIMARY KEY,
    nombre VARCHAR(255)
);


CREATE TABLE empresas(
    id_empresa INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(255)
);


CREATE TABLE usuarios(
    id_usuario INT PRIMARY KEY,
    contrasena VARCHAR(255),
    id_tipo_usuario INT,
    id_estado INT,
    id_empresa INT,
    nombre VARCHAR(255),
    Foreign Key (id_tipo_usuario) REFERENCES tipos_usuarios(id_tipo_usuario),
    Foreign Key (id_estado) REFERENCES estados(id_estado),
    Foreign Key (id_empresa) REFERENCES empresas(id_empresa)
);


CREATE TABLE procesos(
    id_proceso INT AUTO_INCREMENT PRIMARY KEY,
    id_tipo_proceso INT,
    id_usuario INT,
    fecha DATETIME,
    Foreign Key (id_tipo_proceso) REFERENCES tipos_procesos(id_tipo_proceso),
    Foreign Key (id_usuario) REFERENCES usuarios(id_usuario)
);


CREATE TABLE anotaciones(
    id_anotacion INT AUTO_INCREMENT PRIMARY KEY,
    id_usuario INT, 
    prohibicion INT,
    descripcion TEXT,
    Foreign Key (id_usuario) REFERENCES usuarios(id_usuario)
)


CREATE TABLE log_usuarios(
    id_log_usuario INT AUTO_INCREMENT PRIMARY KEY,
    id_tipo_log INT,
    id_usuario INT,
    id_usuarioseguridad INT,
    descripcion TEXT,
    fecha DATETIME,
    Foreign Key (id_usuarioseguridad) REFERENCES usuarios(id_usuario),
    Foreign Key (id_tipo_log) REFERENCES tipos_logs(id_tipo_log),
    Foreign Key (id_usuario) REFERENCES usuarios(id_usuario)
)


CREATE TABLE vehiculos(
    id_registro_vehiculo INT AUTO_INCREMENT PRIMARY KEY,
    id_vehiculo VARCHAR(10),
    id_usuario INT,
    Foreign Key (id_usuario) REFERENCES usuarios(id_usuario)
)


