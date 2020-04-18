DROP TABLE IF EXISTS mordekasier;
 
CREATE TABLE mordekasier (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  ability VARCHAR(250) NOT NULL
);
 
INSERT INTO mordekasier (ability) VALUES ('Decimate');
