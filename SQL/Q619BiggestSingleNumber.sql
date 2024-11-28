# Write your MySQL query statement below
WITH CTE AS 
(
    SELECT * FROM MyNumbers GROUP BY num HAVING COUNT(num) = 1
)
SELECT MAX(num) AS num from CTE;
