CREATE TABLE IF NOT EXIST Produits(
    id VARCHAR(20),
    name VARCHAR(50) NOT NULL,
    description VARCHAR(300) NOT NULL,
    price DECIMAL(19,4) NOT NULL,
    PRIMARY KEY(refProduit),
    );