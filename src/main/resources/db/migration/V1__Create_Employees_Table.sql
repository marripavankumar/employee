CREATE TABLE IF NOT EXISTS employees (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    department VARCHAR(100) NOT NULL,
    salary DECIMAL(10, 2)
);
---- emp.employees definition
--
--CREATE TABLE `employees` (
--  `id` int NOT NULL AUTO_INCREMENT,
--  `name` varchar(100) DEFAULT NULL,
--  `department` varchar(100) DEFAULT NULL,
--  `salary` double DEFAULT NULL,
--  PRIMARY KEY (`id`)
--) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;