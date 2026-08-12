/* Write your T-SQL query statement below */
SELECT 
    U.NAME , 
    ISNULL(SUM(R.DISTANCE) , 0) AS travelled_distance 
FROM USERS U 
    LEFT JOIN RIDES R 
    ON U.ID = R.USER_ID
GROUP BY U.ID , U.NAME
ORDER BY travelled_distance DESC , NAME ASC