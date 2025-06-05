# Write your MySQL query statement below
update  Salary 
set sex = CaSe 
when sex='f'then 'm'
when sex='m'then 'f'
else sex
end;