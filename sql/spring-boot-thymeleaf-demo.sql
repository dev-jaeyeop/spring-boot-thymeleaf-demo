create database spring_boot_thymeleaf_demo;
use spring_boot_thymeleaf_demo;

CREATE TABLE employee
(
    id         INT(11) PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(45),
    last_name  VARCHAR(45),
    email      VARCHAR(45)
);

INSERT INTO employee
VALUES (1, 'Leslie', 'Andrews', 'leslie@email.com'),
       (2, 'Emma', 'Baumgarten', 'emma@email.com'),
       (3, 'Avani', 'Gupta', 'avani@email.com'),
       (4, 'Yuri', 'Petrov', 'yuri@email.com'),
       (5, 'Juan', 'Vega', 'juan@email.com');