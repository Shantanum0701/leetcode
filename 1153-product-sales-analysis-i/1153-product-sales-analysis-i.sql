# Write your MySQL query statement below
select s.year,s.price,p.product_name 
from Sales as s , Product as p
where s.product_id=p.product_id;

