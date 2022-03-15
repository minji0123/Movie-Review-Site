INSERT INTO movie_info(id, img_name, img_url, title, content, director, actor, movie_time, grade) VALUES (1,'', 'https://mblogthumb-phinf.pstatic.net/20160514_227/prun_dar_1463233437152pOrtI_PNG/%C1%D6%C5%E411.png?type=w800', '주토피아', '줄거리','감독1','주디, 닉', 120,'전체이용가');
INSERT INTO movie_info(id, img_name, img_url, title, content, director, actor, movie_time, grade) VALUES (2,'', 'https://upload.wikimedia.org/wikipedia/ko/thumb/0/0f/%EB%B0%B0%ED%8A%B8%EB%A7%A8_%EB%B9%84%EA%B8%B4%EC%A6%88_%ED%8F%AC%EC%8A%A4%ED%84%B0.jpg/220px-%EB%B0%B0%ED%8A%B8%EB%A7%A8_%EB%B9%84%EA%B8%B4%EC%A6%88_%ED%8F%AC%EC%8A%A4%ED%84%B0.jpg', '배트맨', '줄거리','감독2','배트맨', 120,'전체이용가');

INSERT INTO GRADE_ENTITY(id, movie_id, title, grade, body) values (1, 1, '재밌어요', 5, '너무 재미있었어요');
INSERT INTO GRADE_ENTITY(id, movie_id, title, grade, body) values (2, 1, '감동이에요', 5, '정말 감동적인 영화에요');
INSERT INTO GRADE_ENTITY(id, movie_id, title, grade, body) values (3, 1, '짱짱', 5, '또 보고싶은 영화에요');


INSERT INTO GRADE_ENTITY(id, movie_id, title, grade, body) values (4, 2, '노잼이야', 1, '평점 1점도 아까워요');
INSERT INTO GRADE_ENTITY(id, movie_id, title, grade, body) values (5, 2, '무서워요', 3, '공포영화인줄');
INSERT INTO GRADE_ENTITY(id, movie_id, title, grade, body) values (6, 2, '킹받아요', 5, '재밌어서 킹받네요');

INSERT INTO movie_review(id, movie_id, movie_title, title, content, writer, score, views) values (1, 1, '주토피아', '재밌는 주토피아', '대충 여기 주토피아 리뷰내용', '평론가1', 4, 0);
INSERT INTO movie_review(id, movie_id, movie_title, title, content, writer, score, views) values (2, 1, '주토피아', '동물', '리뷰 였던것', '평론가2', 2, 0);
INSERT INTO movie_review(id, movie_id, movie_title, title, content, writer, score, views) values (3, 1, '주토피아', '주디랑 닉', '장문의 리뷰가 올라갈 것 입니다', '평론가3', 3, 0);

INSERT INTO movie_review(id, movie_id, movie_title, title, content, writer, score, views) values (4, 2, '배트맨', '배트맨 리뷰', '아 배트맨 보고싶다', '평론가10', 3, 0);
INSERT INTO movie_review(id, movie_id, movie_title, title, content, writer, score, views) values (5, 2, '배트맨', '배트맨 리뷰', '리뷰가 있었는데요 없었습니다', '평론가11', 1, 0);
INSERT INTO movie_review(id, movie_id, movie_title, title, content, writer, score, views) values (6, 2, '배트맨', '배트맨 리뷰', '평점은 어떻게 해야 하나', '평론가12', 5, 0);
