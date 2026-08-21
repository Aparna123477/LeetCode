# Write your MySQL query statement below
select r.contest_id ,ROUND(COUNT(u.user_id)*100.0/(select COUNT(*) from Users),2)as percentage
from Users u join Register r on u.user_id=r.user_id
group by contest_id
order by percentage desc , r.contest_id asc;