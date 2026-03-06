CREATE TABLE accounts (
    id BIGSERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    balance NUMERIC(18,2) NOT NULL,
    created_at TIMESTAMPTZ DEFAULT CURRENT_TIMESTAMP
);

INSERT INTO accounts (name, balance)
VALUES
('Alice', 1000.00),
('Budi', 500.00);

SELECT * FROM accounts;