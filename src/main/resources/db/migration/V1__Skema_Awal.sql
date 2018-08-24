CREATE TABLE product(
  id int(11) NOT NULL AUTO_INCREMENT PRIMARY KEY,
  name varchar(250) NOT NULL,
  price decimal(10, 1) NOT NULL,
  quantity int(11) NOT NULL,
  description varchar(500) NOT NULL,
  status tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
