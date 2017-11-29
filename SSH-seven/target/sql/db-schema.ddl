
    drop table if exists t_user;

    create table t_user (
        id bigint not null auto_increment,
        createTime datetime,
        email varchar(200),
        gender integer not null,
        name varchar(100) not null,
        password varchar(100) not null,
        updateTime datetime,
        primary key (id)
    );
