CREATE TABLE bill (
	id bigserial NOT NULL,
	purchasedate timestamp NOT NULL,
	clientname varchar(255) NOT NULL,
	clientid varchar(16) NOT NULL,
	subtotal numeric(10, 2) NOT NULL DEFAULT 0.0,
	taxes numeric(10, 2) NOT NULL DEFAULT 0.0,
	total numeric(10, 2) NOT NULL DEFAULT 0.0
);
ALTER TABLE bill ADD CONSTRAINT bill_pk PRIMARY KEY(id);
CREATE TABLE item (
	id bigserial NOT NULL,
	id_bill bigint NOT NULL,
	productname varchar(255) NOT NULL,
	price numeric(10, 2) NOT NULL DEFAULT 0.0,
	tax_rate numeric(10, 2) NOT NULL DEFAULT 0.0
);
ALTER TABLE item ADD CONSTRAINT item_pk PRIMARY KEY(id);
ALTER TABLE item ADD CONSTRAINT bill_item_fk1 FOREIGN KEY (id_bill) REFERENCES bill(id) ON DELETE CASCADE ON UPDATE CASCADE;
