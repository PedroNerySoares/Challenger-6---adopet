create table Tutores(
    id      INT NOT NULL AUTO_INCREMENT,
    nome    VARCHAR2(255) not null,
    email   VARCHAR2(50) not null,
    senha   VARCHAR2(70) not null,

    biografia VARCHAR2(255),
    cidade    VARCHAR2(255),
    foto       VARCHAR2(999),

    PRIMARY KEY(ID)
)