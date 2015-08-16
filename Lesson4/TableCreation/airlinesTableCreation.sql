CREATE TABLE `test`.`airlines` (
  `flightnumber` INT NOT NULL COMMENT '',
  `airline` VARCHAR(45) NOT NULL COMMENT '',
  `additionalspaceservice` BIT(1) NOT NULL COMMENT '',
  `webregistration` BIT(1) NOT NULL COMMENT '',
  `ismealincluded` BIT(1) NOT NULL COMMENT '',
  PRIMARY KEY (`flightnumber`)  COMMENT '');
