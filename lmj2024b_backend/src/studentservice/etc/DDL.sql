use studentservice;
# 점수등록	insert into 테이블명( 속성명 , 속성명 ) values( 속성값 , 속성값 );
insert into student( sname , kscore , escore , mscore ) values( '값' , 0 , 0 , 0 );

# 점수조회
select * from student;

# 점수수정
update student set sname = 'sname' , kscore = 0 , escore = 0 , mscore = 0 where sno = 2;

# 점수수정 조회
select * from student where sno = 12;

# 점수 삭제
delete from student where sno = 1;re , escore , mscore ) values( '값' , '값' , '값' , '값' );