# Write your MySQL query statement below
select employee_id, sum(if(mod(employee_id, 2)=0 or substring(name, 1, 1)='M', 0, salary)) as bonus from Employees
group by employee_id
order by employee_id asc;
