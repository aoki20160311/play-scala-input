# --- !Ups
create table "people" (
                          "id" int auto_increment primary key,
                          "name" varchar(255) not null,
                          "mail" varchar(255) not null,
                          "tel" int
);
insert into "people" values (default, 'taro', 'taro@yamada', 9990999);
insert into "people" values (default, 'hanako', 'hanako@flower', 8880888);
insert into "people" values (default, 'sachiko', 'sachiko@happy', 7770777);


# --- !Downs
drop table "people"

