DROP DATABASE TruewayMobile;
CREATE DATABASE TruewayMobile;
USE TruewayMobile;
CREATE TABLE `PLAN` (
	`ID` INT(10) NOT NULL AUTO_INCREMENT,
	`NAME` varchar(50) NOT NULL,
	`ROI_DATA` varchar(50) ,
	`ROI_FREE_CALL` varchar(50) ,
	`ROI_FREE_TEXT` varchar(50) ,
	`EU_DATA` varchar(50) ,
	`EU_FREE_CALL` varchar(50)  DEFAULT 'Unlimited',
	`EU_FREE_TEXT` varchar(50)  DEFAULT 'Unlimited',
	`EU_ROAMIMG` varchar(50) ,
	`UK_DATA` varchar(50) ,
	`UK_FREE_CALL` varchar(50) ,
	`UK_FREE_TEXT` varchar(50) ,
	`INT_DATA` varchar(50) ,
	`INT_FREE_CALL` varchar(50) ,
	`INT_FREE_TEXT` varchar(50) ,
	`CANADA_ROAMING` varchar(50) ,
	`USA_ROAMING` varchar(50) ,
	`REWARD` varchar(250) ,
	`CONTRACT` varchar(50) ,
	`DISCOUNT` varchar(250) ,
	`DESCRIPTION` varchar(250) ,
	`PRICE` INT ,
	`PRICE_CURR` varchar(10) ,
	`CREATED_AT` DATETIME ,
	`UPDATED_AT` DATETIME ,
	PRIMARY KEY (`ID`)
);

CREATE TABLE `PHONE` (
	`ID` INT(10) NOT NULL AUTO_INCREMENT,
	`NAME` varchar(50) NOT NULL,
	`MODEL` varchar(50) ,
	`MEMORY` varchar(50) ,
	`STORAGE` varchar(50) ,
	`COLOR` varchar(50) ,
	`NETWORK` varchar(50) ,
	`DISPLAY` varchar(50) ,
	`MAIN_CAMERA` varchar(50) ,
	`FRONT_CAMERA` varchar(50) ,
	`OS` varchar(50) ,
	`PRICE` INT(10) ,
	`PRICE_CURR` varchar(10) ,
	`DESCRIPTION` varchar(250) ,
	`IMAGE` blob ,
	`CREATED_AT` DATETIME ,
	`UPDATED_AT` DATETIME ,
	PRIMARY KEY (`ID`)
);

CREATE TABLE `ACCESSORY` (
	`ID` INT(10) NOT NULL AUTO_INCREMENT,
	`NAME` varchar(50) NOT NULL,
	`DESCRIPTION` varchar(250) ,
	`PRICE` INT(10) ,
	`PRICE_CURR` varchar(10) ,
	`IMAGE` blob ,
	`CREATED_AT` DATETIME ,
	`UPDATED_AT` DATETIME ,
	PRIMARY KEY (`ID`)
);

CREATE TABLE `OFFER` (
	`ID` INT(10) NOT NULL AUTO_INCREMENT,
	`NAME` varchar(50) NOT NULL,
	`DESCRIPTION` varchar(250) ,
	`VALUE_PERC` INT ,
	`VALUE_FIXED` INT ,
	`CREATED_AT` DATETIME ,
	`UPDATED_AT` DATETIME ,
	PRIMARY KEY (`ID`)
);

CREATE TABLE `CUSTOMER` (
	`ID` INT(10) NOT NULL AUTO_INCREMENT,
	`FIRST_NAME` varchar(50) NOT NULL,
	`MIDDLE_NAME` varchar(50) ,
	`LAST_NAME` varchar(50) NOT NULL,
	`ADDRESS1` varchar(250) NOT NULL,
	`ADDRESS2` varchar(250) ,
	`ADDRESS3` varchar(250) ,
	`COUNTY` varchar(250) NOT NULL,
	`COUNTRY` varchar(250) NOT NULL,
	`PLAN_START` DATETIME ,
	`PLAN_END` DATETIME ,
	`HOME_PHONE` VARCHAR(50) ,
	`MOBILE_PHONE` VARCHAR(50) ,
	`EMAIL1` VARCHAR(50) ,
	`EMAIL2` VARCHAR(50) ,
	`CREATED_AT` DATETIME ,
	`UPDATED_AT` DATETIME ,
	PRIMARY KEY (`ID`)
);

CREATE TABLE `USER` (
	`ID` INT(10) NOT NULL AUTO_INCREMENT,
	`LOGIN` varchar(50) ,
	`PASSWORD` varchar(50) ,
	`CREAT` BOOLEAN ,
	`READ` BOOLEAN ,
	`UPDAT` BOOLEAN ,
	`DEACTIVE` BOOLEAN ,
	`CREATED_AT` DATETIME ,
	`UPDATED_AT` DATETIME ,
	PRIMARY KEY (`ID`)
);

CREATE TABLE `PLAN_PHONE` (
	`PLAN_ID` INT(10) NOT NULL,
	`PHONE_ID` INT(10) NOT NULL
);

CREATE TABLE `PHONE_ACCESSORY` (
	`PHONE_ID` INT(10) NOT NULL,
	`ACCESSORY_ID` INT(10) NOT NULL
);

CREATE TABLE `PLAN_OFFER` (
	`PLAN_ID` INT(10) NOT NULL,
	`OFFER_ID` INT(10) NOT NULL
);
CREATE TABLE `CUSTOMER_PLAN` (
	`CUST_ID` INT(10) NOT NULL,
	`PLAN_ID` INT(10) NOT NULL
);

CREATE TABLE `INVOICE` (
	`ID` INT(10) NOT NULL AUTO_INCREMENT,
	`NAME` varchar(50) NOT NULL,
	`PLAN_ID` INT(10) NOT NULL,
	`CUST_ID` INT(10) NOT NULL,
	`CREATED_DT` TIMESTAMP ,
	`UPDATED_DT` TIMESTAMP ,
	`DISCOUNT` INT ,
	`TOTAL_AMT` INT NOT NULL,
	`NET_AMT` INT NOT NULL,
	`PAY_METHOD` varchar(50) ,
	PRIMARY KEY (`ID`)
);

CREATE TABLE `DOCUMENT` (
	`ID` INT(10) NOT NULL AUTO_INCREMENT,
	`CUST_ID` INT(10) NOT NULL,
	`MOB_CONTRACT` blob ,
	`SEPA_DD` blob ,
	`INS_CONTRACT` blob ,
	`FUND_CONTRACT` blob ,
	PRIMARY KEY (`ID`)
);

ALTER TABLE `CUSTOMER` ADD CONSTRAINT `CUSTOMER_fk0` FOREIGN KEY (`PLAN_ID`) REFERENCES `PLAN`(`ID`);

ALTER TABLE `CUSTOMER_PLAN` ADD CONSTRAINT `CUSTOMER_PLAN_fk0` FOREIGN KEY (`CUST_ID`) REFERENCES `CUSTOMER`(`ID`);

ALTER TABLE `CUSTOMER_PLAN` ADD CONSTRAINT `CUSTOMER_PLAN_fk1` FOREIGN KEY (`PLAN_ID`) REFERENCES `PLAN`(`ID`);

ALTER TABLE `PLAN_PHONE` ADD CONSTRAINT `PLAN_PHONE_fk0` FOREIGN KEY (`PLAN_ID`) REFERENCES `PLAN`(`ID`);

ALTER TABLE `PLAN_PHONE` ADD CONSTRAINT `PLAN_PHONE_fk1` FOREIGN KEY (`PHONE_ID`) REFERENCES `PHONE`(`ID`);

ALTER TABLE `PHONE_ACCESSORY` ADD CONSTRAINT `PHONE_ACCESSORY_fk0` FOREIGN KEY (`PHONE_ID`) REFERENCES `PHONE`(`ID`);

ALTER TABLE `PHONE_ACCESSORY` ADD CONSTRAINT `PHONE_ACCESSORY_fk1` FOREIGN KEY (`ACCESSORY_ID`) REFERENCES `ACCESSORY`(`ID`);

ALTER TABLE `PLAN_OFFER` ADD CONSTRAINT `PLAN_OFFER_fk0` FOREIGN KEY (`PLAN_ID`) REFERENCES `PLAN`(`ID`);

ALTER TABLE `PLAN_OFFER` ADD CONSTRAINT `PLAN_OFFER_fk1` FOREIGN KEY (`OFFER_ID`) REFERENCES `OFFER`(`ID`);

ALTER TABLE `INVOICE` ADD CONSTRAINT `INVOICE_fk0` FOREIGN KEY (`PLAN_ID`) REFERENCES `PLAN`(`ID`);

ALTER TABLE `INVOICE` ADD CONSTRAINT `INVOICE_fk1` FOREIGN KEY (`CUST_ID`) REFERENCES `CUSTOMER`(`ID`);

ALTER TABLE `DOCUMENT` ADD CONSTRAINT `DOCUMENT_fk0` FOREIGN KEY (`CUST_ID`) REFERENCES `CUSTOMER`(`ID`);

