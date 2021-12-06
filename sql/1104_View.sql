--1104_VIEW

-- VIEW
-- 가상 테이블 : 물리적인 테이블의 select 의 결과를 테이블로 사용

-- create or replace view 뷰 이름
-- as 서브쿼리

-- 1. 복잡한 sql(select) 문을 간단히 사용하기 위해 사용
-- 2. 보안이 필요한 컬럼의 데이터를 보호하기 위해 사용

--자주 사용되는 30번 부서에 소속된 사원들의
-- 사번과 이름과 부서번호를 출력하기 위한
-- SELECT 문을 하나의 뷰로 정의해 봅시다.

select empno ,  ename, deptno from emp where deptno = 30;

--View 생성
create or replace view EMP_VIEW30
as select empno, ename, deptno from emp where deptno = 30;

-- 가상테이블 VIew 를 이용해서 질의
select * from emp_View30;

select * from user_views where view_name =  'EMP_VIEW30';
-- 사용자의 뷰를 모두 확인해보는 명령어

--view 삭제
drop view emp_view30;
---------------------------------------------
select * from emp order by hiredate ;
--rownum = 데이터 집어넣을 때 집어넣은 순서
select rownum, ename, hiredate from emp order by hiredate;
select rownum, ename, hiredate 
from (select * from emp order by hiredate)
where rownum <= 5
;
--rownum 은 작은 범위에서만 검색이 가능
--ex) rownum >= 5 하면 안나옴

--급여액 top3 찾기
select rownum, ename, sal, job 
from (select * from emp order by sal desc)
where rownum <= 3
;

--게시물의 리스트
--회원 리스트
-- 1page = 10 => 1~10
-- 2page = 10 => 11~20
--...
-- 이런 식으로 짤라서 데이터를 처리할 때 사용

--입사일 기준으로 정렬한 가상 테이블
create or replace view emp_hir
as
select * from emp order by hiredate
;
select rownum, ename, hiredate 
from emp_hir;

select rownum, ename, hiredate 
from emp_hir 
where rownum <= 5;
----------------------------------------------------