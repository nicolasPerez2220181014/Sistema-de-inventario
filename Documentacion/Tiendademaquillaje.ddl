CREATE TABLE Persons (person_id  SERIAL NOT NULL, person_name varchar(50), person_lastname varchar(50), person_email varchar(80) UNIQUE, person_cellphone int4 NOT NULL UNIQUE, person_birthdate date, person_creation_date date, person_identification int4 UNIQUE, Fk_Locations_locations_id int4, Fk_Users_user_nick_name varchar(30), Fk_roles_id int4, "Fk_namesidentification _id" int4, PRIMARY KEY (person_id));
CREATE TABLE Roles (roles_id  SERIAL NOT NULL, roles_name varchar(20), PRIMARY KEY (roles_id));
CREATE TABLE Users (user_nick_name varchar(30) NOT NULL, user_password varchar(255), Fk_state_id int4, PRIMARY KEY (user_nick_name));
CREATE TABLE States (state_id  SERIAL NOT NULL, state_name varchar(30), PRIMARY KEY (state_id));
CREATE TABLE Locations (locations_id  SERIAL NOT NULL, location_data varchar(255), location_postal_code numeric(19, 0), location_extra_info varchar(255), Fk_Cities_city_id int4, PRIMARY KEY (locations_id));
CREATE TABLE Cities (city_id  SERIAL NOT NULL, city_name varchar(30), Fk_Departments_department_id int4, Fk_state_id int4, PRIMARY KEY (city_id));
CREATE TABLE Departments (department_id  SERIAL NOT NULL, department_name varchar(30), PRIMARY KEY (department_id));
CREATE TABLE Products (product_internal_serial  SERIAL NOT NULL, product_sell_price numeric(19, 0), product_expires_date date, product_stock int4, product_image int4, Fk_category_id int4, Fk_Typestype_id int4, Fk_reference int4, Fk_Supplier_id int4, PRIMARY KEY (product_internal_serial));
CREATE TABLE Reference_names (reference  SERIAL NOT NULL, reference_name varchar(30), PRIMARY KEY (reference));
CREATE TABLE Categories (category_id  SERIAL NOT NULL, category_name varchar(30), PRIMARY KEY (category_id));
CREATE TABLE Products_Names (name_id  SERIAL NOT NULL, name int4, PRIMARY KEY (name_id));
CREATE TABLE Purchases (purchase_id  SERIAL NOT NULL, purchase_date date, purchase_unit_cost numeric(19, 0), purchase_units int4, Fk_pay_form_id int4, Fk_product_internal_serial int4 NOT NULL, PRIMARY KEY (purchase_id));
CREATE TABLE Categories_Types (type_id  SERIAL NOT NULL, type_name varchar(30), PRIMARY KEY (type_id));
CREATE TABLE Identifications_names ("identification _id"  SERIAL NOT NULL, identification_name varchar(30), PRIMARY KEY ("identification _id"));
CREATE TABLE Bills (bill_id  SERIAL NOT NULL, bill_date date, Fk_person_id int4, Fk_pay_form_id int4, Fk_shipping_guide int4, PRIMARY KEY (bill_id));
CREATE TABLE Pay_forms (pay_form_id  SERIAL NOT NULL, pay_form_name varchar(30), PRIMARY KEY (pay_form_id));
CREATE TABLE Returns (return_id  SERIAL NOT NULL, Fk_product_internal_serial int4 NOT NULL, Fk_person_id int4, PRIMARY KEY (return_id));
CREATE TABLE Supplier (Supplier_id  SERIAL NOT NULL, Supplier_name varchar(30), PRIMARY KEY (Supplier_id));
CREATE TABLE Shippings (shipping_guide  SERIAL NOT NULL, shipping_company varchar(30), PRIMARY KEY (shipping_guide));
CREATE TABLE Bills_Products (id int4 NOT NULL, units int4, discount numeric(19, 0), total numeric(19, 0), tax numeric(19, 0), Fk_product_internal_serial int4 NOT NULL, Fk_bill_id int4 NOT NULL, PRIMARY KEY (id, Fk_product_internal_serial, Fk_bill_id));
ALTER TABLE Cities ADD CONSTRAINT FKCities213134 FOREIGN KEY (Fk_Departments_department_id) REFERENCES Departments (department_id);
ALTER TABLE Locations ADD CONSTRAINT FKLocations752935 FOREIGN KEY (Fk_Cities_city_id) REFERENCES Cities (city_id);
ALTER TABLE Persons ADD CONSTRAINT FKPersons11519 FOREIGN KEY (Fk_Locations_locations_id) REFERENCES Locations (locations_id);
ALTER TABLE Persons ADD CONSTRAINT FKPersons926784 FOREIGN KEY (Fk_Users_user_nick_name) REFERENCES Users (user_nick_name);
ALTER TABLE Purchases ADD CONSTRAINT FKPurchases536721 FOREIGN KEY (Fk_product_internal_serial) REFERENCES Products (product_internal_serial);
ALTER TABLE Products ADD CONSTRAINT FKProducts303003 FOREIGN KEY (Fk_category_id) REFERENCES Categories (category_id);
ALTER TABLE Products ADD CONSTRAINT FKProducts558656 FOREIGN KEY (Fk_Typestype_id) REFERENCES Categories_Types (type_id);
ALTER TABLE Products ADD CONSTRAINT FKProducts645325 FOREIGN KEY (Fk_reference) REFERENCES Reference_names (reference);
ALTER TABLE Persons ADD CONSTRAINT FKPersons138385 FOREIGN KEY (Fk_roles_id) REFERENCES Roles (roles_id);
ALTER TABLE Persons ADD CONSTRAINT FKPersons181072 FOREIGN KEY ("Fk_namesidentification _id") REFERENCES Identifications_names ("identification _id");
ALTER TABLE Cities ADD CONSTRAINT FKCities641575 FOREIGN KEY (Fk_state_id) REFERENCES States (state_id);
ALTER TABLE Users ADD CONSTRAINT FKUsers671309 FOREIGN KEY (Fk_state_id) REFERENCES States (state_id);
ALTER TABLE Bills ADD CONSTRAINT FKBills519795 FOREIGN KEY (Fk_person_id) REFERENCES Persons (person_id);
ALTER TABLE Bills ADD CONSTRAINT FKBills202211 FOREIGN KEY (Fk_pay_form_id) REFERENCES Pay_forms (pay_form_id);
ALTER TABLE Returns ADD CONSTRAINT FKReturns144790 FOREIGN KEY (Fk_product_internal_serial) REFERENCES Products (product_internal_serial);
ALTER TABLE Returns ADD CONSTRAINT FKReturns424334 FOREIGN KEY (Fk_person_id) REFERENCES Persons (person_id);
ALTER TABLE Purchases ADD CONSTRAINT FKPurchases464829 FOREIGN KEY (Fk_pay_form_id) REFERENCES Pay_forms (pay_form_id);
ALTER TABLE Products ADD CONSTRAINT FKProducts266975 FOREIGN KEY (Fk_Supplier_id) REFERENCES Supplier (Supplier_id);
ALTER TABLE Bills ADD CONSTRAINT FKBills480679 FOREIGN KEY (Fk_shipping_guide) REFERENCES Shippings (shipping_guide);
ALTER TABLE Bills_Products ADD CONSTRAINT FKBills_Prod87377 FOREIGN KEY (Fk_bill_id) REFERENCES Bills (bill_id);
ALTER TABLE Bills_Products ADD CONSTRAINT FKBills_Prod304878 FOREIGN KEY (Fk_product_internal_serial) REFERENCES Products (product_internal_serial);
