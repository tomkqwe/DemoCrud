--liquibase formatted sql
--changeset tomkqwe:2
INSERT INTO psy_user_entity(id,email,gender,name,phone_number,surname,user_name,user_password)
VALUES(1,
    'somelogin@somerealm.su',
    'MALE',
    'TEST',
    '123456789',
    'TESTOV',
    'loginTest',
    '123456789');
