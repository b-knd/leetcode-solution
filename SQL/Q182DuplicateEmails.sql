/*
182. Duplicate Emails

Description: 
Write an SQL query to report all the duplicate emails.

Return the result table in any order.

The query result format is in the following example.

 

Example 1:

Input: 
Person table:
+----+---------+
| id | email   |
+----+---------+
| 1  | a@b.com |
| 2  | c@d.com |
| 3  | a@b.com |
+----+---------+
Output: 
+---------+
| Email   |
+---------+
| a@b.com |
+---------+
Explanation: a@b.com is repeated two times.
*/

/* Solution */
select email as Email from Person group by email having count(*) > 1;

/* Alternative using "WITH" */
WITH duplicates as
(select email, count(*) as count from Person group by email)
select email from duplicates where count > 1;
