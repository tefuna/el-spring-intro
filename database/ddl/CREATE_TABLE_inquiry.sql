CREATE TABLE inquiry(
   id serial NOT NULL ,
   name VARCHAR(100) NOT NULL,
   email VARCHAR(100) NOT NULL,
   contents VARCHAR(500) NOT NULL,
   created TIMESTAMP WITH TIME ZONE NOT NULL,
   constraint inquiry_pk primary key(id)
);