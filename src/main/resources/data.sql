INSERT INTO movie_info(id, img_url, title, content, director, actor, movie_time, grade) VALUES (1,'경로', '주토피아', '줄거리','감독1','주디, 닉', 120,'전체이용가');
INSERT INTO movie_info(id, img_url, title, content, director, actor, movie_time, grade) VALUES (2,'경로', '배트맨', '줄거리','감독2','배트맨', 120,'전체이용가');

INSERT INTO GRADE_ENTITY(id, movie_id, title, grade, body) values (1, 1, '재밌어요', 5, '너무 재미있었어요');
INSERT INTO GRADE_ENTITY(id, movie_id, title, grade, body) values (2, 1, '감동이에요', 5, '정말 감동적인 영화에요');
INSERT INTO GRADE_ENTITY(id, movie_id, title, grade, body) values (3, 1, '짱짱', 5, '또 보고싶은 영화에요');


INSERT INTO GRADE_ENTITY(id, movie_id, title, grade, body) values (4, 2, '노잼이야', 1, '평점 1점도 아까워요');
INSERT INTO GRADE_ENTITY(id, movie_id, title, grade, body) values (5, 2, '무서워요', 3, '공포영화인줄');
INSERT INTO GRADE_ENTITY(id, movie_id, title, grade, body) values (6, 2, '킹받아요', 5, '재밌어서 킹받네요');
