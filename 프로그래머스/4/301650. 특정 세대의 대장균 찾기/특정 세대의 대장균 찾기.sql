-- 코드를 작성해주세요
WITH RECURSIVE tree AS (
    -- 1단계: 루트(1세대)
    SELECT
    ID, PARENT_ID, 1 AS LEVEL
    FROM ECOLI_DATA
    WHERE PARENT_ID IS NULL
    
    UNION ALL
    
    -- 2단계: 자식노드를 재귀적으로 조회(2세대~)
    SELECT
    C.ID, C.PARENT_ID, P.LEVEL + 1 AS LEVEL
    FROM ECOLI_DATA C
    JOIN tree P ON C.PARENT_ID = P.ID
)

SELECT ID 
FROM tree
WHERE LEVEL = 3
ORDER BY ID asc;