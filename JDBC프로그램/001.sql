create table person(
	name varchar(20),
    phone varchar(20),
    email varchar(20),
    primary key(phone)
);

-- 데이터 삽입 CRUD에서 C에 해당하는 
insert into person values('김선달','011-000-0000','kim@a.com');
insert into person(name, phone) values('김','011-111-0000');

-- 데이터 읽어들이기 R에 해당
select * from person;
-- 테이블에있는 데이터 수 조회 
select count(*) from person;


-- 데이터 업데이트 하기 U - 조건절이 없으므로전부 업데이트(위험)
update person set name = '봉이김선달';
-- Error Code: 1175. You are using safe update mode and you tried to update a table 
-- 	without a WHERE that uses a KEY column.  To disable safe mode
-- 		, toggle the option in Preferences -> SQL Editor and reconnect.	0.000 sec


-- 조건에 맞게 검색하기
select * from person
where phone = '011-111-0000'
;

-- 조건절과 함께 원하는 row의 데이터를 찾아서 값을 업데이트 한다
update person set name = '김선달'
where phone = '011-111-0000';

-- 이름이 김선달이 데이터의 비어있는 email컬럼의 값을 적당히 채우기
update person set email = 'kimabc@b.com'
where phone = '011-111-0000';

-- 봉이김선달의 데이터중에 이름과 email을 동시에 변경
update person set email = 'kimabc@aaa.com', name = '달선김'
where phone = '011-000-0000';

-- 데이블이 생성된후 데이블 구조를 변경해 보기 alter
-- alter : 컬럼속성변경, 컬럼추가, 컬럼 삭제
alter table person modify column name varchar(20) not null;
-- name 컬럼이 not null 로변경하고 디폴트 값도 없어서 아래 문장을 실행되지 않는다
insert into person(phone,email) values('011','aaa@a.com');
-- email 속성도 not null 로 변경
alter table person modify column email varchar(20) not null;



