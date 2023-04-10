create table Pet(
    id INT NOT NULL AUTO_INCREMENT,
    -- abrigo      
    nome VARCHAR2(50) NOT NULL,
    descricao VARCHAR2(50) NOT NULL,
    adotado Boolean NOT NULL,
    idade INT NOT NULL,
    endereco VARCHAR2(255) NOT NULL,
    imagem VARCHAR2(999) NOT NULL,
    PRIMARY key(id)
);

INSERT INTO PET(nome, descricao, adotado ,idade, endereco, imagem)
VALUES('Astrid', 'mansa', false,'2','ttat','asdadadasda');