CREATE TABLE IF NOT EXISTS tourists (
    tourist_id SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(150) NOT NULL,
    country VARCHAR(80),
    age INTEGER,
    destination VARCHAR(100)
);

-- Optional sample data. Run only if you need sample records.
INSERT INTO tourists (name, email, country, age, destination)
VALUES
('Rahul', 'rahul@gmail.com', 'India', 22, 'Goa'),
('Priya', 'priya@gmail.com', 'India', 21, 'Kerala'),
('John', 'john@gmail.com', 'USA', 28, 'Hyderabad'),
('Emma', 'emma@gmail.com', 'UK', 25, 'Agra'),
('Arjun', 'arjun@gmail.com', 'India', 23, 'Manali');
