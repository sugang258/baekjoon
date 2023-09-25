-- 코드를 입력하세요
(SELECT DATE_FORMAT(A.SALES_DATE, '%Y-%m-%d') AS SALES_DATE, A.PRODUCT_ID, A.USER_ID, A.SALES_AMOUNT
FROM ONLINE_SALE AS A
WHERE SALES_DATE LIKE '2022-03%'
UNION
SELECT DATE_FORMAT(B.SALES_DATE, '%Y-%m-%d') AS SALES_DATE, B.PRODUCT_ID, NULL AS USER_ID, B.SALES_AMOUNT
FROM OFFLINE_SALE AS B
WHERE SALES_DATE LIKE '2022-03%')
ORDER BY SALES_DATE ASC, PRODUCT_ID ASC, USER_ID ASC;

