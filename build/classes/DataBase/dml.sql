USE ACME_ZONE;

INSERT INTO estados(id_estado,nombre)VALUES
(0,"Inactivo"),
(1,"Activo");


INSERT INTO tipos_procesos(id_tipo_proceso,nombre)VALUES
(0,"Salida"),
(1,"Entrada"),
(2,"Registro Vehiculo"),
(3,"Anotacion");


INSERT INTO tipos_logs(id_tipo_log,nombre)VALUES
(0,"Registro"),
(1,"Proceso"),
(2,"Anotaciones"),
(3,"Registro de vehiculos");


INSERT INTO tipos_usuarios(id_tipo_usuario,nombre)VALUES
(0,"Invitado"),
(1,"Operario"),
(2,"Seguridad"),
(3,"Funcionario"),
(4,"Supervisor"),
(5,"SuperUsuario");


INSERT INTO empresas(nombre)VALUES
("ACME_ZONE"),
("Campus"),
("Majorel"),
("Empresa1"),
("Empresa2"),
("Empresa3");

INSERT INTO usuarios(id_usuario,contrasena,id_tipo_usuario,id_estado,id_empresa,nombre)VALUES
(0,"superuser",5,1,1,"SuperUsuario");

INSERT INTO usuarios(id_usuario,contrasena,id_tipo_usuario,id_estado,id_empresa,nombre)VALUES
(2,"USUARIO1",2,1,1,"Seguridad1");

