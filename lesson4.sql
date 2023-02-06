ошибки в расписании (фильмы накладываются друг на друга), отсортированные по возрастанию времени. Выводить надо колонки «фильм 1», «время начала», «длительность», «фильм 2», «время начала», «длительность»;

select m1.name "фильм 1", s1.start_date "время начала", m1.lenght "длительность",
	   m2.name "фильм 1", s1.start_date "время начала", m1.lenght "длительность"
from show s1 
join movie m1
on s1.movie=m1.id
join show s2 
on s1.start_date between s2.start_date and s2.end_date - interval '1 second' and s1.id<>s2.id
join movie m2
on s2.movie_id=m2.id
order by s1.start_date

перерывы 30 минут и более между фильмами — выводить по уменьшению длительности перерыва. Колонки «фильм 1», «время начала», «длительность», «время начала второго фильма», «длительность перерыва»;

select name "фильм 1", start_date "время начала", lenght "длительность",
m2.start_date "время начала второго фильма",
m2.(start_date - end_date) "длительность перерыва"
from (
select m1.name, m1.lenght, s1.*, (select min(s2.start_date) from show s2 where s2.start_date >= s1.end_date) m2.start_date
from show s1
join movie m1
on s1.movie_id=m1.id
) order by 5 desc nulls last