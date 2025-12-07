-- 2022년 한해 평가 점수(상반기+하반기)가 가장 높은 사원의 정보 조회

WITH view AS (
    -- 2022년 한해 평가 점수가 가장 높은 사원의 점수, 사번 집계
    SELECT 
        SUM(SCORE) AS SCORE,
        EMP_NO
    FROM HR_GRADE
    GROUP BY EMP_NO
    ORDER BY SUM(SCORE) DESC
    LIMIT 1
)

-- 2022년 평가 점수가 가장 높은 사원의 정보 조회
SELECT 
    V.SCORE,
    V.EMP_NO,
    E.EMP_NAME,
    E.POSITION,
    E.EMAIL
FROM view V
JOIN HR_EMPLOYEES E
ON V.EMP_NO = E.EMP_NO
