CREATE TABLE transaction (
  id int AUTO_INCREMENT PRIMARY KEY,
  amount decimal(10,2) NOT NULL,
  type varchar(20) NOT NULL,
  date datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO transaction (amount, type, date) VALUES (50.00, 'DEBIT', '2025-08-03 00:00:00');