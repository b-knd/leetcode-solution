/*
596. Classes More Than 5 Students

Description:
Write an SQL query to report all the classes that have at least five students.

Return the result table in any order.

The query result format is in the following example.

 

Example 1:

Input: 
Courses table:
+---------+----------+
| student | class    |
+---------+----------+
| A       | Math     |
| B       | English  |
| C       | Math     |
| D       | Biology  |
| E       | Math     |
| F       | Computer |
| G       | Math     |
| H       | Math     |
| I       | Math     |
+---------+----------+
Output: 
+---------+
| class   |
+---------+
| Math    |
+---------+
Explanation: 
- Math has 6 students, so we include it.
- English has 1 student, so we do not include it.
- Biology has 1 student, so we do not include it.
- Computer has 1 student, so we do not include it.
*/

/* Solution */
select class from Courses group by class having count(*) >= 5;
