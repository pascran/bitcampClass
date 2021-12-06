
--2021.11.05

-- 임시 테이블 생성
create table book_log(
    bookid_1 number,
    bookname_1 varchar2(40),
    publisher_1 varchar2(40),
    price_1 number
);

--트리거 
create or replace trigger afterInsertBook
after insert on book for each row 
declare 
    -- 변수 선언
    average number; 
begin
    insert into book_log
    values (:new.bookid, :new.bookname, :new.publisher, :new.price
    );
    dbms_output.put_line('book_log 테이블에 백업');
end
;
-----------------------------------------------------
--트리거 실행 테스트
insert into book values(20, '스포츠과학2' , '이상미디어', 60000);

select * from book;
