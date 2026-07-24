/* Write your T-SQL query statement below */
SELECT MACHINE_ID,
       ROUND(
           (
               (SELECT SUM(TIMESTAMP)
                FROM ACTIVITY A2
                WHERE A2.ACTIVITY_TYPE = 'END'
                  AND A2.MACHINE_ID = A1.MACHINE_ID)
               -
               (SELECT SUM(TIMESTAMP)
                FROM ACTIVITY A2
                WHERE A2.ACTIVITY_TYPE = 'START'
                  AND A2.MACHINE_ID = A1.MACHINE_ID)
           ) / COUNT(DISTINCT PROCESS_ID),
           3
       ) AS processing_time
FROM ACTIVITY A1
GROUP BY MACHINE_ID;