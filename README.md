# OTS-Assessment

##*1. UML*


@startuml

title Pharmacy Warehouse


class Drug_Category {

  +drug_category_id: String
  
  +name: String

}

class Drug {

+drug_id: String

+code: String

+name: String

+price: double

+stock: int

+drug_category: String   ' FK to Drug_Category.drug_category_id

}

class Movement_Stock {

+movement_id: String

+type: String

+quantity: int

+movementDate: Date

+drug_id: String         ' FK to Drug.drug_id

}


##*2. ERD*

DROP DATABASE IF EXISTS pharmacy_warehouse;

CREATE DATABASE pharmacy_warehouse;


CREATE TABLE drug_category (

drug_category_id BIGSERIAL PRIMARY KEY,

name VARCHAR(100) NOT NULL

);


CREATE TABLE drug (

drug_id BIGSERIAL PRIMARY KEY,

code VARCHAR(50) NOT NULL,

name VARCHAR(150) NOT NULL,

price DECIMAL(10,2) NOT NULL,

stock INT NOT NULL,

drug_category_id BIGINT NOT NULL

REFERENCES drug_category(drug_category_id)

);


CREATE TABLE movement_stock (

movement_id BIGSERIAL PRIMARY KEY,

type VARCHAR(16) NOT NULL,

quantity INT NOT NULL,

movementDate DATE NOT NULL,

drug_id BIGINT NOT NULL

REFERENCES drug(drug_id)

);



##*3. Java Code*
