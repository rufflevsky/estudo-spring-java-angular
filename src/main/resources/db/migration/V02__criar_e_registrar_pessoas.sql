CREATE TABLE pessoa (
	codigo BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(30) NOT NULL,
    ativo boolean not null,
    logradouro varchar(50),
    numero varchar(5),
    complemento varchar(30),
    bairro varchar(15),
    cep varchar(8),
    cidade varchar(20),
    estado varchar(15)
) ENGINE=InnoDB DEFAULT CHARSET=utf8; 
 
insert into pessoa (nome, ativo, logradouro, numero, 
					complemento, bairro, cep, cidade, estado) 
			values ('Rafael Munoz', true, 'Rua da Mouraria', '53','' ,'Nazaré','40040090','Salvador','Bahia');
insert into pessoa (nome, ativo, logradouro, numero, 
					complemento, bairro, cep, cidade, estado) 
			values ('Camila Costa', true, 'Rua da Madeira', '53','' ,'Uberaba','40040090','Curitiba','Paraná');
insert into pessoa (nome, ativo, logradouro, numero, 
					complemento, bairro, cep, cidade, estado) 
			values ('Linard Skynard', true, 'Rua da Tábua', '53','' ,'Uberaba','40040090','Curitiba','Paraná');
insert into pessoa (nome, ativo, logradouro, numero, 
					complemento, bairro, cep, cidade, estado) 
			values ('Gilberto Damião', true, 'Rua da Caçamba', '53','' ,'Jurubeba','40040090','Morretes','Paraná');
insert into pessoa (nome, ativo, logradouro, numero, 
					complemento, bairro, cep, cidade, estado) 
			values ('Nani People', true, 'Rua da Palmeira', '53','' ,'Paqueta','40040090','Morretes','Paraná');
insert into pessoa (nome, ativo, logradouro, numero, 
					complemento, bairro, cep, cidade, estado) 
			values ('Manu Zica', true, 'Rua da Manu', '53','' ,'Uberaba','40040090','Curitiba','Paraná');


