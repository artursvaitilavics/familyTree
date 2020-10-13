create table person (
	id int not null auto_increment primary key,
    firstName varchar(45),
    lastName varchar(45),
	lifeDates varchar(45),
    fatherId int references person(id),
    motherId int references person(id),
    siblingId int references peron(id)
);


