DROP DATABASE bank_db;

CREATE DATABASE bank_db;

USE bank_db;

CREATE TABLE accounts (
    acc_id INT PRIMARY KEY,
    acc_name VARCHAR(100),
    balance DECIMAL(10, 2)
);

-- Insert sample data
INSERT INTO accounts (acc_id, acc_name, balance) VALUES
(101, 'Alice', 5000.00),
(102, 'Bob', 3000.00);

