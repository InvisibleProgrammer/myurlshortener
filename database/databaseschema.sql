create table users (
    userId int generated always as identity not null,
    email varchar(250) not null,
    password varchar(100) not null,
    isActive boolean not null default (true),
    constraint pk_users primary key (userId),
    constraint idx_unique_email unique (email)
);

create table shortUrls (
    shortUrlId int generated always as identity not null,
    fullUrl varchar(1000) not null,
    shortUrl varchar(100) not null,
    constraint pk_shortUrls primary key (shortUrlId),
    constraint idx_unique_shortUrl unique (shortUrl)
);

create table userDomains (
    userDomainId int generated always as identity not null,
    userId int not null,
    domain varchar(100) not null,
    constraint pk_userDomains primary key (userDomainId)
);

create index idx_userDomains_userId on userDomains (userId);

create index idx_userDomains_domain on userDomains (domain);

create table userShortUrls (
    userId int not null,
    shortUrlId int not null,
    constraint pk_userShortUrls primary key (userId, shortUrlId)
);

