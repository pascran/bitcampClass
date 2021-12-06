--basic
select * from phoneinfo_basic;
--insert
insert into phoneinfo_basic (idx, 
    fr_name, 
    fr_phonenumber, 
    fr_email, 
    fr_address,
    fr_regdate)
    values(1, '장현우', 01011112222, 'jack@naver.com', 'upenn', sysdate)
;
--update
update phoneinfo_basic
set fr_address = 'seoul'
where fr_name = '장현우'
;
--delete 
delete from phoneinfo_basic
where fr_name = '장현우'
;

--phoneinfo_univ
select * from phoneinfo_univ;
--insert
insert into phoneinfo_univ(idx,
fr_u_major,
fr_u_year,
fr_ref)
values (1, '유아복지', 4, 1)
;
--update
update phoneinfo_univ
set fr_u_major = '공무원'
where idx = 1
;
--delete
delete from phoneinfo_univ 
where idx = 1
;

--phoneinfo_com

select * from phoneinfo_com;
--insert
insert into phoneinfo_com(
idx, 
fr_c_company, 
fr_ref)
values (1, 'NC' , 1);
--update
update phoneinfo_com
set fr_c_company = '백수'
where fr_c_company = 'NC'
;
--delete
delete from phoneinfo_com where idx = 1;