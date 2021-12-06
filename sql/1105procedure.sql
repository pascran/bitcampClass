 -- 2021.11.05 procedure
 
 -- 데이터를 받아서 데이터 변경처리를 프로그램 요소를 이용해서 실행
 
 -- create or replace 프로시저 이름  (매개변수) 
 -- as          -- 선언부
 -- begin       --프로그램 코드 시작
 -- ........
 -- end
 -- ;
 
 desc book;
 -- Book 테이블에 한개의 투플을 삽입하는 프로시저
 create or replace procedure InsertBook(
 myBookId in number,
 myBookName in varchar2,
 myPublisher in varchar2,
 myPrice in number
 )
 as
 begin  -- 코드 실행 시작
        -- 핵심처리 코드
        -- 매개변수로 받은 데이터를 이용해서 데이터 삽입
        insert into book(bookid, bookname, publisher, price)
        values (myBookId, myBookName, myPublisher, myPrice);
 end    --코드 실행 종료
 ;
 
 -- 프로시저 호출 : 실행 요청
 
 --exec 프로시저이름 (매개변수 값 ,........);
 
exec insertbook(13, '스포츠과학' , '마당과학서적', 25000);
select * from book;
 
 --같은 이름의 책을 등록해보고, 다른 이름의 책을 입력
 --같은 이름의 책 등록
 exec bookinsertorupdate(15, '스포츠과학', '마당과학서적1', 10000);
 
 -------------------------------------------------------------
 
 set serveroutput on;
declare
    avgVal number;
begin
    -- 프로시저 호출 (프로시저는 외부에서도 사용 가능)
    avgPrice(avgVal);
    dbms_output.put_line('책값 평균: '|| avgVal);  
end
;