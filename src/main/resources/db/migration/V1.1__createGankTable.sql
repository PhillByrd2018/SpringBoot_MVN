DROP TABLE IF EXISTS gankTable;
 
CREATE TABLE gankTable (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  cangank boolean NOT NULL
);
 
INSERT INTO gankTable (cangank) VALUES ('false');