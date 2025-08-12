# Write your MySQL query statement below
select w.id as Id from Weather w where w.temperature > (select t.temperature from Weather t Where t.recordDate = Date_Sub(w.recordDate,interval 1 day));