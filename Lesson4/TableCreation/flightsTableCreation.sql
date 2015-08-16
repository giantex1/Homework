CREATE TABLE `test`.`flights` (
  `flightnumber` INT NOT NULL COMMENT '',
  `departureairport` VARCHAR(45) NOT NULL COMMENT '',
  `arrivalairport` VARCHAR(45) NOT NULL COMMENT '',
  `stopsnumber` INT NOT NULL COMMENT '',
  `averageticketprice` INT NOT NULL COMMENT '',
  `availableseats` INT NOT NULL COMMENT '',
  PRIMARY KEY (`flightnumber`)  COMMENT '');
