truncate table todo_type;
insert into todo_type values('01', '緊急', '最優先で取り組むべき');
insert into todo_type values('02', '重要', '期限に間に合わせるべき');
insert into todo_type values('03', 'できれば', '今度やってみたい');
commit;