create table if not exists book(
book_id int not null auto_increment,
title varchar(100),
price int,
create_dt datetime default now(),
primary key(book_id)
);

alter table book add column category varchar(20);

insert into book(title,price,create_dt) 
values('스프링 부트 배우기', 33000,now() );

select * from book where book_id = 1;

