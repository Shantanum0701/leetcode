# Write your MySQL query statement below
select e.name
from employee e
inner join employee ee
on e.id = ee.managerId
group by ee.managerid
having count(ee.managerId) >= 5