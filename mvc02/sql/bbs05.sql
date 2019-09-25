drop table bbs05;
drop sequence bbs05_seq;

create table bbs05(
	num number primary key,
	sub varchar2(30),
	content varchar2(2000),
	name varchar2(15),
	nalja date
);

create sequence bbs05_seq;

--dummy
insert into bbs05 values (bbs05_seq.nextval, 'sub1', 'content1', 'user01', sysdate);
insert into bbs05 values (bbs05_seq.nextval, 'sub2', 'content2', 'user02', sysdate);
insert into bbs05 values (bbs05_seq.nextval, 'sub3', 'content3', 'user03', sysdate);
insert into bbs05 values (bbs05_seq.nextval, 'sub4', 'content4', 'user04', sysdate);
insert into bbs05 values (bbs05_seq.nextval, 'sub5', 'content5', 'user05', sysdate);
commit;
select * from bbs05;