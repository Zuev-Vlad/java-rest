--liquibase formatted sql
--liquibase --changelog-file=09_07_2022_01_create_user_table.sql generate-changelog
CREATE TABLE user_data
(
    id       int(9) PRIMARY KEY,
    name     varchar(25) NOT NULL,
    password varchar(15) NOT NULL
);