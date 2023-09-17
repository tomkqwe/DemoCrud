--liquibase formatted sql
--changeset tomkqwe:1
CREATE TABLE psy_user_entity (
        id bigint not null,
        email varchar(255),
        gender varchar(255) check (gender in ('MALE','FEMALE')),
        name varchar(255),
        phone_number varchar(255),
        surname varchar(255),
        user_name varchar(32) not null,
        user_password varchar(20),
        primary key (id)
    );
