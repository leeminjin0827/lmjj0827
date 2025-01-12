# DB 구성
drop database if exists studentservice; # 같은 DB명 존재시 삭제
create database studentservice; # DB 생성
use studentservice; # DB 활성화

# 테이블 생성
create table student(
	sno int unsigned auto_increment ,
    sname varchar(8) not null ,
    kscore int not null ,
    escore int not null ,
    mscore int not null ,
    constraint primary key( sno )
);

# 테이블 샘플
insert into student ( sname , kscore , escore , mscore ) values ( '이민진' , '10' , '20' , '30' );
insert into student ( sname , kscore , escore , mscore ) values ( '메시' , '100' , '100' , '100' );
insert into student ( sname , kscore , escore , mscore ) values ( '호날두' , '100' , '100' , '100' );
insert into student ( sname , kscore , escore , mscore ) values ( '그리즈만' , '100' , '100' , '100' );
insert into student ( sname , kscore , escore , mscore ) values ( '안토니' , '0' , '0' , '0' );
