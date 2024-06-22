# Write your MySQL query statement below
SELECT ROUND(SUM(tiv_2016), 2) AS tiv_2016 FROM Insurance WHERE 
tiv_2015 IN
(SELECT tiv_2015 FROM (
    SELECT tiv_2015, COUNT(*) AS cnt
    FROM Insurance
    GROUP BY tiv_2015
) AS counts
WHERE cnt > 1)
AND (lat, lon) IN
(SELECT lat, lon
FROM (
    SELECT lat, lon, COUNT(*) AS cnt
    FROM Insurance
    GROUP BY lat, lon
) AS counts
WHERE cnt = 1);
