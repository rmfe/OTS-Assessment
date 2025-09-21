# OTS-Assessment

## *1. UML*


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


## *2. ERD*

--To erd είναι ανεβασμένος σε αρχείο με όνομα task2_ERD.svg . 

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



## *3. Java Code*

Ο κώδικας με τα ερωτήματα (δημιουργία νέων φαρμάκων και προβολή όλων των φαρμάκων της αποθήκης) είναι ανεβασμένος σε αρχείο με όνομα task3_java_code.java .  


## *Επεξήγηση*

Τα <ins>ζητούμενα 1 και 2</ins> υλοποιήθηκαν αποκλειστικά από εμένα, και συγκεκριμένα το διάγραμμα του <ins>ζητούμενου 2</ins> έγινε μέσω της ιστοσελίδας draw.io


Δεν είχα προηγούμενη εμπειρία στη Java. Για την υλοποίηση του <ins>ζητούμενου 3</ins> χρησιμοποίησα Stack Overflow, W3Schools και ChatGPT. Με βάση τα παραδείγματα και τις εξηγήσεις τους, έκανα τις απαραίτητες προσαρμογές στον κώδικα ώστε να καλύπτει τις ζητούμενες λειτουργίες. 


Έχω μια κλάση Drug, που περιγράφει τι είναι ένα φάρμακο(id, κωδικός, όνομα, τιμή, απόθεμα, κατηγορία). Υπάρχει μια λίστα drugs, η οποία έχει τον ρόλο της αποθήκης. Κάθε φορά που χρειάζεται να δημιουργηθεί ένα νέο φάρμακο, φτιάχνω ένα αντικείμενο Drug, το οποίο προστίθεται στη λίστα. Για την προβολή όλων των φαρμάκων, γίνεται εμφάνιση των στοιχείων της λίστας. 




