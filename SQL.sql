USE inventorydb;
TABLE users;

UPDATE users SET status = 'ACTIVE' WHERE id = 1;

TABLE suppliers;

DESC products;
TABLE products;
TABLE categories;
INSERT INTO categories(category_name, description) VALUES('Electronics', 'asdfghjkl');

TABLE store_purchase;
DESC store_purchase;
INSERT INTO store_purchase(purchased_by_id, supplier_id) VALUES( 1, 1);

INSERT INTO products(quantity, price, product_name, status, category_id, purchase_id, supplier_id, product_description)
VALUES
(100, 1000, 'Mobile', 'IN_STOCK', 1,1,1,'Phone');