-- Q1 
-- -----------------------------------------------------------------------------------------------------------
-- select first and last name of employees with salaries greater than 10000 and hired after 1998 
-- and do not include employees from Administration and the employees should be from Australia or Canada.

use day_four_db;

select employees.first_name, employees.last_name, hire_date, department_name, countries.country_name 
from employees
join departments on employees.department_id = departments.department_id
join locations on departments.location_id = locations.location_id
join countries on locations.country_id = countries.country_id
where (salary > 5000) AND hire_date > '1990-01-01' AND Not(department_name = 'Administration') AND country_name in ('Australia','Canada');


-- Q2
-- -----------------------------------------------------------------------------------------------------------
-- Select the first 6 higly paid employees who are Accountants,Administration Assistant

use day_four_db;

select * from jobs
inner join employees on jobs.job_id = employees.job_id
where job_title in ('Accountant' ,'Administration Assistant')
order by salary desc limit 0,6;


-- Q3 
-- -----------------------------------------------------------------------------------------------------------
-- Select dependents of the employees whose salaries are between 10000 and 20000

use day_four_db;

select * from dependents
inner join employees on dependents.employee_id=employees.employee_id
where salary between 10000 and 20000






