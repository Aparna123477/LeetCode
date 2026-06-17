# Write your MySQL query statement below
select e.name as Employee
from Employee  e
join Employee mgr on mgr.id=e.managerId
where e.salary>mgr.salary; 
