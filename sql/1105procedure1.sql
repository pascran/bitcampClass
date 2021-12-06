 -- 2021.11.05 procedure
 

 
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
 
 