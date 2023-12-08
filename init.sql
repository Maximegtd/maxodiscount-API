CREATE TABLE IF NOT EXIST Produits(
     refProduit VARCHAR(20),
     designationProduit VARCHAR(50) NOT NULL,
     descriptionProduit VARCHAR(300) NOT NULL,
     prixProduit DECIMAL(19,4) NOT NULL,
     quantiteProduit INT NOT NULL,
     refRayon VARCHAR(50) NOT NULL,
     PRIMARY KEY(refProduit),
);