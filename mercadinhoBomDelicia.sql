/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  pedroportales
 * Created: 16 de abr. de 2024
 */

CREATE DATABASE mercadinhoBomDelicia;
USE mercadinhoBomDelicia;

CREATE TABLE if not exists produtos (
    id_produtos int not null auto_increment PRIMARY KEY,
    nomeProduto varchar(100) not null,
    quantidade int not null,
    preco decimal not null
);

CREATE TABLE if not exists funcionarios (
    id_funcionarios int not null auto_increment PRIMARY KEY,
    nomeFuncionario varchar(100) not null,
    senha varchar(100) not null,
    email varchar(100) not null,
    cargo varchar(45) not null,
    cpf varchar(20) not null
  -- CONSTRAINT fk_funcionarios_produtos foreign key (produtos_id) references produtos (id)
);

-- INSERT INTO produtos (nomeProduto,quantidade,preco)VALUES(?,?,?);

-- SELECT * FROM produtos;

-- UPDATE produtos SET nomeProduto = ?,quantidade = ?,preco = ? WHERE id_produto = ?;

-- DELETE FROM produtos WHERE id_produto = ?;

-- INSERT INTO funcionarios (nomeFuncionario,senha,email,cargo,cpf)VALUES("administrador","senhaadmin","admin@admin","",?);
