# Write your MySQL query statement below
WITH CTE_COUNT AS
    (SELECT COUNT(1) AS total FROM Users)
SELECT
    contest_id,
    round((count(user_id)/total)* 100, 2) AS percentage
FROM
    Register, CTE_COUNT
GROUP BY contest_id
ORDER BY percentage DESC, contest_id;
