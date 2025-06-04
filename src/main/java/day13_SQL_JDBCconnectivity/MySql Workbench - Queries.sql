insert into Empl(empno, ename, job, mgr, hiredate, sal, comm, deptno) values (8521, 'SETH', 'SALESMAN', 8698, '1991-02-22', '1250.00', '500.00', 30), (8566, 'MAHADEVAN', 'MANAGER', 8839, '1991-04-02', '2985.00', null, 20), (8654, 'MOMIN', 'SALESMAN', 8698, '1991-09-28', '1250.00', '1400.00', 30), (8698, 'BINA', 'MANAGER', 8839, '1991-05-01', '2850.00', null, 30), (8882, 'SHIVANSH', 'MANAGER', 8839, '1991-06-09', '2450.00', null, 10), (8888, 'SCOTT', 'ANALYST', 8566, '1992-12-09', '3000.00', null, 20), (8839, 'AMIR', 'PRESIDENT', null, '1991-11-18', '5000.00', null, 10), (8844, 'KULDEEP', 'SALESMAN', 8698, '1991-09-08', '1500.00', 0.00, 30)
use Employee;
insert into Empl(empno, ename, job, mgr, hiredate, sal, comm, deptno) values (8521, 'SETH', 'SALESMAN', 8698, '1991-02-22', '1250.00', '500.00', 30), (8566, 'MAHADEVAN', 'MANAGER', 8839, '1991-04-02', '2985.00', null, 20), (8654, 'MOMIN', 'SALESMAN', 8698, '1991-09-28', '1250.00', '140.00', 30), (8698, 'BINA', 'MANAGER', 8839, '1991-05-01', '2850.00', null, 30), (8882, 'SHIVANSH', 'MANAGER', 8839, '1991-06-09', '2450.00', null, 10), (8888, 'SCOTT', 'ANALYST', 8566, '1992-12-09', '3000.00', null, 20), (8839, 'AMIR', 'PRESIDENT', null, '1991-11-18', '5000.00', null, 10), (8844, 'KULDEEP', 'SALESMAN', 8698, '1991-09-08', '1500.00', 0.00, 30);
select * from empl;
alter table empl modify column comm decimal(6,2);
update empl set comm='1400.00' where comm='140.00';
select ename,sal from empl where sal >= '2200.00';
select empno, ename, job, mgr, hiredate, sal, deptno from empl where comm=null;
select * from empl where comm=null;

select * from empl where sal NOT between '2500.00' AND '4000.00';

select ename from empl where ename LIKE '__A%';
select ename from empl where ename LIKE '%T';