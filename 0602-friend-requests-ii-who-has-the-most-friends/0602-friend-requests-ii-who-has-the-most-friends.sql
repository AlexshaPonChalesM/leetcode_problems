SELECT id,
      (SUM(count))AS num
FROM (
    SELECT accepter_id AS id, COUNT(*) AS count
    FROM RequestAccepted
    GROUP BY accepter_id

    UNION ALL

    SELECT requester_id AS id, COUNT(*) AS count
    FROM RequestAccepted
    GROUP BY requester_id
) AS num
GROUP BY id
order by num desc limit 1;
