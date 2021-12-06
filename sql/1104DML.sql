--2021.11.04

-- DML : 데이터의 변경 - > 데이터 삽입
drop table emp01;
create table emp01
as
select * from emp
;
select * from emp01;
--update 테이블이름 set 컬럼이름 = 값 , 컬럼이름 = 값, .... where 행 선택 조건
-- 1. 모든 사원의 부서번호를 30번으로 수정
update emp01 
set deptno = 30;

-- 2. 모든 사원의 급여를 10% 인상
update emp01
set sal = sal * 1.1;

-- 3. 모든 사원의 입사일을 오늘로 수정
update emp01
set hiredate = sysdate
;
------------------------------------------------------------

-- 1.  부서번호가 10번인 사원의 부서번호를 30번으로 수정하기
update emp01
set deptno = 30
where deptno = 10;

-- 2. 급여가 3000이상인 사원만 급여를 10% 인상하기
update emp01
set sal = sal * 1.1
where sal >= 3000
;

--3. 1987 년에 입사한 사원의 입사일을 오늘로. 수정

update emp01
set hiredate = sysdate
where substr(hiredate, 1, 2) = '87'
;
select*from emp01 where substr(hiredate, 1, 2) = '87';

-----------------------------------------------------------
-- 두 개 이상의 컬럼을 변경할 때는 컴머를 쓰고 바꾸고자 하는 컬럼을 추가

--1.SCOTT 사원의 부서번호는 40, 직급은 MANAGER로
-- 한꺼번에 수정
update emp01
set deptno = 40, job = 'MANAGER'
where ename = 'SCOTT'
;
select * from emp01 where ename = 'SCOTT';


--2. SCOTT 사원의 입사일자는 오늘로, 급여를 50으로 커미션은 4000으로 바꾸기
update emp01
set hiredate = sysdate, sal = 50, comm=4000
where ename = 'SCOTT'
;

-------------------------------------------------------
--20번 부서의 지역명을 40번 부서의 지역명으로 변경하기
drop table dept01;

create table dept01
as
select * from dept;

update dept01
set loc = (select loc from dept01 where deptno = 20 ) 
where deptno =40;

select * from dept01
;

--서브쿼리를 이용해서 부서번호가 20인 부서의 부서명과 지역명을 부서번호가 40인 부서와
-- 동일하게 변경하자
update dept01
set (dname, loc)  = (select dname, loc from dept01 where deptno = 40)
where deptno = 20;

-------------------------------------------------------------------
--테이블에 불필요한 행을 삭제하기 위한 DELETE
-- DELETE from 테이블 where 조건;
delete from dept01;
delete from emp01;
select * from emp01;
select * from dept01;

rollback; -- > 마지막 커밋된 위치로 이동,
--마지막 커밋 후 작업된 DML은 사라진다. = DB에 반영이 되지 않는다.
-- 특정 

-- 30번 부서만 삭제하기
delete from dept01 where deptno = 30;
select * from dept01;
commit;

--사원 테이블에서 부서명이 SALES 인 사원을 모두 삭제해보자
delete from emp01
where deptno = (select deptno from dept where dname = 'SALES');

select*from emp01;