 -- 2021.11.05 procedure
 

 
 desc book;
-- 동일한 도서가 있는지 점건한 후 삽입하는 프로시저( BookInsertOrUpdate)
 
 create or replace procedure BookInsertOrUdate(
    --매개변수
    myBookId number,
    myBookName varchar2,
    myPublisher varchar2,
    myPrice number
    )
as
 -- 변수 선언
    mycount number;
begin
 -- 입력받은 책이름으로 같은 이름의 책을 보유하는지 여부 확인 숫자
    select count(*) into mycount from book where bookname like myBookName;
    -- 책의 갯수로 분기 : 수정 또는 입력
    if mycount != 0 then
        -- 가격 수정
        update book set price = myPrice where bookname like myBookName;
    else 
        --  데이터(행) 입력
        insert into book values (myBookId, myBookName, myPublisher, myPrice);
    end if;
end;