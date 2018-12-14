-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema camposDB
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `camposDB` ;

-- -----------------------------------------------------
-- Schema camposDB
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `camposDB` DEFAULT CHARACTER SET utf8 COLLATE utf8_bin ;
USE `camposDB` ;

-- -----------------------------------------------------
-- Table `camposDB`.`campo`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `camposDB`.`campo` ;

	CREATE TABLE IF NOT EXISTS `camposDB`.`campo` (
	  `idcampo` INT NOT NULL AUTO_INCREMENT,
	  `nombrecampo` VARCHAR(45) NOT NULL,
	  `superficiecampo` DOUBLE NOT NULL,
	  `estadocampo` VARCHAR(15) NULL DEFAULT 'Creado',
	  PRIMARY KEY (`idcampo`),
	  UNIQUE INDEX `nombrecampo_UNIQUE` (`nombrecampo` ASC) )
	ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `camposDB`.`lote`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `camposDB`.`lote` ;

CREATE TABLE IF NOT EXISTS `camposDB`.`lote` (
  `idlote` INT NOT NULL AUTO_INCREMENT,
  `superficielote` DOUBLE NOT NULL,
  `tiposuelo` VARCHAR(3) NOT NULL,
  `idcampo` INT NOT NULL,
  `numerolote` INT NOT NULL,
  PRIMARY KEY (`idlote`),
  INDEX `fk_lote_campo_idx` (`idcampo` ASC) ,
  CONSTRAINT `fk_lote_campo`
    FOREIGN KEY (`idcampo`)
    REFERENCES `camposDB`.`campo` (`idcampo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
