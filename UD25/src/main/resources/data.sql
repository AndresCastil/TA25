DROP TABLE IF EXISTS fabricantes;

CREATE TABLE fabricantes (
	id int auto_increment,
    nombre nvarchar(100),
    primary key (id)
    );
    
DROP TABLE IF EXISTS articulos;    
CREATE TABLE articulos (
	id int auto_increment,
    nombre nvarchar(100),
    precio int,
    idFabricante int,
    primary key (id),
    foreign key (idFabricante) references fabricantes(id) ON DELETE CASCADE ON UPDATE CASCADE
    );
    

insert into fabricantes (nombre)values('Kingston');
insert into fabricantes (nombre)values('Tp-link');
insert into fabricantes (nombre)values('Trust');
insert into fabricantes (nombre)values('HP');
insert into fabricantes (nombre)values('Toshiba');

insert into articulos (nombre, precio, idFabricante) values ('Disco duro','80','1');
insert into articulos (nombre, precio, idFabricante) values ('Repetidor red wifi','90','2');
insert into articulos (nombre, precio, idFabricante) values ('Lector DNI','12','3');
insert into articulos (nombre, precio, idFabricante) values ('Impresora','75','4');
insert into articulos (nombre, precio, idFabricante) values ('Portatil','350','5');



