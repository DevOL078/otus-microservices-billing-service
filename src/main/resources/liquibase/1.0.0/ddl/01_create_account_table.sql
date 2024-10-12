create table if not exists accounts
(
    id          uuid           not null primary key,
    user_id     uuid           not null,
    create_date timestamp      not null default now(),
    edit_date   timestamp      not null default now(),
    amount      numeric(19, 2) not null
);