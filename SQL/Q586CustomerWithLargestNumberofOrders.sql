# Write your MySQL query statement below

select customer_number from Orders group by customer_number
having count(order_number) = (select count(order_number) as cnt from Orders group by customer_number
order by cnt desc limit 1) ;
