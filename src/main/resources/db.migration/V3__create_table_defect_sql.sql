CREATE TABLE defect (
  id SERIAL PRIMARY KEY,
  equipment_id BIGINT,
  description VARCHAR(255),
  FOREIGN KEY (equipment_id) REFERENCES equipment (id)
);