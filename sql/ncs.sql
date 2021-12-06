--1.DDL 작성
drop table contact;
create table Contact (
    idx number(20),
    name varchar2(20) not null,
    phonenum varchar2(20)not null,
    address varchar2(50)default '한국' not null ,
    email varchar2(50)default 'N' not null,
    category varchar2(20),
    
    
    major varchar2(10),
    grade number,
    
    work varchar(20),
    dept varchar(20),
    job varchar(20),
    
    wgroup varchar(20),
    nickname varchar(20),
    
    
    
    constraint pk_contact primary key (idx),
    constraint category_check check (category in ('univ' , 'com' , 'cafe'))
    );
    
--2.
insert into Contact
values(1, '장현우', '01000000000', '서울', '123@naver', 'univ', 'video', 4, '없음',
'없음', '없음', '동창', 'jack');

--3. 
