CREATE TABLE products (
	id bigint PRIMARY KEY,
	name text,
	photo text,
	unit text
);

CREATE TABLE dishes (
	id bigint PRIMARY KEY,
	name text,
	photo text
);

CREATE TABLE ingredients (
	product_id bigint,
	count float,
	dish_id bigint references dishes(id)
);

CREATE TABLE tools (
	id bigint PRIMARY KEY,
	photo text
);