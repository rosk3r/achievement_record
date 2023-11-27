DROP DATABASE IF EXISTS accomplishments;
CREATE DATABASE accomplishments;

DROP TABLE t_achievements;
DROP TABLE t_group;
DROP TABLE t_student;
DROP TABLE t_specialization;
DROP TABLE t_events;

create table t_events
(
    id            bigint       not null
        primary key,
    name          varchar(128) not null,
    description   varchar(1000),
    conduct_level varchar(64)  not null
);

create table t_specialization
(
    id   bigint       not null
        primary key,
    name varchar(128) not null
);

create table t_group
(
    id                bigint      not null
        primary key,
    specialization_id bigint      not null,
    name              varchar(24) not null,
    course         integer     not null,

    FOREIGN KEY (specialization_id) REFERENCES t_specialization (id)
);

create table t_student
(
    id             bigint      not null
        primary key,
    first_name     varchar(64) not null,
    last_name      varchar(64) not null,
    middle_name    varchar(64),
    birth_date     date        not null,
    education_type varchar(24) not null,
    group_id       bigint      not null,

    FOREIGN KEY (group_id) REFERENCES t_group (id)
);

create table t_achievements
(
    id                bigint       not null
        primary key,
    event_id          bigint       not null,
    person_id         bigint       not null,
    achievement_level varchar(128) not null,

    FOREIGN KEY (event_id) REFERENCES t_events (id),
    FOREIGN KEY (person_id) REFERENCES t_student (id)
);

--TABLES DATA INSERT--

INSERT INTO t_specialization (id, name)
VALUES (1, 'Информационные технологии'),
       (2, 'Электротехника');

INSERT INTO t_group (id, specialization_id, name, course)
VALUES (1, 1, 'IT-101', 2),
       (2, 1, 'IT-102', 1),
       (3, 2, 'ЭТ-201', 3);

INSERT INTO t_student (id, first_name, last_name, middle_name, birth_date, education_type, group_id)
VALUES (1, 'Иван', 'Иванов', 'Иванович', '1990-01-15', 'Очная', 1),
       (2, 'Мария', 'Петрова', 'Сергеевна', '1992-05-20', 'Заочная', 2),
       (3, 'Алексей', 'Смирнов', 'Александрович', '1991-11-10', 'Очная', 1),
       (4, 'Екатерина', 'Козлова', 'Игоревна', '1993-08-25', 'Очная', 3),
       (5, 'Сергей', 'Федоров', 'Дмитриевич', '1990-03-18', 'Заочная', 1),
       (6, 'Анна', 'Кузнецова', 'Владимировна', '1992-09-05', 'Очная', 2),
       (7, 'Павел', 'Морозов', 'Андреевич', '1993-12-30', 'Заочная', 3),
       (8, 'Ольга', 'Новикова', 'Сергеевна', '1991-06-08', 'Очная', 2);

INSERT INTO t_events (id, name, description, conduct_level)
VALUES (1, 'Спортивный марафон', 'Бег на длинные дистанции', 'Международный'),
       (2, 'Научная конференция', 'Обсуждение актуальных тем в науке', 'Федеральный'),
       (3, 'Творческий вечер', 'Выступления студентов с творческими номерами', 'Районный'),
       (4, 'Ярмарка вакансий', 'Представление компаний и предложения о работе', 'Областной');

INSERT INTO t_achievements (id, event_id, person_id, achievement_level)
VALUES (1, 1, 1, 'Победитель'),
       (2, 2, 3, 'Лучший доклад'),
       (3, 3, 2, 'Лучшее творческое выступление'),
       (4, 4, 1, 'Подписал контракт с компанией X'),
       (5, 1, 2, 'Второе место'),
       (6, 2, 1, 'Отличное исследование'),
       (7, 3, 3, 'Лучший актерский навык'),
       (8, 4, 2, 'Получил предложение о стажировке'),
       (9, 1, 3, 'Третье место'),
       (10, 2, 2, 'Наилучший научный доклад'),
       (11, 3, 1, 'Специальный приз жюри'),
       (12, 4, 3, 'Оценка: 10/10'),
       (13, 1, 1, 'Спортивный дарвинист'),
       (14, 2, 3, 'Самая интересная презентация'),
       (15, 3, 2, 'Искусство в высшем проявлении'),
       (16, 4, 1, 'Рекомендуется для трудоустройства'),
       (17, 1, 2, 'Получил сертификат участника'),
       (18, 2, 1, 'Научный гений'),
       (19, 3, 3, 'Завораживающее выступление'),
       (20, 4, 2, 'Лучший стенд на ярмарке'),
       (21, 1, 3, 'Лучший бегун'),
       (22, 2, 2, 'Интересные исследования'),
       (23, 3, 1, 'Гармония таланта'),
       (24, 4, 3, 'Специальное приглашение на собеседование'),
       (25, 1, 1, 'Спортивная звезда'),
       (26, 2, 3, 'Лучший студент-исследователь'),
       (27, 3, 2, 'Талантливый артист'),
       (28, 4, 1, 'Перспективный выпускник');