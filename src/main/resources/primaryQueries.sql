create table primarybook(
                            primarybookid integer primary key,
                            primarybookname varchar(300),
                            primarygenre varchar(100),
                            primaryauthor varchar(200)
)

insert into primarybook(primarybookid, primarybookname, primarygenre, primaryauthor)
values(1,'The Alchemist', 'English Novel', 'Paulo Coelho'),(2,'The Girl Next Door', 'English Novel', 'Chetan Bhagat'),(3,'The Girl in Room 105', 'English Novel', 'Chetan Bhagat')

create table primaryuser(
                            primaryuserid integer primary key,
                            primaryusername varchar(300)
)

insert into primaryuser(primaryuserid, primaryusername)
values(1, 'Jainish Bharti'),(2, 'Binit Kumar'),(3, 'Shivam Raj'),(4, 'Bivash Baidya')

create table primarysales(
                             primarysalesid integer primary key,
                             primaryuserid integer references primaryuser(primaryuserid),
                             primarybookid integer references primarybook(primarybookid)
)

insert into primarysales(primarysalesid, primaryuserid, primarybookid)
values(1,1,1),(2,1,1),(3,2,1),(4,3,3)

