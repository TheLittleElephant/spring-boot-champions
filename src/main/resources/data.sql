DROP TABLE IF EXISTS champions;

CREATE TABLE champions (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  nom VARCHAR(255) NOT NULL
);

INSERT INTO champions (nom) VALUES
  ('Teemo'),
  ('Brand');