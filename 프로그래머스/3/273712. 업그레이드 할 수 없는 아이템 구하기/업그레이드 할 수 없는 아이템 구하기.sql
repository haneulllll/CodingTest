-- 코드를 작성해주세요
-- 업그레이드 불가 = parent_id = item_id가 아닌 것 -> 자식이 없는 부모
SELECT V.ITEM_ID, ITEM_NAME, RARITY
FROM (SELECT P.ITEM_ID
      FROM ITEM_TREE P
      LEFT JOIN ITEM_TREE C ON P.ITEM_ID = C.PARENT_ITEM_ID
      GROUP BY P.ITEM_ID
      HAVING COUNT(C.ITEM_ID) = 0) V
JOIN ITEM_INFO I ON I.ITEM_ID = V.ITEM_ID
ORDER BY ITEM_ID desc;