create table city
(
    id      bigserial PRIMARY KEY not null,
    name    VARCHAR(512),
    state   VARCHAR(512),
    country VARCHAR(512),
    coord   VARCHAR(512)
);