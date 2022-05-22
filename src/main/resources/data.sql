	DROP TABLE IF EXISTS cajas;
	DROP TABLE IF EXISTS almacenes;
	
		CREATE TABLE almacenes (
		id int  PRIMARY KEY AUTO_INCREMENT,
		lugar varchar(100),
		capacidad int
	);
	
	CREATE TABLE cajas(
	    id char(5) PRIMARY KEY,
	    contenido varchar(100),
	    valor int,
	    almacen int,
	    FOREIGN KEY (almacen) REFERENCES almacenes(id)
	    on delete cascade
	    on update cascade
	);
	
	
	INSERT INTO almacenes (lugar, capacidad) VALUES
	('Tarragona', 5),
	('Barcelona', 10),
	('Girona', 15),
	('Lleida', 20),
	('Valencia', 25);
	
	
	INSERT INTO cajas (id, contenido, valor, almacen) VALUES
	('A1234','Tijeras',50,1),
	('B1234','Lápices',50,2),
	('C1234','Bolígrafos',50,3),
	('D1234','Rotuladores',50,4),
	('E1234','Papel',50,5);
	