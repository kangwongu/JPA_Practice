DROP TABLE IF EXISTS order_item;
DROP TABLE IF EXISTS orders;
DROP TABLE IF EXISTS delivery;
DROP TABLE IF EXISTS item;
DROP TABLE IF EXISTS member;
DROP TABLE IF EXISTS category;
DROP TABLE IF EXISTS category_item;

CREATE TABLE member (
    member_id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    city VARCHAR(255) NOT NULL,
    street VARCHAR(255) NOT NULL,
    zip_code VARCHAR(255) NOT NULL
);

CREATE TABLE item (
      item_id BIGINT AUTO_INCREMENT PRIMARY KEY,
      name VARCHAR(255) NOT NULL,
      price INT NOT NULL,
      stock_quantity INT NOT NULL,
      item_type VARCHAR(255) NOT NULL,
      artist VARCHAR(255),
      etc VARCHAR(255),
      author VARCHAR(255),
      isbn VARCHAR(255),
      director VARCHAR(255),
      actor VARCHAR(255)
);

CREATE TABLE delivery (
      delivery_id BIGINT AUTO_INCREMENT PRIMARY KEY,
      city VARCHAR(255) NOT NULL,
      street VARCHAR(255) NOT NULL,
      zip_code VARCHAR(255) NOT NULL,
      status VARCHAR(255) NOT NULL
);

CREATE TABLE orders (
    order_id BIGINT AUTO_INCREMENT PRIMARY KEY,
    member_id BIGINT,
    delivery_id BIGINT,
    order_date DATETIME NOT NULL,
    status VARCHAR(255) NOT NULL
);

CREATE TABLE order_item (
    order_item_id BIGINT AUTO_INCREMENT PRIMARY KEY,
    item_id BIGINT,
    order_id BIGINT,
    order_price INT NOT NULL,
    count INT NOT NULL
);

create table category (
      id bigint not null auto_increment,
      parent_id bigint,
      name varchar(255),
      primary key (id)
);

create table category_item (
   category_id bigint,
   id bigint not null auto_increment,
   item_id bigint,
   primary key (id)
);
