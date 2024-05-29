create table storage.t_product
(
    product_id         serial primary key,
    c_title            varchar(200) not null check ( length(trim(c_title)) >= 3 )
);

create table storage.t_product_balance
(
    balance_id serial primary key,
    product_id bigint not null,
    balance    bigint not null check ( balance > 0 ),
    price      decimal(12, 2) check ( price > 0 ),
    unique (product_id),
    constraint fk_product_balance_product foreign key (product_id) references t_product (product_id) on delete cascade on update no action
);