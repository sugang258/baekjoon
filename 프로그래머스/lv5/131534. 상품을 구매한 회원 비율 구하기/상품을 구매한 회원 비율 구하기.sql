-- 코드를 입력하세요
SELECT YEAR(B.SALES_DATE) AS YEAR, MONTH(B.SALES_DATE) AS MONTH, 
       COUNT(DISTINCT A.USER_ID) AS PUCHASED_USERS, 
       ROUND(
       COUNT(DISTINCT A.USER_ID)
        /
        (SELECT COUNT(*) FROM USER_INFO WHERE YEAR(JOINED) = '2021'),1)
           AS PUCHASED_RATIO
FROM USER_INFO AS A
JOIN ONLINE_SALE AS B
ON A.USER_ID = B.USER_ID
WHERE YEAR(A.JOINED) = '2021'

GROUP BY YEAR, MONTH
ORDER BY YEAR ASC, MONTH ASC
;