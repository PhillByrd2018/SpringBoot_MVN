DROP TABLE IF EXISTS gank;
DROP TABLE IF EXISTS gankTable;

CREATE TABLE gank (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  can_gank boolean NOT NULL
);
 
INSERT INTO gank(can_gank) VALUES (false);