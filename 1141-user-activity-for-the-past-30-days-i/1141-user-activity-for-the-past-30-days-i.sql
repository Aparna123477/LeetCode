# Write your MySQL query statement below
select activity_date as day ,
count(distinct user_id) as active_users
from Activity
where activity_date between cast('2019-06-28' as date) and cast('2019-07-27' as date)
group by activity_date;