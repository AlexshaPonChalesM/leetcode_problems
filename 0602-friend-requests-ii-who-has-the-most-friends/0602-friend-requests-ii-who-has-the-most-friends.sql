select id ,sum(count) as num from (select requester_id as id,count(*) as count from RequestAccepted group by requester_id  
union all 
select accepter_id as id ,count(*) as count from RequestAccepted group by accepter_id)as num
group by id order by num desc limit 1 offset 0;