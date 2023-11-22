CREATE TABLE member(
   id serial NOT NULL,
   name VARCHAR(100) NOT NULL,
   email VARCHAR(100) NOT NULL,
   constraint member_pk primary key(id)
);