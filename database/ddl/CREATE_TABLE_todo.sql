CREATE TABLE todo (
   id serial NOT NULL,
   user_id int NOT NULL,
   todo_type_id VARCHAR(2) NOT NULL,
   title VARCHAR(50) NOT NULL,
   detail VARCHAR(2000) NOT NULL,
   deadline TIMESTAMP WITH TIME ZONE,
   constraint todo_pk primary key(id)
);