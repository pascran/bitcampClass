--2021.11.02

--중첩 질의
--평균 급여보다 더 많은 급여를 받는 사원을 검색하는 문장
--평균급여 구해보기
select avg(sal)
from emp;

--2073.214285714285714285714285714285714286
select ename, sal
from emp
where sal>2073.214285714285714285714285714285714286
;

--중첩질의를 사용한다면??
select ename, sal
from emp
where sal>(select avg(sal) from emp)
;

--평균 주문금액 이하의 주문에 대해서 주문번호 , 금액 출력
--평균 주문금액
select avg(saleprice) from orders;

select orderid, saleprice
from orders
where saleprice <= (select avg(saleprice) from orders)
;

--각 고객의 평균 주문금액보다 큰 금액의 주문내역에 대해서 주문번호, 고객번호, 금액
-- 각 고객의 평균 주문금액
select avg(saleprice) from orders
where custid = 1;
--1번 고객의 평균 주문금액보다 큰 가격의 책 출력
select custid, orderid, saleprice
from orders O
where saleprice > (select avg(saleprice) from orders OA where OA.custid = O.custid)
;

--다중행 서브 쿼리
-- IN , SOME, ANY ,  ALL, EXISTS

-- 3000 이상 받는 사원이 소속된 부서와 동일한 부서에서 근무하는 사원 출력

select * from emp where deptno = 10 or deptno = 20 ;

select * 
from emp 
where deptno in (
select distinct(deptno) from emp
where sal >= 3000);

--대한민국에 거주하는 고객에게 판매한 도서의 총 판매액을 구하시오
--대한민국에 거주하는 고객
select custid from customer where address like '%대한민국%'
;
--도서의 총 판매액
select sum(saleprice) 
from orders
--where custid in(2,3,5)
where custid in(select custid from customer where address like '%대한민국%')
;

--3 번 고객이 주문한 도서의 최고 금액보다 더 비싼 도서를 구입한 주문의 주문번호와 금액
--3번 고객의 주문 도서의 금액들
select saleprice from orders where custid = 3;
--더 비싼 도서를 구입한 주문의 주문번호와 금액을 보이시오
select saleprice 
from orders
;
-- 6000 
-- 12000
-- 13000

select orderid, saleprice
from orders
where saleprice > all(
select saleprice from orders where custid = 3
);
--부서번호가 30번인 사원들의 급여 중 가장 작은 값(950) 보다 많은 급여를 받는 사원의 이름,
--급여를 출력
select ename, sal
from emp
where sal > any(select sal from emp where deptno = 30)
;
-- 30번 부서 직원 중 '아무나'(최소값) 보다 급여가 높은 사원 찾기

--30번 소속 사원들 중에서 급여를 가장 많이 받는 사원보다 더 많은 급여를 받는 사원 이름, 급여
select ename, sal
from emp
where sal > all(select sal from emp where deptno = 30);
-- 30번 부서 ' 모두 '(최대값) 를 포함해 이들의 sal 이상을 찾는 것

--exists 연산자

select * from customer where address like '%대한민국%';

select sum(saleprice)
from orders o 
where exists (
select * from customer c where address like '%대한민국%' and c.custid = o.custid
)
;