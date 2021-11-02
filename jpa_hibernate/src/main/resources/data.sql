insert into course_details(id, username, created_Date, last_Updated_Date) values(10001, 'jpa demo', sysdate(), sysdate());
insert into course_details(id, username, created_Date, last_Updated_Date) values(10002, 'h2 demo', sysdate(), sysdate());
insert into course_details(id, username, created_Date, last_Updated_Date) values(10003, 'spring demo', sysdate(), sysdate());

insert into passport(id,number) values(30001,'S23456');
insert into passport(id,number) values(30002,'S12345');
insert into passport(id,number) values(30003,'S01234');

insert into student(id,name,passport_id) values(20001,'Kohli',30001);
insert into student(id,name,passport_id) values(20002,'Dhoni',30002);
insert into student(id,name,passport_id) values(20003,'Rohit',30003);

insert into review(id,rating,description) values(40001,'4','Great');
insert into review(id,rating,description) values(40002,'5','Awesome');
insert into review(id,rating,description) values(40003,'4','Worth');

