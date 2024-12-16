SELECT us.nombre ,us.id_usuario, tp.nombre
FROM procesos pr 
JOIN usuarios us ON us.id_usuario = pr.id_usuario
JOIN tipos_procesos tp ON tp.id_tipo_proceso = pr.id_tipo_proceso;


SELECT id_vehiculo, us.nombre
FROM vehiculos vh
JOIN usuarios us ON vh.id_usuario = us.id_usuario;


SELECT us.nombre, an.prohibicion, an.descripcion
FROM anotaciones an 
JOIN usuarios us ON us.id_usuario = an.id_usuario;


SELECT us.nombre, us.id_usuario, us.id_tipo_usuario
FROM usuarios us 
JOIN tipos_usuarios tu ON us.id_tipo_usuario = tu.id_tipo_usuario
WHERE us.id_tipo_usuario = 4 AND us.id_estado = 0;


SELECT us.id_usuario
FROM usuarios us
JOIN tipos_usuarios tu ON tu.id_tipo_usuario = us.id_tipo_usuario
WHERE tu.id_tipo_usuario = 3;