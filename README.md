# OTS-Assessment

1. UML


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

2. ERD




3. Java Code
