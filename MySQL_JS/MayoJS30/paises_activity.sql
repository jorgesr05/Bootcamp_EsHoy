SET GLOBAL sql_mode=(SELECT REPLACE(@@sql_mode,'ONLY_FULL_GROUP_BY',''));

/*EJERCICIO 1*/
SELECT * FROM countries 
JOIN languages ON countries.id = languages.country_id
WHERE language = "Slovene"
;

/*EJERCICIO 1 - 2*/
SELECT * FROM languages
JOIN countries on languages.country_id=countries.id
WHERE language = "Slovene";

/*EJERCICIO 1 - 3*/
SELECT countries.name,languages.language FROM languages
JOIN countries on languages.country_id=countries.id
WHERE language = "Slovene";

/*EJERCICIO 1- 4*/
SELECT countries.name,languages.language,languages.percentage FROM languages
JOIN countries on languages.country_id=countries.id
WHERE language = "Slovene"
ORDER BY percentage DESC;

/*EJERCICIO 2*/
SELECT countries.name, COUNT(countries.id) FROM cities
JOIN countries on cities.country_id=countries.id
GROUP BY countries.id;

/*
,COUNT(countries.id) as ciudades
ORDER BY ciudades DESC/*

/*EJERCICIO 2-1*/
SELECT countries.name,max(languages.language),COUNT(countries.id) FROM cities
JOIN countries ON cities.country_id=countries.id
JOIN languages ON countries.id=languages.country_id
GROUP BY countries.id
;

/*EJERCICIO 3*/
SELECT * FROM cities
WHERE population > 500000 AND country_code="MEX"
ORDER BY population DESC;

/*EJERCICIO 4*/
SELECT  * FROM languages
WHERE percentage > 89
ORDER BY percentage DESC;

/*EJERCICIO 5*/
SELECT * FROM countries
WHERE surface_area <501 AND population>100000
ORDER BY surface_area DESC;


/*EJERCICIO 6*/
SELECT * FROM countries
WHERE capital > 200 AND life_expectancy > 75 AND government_form = 'Constitutional Monarchy'
ORDER BY name DESC;

/*EJERCICIO 6-1*/
SELECT * FROM countries
WHERE government_form like '%Constitutional Monarchy%'
ORDER BY name DESC;

/*EJERCICIO 7*/
SELECT countries.name, cities.name,cities.district,cities.population FROM cities
JOIN countries ON cities.country_id=countries.id
WHERE district = "Buenos Aires" 
AND cities.population > 500000;

/*EJERCICIO 8*/
SELECT countries.region, COUNT(countries.region) as countries FROM countries
GROUP BY countries.region
ORDER BY countries DESC
;



