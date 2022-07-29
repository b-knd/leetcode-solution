/*
@b-knd (jingru) on 29 July 2022 10:48:00
*/

/*Solution*/
With temp as 
(select stock_name, operation, SUM(price) as price from Stocks group by stock_name, operation)
select b.stock_name, (s.price - b.price) as capital_gain_loss from temp b, temp s 
where b.stock_name = s.stock_name AND
      b.operation = "Buy" AND
      s.operation = "Sell";
//Runtime: 418 ms, faster than 95.12% of MySQL online submissions for Capital Gain/Loss.
//Memory Usage: 0B, less than 100.00% of MySQL online submissions for Capital Gain/Loss. 
      
/*
Description:
Write an SQL query to report the Capital gain/loss for each stock.
The Capital gain/loss of a stock is the total gain or loss after buying and selling the stock one or many times.
Return the result table in any order.
The query result format is in the following example.



Example 1:

Input: 
Stocks table:
+---------------+-----------+---------------+--------+
| stock_name    | operation | operation_day | price  |
+---------------+-----------+---------------+--------+
| Leetcode      | Buy       | 1             | 1000   |
| Corona Masks  | Buy       | 2             | 10     |
| Leetcode      | Sell      | 5             | 9000   |
| Handbags      | Buy       | 17            | 30000  |
| Corona Masks  | Sell      | 3             | 1010   |
| Corona Masks  | Buy       | 4             | 1000   |
| Corona Masks  | Sell      | 5             | 500    |
| Corona Masks  | Buy       | 6             | 1000   |
| Handbags      | Sell      | 29            | 7000   |
| Corona Masks  | Sell      | 10            | 10000  |
+---------------+-----------+---------------+--------+
Output: 
+---------------+-------------------+
| stock_name    | capital_gain_loss |
+---------------+-------------------+
| Corona Masks  | 9500              |
| Leetcode      | 8000              |
| Handbags      | -23000            |
+---------------+-------------------+
*/
