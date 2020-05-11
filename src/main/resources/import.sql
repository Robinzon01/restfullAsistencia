/* Populate tables */
INSERT INTO clientes (id,nombre, apellido, email, create_at, foto) VALUES(1,'Andres', 'Guzman', 'profesor@bolsadeideas.com', SYSDATE,'');
INSERT INTO clientes (id,nombre, apellido, email, create_at, foto) VALUES(2,'John', 'Doe', 'john.doe@gmail.com', SYSDATE,'');
INSERT INTO clientes (id,nombre, apellido, email, create_at, foto) VALUES(3,'Linus', 'Torvalds', 'linus.torvalds@gmail.com', SYSDATE,'');
INSERT INTO clientes (id,nombre, apellido, email, create_at, foto) VALUES(4,'Jane', 'Doe', 'jane.doe@gmail.com', SYSDATE,'');
INSERT INTO clientes (id,nombre, apellido, email, create_at, foto) VALUES(5,'Rasmus', 'Lerdorf', 'rasmus.lerdorf@gmail.com', SYSDATE,'');
INSERT INTO clientes (id,nombre, apellido, email, create_at, foto) VALUES(6,'Erich', 'Gamma', 'erich.gamma@gmail.com', SYSDATE,'');
INSERT INTO clientes (id,nombre, apellido, email, create_at, foto) VALUES(7,'Richard', 'Helm', 'richard.helm@gmail.com', SYSDATE,'');
INSERT INTO clientes (id,nombre, apellido, email, create_at, foto) VALUES(8,'Ralph', 'Johnson', 'ralph.johnson@gmail.com', SYSDATE,'');
INSERT INTO clientes (id,nombre, apellido, email, create_at, foto) VALUES(9,'John', 'Vlissides', 'john.vlissides@gmail.com', SYSDATE,'');
INSERT INTO clientes (id,nombre, apellido, email, create_at, foto) VALUES(10,'James', 'Gosling', 'james.gosling@gmail.com', SYSDATE,'');
INSERT INTO clientes (id,nombre, apellido, email, create_at, foto) VALUES(11,'Bruce', 'Lee', 'bruce.lee@gmail.com', SYSDATE,'');
INSERT INTO clientes (id,nombre, apellido, email, create_at, foto) VALUES(12,'Johnny', 'Doe', 'johnny.doe@gmail.com', SYSDATE,'');
INSERT INTO clientes (id,nombre, apellido, email, create_at, foto) VALUES(13,'John', 'Roe', 'john.roe@gmail.com', SYSDATE,'');
INSERT INTO clientes (id,nombre, apellido, email, create_at, foto) VALUES(14,'Jane', 'Roe', 'jane.roe@gmail.com', SYSDATE,'');
INSERT INTO clientes (id,nombre, apellido, email, create_at, foto) VALUES(15,'Richard', 'Doe', 'richard.doe@gmail.com', SYSDATE,'');
INSERT INTO clientes (id,nombre, apellido, email, create_at, foto) VALUES(16,'Janie', 'Doe', 'janie.doe@gmail.com', SYSDATE,'');
INSERT INTO clientes (id,nombre, apellido, email, create_at, foto) VALUES(17,'Phillip', 'Webb', 'phillip.webb@gmail.com', SYSDATE,'');
INSERT INTO clientes (id,nombre, apellido, email, create_at, foto) VALUES(18,'Stephane', 'Nicoll', 'stephane.nicoll@gmail.com', SYSDATE,'');
INSERT INTO clientes (id,nombre, apellido, email, create_at, foto) VALUES(19,'Sam', 'Brannen', 'sam.brannen@gmail.com', SYSDATE,'');  
INSERT INTO clientes (id,nombre, apellido, email, create_at, foto) VALUES(20,'Juergen', 'Hoeller', 'juergen.Hoeller@gmail.com', SYSDATE,''); 
INSERT INTO clientes (id,nombre, apellido, email, create_at, foto) VALUES(21,'Janie', 'Roe', 'janie.roe@gmail.com', SYSDATE,'');
INSERT INTO clientes (id,nombre, apellido, email, create_at, foto) VALUES(22,'John', 'Smith', 'john.smith@gmail.com', SYSDATE,'');
INSERT INTO clientes (id,nombre, apellido, email, create_at, foto) VALUES(23,'Joe', 'Bloggs', 'joe.bloggs@gmail.com', SYSDATE,'');
INSERT INTO clientes (id,nombre, apellido, email, create_at, foto) VALUES(24,'John', 'Stiles', 'john.stiles@gmail.com', SYSDATE,'');
INSERT INTO clientes (id,nombre, apellido, email, create_at, foto) VALUES(25,'Richard', 'Roe', 'stiles.roe@gmail.com', SYSDATE,'');

/* Populate tabla productos */
INSERT INTO productos (id,nombre, precio, create_at) VALUES(1,'Panasonic Pantalla LCD', 259990, SYSDATE);
INSERT INTO productos (id,nombre, precio, create_at) VALUES(2,'Sony Camara digital DSC-W320B', 123490, SYSDATE);
INSERT INTO productos (id,nombre, precio, create_at) VALUES(3,'Apple iPod shuffle', 1499990, SYSDATE);
INSERT INTO productos (id,nombre, precio, create_at) VALUES(4,'Sony Notebook Z110', 37990, SYSDATE);
INSERT INTO productos (id,nombre, precio, create_at) VALUES(5,'Hewlett Packard Multifuncional F2280', 69990, SYSDATE);
INSERT INTO productos (id,nombre, precio, create_at) VALUES(6,'Bianchi Bicicleta Aro 26', 69990, SYSDATE);
INSERT INTO productos (id,nombre, precio, create_at) VALUES(7,'Mica Comoda 5 Cajones', 299990, SYSDATE);

/* Creamos algunas facturas */
INSERT INTO facturas (id,descripcion, observacion, cliente_id, create_at) VALUES(1,'Factura equipos de oficina', null, 1, SYSDATE);
INSERT INTO facturas_items (id,cantidad, factura_id, producto_id) VALUES(1,1, 1, 1);
INSERT INTO facturas_items (id,cantidad, factura_id, producto_id) VALUES(2,2, 1, 4);
INSERT INTO facturas_items (id,cantidad, factura_id, producto_id) VALUES(3,1, 1, 5);
INSERT INTO facturas_items (id,cantidad, factura_id, producto_id) VALUES(4,1, 1, 7);

INSERT INTO facturas (id,descripcion, observacion, cliente_id, create_at) VALUES(2,'Factura Bicicleta', 'Alguna nota importante!', 2, SYSDATE);
INSERT INTO facturas_items (id,cantidad, factura_id, producto_id) VALUES(5,3, 2, 6);

/* Creamos algunos usuarios con sus roles */
INSERT INTO users (username, password, enabled) VALUES ('andres','$2a$10$O9wxmH/AeyZZzIS09Wp8YOEMvFnbRVJ8B4dmAMVSGloR62lj.yqXG',1);
INSERT INTO users (username, password, enabled) VALUES ('admin','$2a$10$DOMDxjYyfZ/e7RcBfUpzqeaCs8pLgcizuiQWXPkU35nOhZlFcE9MS',1);

INSERT INTO authorities (user_id, authority) VALUES (1,'ROLE_USER');
INSERT INTO authorities (user_id, authority) VALUES (2,'ROLE_ADMIN');
INSERT INTO authorities (user_id, authority) VALUES (2,'ROLE_USER');

Insert into ARFAMC (NO_CIA, CUENTA_DOL, CUENTA_SOL, NOMBRE, RAZON_SOCIAL, NO_CLIENTE_ONLINE) Values ('01', '182452-4524', '1552455-899', 'ESCUELA', 'ESCUELA ACTIVA S.A.C', 'ESCUELA ACTIVA');
Insert into ARFAMC (NO_CIA, CUENTA_DOL, CUENTA_SOL, NOMBRE, NOMBRE_ANO, RAZON_SOCIAL, NO_CLIENTE_ONLINE) Values ('02', '15245-15', '18578-25', 'DELTA', 'DELTA', 'DELTA', 'DELTA');

Insert into ASTENCI (COD_AS, NO_CIA, ESTADO, FOTO, NOMBRE) Values (1, '01', 'S', 'assets/images/icons/ENTRADA.png', 'ENTRADA');
Insert into ASTENCI (COD_AS, NO_CIA, ESTADO, FOTO, NOMBRE) Values (2, '01', 'S', 'assets/images/icons/SALIDA.png', 'SALIDA');
Insert into ASTENCI (COD_AS, NO_CIA, ESTADO, FOTO, NOMBRE) Values (3, '01', 'S', 'assets/images/icons/ALMUERZO.png', 'ALMUERZO');
Insert into ASTENCI (COD_AS, NO_CIA, ESTADO, FOTO, NOMBRE) Values (4, '01', 'S', 'assets/images/icons/RETORNO.png', 'RETORNO');
Insert into ASTENCI (COD_AS, NO_CIA, ESTADO, FOTO, NOMBRE) Values (5, '02', 'S', 'assets/images/icons/ENTRADA.png', 'ENTRADA');