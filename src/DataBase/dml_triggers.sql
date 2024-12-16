USE ACME_ZONE;

CREATE TRIGGER log_usuarios_entrada_salida
AFTER INSERT ON procesos
FOR EACH ROW
BEGIN
    INSERT INTO log_usuarios(id_tipo_log,id_usuario,id_usuarioseguridad,descripcion,fecha)VALUES
    (1,NEW.id_usuario,id_usuarioseguridad,CONCAT("Se realizó el proceso en la persona con documento: ", NEW.id_usuario),NOW());
END;

DROP TRIGGER log_usuarios;