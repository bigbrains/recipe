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
	id bigint,
	product_id bigint,
	count float,
	dish_id bigint references dishes(id)
);

CREATE TABLE tools (
	id bigint PRIMARY KEY,
	text name,
	photo text
);

CREATE TABLE dishes_tools (
	dish_id bigint references dishes(id),
	tool_id bigint references tools(id)
);
