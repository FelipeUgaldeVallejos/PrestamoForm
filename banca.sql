CREATE DATABASE Banca;

USE Banca;

create table Prestamo (
  tipo varchar(1) not null,
  id varchar(10) unique not null,
  nombre varchar(30) not null,
  monto double,
  tasa double,
  plazo double,
  Primary key(id)
);

create table Usuario (
  id varchar(10) unique not null,
  clave varchar(100) not null,
  rol varchar(10) not null,
  Primary key(id)
);

insert into Prestamo (tipo,id,nombre,monto,tasa,plazo)
 values ('1','111','Juan',1000000,1,60);
 
insert into Prestamo (tipo,id,nombre,monto,tasa,plazo)
 values ('1','222','Maria',20000000,2,120);

insert into Usuario (id,clave,rol)
 values ('jsanchez','$2a$12$UafqQkd9TVJxw9W4HoQ1eePssHEW6IPlX9VeKHWvMfiEeHGgsdOGO','ADM');
 /* clave 111 */
 
 insert into Usuario (id,clave,rol)
 values ('saltman','$2a$12$z0dbkRqX1JSXOjAN9YX8tOWp.Es70TJl08ebtGgrwdOvgKe9dC67e','USR');
 /* clave 222 */