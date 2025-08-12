# Write your MySQL query statement below
select e.name from Employee e where (select count(*) from Employee p where p.managerId=e.id  ) >=5