--2021.11.02

--��ø ����
--��� �޿����� �� ���� �޿��� �޴� ����� �˻��ϴ� ����
--��ձ޿� ���غ���
select avg(sal)
from emp;

--2073.214285714285714285714285714285714286
select ename, sal
from emp
where sal>2073.214285714285714285714285714285714286
;

--��ø���Ǹ� ����Ѵٸ�??
select ename, sal
from emp
where sal>(select avg(sal) from emp)
;

--��� �ֹ��ݾ� ������ �ֹ��� ���ؼ� �ֹ���ȣ , �ݾ� ���
--��� �ֹ��ݾ�
select avg(saleprice) from orders;

select orderid, saleprice
from orders
where saleprice <= (select avg(saleprice) from orders)
;

--�� ���� ��� �ֹ��ݾ׺��� ū �ݾ��� �ֹ������� ���ؼ� �ֹ���ȣ, ����ȣ, �ݾ�
-- �� ���� ��� �ֹ��ݾ�
select avg(saleprice) from orders
where custid = 1;
--1�� ���� ��� �ֹ��ݾ׺��� ū ������ å ���
select custid, orderid, saleprice
from orders O
where saleprice > (select avg(saleprice) from orders OA where OA.custid = O.custid)
;

--������ ���� ����
-- IN , SOME, ANY ,  ALL, EXISTS

-- 3000 �̻� �޴� ����� �Ҽӵ� �μ��� ������ �μ����� �ٹ��ϴ� ��� ���

select * from emp where deptno = 10 or deptno = 20 ;

select * 
from emp 
where deptno in (
select distinct(deptno) from emp
where sal >= 3000);

--���ѹα��� �����ϴ� ������ �Ǹ��� ������ �� �Ǹž��� ���Ͻÿ�
--���ѹα��� �����ϴ� ��
select custid from customer where address like '%���ѹα�%'
;
--������ �� �Ǹž�
select sum(saleprice) 
from orders
--where custid in(2,3,5)
where custid in(select custid from customer where address like '%���ѹα�%')
;

--3 �� ���� �ֹ��� ������ �ְ� �ݾ׺��� �� ��� ������ ������ �ֹ��� �ֹ���ȣ�� �ݾ�
--3�� ���� �ֹ� ������ �ݾ׵�
select saleprice from orders where custid = 3;
--�� ��� ������ ������ �ֹ��� �ֹ���ȣ�� �ݾ��� ���̽ÿ�
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
--�μ���ȣ�� 30���� ������� �޿� �� ���� ���� ��(950) ���� ���� �޿��� �޴� ����� �̸�,
--�޿��� ���
select ename, sal
from emp
where sal > any(select sal from emp where deptno = 30)
;
-- 30�� �μ� ���� �� '�ƹ���'(�ּҰ�) ���� �޿��� ���� ��� ã��

--30�� �Ҽ� ����� �߿��� �޿��� ���� ���� �޴� ������� �� ���� �޿��� �޴� ��� �̸�, �޿�
select ename, sal
from emp
where sal > all(select sal from emp where deptno = 30);
-- 30�� �μ� ' ��� '(�ִ밪) �� ������ �̵��� sal �̻��� ã�� ��

--exists ������

select * from customer where address like '%���ѹα�%';

select sum(saleprice)
from orders o 
where exists (
select * from customer c where address like '%���ѹα�%' and c.custid = o.custid
)
;