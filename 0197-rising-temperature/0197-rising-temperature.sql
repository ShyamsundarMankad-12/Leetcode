/* Write your T-SQL query statement below */
-- CORRELATD SUBQUERY 
SELECT ID FROM WEATHER AS W1 
WHERE TEMPERATURE > (SELECT TEMPERATURE FROM WEATHER AS W2 WHERE W2.recordDate = DATEADD(day, -1, W1.recordDate))

-- FROM JOINS 

-- SELECT W1.id
-- FROM Weather W1
-- JOIN Weather W2
-- ON W1.recordDate = DATEADD(day, 1, W2.recordDate)
-- WHERE W1.temperature > W2.temperature;