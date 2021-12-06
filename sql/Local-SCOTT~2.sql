--   로그인한 사용자가 보유하고 있는 테이블 정보를 가지고 있는 메타데이터 테이블
select * from tab;

-- 테이블의 구조 확인
DESC dept;

select * from emp;
select * from dept;
select loc, deptno, dname from dept;
select * from book;
select * from customer;
select * from orders;
select orderid, custid, saleprice from orders;

-- select 구문에서 컬럼의 산술연산이 가능
select sal, sal + 100, sal-100, sal*12
from emp;

select * from emp;

-- 회사의 사원들의 이름과 월 급여, 연봉을 리스트로 출력
select ename, sal, sal*12
from emp;
SELECT comm from emp;
-- 연봉에 +comm, 주의! comm 의 값 중에는 null
-- null: 정해지지 않은 값 = 있는것도 아니고 없는것도 아니다! 연산의 결과 -> null
select ename, sal, sal * 12, sal * 12+comm
from emp;
--null 값을 치환해주는 nvl 함수
-- nvl(컬럼명, 치환할 데이터)-> 컬럼의 값 중 null 값의 치환 값으로
select comm, nvl(comm, 0)
from emp;
-- nvl 을 넣고 결과값 출력
select ename, sal, sal * 12, comm, sal * 12+comm, 
    comm, nvl(comm, 0), sal * 12+nvl(comm, 0)
from emp;

-- 별칭을 이용해서 컬럼이름 사용
select ename as "사원이름", sal as "월급여", sal * 12+nvl(comm, 0) as "연봉"
from emp;

select ename name, sal sal, sal * 12+nvl(comm, 0)salofyear
from emp;

--문자열을 연결해주는 || 연산자
select ename || ' is a ' || job msg
from emp;
-- 중복 데이터를 제거하는 distinct  
select distinct deptno, job
from emp;
-- 우리 서점에 입점한 출판사 리스트 
select distinct publisher
from book;

-----------------------------------------------
select * --출력하고자 하는 컬럼 
from emp -- 대상 테이블
where sal >= 3000 --조건: 비교연산 또는 논리연산 => 행을 찾을 조건
;

-- 10번 부서에 소속된 -> 행을 검색할 조건
--사원의 리스트 출력
select *
from emp
where deptno=10
;

-- 이름이 FORD 인 사원의: 행
-- 사원번호 (EMPNO) 와 사원이름 (ENAME) 과 급여 (SAL) 을 출력: 컬럼

select empno, ename, sal
from emp
where ename = 'FORD' -- 문자열 비교시 반드시 작은따옴표 사용 
;

--날짜 비교: 82년 이후 입사자
select *
from emp
where HIREDATE >='82/01/01'
;

--10번 부서 소속 +직급 MANAGER 검색
-- 사원명, 부서번호 , 직금 출력 
select ename, deptno, job
from emp
where deptno = 10 and job ='MANAGER'
;
--10번 부서 소속 사원이거나  +직급 MANAGER 검색
-- 사원명, 부서번호 , 직금 출력 
select ename, deptno, job
from emp
where deptno = 10 or job ='MANAGER'
;
--10번 부서 소속이 아닌 사원검색
-- 사원명, 부서번호 , 직금 출력 
select ename, deptno, job
from emp
where not deptno= 10
--where deptno<>10
--where deptno != 10 셋다 가능
;

--2000`3000 사이 급여를 받는 직원
select *
from emp
--where sal >= 2000 and sal <= 3000
where  sal between 2000 and 3000
;

-- 커미션이 300 이거나 500 이거나 1400 인 사원을 검색 IN   연산자

select *
from emp
--where comm = 300 or comm = 500 or comm = 1400
where comm in (300, 500, 1400)
;

--like 패턴 검색
--F 로 시작하는 이름을 가진 사원을 검색
select *
from emp
where ename like 'F%'
;

--문자열 A 를 포함하는 이름을 가진 사원을 검색
select *
from emp
--where ename like '%A%'
--이름에 A 가 안 들어가는 사원 검색
where ename not like '%A%'
;

--이름이 N 으로 끝나는 사원을 검색
select *
from emp
where ename like '%N'
;

--이름의 두번째 문자열이 A 인 사원 찾기 (와일드카드 _ 사용해보기)
select *
from emp 
where ename like '_A%'
;

-- null 같은 경우는 연산자로(부등호 등) 대응 불가능하므로
-- is null 연산자를 사용해야 함
select *
from emp
where comm is null
-- where comm is not null
--where comm != 0
;
--정렬을 위한 order by 절
--order by 컬럼명{[asc] | desc} , asc(오름차순), desc(내림차순)
--급여 기준 오름차순/내림차순 정렬
select *
from emp
--order by sal asc
--order by sal == 기본 정렬: asc
order by sal desc
;
--사원 이름 정렬
 select *
 from emp
 order by ename
 ;
 --입사일 기준 정렬
 select *
 from emp
 order by hiredate, sal
 ;
 
