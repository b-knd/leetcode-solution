# Write your MySQL query statement below
SELECT
    s.user_id,
    coalesce(round(
        sum(case when action = 'confirmed' then 1 else 0 end) / count(c.user_id),2), 0) as confirmation_rate
FROM 
    Signups as s
    LEFT JOIN
    Confirmations as c
    ON c.user_id = s.user_id
GROUP BY c.user_id;
