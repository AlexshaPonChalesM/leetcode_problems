select s.user_id, 
round(coalesce(
(select count(*) from confirmations c where s.user_id=c.user_id and c.action="confirmed")/
nullif(
(select count(*) from confirmations c 
where s.user_id=c.user_id),0),0),2) as confirmation_rate
from signups s; 