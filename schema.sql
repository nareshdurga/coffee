CREATE TABLE `world`.`customer` (
  `customer_id` INT NOT NULL,
  `first_name` VARCHAR(45) NULL,
  `last_name` VARCHAR(45) NULL,
  `customer_type` VARCHAR(45) NULL,
  `full_name` VARCHAR(45) NULL,
  `email` VARCHAR(45) NULL,
  `mobile` VARCHAR(45) NULL,
  PRIMARY KEY (`customer_id`));
  
  CREATE TABLE `world`.`beverage` (
  `beverage_id` INT NOT NULL,
  `beverage_name` VARCHAR(45) NULL,
  `beverage_cost` VARCHAR(45) NULL,
  `beverage_type` VARCHAR(45) NULL,
  PRIMARY KEY (`beverage_id`));

  
  CREATE TABLE `world`.`order` (
  `order_id` INT NOT NULL,
  `customer_id` INT NULL,
  `beverage_id` INT NULL,
  `total_cost` DECIMAL NULL,
  PRIMARY KEY (`order_id`),
  INDEX `customer_id_idx` (`customer_id` ASC),
  INDEX `beverage_id_idx` (`beverage_id` ASC),
  CONSTRAINT `customer_id`
    FOREIGN KEY (`customer_id`)
    REFERENCES `world`.`customer` (`customer_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `beverage_id`
    FOREIGN KEY (`beverage_id`)
    REFERENCES `world`.`beverage` (`beverage_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);

