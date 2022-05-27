create table secondarybook(
                              secondarybookid integer primary key,
                              secondarybookname varchar(300),
                              secondarygenre varchar(100),
                              secondaryauthor varchar(200)
)

insert into secondarybook(secondarybookid, secondarybookname, secondarygenre, secondaryauthor)
values(1,'The Clean Code', 'Programming', 'Robert Darwin'),(2,'Let us C', 'Programming', 'Some writer'),(3,'The Girl in Room 105', 'English Novel', 'Chetan Bhagat')

create table secondaryuser(
                              secondaryuserid integer primary key,
                              secondaryusername varchar(300)
)

insert into secondaryuser(secondaryuserid, secondaryusername)
values(1, 'Aaqib Eqbal'),(2, 'Abhishek Kumar'),(3, 'Himanshu Raj'),(4, 'Ankush Jha')

create table secondarysales(
                               secondarysalesid integer primary key,
                               secondaryuserid integer references secondaryuser(secondaryuserid),
                               secondarybookid integer references secondarybook(secondarybookid)
)

insert into secondarysales(secondarysalesid, secondaryuserid, secondarybookid)
values(1,1,1),(2,1,1),(3,2,1),(4,3,3),(5,3,2)