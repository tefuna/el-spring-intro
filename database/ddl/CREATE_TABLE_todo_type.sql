CREATE TABLE todo_type (
   todo_type_id VARCHAR(2),
   type_name VARCHAR(20) NOT NULL,
   comment VARCHAR(50),
   constraint todo_type_pk primary key(todo_type_id)
);