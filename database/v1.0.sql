CREATE database blog;
use blog;

CREATE TABLE `blog`(
    id int not null auto_increment,
    title varchar(100) not null,
    category varchar(100) not null,
    content varchar(1000) null,
    PRIMARY KEY(id)
) engine=InnoDB charset=utf8