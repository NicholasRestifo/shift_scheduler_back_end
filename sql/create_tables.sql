drop schema public cascade;

create schema public;

CREATE TABLE job_location (
	id SERIAL PRIMARY KEY,
	name VARCHAR NOT NULL
);

CREATE TABLE position (
	id SERIAL PRIMARY KEY,
	name VARCHAR NOT NULL
);

CREATE TABLE employee (
	id SERIAL PRIMARY KEY,
	name VARCHAR NOT NULL,
	job_location_id SERIAL REFERENCES job_location(id),
	position_id SERIAL REFERENCES position(id)
);

CREATE TABLE shift (
	id SERIAL PRIMARY KEY,
	job_location_id SERIAL REFERENCES job_location(id),
	position_id SERIAL REFERENCES position(id),
	start_time TIMESTAMP NOT NULL,
	end_time TIMESTAMP NOT NULL,
	max_employees INTEGER NOT NULL
);

CREATE TABLE employee_shift (
	employee_id SERIAL REFERENCES employee(id),
	shift_id SERIAL REFERENCES shift(id),
	PRIMARY KEY (employee_id, shift_id)
);