


-------------------------------------------------------------------------------------------------------------------------


INSERT INTO user_tb (`id`, `email`, `password`, `user_type_enum`, `username`)
VALUES ('1', 'ssar@naver.com', '1234', 'NORMAL', '쌀');
INSERT INTO user_tb (`id`, `email`, `password`, `user_type_enum`, `username`)
VALUES ('2', 'cos@naver.com', '1234', 'NORMAL', '코스');
INSERT INTO user_tb (`id`, `email`, `password`, `user_type_enum`, `username`)
VALUES ('3', 'admin@naver.com', '1234', 'ADMIN', '관리자');
INSERT INTO user_tb (`id`, `email`, `password`, `user_type_enum`, `username`)
VALUES ('4', 'love@naver.com', '1234', 'NORMAL', '럽브');


-------------------------------------------------------------------------------------------------------------------------


INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('101', 'dummyAuthor101@naver.com', '1234', '박태준');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('101', '박태준', '101');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('101', 0, '외모지상주의', 7, 30, '월수금', '못생기고 뚱뚱하다고 괴롭힘을 당하며  루저 인생만 살아온 내가 잘생겨졌다는 이유로 인싸가 됐다.어느 날 자고 일어났더니 갑자기 완벽한 외모와 몸을 지닌 사람이 되어 깨어난다면?', '순위', 'thumbnail_IMAG21_01672165-03c8-44b1-ba0e-ef82c9cfcd10.jpg', '2022-05-14');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('101', '101', '101');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('102', 8, '광마회귀', 5, 42, '화목토',
        '무공에 미친 광마 이자하.그는 마교 교주의 천옥을 훔쳐 쫓기던 중 벼랑에서 떨어지게 된다.모든 게 끝났다고 생각한 순간 눈을 떠보니, 사람들에게 무시당하던 점소이 시절로 돌아와 있는데...게다가 억울한 누명으로 두들겨 맞고 객잔은 박살이 나 있는 상황. ​점소이 시절로 회귀한 광마! 사내는 다시 미치게 될 것인가? 아니면 사내의 적들이 미치게 될 것인가.', '무료',
        'thumbnail_IMAG21_7365135131254864183.jpg', '2022-06-12');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('102', 'dummyAuthor102@naver.com', '1234', 'JP');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('102', 'JP ', '102');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('102', '102', '102');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('103', 'dummyAuthor103@naver.com', '1234', '이히');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('103', ' 이히 ', '103');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('103', '102', '103');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('104', 'dummyAuthor104@naver.com', '1234', '유진성');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('104', ' 유진성', '104');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('104', '102', '104');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('103', 0, '나 혼자 만렙 뉴비', 2, 48, '금토',
        '게임 너튜버로 활동 중인 주인공 진혁은 유일하게 [시련의 탑]의 엔딩을 봤지만, 게임의 인기가 하락하며 더 이상 게임 너튜버로서의 삶도 유지하기 힘들어진다.엔딩을 보았기에 이대로 게임을 마무리하려는 진혁. 바로 그날, [시련의 탑]은 현실이 되었다.게임의 모든 요소를 다 알고 있는 진혁은 누구보다 빠르게 모든 것을 차지한다!"진짜 고인물이 뭔지 보여주지."', '신작',
        'thumbnail_IMAG21_4dda13fe-417f-45b9-9696-880f2487d41d.jpg', '2023-05-22');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('105', 'dummyAuthor105@naver.com', '1234', 'WAN.Z');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('105', 'WAN.Z ', '105');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('105', '103', '105');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('106', 'dummyAuthor106@naver.com', '1234', '스윙뱃');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('106', ' 스윙뱃 ', '106');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('106', '103', '106');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('107', 'dummyAuthor107@naver.com', '1234', '메슬로우');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('107', ' 메슬로우', '107');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('107', '103', '107');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('108', 'dummyAuthor108@naver.com', '1234', '김세훈');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('108', '김세훈', '108');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('104', 0, '열렙전사 3부', 4, 35, '월금', '이번엔 현실이다!게임이 되어버린 세상, 열렙전사 공원호가 다시 한 번 최강의 자리를 노린다!', '무료', 'thumbnail_IMAG21_75d7192e-5de2-46ae-bd94-749477fbabe6.jpg', '2023-06-15');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('108', '104', '108');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('109', 'dummyAuthor109@naver.com', '1234', '롸나');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('109', '롸나', '109');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('105', 0, '대신 살쪄주는 여자', 9, 38, '토일',
        '음식의 유혹 앞에서 먹고 토하기를 반복하며 괴로워하던 여희연은 예쁜 얼굴과 날씬한 몸매로 학교 인기남까지 쟁취한 진주아를 질투하며 마른 몸에 대한 깊은 욕망을 갖게 된다.그러다 우연히 진주아가  대신 살쪄주는 능력 을 가지고 있는 하명선과의 거래를 통해 살을 빼고 있다는 사실을 알게 되고, 아무도 모르게 하명선에게 접근하여 그녀와의 위험한 거래를 시작한다.', '순위',
        'thumbnail_IMAG21_13d24e4e-58af-4517-918c-8bd7d12de130.jpg', '2023-02-09');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('109', '105', '109');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('106', 0, '재혼 황후', 7, 27, '월화수목금토일', '동대제국의 완벽한 황후였던 나비에.​황제인 남편이 정부를 황후로 만들려는 것을 알고 이혼을 택한다. 그리고 결심한다.이곳에서 황후가 될 수 없다면 다른 곳에서 황후가 되겠다고.인기 웹소설  재혼 황후 가 웹툰화되다!', '없음', 'thumbnail_IMAG21_4b3c44a0-f286-4878-bac3-84c3ec9dc0a1.jpg',
        '2023-01-29');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('110', 'dummyAuthor110@naver.com', '1234', '히어리');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('110', '히어리 ', '110');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('110', '106', '110');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('111', 'dummyAuthor111@naver.com', '1234', '숨풀');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('111', ' 숨풀 ', '111');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('111', '106', '111');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('112', 'dummyAuthor112@naver.com', '1234', '알파타르트');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('112', ' 알파타르트', '112');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('112', '106', '112');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('107', 0, '역대급 영지 설계사', 10, 26, '금일', '소설 속 귀족이 된 토목공학도 김수호. 그런데 뭐? 내 영지가 곧 망할 거라고? 그럼 살려야지. 설계하고, 건설하고, 분양해서. [전 대륙이 기다려온 특별한 기회! 퍼펙트한 교통, 최상의 학군, 쾌적한 숲세권, 원스톱 프리미엄 영지 라이프의 프론테라 남작령이 여러분을 기다립니다. 선착순 분양계약중!]', '순위',
        'thumbnail_IMAG21_cc85f891-272b-450a-b642-cffe1568ab71.jpg', '2023-01-02');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('113', 'dummyAuthor113@naver.com', '1234', '이현민');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('113', '이현민 ', '113');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('113', '107', '113');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('114', 'dummyAuthor114@naver.com', '1234', '김현수');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('114', ' 김현수 ', '114');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('114', '107', '114');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('115', 'dummyAuthor115@naver.com', '1234', '문백경');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('115', ' 문백경', '115');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('115', '107', '115');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('116', 'dummyAuthor116@naver.com', '1234', '요다');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('116', '요다', '116');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('108', 0, '대학원 탈출일지', 9, 35, '토일', '연구에 꿈을 가지고 대학원을 선택한 병아리 요다.예상과는 다르게 연구에 관심 없는 교수님과 똥군기의 연구실 분위기에 당황한다.요다는 과연 무사히 대학원을 탈출할 수 있을 것인가?!', '완결', 'thumbnail_IMAG21_3919364435331003700.jpg', '2022-02-13');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('116', '108', '116');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('117', 'dummyAuthor117@naver.com', '1234', '김규삼');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('117', '김규삼', '117');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('109', 15, '데드퀸', 5, 45, '목금토일', '절망에 빠져 죽음이 임박했을때, 진짜 여왕이 재림한다!하이브 세계관의 장대한 끝, 데드퀸', '없음', 'thumbnail_IMAG21_4049077133597095219.jpg', '2022-08-12');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('117', '109', '117');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('110', 12, '상남자', 3, 42, '화수', '오로지 성공만을 바라보며 기업 정점의 자리까지 오른, 최고의 샐러리맨 한유현.대가로 사랑하던 모든 이를 잃어버린 후, 후회 섞인 인생을 돌아보는데...어느 날 모든 기억을 안은 채, 젊은 시절의 그때로 돌아가게 된다.모든 것의 시작점인 신입사원의 위치에서, 그가 다시 삶을 설계한다!', '없음',
        'thumbnail_IMAG21_529c6125-cf14-435f-94ed-db1a2d499d84.jpg', '2023-03-17');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('118', 'dummyAuthor118@naver.com', '1234', '하늘소');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('118', '하늘소 ', '118');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('118', '110', '118');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('119', 'dummyAuthor119@naver.com', '1234', '도가도');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('119', ' 도가도 ', '119');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('119', '110', '119');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('120', 'dummyAuthor120@naver.com', '1234', '김태궁');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('120', ' 김태궁', '120');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('120', '110', '120');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('111', 0, '언니, 이번 생엔 내가 왕비야', 10, 37, '화일', '약혼자, 언니, 부모. 모든 것으로부터 버려진 그 날, 아리아드네는 14년 전으로 회귀한다.“젠장! 나는 지금 너에게 구애하는 거라고!”태도가 완전히 달라진 전생의 약혼자부터,“울지 마, 아리아드네. 너는 네가 얼마나 예쁜지 모르지?”그녀에게 첫눈에 반한 다정한 왕자님까지.이번에야말로 모두에게 복수하고, 왕비가 되리라.', '순위',
        'thumbnail_IMAG21_35c1a390-7598-418e-9902-dc9a84f22d8b.jpg', '2022-11-12');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('121', 'dummyAuthor121@naver.com', '1234', 'Omin');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('121', 'Omin ', '121');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('121', '111', '121');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('122', 'dummyAuthor122@naver.com', '1234', '테미스');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('122', ' 테미스 ', '122');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('122', '111', '122');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('123', 'dummyAuthor123@naver.com', '1234', '레팔진프');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('123', ' 레팔진프', '123');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('123', '111', '123');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('112', 8, '1초', 2, 39, '화수', '구조율 100%의 전설적인 소방관.  그의 특별한 능력은 긴장하는 순간, 미래가 보인다는 것! 촌각을 다투는 진짜 소방관들의 이야기', '신작', 'thumbnail_IMAG21_17f81846-d1a9-43fd-83a4-f9e966b6b977.jpg', '2023-10-10');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('124', 'dummyAuthor124@naver.com', '1234', '시니');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('124', '시니 ', '124');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('124', '112', '124');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('125', 'dummyAuthor125@naver.com', '1234', '광운');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('125', ' 광운', '125');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('125', '112', '125');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('113', 8, '낙향문사전', 2, 38, '월화', '온갖 비리가 가득한 과거 시험에 낙방해 좌절한 주인공 손빈. 자신의 신세를 한탄하는 손빈 앞에 나타난 사자혁은 그에게 자신의 일대기를 기록할 것을 청한다. 이후 둘은 함께 천하를 주유하게 되는데, 과연 그의 붓이 써 내려가는 무림 일대기는 어떠한 기록을 남기게 되고, 무림 세계에 발을 들이게 된 손빈의 운명은 어찌 흘러갈는지……', '무료',
        'thumbnail_IMAG21_3904681570744218160.jpg', '2023-10-10');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('126', 'dummyAuthor126@naver.com', '1234', '바킹독');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('126', '바킹독 ', '126');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('126', '113', '126');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('127', 'dummyAuthor127@naver.com', '1234', '팀 페가수스');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('127', ' 팀 페가수스 ', '127');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('127', '113', '127');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('128', 'dummyAuthor128@naver.com', '1234', '언라이팅');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('128', ' 언라이팅', '128');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('128', '113', '128');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('114', 0, '죽지 않으려면', 6, 24, '월수금',
        '고등학생 임다준은 학교에서 늘상 괴롭힘을 당하는 게 일상이었다. 삶을 포기하기 직전 우연히 본 티비 속 동급생 살해범의 인터뷰에 감명을 받고 복수를 결심하게 된다.복수는 성공했지만 삶은 원치않는 방향으로 흘러가게 되고.. 학교에서 나온 임다준은 범상치않은 가출팸에 들어가게 된다.가출청소년 임다준은 더이상 학교 안 일진들에게 시달리지 않게 되었지만 그보다 잔혹한 길거리의 양아치들을 상대로 살아남아야만 한다.삶의 끝자락에 내몰린 고등학생 임다준의 길거리 생존기!',
        '순위', 'thumbnail_IMAG21_be1cd9e7-17da-449a-bc04-1294015fdbd5.jpg', '2023-10-10');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('129', 'dummyAuthor129@naver.com', '1234', '파래');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('129', '파래 ', '129');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('129', '114', '129');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('130', 'dummyAuthor130@naver.com', '1234', '임진국');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('130', ' 임진국', '130');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('130', '114', '130');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('115', 0, '천하제일 대사형', 7, 27, '수일', '잔혹했던 정사대전에 반 강제적으로 끌려갔던 대사형 ‘혁무상’.수많은 피가 흐른 전쟁에 참전한지 7년. 전쟁은 진즉 끝났음에도 돌아오지 않아 죽은 줄 알았다.간신히 고향 땅을 밟은 혁무상이 보게 된 것은, 고작 삼류 흑도에게 핍박당해 무너져가는 고향 용호무관의 모습.분노에 찬 혁무상. 용호무관을 향해 다가오는 모든 위협에 대사형은 검을 빼어 든다.',
        '완결', 'thumbnail_IMAG21_311b8a63-cb77-4198-b015-95ef835007ac.jpg', '2023-10-10');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('131', 'dummyAuthor131@naver.com', '1234', 'YooN');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('131', 'YooN ', '131');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('131', '115', '131');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('132', 'dummyAuthor132@naver.com', '1234', '북미혼');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('132', ' 북미혼', '132');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('132', '115', '132');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('133', 'dummyAuthor133@naver.com', '1234', '순끼');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('133', '순끼', '133');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('116', 0, '세기말 풋사과 보습학원', 2, 28, '목일',
        '어릴 때 알던 재수없던 놈이 더 재수없는 놈이 되어 돌아왔다! 중3 황미애의 옆 빌라에 어릴 때 잠깐 시골에서 봤던 김철이 이사 와 같은 학교 같은 반이 되고  철이와 미애 라 놀림 받자 김철은 미애를 불쾌해하며 피한다. 너만 불쾌한 줄 알아? 나쁜 놈! 미애는 속이 상하지만 그럼에도 자꾸 이상한 우연으로 계속 엮이며 트러블이 발생, 결국 둘은 크게 마음이 상하고 서로 더 이상 아는 척 하지 않으려 한다. 맨날 화만내는 김철과, 황미애 인생에 처음 만나는 이상한 친구들까지 엮이게 되며 미애는 사춘기를 정통으로 겪게 되는데.... <치즈인더트랩> 순끼 작가의 신작!',
        '신작', 'thumbnail_IMAG21_8ad71820-0c48-418a-89e9-5c001e393f54.jpg', '2023-10-10');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('133', '116', '133');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('117', 15, '사신', 9, 38, '화목', '형의 복수를 위해 살천문의 무사 황정을 죽인 소년 종리추.살천문의 추격을 피하기 위해 살혼부의 살수 적지인살에게몸을 의탁하게 되면서 십망(十忘)이라는 거대한 소용돌이에 휩쓸린다.십망의 그늘에서 벗어나기 위해선 전설의 경지인 사무령이 되는 수밖에 없다!종리추는 과연 사무령이 되어정파 무림이 만들어놓은 숨막히는 규율 속에서 자유를 찾을 수 있을까?',
        '휴재', 'thumbnail_IMAG21_361ed944-3c87-481f-a3d9-0e02c12b027d.jpg', '2023-10-10');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('134', 'dummyAuthor134@naver.com', '1234', '임재원');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('134', '임재원 ', '134');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('134', '117', '134');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('135', 'dummyAuthor135@naver.com', '1234', '설봉');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('135', ' 설봉', '135');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('135', '117', '135');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('118', 0, '흑요석의 신부', 4, 39, '화토',
        '사랑 따윈 꿈꿔보지도 못한 초라한 삶.불행한 결혼생활에 지쳐 목숨을 끊으려던 밤.내게 특별한 초대장이 날아왔다. [당신은 보석과 같이 빛나는 존재입니다.당신처럼 빛나는 존재들이 모이는 보석함.보석함에 들어오시겠습니까? YES? or NO?] 가장 특별한 사람들만이 참가할 수 있다는 화려한 파티. <제국의 보석함> 얼굴과 신분을 모두 숨긴 채, ‘진정한 사랑’에 의해 결혼 상대를 만나는 곳.‘내게도 선택받은 자들처럼, 빛나는 보석이 될 기회가 주어진다면….’ 그날 밤, 나의 선택이 모든 것을 뒤바꿔놓았다.',
        '순위', 'thumbnail_IMAG21_fcc13386-dc54-4e27-a91b-c64bf0616003.jpg', '2023-10-10');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('136', 'dummyAuthor136@naver.com', '1234', '왕보라청푸름');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('136', '왕보라청푸름 ', '136');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('136', '118', '136');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('137', 'dummyAuthor137@naver.com', '1234', '팀 쿼츠');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('137', ' 팀 쿼츠', '137');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('137', '118', '137');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('119', 0, '전남편의 미친개를 길들였다', 3, 22, '수일',
        '"아버지, 제게 미쉘 알랑케스를 절단낼 기회를 주세요."  죽음을 예감한 순간 라인하르트는 소원을 되뇌였다. 정신을 차려 보니, 15년 전 아버지의 장례식으로 돌아와 있었다.아버지를 죽게 한 원흉인 황태자, 미쉘 알랑케스에게 이혼당하던 그때로. 라인하르트는 미쉘의 다리를 찌르고 그로 인해 변방의 영지로 쫓겨나게 된다.험난한 여정 중, 그녀는 뜻밖의 인물과 조우하게 되는데……. 그녀가 주워 온 더럽고 불쌍한 아이.이전 생에서 그는 전쟁 영웅이자 황제의 사생아,전남편이 길들였던 미친개였다.',
        '없음', 'thumbnail_IMAG21_335a77d2-bbcd-4766-83f6-8d90120e9379.jpg', '2023-10-10');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('138', 'dummyAuthor138@naver.com', '1234', '철무장미');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('138', '철무장미 ', '138');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('138', '119', '138');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('139', 'dummyAuthor139@naver.com', '1234', '자개');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('139', ' 자개 ', '139');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('139', '119', '139');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('140', 'dummyAuthor140@naver.com', '1234', '재겸');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('140', ' 재겸', '140');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('140', '119', '140');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('120', 0, '나혼자 탑에서 농사', 2, 36, '월목일',
        '어느 날 갑자기 도시에 나타난 정체불명의 탑.사람들은 그곳을 던전이라고 부르기로 했다.그리고 그곳은 험한 지형과 위험한 몬스터들로 가득했지만수많은 보물이 기다리는 기회의 땅이기도 하다.평범한 삶을 살고 있던 청년 세준은 우연한 기회로 던전에 초대받게 되고 자신도 부자가 될 생각에 기뻤지만 어딘지 알 수 없는 탑의 숨겨진 공간에 조난당하고 만다.가진 거라곤 씨앗 몇 개와 몸뚱어리뿐. 이제 세준은 농사를 짓고, 자원을 수집하며 자신만의 생존 전략을 모색해야만 한다!',
        '없음', 'thumbnail_IMAG21_4a5ab33b-e6fe-4fbe-95b7-bd7fa6a9c156.jpg', '2023-10-10');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('141', 'dummyAuthor141@naver.com', '1234', '임형');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('141', '임형 ', '141');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('141', '120', '141');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('142', 'dummyAuthor142@naver.com', '1234', '이하경');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('142', ' 이하경 ', '142');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('142', '120', '142');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('143', 'dummyAuthor143@naver.com', '1234', 'sdcknight');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('143', ' sdcknight', '143');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('143', '120', '143');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('121', 12, '서울역 드루이드', 2, 28, '수토', '이세계로 사라진 뒤 천 년 만에 지구로 귀환한, 박수호. 그 사이 세상은 몬스터의 등장으로 철저한 약육강식의 세상으로 변해 있었다. 천 년 동안 처절한 생존경쟁으로 살아남은 동물의 왕 드루이드, 세계 정복에 나서다.이제부터 이 구역의 지배자는 나다.', '순위',
        'thumbnail_IMAG21_60f66caa-8332-4333-b510-147854a2e496.jpg', '2023-10-10');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('144', 'dummyAuthor144@naver.com', '1234', '문성호');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('144', '문성호 ', '144');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('144', '121', '144');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('145', 'dummyAuthor145@naver.com', '1234', '활성곰');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('145', ' 활성곰 ', '145');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('145', '121', '145');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('146', 'dummyAuthor146@naver.com', '1234', '진설우');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('146', ' 진설우', '146');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('146', '121', '146');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('122', 0, '삼국지톡', 10, 28, '월목', '"유비, 조조, 손권 등 영웅들이 활약하던 후한, 그 난세에 핸드폰이 있었다면?메신저로 소통하고, 개인 방송으로 군사를 모집한다! 이제껏 보지 못한 완전히 새로운 삼국지!"', '신작', 'thumbnail_IMAG21_fd8cb5db-01ab-4c7b-a2a9-920d4479d5f7.jpg', '2023-10-10');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('147', 'dummyAuthor147@naver.com', '1234', '무적핑크');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('147', '무적핑크 ', '147');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('147', '122', '147');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('148', 'dummyAuthor148@naver.com', '1234', '이리');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('148', ' 이리', '148');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('148', '122', '148');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('123', 0, '약탈 신부', 3, 39, '월수금', '베르크 남작가의 사생아 루시나에게 일생일대의 기회가 찾아온다. 드래곤의 땅 타야르를 통치하는 대왕이자 정복자 하칸. 그의 약탈 신부가 되는 조건으로 주어진 또 다른 삶의 기회. 비록 반쪽짜리 자유라도 절실했던 루시나는 그렇게 미지의 세계로 발을 내딛게 되는데… 절망의 끝을 밝혀 준 단 하나의 사랑 이야기.', '순위',
        'thumbnail_IMAG21_d09239e1-4e22-46a7-83df-b7094eceb403.jpg', '2023-10-10');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('149', 'dummyAuthor149@naver.com', '1234', '팀 카푸치노');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('149', '팀 카푸치노 ', '149');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('149', '123', '149');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('150', 'dummyAuthor150@naver.com', '1234', '강희자매');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('150', ' 강희자매', '150');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('150', '123', '150');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('151', 'dummyAuthor151@naver.com', '1234', '청건');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('151', '청건', '151');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('124', 0, '공동급식구역', 6, 32, '화목토', '강자가 모든 것을 지배하는 수작고등학교.전학생 이사나는 공평하지 않은 점심급식에 분노한다.비분함을 감출 수 없다면 이미 싸움은 시작된 것. 달려 사나!', '무료', 'thumbnail_IMAG21_a2783aa9-2b4f-4cc4-86c9-140039e796be.jpg', '2023-10-10');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('151', '124', '151');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('125', 15, '커플브레이커', 10, 30, '목일',
        '기존의 뻔한 짝짓기 프로그램은 가라! 사랑을 시험하고 싶은 각양각색의 연인들이 한 자리에 모였다. 누군가는 환승한 연인에게 복수를 위해, 또 어떤 커플은 더 유명해 지고 싶어서 혹은 진실한 사랑을 확인하기 위해... 초인기 히트 연애 예능 프로그램 <THE 커플 브레이커>를 무대로 펼쳐지는 마라맛 복수 로맨스! <자매전쟁> 기맹기, <원수를 사랑하라> 태건 작가의 만남!', '순위',
        'thumbnail_IMAG21_6edbde13-770a-495c-98d8-5d1d46fcc045.jpeg', '2023-10-10');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('152', 'dummyAuthor152@naver.com', '1234', '기맹기');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('152', '기맹기 ', '152');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('152', '125', '152');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('153', 'dummyAuthor153@naver.com', '1234', '태건');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('153', ' 태건', '153');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('153', '125', '153');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('126', 15, '말년용사', 8, 29, '목금', '전역하기 3일 전 어이없는 사고로 죽어버린 말년 병장.갑자기 이세계로 떠나라는 현실을 받아들이지 못하고 난리를 치다맨몸으로 이세계에 떨어지는 벌을 받게 된다.말년 병장의 눈물겨운 밀리터리 생존 판타지!', '완결', 'thumbnail_IMAG21_7a5dbee0-0997-41f9-99b3-bb062e18fb64.jpg', '2023-10-10');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('154', 'dummyAuthor154@naver.com', '1234', '후딩');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('154', '후딩 ', '154');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('154', '126', '154');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('155', 'dummyAuthor155@naver.com', '1234', '신마니');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('155', ' 신마니', '155');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('155', '126', '155');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('156', 'dummyAuthor156@naver.com', '1234', '베어리');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('156', '베어리', '156');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('127', 8, '연애의 기록', 1, 26, '월화수목금토일', '사회 초년생인 석호에게는 직업이나 연봉보다 더 중요한 것이 있었으니... 그건 바로 모태솔로 탈출.석호는 꿈에 그리던 첫 연애를 시작하게 되지만 예상치 못한 고난들을 겪게 된다.  소년과 군인을 거쳐 사회인으로 거듭난 문석호의 사랑과 일 그리고 꿈을 다룬 성장 이야기!', '없음',
        'thumbnail_IMAG21_ceb2e7d1-abc4-4351-823d-c410ffb1d379.jpg', '2023-10-10');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('156', '127', '156');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('128', 12, '문제적 왕자님', 2, 26, '수',
        '아버지에게 버려지고 외가인 바덴가에서조용하게 살아가고 있는 에르나 하르디.이 작은 시골에 위기가 찾아왔다.외조부인 바덴 남작이 죽고 난 후,모든 재산이 넘어가게 된 것!어떻게든 바덴가를 지키고 싶은 에르나는아버지에게 도움을 청하기 위해 슈베린으로 향하고…그곳에서 마주치게 된왕실의 독버섯, 비에른 드나이스터― 희대의 스캔들로 왕세자 자리마저 내려놓은 왕실의 탕아!바덴가를 지키고 싶은 에르나에게 이 달콤한 독버섯이 건네지는데…!“에르나 아가씨, 독버섯은 먹지 마세요. 먹으면 죽어요.”',
        '없음', 'thumbnail_IMAG21_1b3a9842-439f-43a3-8b2f-90fc1b1ee356.jpg', '2023-10-10');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('157', 'dummyAuthor157@naver.com', '1234', '선인장');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('157', '선인장 ', '157');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('157', '128', '157');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('158', 'dummyAuthor158@naver.com', '1234', '솔체');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('158', ' 솔체', '158');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('158', '128', '158');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('159', 'dummyAuthor159@naver.com', '1234', '유성연');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('159', '유성연', '159');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('129', 0, '뼈왕', 3, 26, '토', '낯선 이세계에 떨어지게 된 정형외과 의사 이대환. 그는 뼈를 조립하여 해골을 되살릴 수 있는 능력을 발견한다. 그렇게 살려낸 수많은 해골들의 지지 속에 뼈왕으로 등극! 하지만 행복도 잠시. 전투 중에 생명과도 같은 오른팔을 잃게 되고, 오른팔을 되찾기 위해 여행길에 오르게 되는데...', '순위',
        'thumbnail_IMAG21_5cdd430d-02b5-4d29-b048-9c046e6ffda4.jpg', '2023-10-10');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('159', '129', '159');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('160', 'dummyAuthor160@naver.com', '1234', '이은재');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('160', '이은재', '160');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('130', 0, '펜홀더', 3, 32, '토', '천재적인 재능으로 모든 스포츠를 씹어먹는 고등학생 한이연.어떤 스포츠를 해도 패배를 몰랐던 그에게, 벽을 느끼게 해준 한 탁구 고수가 등장하는데...승부욕에 불타오른 이연은 사라져가는  펜홀더  라켓으로 복수를 꿈꾼다!', '없음', 'thumbnail_IMAG21_40ab2ca2-1b9a-41b5-9577-2dec3d4d6ef7.jpg', '2023-10-10');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('160', '130', '160');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('161', 'dummyAuthor161@naver.com', '1234', '구리');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('161', '구리', '161');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('131', 0, '센스제로', 5, 38, '월', '매사에 너무 너무 긍정적이라서 일까? 눈치가 없어도 너무 없는 윤지호. 그런 그녀를 오랫동안 남몰래 짝사랑해온 남자들이 있다. 과연 그들의 마음이 최악의 센스제로 윤지호에게 닿을 수 있을까?이 시대 최고의 넌씨눈 코미디 로맨스.', '없음', 'thumbnail_IMAG21_c4da527a-594d-4bf4-9e33-4456ebde0116.jpg',
        '2023-10-10');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('161', '131', '161');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('162', 'dummyAuthor162@naver.com', '1234', '아니영');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('162', '아니영', '162');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('132', 8, '그렇고 그런 바람에', 4, 42, '월화수목금토일', '4년 전 학교를 떠들썩하게 만들었던 불륜녀 오바람이 복학했다.그런데 복학한 것은 바람만이 아니다? 바람의 주변을 맴돈다는 물귀신 소문..!바람은 물귀신의 훼방에도 굴하지 않고 즐거운 학교생활을 이어갈 수 있을까?<라일락 200%> 아니영 작가의 캠퍼스 로맨스 신작!', '없음',
        'thumbnail_IMAG21_e43d251c-2624-4f7d-871f-3c829ba25efa.jpg', '2023-10-10');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('162', '132', '162');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('133', 15, '폭군님은 착하게 살고 싶어', 9, 46, '월화수목금토일', '제국 우베라의 폭군이었던 도로테아 밀라네어.결국 사랑하는 사람에게 미움 받고 처형을 당하고 만다.그런데... 눈을 뜨니 어린 시절로 되돌아왔다?!이건 기회라 생각하며, 이번 생은 착하게 사는 것으로 목표를 정한 그녀.과연, 도로테아는 폭군이었던 과거를 청산하고 새로운 삶에서 착하게 살아갈 수 있을까...?!', '순위',
        'thumbnail_IMAG21_4cef0649-b3cf-4a27-8eda-afb93d6f6bf4.jpg', '2023-10-10');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('163', 'dummyAuthor163@naver.com', '1234', '람글');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('163', '람글 ', '163');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('163', '133', '163');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('164', 'dummyAuthor164@naver.com', '1234', '카콘');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('164', ' 카콘', '164');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('164', '133', '164');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('134', 0, '히어로 킬러', 1, 28, '토', '전쟁은 빌런들의 패배로 막을 내렸다.이제 세상은 부패한 히어로들이 지배하고 있다.그리고, 그런 히어로들 중 하나가 이화의 언니를 죽였다.언니를 죽인 게 누구인지는 모르지만 상관없다.한 놈씩 죽이다 보면 그중에 있을 테니까.이화는 매일 밤 영웅들을 사냥하는 빌런, 히어로 킬러가 된다. ​한 악당의 지독한 액션 활극.“모조리 죽이고, 빼앗아 주마!”',
        '없음', 'thumbnail_IMAG21_b71167a5-4409-411e-96e8-f2dad9ddbe00.jpg', '2023-10-10');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('165', 'dummyAuthor165@naver.com', '1234', '꿀벌');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('165', '꿀벌 ', '165');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('165', '134', '165');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('166', 'dummyAuthor166@naver.com', '1234', '벌꿀');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('166', ' 벌꿀', '166');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('166', '134', '166');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('135', 0, '브레이커 : 이터널 포스', 6, 45, '월화수목금토일',
        '전설급 현대무협 도시액션이 시작된다.괴롭힘에 옥상에서 죽음을 고민하고 있는 하제. 그 앞에 시운이라는 선배가 나타나대뜸 하제를 아래로 떨어뜨려버린다?! 하지만 무사히 눈을 뜬 곳은 학교 보건실.다시 시작되는 일진들의 괴롭힘에 하제의 반격은 실패로 끝나고..하지만 그 앞에 시운이 다시 등장해 하제를 코치해 하제의 주먹으로 일진들을 일격에 쓰러뜨린다.이제 평범한줄 알았던 학교의 한꺼풀 아래에 있는 무림의 존재가 드러나며, 무림세계로의 험난한 모험이 시작된다.',
        '신작', 'thumbnail_IMAG21_21ee5311-021a-405a-bc57-eea051c54552.jpg', '2023-10-10');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('167', 'dummyAuthor167@naver.com', '1234', '전극진');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('167', '전극진 ', '167');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('167', '135', '167');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('168', 'dummyAuthor168@naver.com', '1234', '박진환');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('168', ' 박진환', '168');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('168', '135', '168');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('136', 8, '더 게이머', 5, 25, '화', '이유도 모른 채 현실이 게임처럼 뒤바뀐다면 어떻게 될까?레벨이 오르고, 스테이터스를 올릴 수 있다면?게임이 되어 버린 현실 속 모험기!', '무료', 'thumbnail_IMAG21_ce8f3dbb-3891-4e83-9782-64fa7986946e.jpg', '2023-10-10');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('169', 'dummyAuthor169@naver.com', '1234', '성상영');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('169', '성상영 ', '169');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('169', '136', '169');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('170', 'dummyAuthor170@naver.com', '1234', '상아');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('170', ' 상아', '170');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('170', '136', '170');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('137', 12, '야수라는 공작에게 시집왔는데', 7, 22, '수', '광활한 영지와 막대한 부를 가진 스테이턴 대 공작이 내게 청혼했다.굳이 영지도 없고 이름만 겨우 귀족 가문인 내게 청혼한 이유가 무엇일까?거기에 더해 수도에서 들려오는 흉흉한 소문이 있었는데…"스테이턴 공작은, 피도 눈물도 없는 야수라고."', '휴재',
        'thumbnail_IMAG21_5a6161fc-9ede-4feb-b3f1-b621ea7e4844.jpg', '2023-10-10');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('171', 'dummyAuthor171@naver.com', '1234', '나양');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('171', '나양 ', '171');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('171', '137', '171');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('172', 'dummyAuthor172@naver.com', '1234', '김승혁');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('172', ' 김승혁 ', '172');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('172', '137', '172');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('173', 'dummyAuthor173@naver.com', '1234', '박약초');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('173', ' 박약초', '173');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('173', '137', '173');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('138', 0, '그 기사가 레이디로 사는 법', 8, 45, '토', '가장 가까운 친우이자 믿었던 부관의 검이 내 몸을 관통했다.다시 눈을 떴을 땐 적국의 귀족 레이디가 되어있었다.낯설고 연약한 타인의 몸과 잃어버린 3년의 세월, 그 사이에 망해버린 나의 조국.배신의 아픔과 정체성의 혼란으로 정신을 차릴 수가 없었다.그러나 나는 결국 살아가기로 했다. 루시펠라 아이딘으로써, 검을 든 귀족 레이디로서.',
        '없음', 'thumbnail_IMAG21_b5ba4df8-fff7-47a0-86f0-2960a054e03e.jpg', '2023-10-10');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('174', 'dummyAuthor174@naver.com', '1234', '아인');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('174', '아인 ', '174');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('174', '138', '174');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('175', 'dummyAuthor175@naver.com', '1234', 'Ink.');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('175', ' Ink. ', '175');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('175', '138', '175');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('176', 'dummyAuthor176@naver.com', '1234', '성혜림');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('176', ' 성혜림', '176');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('176', '138', '176');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('139', 8, '플레이어', 2, 21, '화', '베댓 공약으로 어쩌다 웹툰 속 주인공이 되었다!', '완결', 'thumbnail_IMAG21_ad75ad2a-a372-4f6c-873c-41ddd2e11f79.jpg', '2023-10-10');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('177', 'dummyAuthor177@naver.com', '1234', '박종석');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('177', '박종석 ', '177');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('177', '139', '177');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('178', 'dummyAuthor178@naver.com', '1234', '오현준');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('178', ' 오현준', '178');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('178', '139', '178');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('140', 0, '도깨비의 밤', 9, 36, '목금', '도깨비의 피를 물려받은 반요(半妖) 소년 최시우.이 세상 모든 요괴들의 정점에 올라서기까지.세상의 밤을 다스리는 요마왕(妖魔王).그 자리를 놓고 벌어지는 싸움이 시작된다.', '무료', 'thumbnail_IMAG21_a53a4e1b-3395-44da-b9dc-6fe08c98bee5.jpg', '2023-10-10');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('179', 'dummyAuthor179@naver.com', '1234', '문식');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('179', '문식 ', '179');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('179', '140', '179');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('180', 'dummyAuthor180@naver.com', '1234', '도올');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('180', ' 도올', '180');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('180', '140', '180');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('141', 0, '대위님! 이번 전쟁터는 이곳인가요?', 7, 46, '월화수목금토일',
        '대한민국의 내로라 하는 엘리트 특전사 대위 이윤아.뼛속까지 군인인 그녀의 인생에 로맨스 따위는 없었다. 그러나 해외파병 중 포탄을 맞고 정신을 잃은 그녀 앞에 전혀 다른 세상이 펼쳐진다. 친구가 쓴 로맨스 판타지 소설에 빙의된 것!그것도 비루한 삶을 살아가는 엑스트라  로잘리 가 되어. 깊은 한숨을 내쉬며 머리를 짚는 것도 잠깐, 그녀는 이곳을 전쟁터라 여기고 삶을 바꾸기로 한다. "여긴 계급사회지. 내가 군대라는 계급사회는 질릴 정도로 체험을 했거든." 절대적 카리스마로 공작가를 정복해나가는 대위님!하지만 의도치 않게 로맨스까지 휘어잡게 되는데…. "공작, 황태자를 꿇린 소감이 어때? 황제 폐하를 제외하고 처음으로 누군가한테 무릎 꿇은 건데." 원작 남주인공은 여주인공이 아닌 그녀에게 무릎까지 꿇는다.사랑은 안중에도 없었던 대위님, 이번 전쟁터에서도 승리할 수 있을까?',
        '순위', 'thumbnail_IMAG21_63c2a7a4-ca93-4ab4-8224-769b3dfa692b.jpg', '2023-10-10');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('181', 'dummyAuthor181@naver.com', '1234', '보살');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('181', '보살 ', '181');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('181', '141', '181');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('182', 'dummyAuthor182@naver.com', '1234', '비터버');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('182', ' 비터버 ', '182');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('182', '141', '182');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('183', 'dummyAuthor183@naver.com', '1234', '리묘');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('183', ' 리묘', '183');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('183', '141', '183');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('184', 'dummyAuthor184@naver.com', '1234', 'siAm');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('184', 'siAm', '184');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('142', 15, '소름일기', 10, 42, '월화수목금토일', ' 내 눈 에는 보이지만 남들에게는 보이지 않는  그것 들.어릴 적부터 남들과는 조금 다른 체질로 인해 겪었던 남들에게 말 못할 여러 기이한 경험들을오래된 일기장 넘기듯 풀어내는 실화기반 심령 공포썰.<모태솔로 수용소>,<미드나잇체이서> 작가의 신작!', '무료',
        'thumbnail_IMAG21_11721c44-7e70-45e2-bd2e-da1e4a51922b.jpg', '2023-10-10');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('184', '142', '184');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('185', 'dummyAuthor185@naver.com', '1234', '임목원');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('185', '임목원', '185');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('143', 0, '언다잉', 7, 45, '수일', '전국의 죽어가던 노인들의 병이 한순간에 싹 나았다면?노인 인구가 급증하고 사회적 비용은 폭발 직전!졸지에 노인들을 부양하게 된 젊은 사람들 사이에서 노인들이 버림받고 살해당하는 일도 심심찮게 벌어지게 되는데...죽어가던 사람들이 되살아난 기적인 줄 알았지만 재난인 이야기죽지않는 노인들, 기적일까 저주일까불청객이 되어버린 사람들의 이야기가 시작된다.',
        '없음', 'thumbnail_IMAG21_e90dca57-f705-4a4e-8848-752d809b4b8b.jpg', '2023-10-10');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('185', '143', '185');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('186', 'dummyAuthor186@naver.com', '1234', '민원백');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('186', '민원백', '186');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('144', 0, '그거 사랑 아니야', 10, 40, '목일',
        '수연은 6년 사귄 남자친구 정현과 결혼하려고 하지만 이기적이고 자기밖에 모르는 정현과의 결혼을 주변에서 모두 반대한다."나랑 왜 결혼하고 싶어?" 정현의 마음을 확신 받고자 던진 수연의 질문에 정현은 뜻밖의 답을 내놓는다."우리 아버지 곧 퇴직하시는데 그전에 뿌린 축의금 환수해야지."뭐!? 그게 나와 결혼하려는 이유라고!? 혼란스러운 마음도 잠시, 회사 후임 도경과 지독하게 엮여버리는데…', '휴재',
        'thumbnail_IMAG21_9ea6aae5-1236-4ff9-9a36-d4bb1eb5f210.jpg', '2023-10-10');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('186', '144', '186');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('187', 'dummyAuthor187@naver.com', '1234', '임성훈');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('187', '임성훈', '187');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('145', 15, '새동네', 2, 36, '화목토', '오갈 데 없는 노인들이 산간벽지를 개간해 작은 마을 공동체를 이루며 살기 시작하였으니, 이름하여 새동네! 어느 날, 새동네 일대가 신도시 재개발에 휩싸이고 부정한 세력들이 들어오자 마을의 평화와 존립을 위해 결국 노인들이 나서며 경고하는데…... “잠 자는 사자의 코털은 건드는 게 아녀~!”', '무료',
        'thumbnail_IMAG21_c3681647-f04f-42e4-aa82-da16d75a15ad.jpg', '2023-10-10');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('187', '145', '187');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('188', 'dummyAuthor188@naver.com', '1234', '나유진');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('188', '나유진', '188');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('146', 15, '웅크', 7, 41, '목', '그시절 우리가 사랑했던 웹툰 <일상날개짓> 나유진 작가님의 힐링 차기작.  나는 왜 태어났을까?  지금 이곳에 존재하기 위해 얼마나 꼬물꼬물 애썼던가. 그 잃어버린 기억을 찾아 떠나는 엄마 뱃속 감성 판타지! 하나의 세포에 불과했던 우리 모두가 거쳐온, 280일의 성장 이야기가 시작된다.', '무료',
        'thumbnail_IMAG21_21640049-34da-44e5-82d7-bbb7aca3a3f8.jpg', '2023-10-10');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('188', '146', '188');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('189', 'dummyAuthor189@naver.com', '1234', '38');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('189', '38', '189');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('147', 12, '쌈빡', 10, 47, '수', '마천에는 오래된 소문이 하나 있다.그것은 이 학교가 조폭양성소라는 소문..물론 아직은 소문일 뿐이다.', '무료', 'thumbnail_IMAG21_54762710-164c-4341-90ac-d9cea424eb15.jpg', '2023-10-10');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('189', '147', '189');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('148', 0, '평화식당', 8, 40, '월', '여러 차원이 뒤섞여 아수라장이 된 서울.지옥에서 온 마왕, 축복 받은 용사, 멸망급 드래곤...그들 모두 이곳 평화식당에선 얌전한 손님에 불과하다!차원 최강 요리사  수아 의 평화로운(?) 식당 운영기!!', '휴재', 'thumbnail_IMAG21_7a731990-1b33-4d79-8c00-e8fe03460618.jpg', '2023-10-10');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('190', 'dummyAuthor190@naver.com', '1234', '턍');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('190', '턍 ', '190');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('190', '148', '190');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('191', 'dummyAuthor191@naver.com', '1234', '서우서우');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('191', ' 서우서우', '191');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('191', '148', '191');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('149', 0, '성스러운 그대 이르시길', 9, 47, '월', '신성국의 이단심문관  맥클라트 는 대신관의 명으로 사악한 대마녀  비에니 를 사로잡는다. 그런데 비에니는 오히려 마녀사냥을 돕겠다며 다른 마녀들을 밀고한다. 자기 앞에선 두려움에 떨면서도, 마녀를 정화하는 데는 거리낌이 없는 비에니. 그녀를 곁에 두며 맥클라트는 자신의 감정과 신념에 점점 혼란스러움을 느끼는데...', '없음',
        'thumbnail_IMAG21_487ec2b2-9670-456f-9837-733602d048b1.jpg', '2023-10-10');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('192', 'dummyAuthor192@naver.com', '1234', '26');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('192', '26', '192');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('192', '149', '192');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('193', 'dummyAuthor193@naver.com', '1234', '유다');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('193', ' 유다', '193');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('193', '149', '193');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('194', 'dummyAuthor194@naver.com', '1234', '앵뚜');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('194', ' 앵뚜 ', '194');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('194', '149', '194');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('195', 'dummyAuthor195@naver.com', '1234', '로주');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('195', ' 로주 ', '195');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('195', '149', '195');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('196', 'dummyAuthor196@naver.com', '1234', '미나토');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('196', ' 미나토', '196');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('196', '149', '196');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('150', 15, '로또 황녀님', 9, 21, '목',
        '[나는 환생과 회귀를 멋지게 한 아기를 만나고 싶단다. 한 번 더 살아볼 테냐?]전생의 유명 유튜버, 다음 인생에서 신이 좋은 가문에 태어나게 해 준댔는데,망한 황실의 황녀로 태어나고 말았다!그런데 절망도 잠시, 띠롱! 소리와 함께 눈앞에 채팅창이 떠올랐다.이게 다 뭐야?[베르크: 내 조카가 빵이 먹고 싶다는군.][베르크: 제국의 모든 빵집을 수배해.]', '순위',
        'thumbnail_IMAG21_761b9cda-5024-4109-bd3d-77e07ca6010f.jpg', '2023-10-10');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('197', 'dummyAuthor197@naver.com', '1234', '무무경');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('197', '무무경 ', '197');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('197', '150', '197');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('198', 'dummyAuthor198@naver.com', '1234', '도힌');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('198', ' 도힌', '198');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('198', '150', '198');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('199', 'dummyAuthor199@naver.com', '1234', '보리멸');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('199', ' 보리멸', '199');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('199', '150', '199');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('200', 'dummyAuthor200@naver.com', '1234', '연일');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('200', '연일', '200');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('151', 8, '그냥 선생님', 5, 22, '화', '선생님 집은 학교 아니에요? 선생님도 집이 있어요?우리들 모두의 학창 시절, 언제나 그 자리에 있을 거만 같은 선생님들.수업이 끝난 교실, 학교 바깥. 그냥 선생님들의 평범하고 사랑스러운 일상,일상 로맨스 <그냥 선생님>', '완결', 'thumbnail_IMAG21_b39d8b31-ca85-492f-8588-c766aa2b3c27.jpg',
        '2023-10-10');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('200', '151', '200');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('152', 8, '킬 더 드래곤', 6, 29, '화', '"필사적으로 살아남아라."인류는 침략자  드래곤 에게 멸망을 선고받았다.붕괴 직전의 세계에서 인류를 수호하기 위해전쟁고아 이한은  사이커 로 각성한다!', '완결', 'thumbnail_IMAG21_f6a66314-b084-4f48-ae7d-e5ee5771f17a.jpg', '2023-10-10');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('201', 'dummyAuthor201@naver.com', '1234', '현가');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('201', '현가 ', '201');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('201', '152', '201');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('202', 'dummyAuthor202@naver.com', '1234', '미스 지수');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('202', ' 미스 지수 ', '202');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('202', '152', '202');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('203', 'dummyAuthor203@naver.com', '1234', '백수귀족');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('203', ' 백수귀족', '203');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('203', '152', '203');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('153', 8, '신컨의 원 코인 클리어', 8, 28, '화', '가입자 30억, 동시 접속자 3억. 클리어한 사람 0명.수천만명이 수천, 수만번 도전해도 클리어 하지 못한 가상현실 게임 ‘단탈리안’에 동생이 갇혔다."나 킹피 월챔 5회 연속 우승자야. 나보다 가상현실 게임 잘 하는사람, 공식적으로는 없어.""단탈리안은 한번도 해본 적 없잖아!""괜찮아.단탈리안, 내가 깬다."', '휴재',
        'thumbnail_IMAG21_707d140c-65e7-4164-a885-dd99ea22f266.jpeg', '2023-10-10');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('204', 'dummyAuthor204@naver.com', '1234', '스튜디오 호호이');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('204', '스튜디오 호호이 ', '204');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('204', '153', '204');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('205', 'dummyAuthor205@naver.com', '1234', 'Akheres');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('205', ' Akheres', '205');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('205', '153', '205');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('206', 'dummyAuthor206@naver.com', '1234', '스페트');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('206', '스페트', '206');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('154', 0, '괴물 의상실', 9, 46, '월', '패션 디자이너의 꿈을 포기하던 그날, 낯선 세계에 떨어진 윤비단은 우연한 기회로 수상한 의상실에서 일하게 된다.그곳은 바로 괴물이 인간 사이에 섞여 살아갈 수 있도록 특수한 옷만을 제작하는 괴물 맞춤 의상실 ‘루델리’.윤비단은 그곳에서 수많은 괴물들을 만나며 옷을 디자인하게 되는데..과연 꿈을 되찾고 어엿한 디자이너가 될 수 있을까?', '완결',
        'thumbnail_IMAG21_f692e2df-891a-458f-bc8a-e7040ebf8c6f.jpg', '2023-10-10');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('206', '154', '206');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('207', 'dummyAuthor207@naver.com', '1234', '김민혁');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('207', '김민혁', '207');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('155', 0, '후덜덜덜 남극전자', 6, 45, '월', '남극전자 출근 1일차, 신입사원 김정훈! 이직을 준비중입니다.', '없음', 'thumbnail_IMAG21_a5f5b19f-5c44-4adf-b801-ec831eadc27b.jpg', '2023-10-10');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('207', '155', '207');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('208', 'dummyAuthor208@naver.com', '1234', '초승');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('208', '초승', '208');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('156', 0, '온리호프', 10, 48, '금', '사랑스러운 남편의 살인을 목격한 그날 밤,은혜는 살해 당해 그를 처음 만난 9년 전으로 돌아왔다.과연 남편의 연쇄살인을 막을 수 있을까?그리고... 예전처럼 다시 사랑할 수 있을까?', '신작', 'thumbnail_IMAG21_e5f6d283-25ac-4c32-be9a-b883c1ba7b87.jpg', '2023-10-10');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('208', '156', '208');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('209', 'dummyAuthor209@naver.com', '1234', '혼');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('209', '혼', '209');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('157', 15, '절대복종', 10, 32, '목', '일진들의 괴롭힘을 받던 다임은 자신의 오래된 핸드폰에서 자신의 인생을 바꿀 게임을 만나게 된다.일진들을 부려먹고, 선량한 조력자들을 포섭하여 성장시킬 수 있는 사기적인 전략 RPG 게임!이 RPG 게임의 최종 목표는 학교 폭력을 세상에서 없애는 것이다.', '순위',
        'thumbnail_IMAG21_b01c5e4c-fe6f-4817-a0db-b00b80b3ec94.jpeg', '2023-10-10');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('209', '157', '209');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('210', 'dummyAuthor210@naver.com', '1234', '은작');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('210', '은작', '210');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('158', 0, '룸9', 8, 22, '금',
        '평범한 대학생 채수진은 정체 모를 공간에 감금되어 있다. 몇 날을 고립감과 외로움으로 괴로워하던 중 이곳에 대한 소개와 나갈 수 있는 방법이 제시된다. 공간은 9개의 밀실로 구성되어 있고 각 방에는 사람들이 갇혀있다. 갇혀있는 사람들 중에 잔인한 연쇄살인마가 있고, 이곳을 탈출하는 유일한 방법은 이 살인마를 죽이는 것이다. 과연 채수진은 지옥에서 빠져나갈 수 있을 것인가!', '완결',
        'thumbnail_IMAG21_54a73ea1-f5b7-482e-81be-6e5d049b7e3e.jpg', '2023-10-10');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('210', '158', '210');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('211', 'dummyAuthor211@naver.com', '1234', '공현곤');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('211', '공현곤', '211');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('159', 0, '지니오패스', 7, 40, '일',
        ' 살인욕구를 가진 천재들을 이용해 힘을 독차지하려는 비밀조직이 존재한다! 참전 후 살인망상에 시달리는 퇴역군인 도마도. 치료를 위해 방문한 정신상담센터에서 다짜고짜 자신을 대한민국 최상위급 천재라며 의문의 전화번호가 적힌 명함 한장을 건넨다. 그 번호를 누르니 연결된 상담원은 마도에게 원하는 뒤처리 서비스를 선택하라며네 가지 보기를 주는데… 1번 폭행, 2번 납치, 3번 강도 그리고 4번 살인.', '순위',
        'thumbnail_IMAG21_1ae3f0d3-f4ed-4a90-86f0-dc7d028b1782.jpg', '2023-10-10');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('211', '159', '211');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('212', 'dummyAuthor212@naver.com', '1234', '석영');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('212', '석영', '212');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('160', 8, '여름여자 하보이', 6, 46, '화', '여름마다 비밀을 간직한 여자, 하보이.내 머리속엔 ‘이것’만 있어야 하는데 윗층에 세 들어온 트롯 작사가 을준이 거슬리기 시작한다!간단명료한 그녀 ‘하보이’와 복잡미묘한 그 ‘권을준’의 로맨틱 코미디.', '순위', 'thumbnail_IMAG21_68171ccc-7365-47ed-babe-6e20dc3fc3b5.jpg', '2023-10-10');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('212', '160', '212');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('213', 'dummyAuthor213@naver.com', '1234', '장태산');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('213', '장태산', '213');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('161', 0, '몽홀', 8, 35, '토', '차갑고 척박한 땅 몽홀그 곳에서 펼쳐지는 감동의 대서사시', '신작', 'thumbnail_IMAG21_3618981192359294768.jpg', '2023-10-10');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('213', '161', '213');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('162', 0, '멜빈이 그들에게 남긴 것', 10, 25, '월',
        '"이건 당신을 지키고 복수를 돕기 위한 형식적인 혼인입니다."네우스 성의 귀한 아가씨, 셰릴.어느 밤, 숙부의 반란으로 오라비가 살해당하고, 그녀 역시 죽임을 당할 위기에 처한다. 모든 걸 포기한 마지막 순간. 구원이 찾아왔다.“기어이 내 혼약자를 죽이고 싶다면. 네우스 성은 전쟁을 각오해야 할 거다.”가짜 혼약을 앞세워 그녀를 구해준 블레어의 성주, 펠릭스. 오라버니의 친구로만 알고 있던 그와의 낯선 결혼생활이 시작된다.',
        '무료', 'thumbnail_IMAG21_cce91579-a3d8-45c0-b82e-c8e9a64faf69.jpg', '2023-10-10');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('214', 'dummyAuthor214@naver.com', '1234', '삼칠13');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('214', '삼칠13 ', '214');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('214', '162', '214');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('215', 'dummyAuthor215@naver.com', '1234', '팀 해피게리');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('215', ' 팀 해피게리 ', '215');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('215', '162', '215');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('216', 'dummyAuthor216@naver.com', '1234', '류희온');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('216', ' 류희온', '216');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('216', '162', '216');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('217', 'dummyAuthor217@naver.com', '1234', 'bunny');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('217', 'bunny', '217');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('163', 0, '스토커의 하루', 3, 37, '토',
        '옆집엔 스토커가 살고 윗집엔 미치광이가 산다! 끔찍한 기억의 고시원에서 벗어나 허름한 원룸으로 도망쳐 나온 미대생 ‘김하루’. 이사 온 지 한 달 만에 옆집에는 자살 사건이 발생하고 그 방엔 음침하고 수상해 보이는 여자가 이사 온다. 그러던 어느 날 집으로 돌아온 김하루의 눈앞에 자신의 방에서 식칼을 든 채 서 있는 옆집 여자와 마주치게 되는데… “하루씨… 난 당신을 위해 뭐든 할 수 있어.”', '완결',
        'thumbnail_IMAG21_cda3c8aa-f076-439a-94e9-cdac4f0b5db7.jpeg', '2023-10-10');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('217', '163', '217');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('164', 12, '50대덕툰', 9, 34, '수', '본 콘텐츠는 대전과학산업진흥원과 대전정보문화산업진흥원(웹툰캠퍼스)의 브랜드웹툰입니다.', '없음', 'thumbnail_IMAG21_db171410-45d0-403c-8626-dd1374bad6ff.jpg', '2023-10-10');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('218', 'dummyAuthor218@naver.com', '1234', '김대훈');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('218', '김대훈', '218');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('218', '164', '218');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('219', 'dummyAuthor219@naver.com', '1234', '신여름');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('219', ' 신여름', '219');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('219', '164', '219');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('220', 'dummyAuthor220@naver.com', '1234', '임상윤');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('220', ' 임상윤', '220');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('220', '164', '220');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('221', 'dummyAuthor221@naver.com', '1234', '서나래');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('221', ' 서나래 ', '221');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('221', '164', '221');
-- INSERT INTO user_tb (`id`,`email`,`password`,`username`) VALUES ('222', 'dummyAuthor222@naver.com', '1234', '김대훈');
-- INSERT INTO author_tb (`id`,`author_nickname`,`user_id`) VALUES ('222', ' 김대훈','222');
-- INSERT INTO webtoon_author_tb (`id`,`webtoon_id`,`author_id`) VALUES ('222', '164', '222');
-- INSERT INTO user_tb (`id`,`email`,`password`,`username`) VALUES ('223', 'dummyAuthor223@naver.com', '1234', '신여름');
-- INSERT INTO author_tb (`id`,`author_nickname`,`user_id`) VALUES ('223', ' 신여름','223');
-- INSERT INTO webtoon_author_tb (`id`,`webtoon_id`,`author_id`) VALUES ('223', '164', '223');
-- INSERT INTO user_tb (`id`,`email`,`password`,`username`) VALUES ('224', 'dummyAuthor224@naver.com', '1234', '만두인');
-- INSERT INTO author_tb (`id`,`author_nickname`,`user_id`) VALUES ('224', ' 만두인','224');
-- INSERT INTO webtoon_author_tb (`id`,`webtoon_id`,`author_id`) VALUES ('224', '164', '224');
-- INSERT INTO user_tb (`id`,`email`,`password`,`username`) VALUES ('225', 'dummyAuthor225@naver.com', '1234', '서나래');
-- INSERT INTO author_tb (`id`,`author_nickname`,`user_id`) VALUES ('225', ' 서나래','225');
-- INSERT INTO webtoon_author_tb (`id`,`webtoon_id`,`author_id`) VALUES ('225', '164', '225');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('165', 8, '바스티안', 9, 30, '화',
        '고물상의 손자와 거지 공주가 결혼했다.유효 기간은 2년, 각자의 이익을 도모하기 위한 계약이었다.촉망받는 해군 장교이자 대부호, 금빛 찬란한 성공을 거두고도 비천한 혈통 탓에 멸시받는 고물상의 손자.바스티안 클라우비츠는 출세와 복수를 위한 징검돌이 필요했다.과거의 영광밖에 남지 않은 몰락 귀족, 황실의 혈통을 가지고도 날품팔이를 해 생계를 이어가는 거지 공주.오데트 폰 디센은 새로운 삶을 시작하기 위한 돈이 필요했다.성공적인 거래라고 생각했다.예상치 못한 손해가 발생하기 전까지는.“내게 가장 소중한 걸 망쳐 놓았으니, 너도 가장 소중한 걸 잃어야 공평한 거래지. 안 그래?” 바스티안은 막대한 손해에 대한 책임을 묻기로 했다.증오와 원망,미련, 이 빌어먹을 여자의 이름자까지.모든 것이 하얗게 불태워져 사라진 완전한 끝을 위하여.',
        '순위', 'thumbnail_IMAG21_7c73fc44-700b-4bf4-a1a2-7d3e781638a8.jpg', '2023-10-10');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('226', 'dummyAuthor226@naver.com', '1234', '아빈');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('226', '아빈 ', '226');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('226', '165', '226');
-- INSERT INTO user_tb (`id`,`email`,`password`,`username`) VALUES ('227', 'dummyAuthor227@naver.com', '1234', '솔체'); --158 중복
-- INSERT INTO author_tb (`id`,`author_nickname`,`user_id`) VALUES ('227', ' 솔체','227'); --158 중복
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('227', '165', '158');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('228', 'dummyAuthor228@naver.com', '1234', '조니조');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('228', '조니조', '228');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('166', 12, '너의 키스씬', 10, 35, '수',
        '예능작가 이슬, 새로 담당한 예능프로그램에 최애 아이돌인 블록슛 승찬의 출연소식을 듣는다.10년 넘게 좋아한 최애를 만난다는 기대도 잠시, 방송국에서 우연히 최애가 다른 사람과 몰래 키스하는 현장을 목격한다.게다가 담당한 예능 프로그램은 출연자들끼리 데이트 하는 모습으로 가득한 연애버라이어티라는데...나 아닌 다른 사람과 썸타고 연애하는 모습을 지켜봐야 한다. 비록 그가 나의 최애, 혹은 썸남일지라도.<점핑오버> 조니조 작가 신작!',
        '무료', 'thumbnail_IMAG21_78b255d2-1610-4884-8226-6d2894c6fd35.jpg', '2023-10-10');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('228', '166', '228');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('229', 'dummyAuthor229@naver.com', '1234', '엥비');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('229', '엥비', '229');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('167', 0, '달이 없는 나라', 10, 43, '일', '온 나라의 모든 집안이 부계를 따르지만, 단 한 곳 황실만은 어머니로부터 딸에게 황위가 이어진다. 그리고 아들을 내세워 여황제의 눈에 들고자 하는 귀족들.  사랑조차 협잡이 되는 황궁에 홀로 던져진 태자 선요. 그녀는 선택해야 한다. 태자의 정실이 되는 것은 누구일까? 그리고 모든 것이 끝났을 때, 선요는 사랑과 권력을 둘 다 가질 수 있을까?',
        '없음', 'thumbnail_IMAG21_3978478587194062641.jpg', '2023-10-10');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('229', '167', '229');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('230', 'dummyAuthor230@naver.com', '1234', '김이연');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('230', '김이연', '230');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('168', 8, '메소드 연기법', 8, 45, '화',
        '메소드 연기로 유명한 천재 배우 서시아.새로운 드라마 방영을 앞둔 그녀의 주변에서 미심쩍은 살인사건이 연이어 일어난다.그녀의 새로운 경호원 봉수는 살인사건과 그녀 사이에 연관성이 있다는 사실을 알아차리고, 비밀을 파헤치기 위해 조금씩 사건을 파고들게 되는데….완벽한 그녀의 연기력, 과연 숨겨진 비밀은 무엇일까?!<뱀이 앉은 자리>, <구독금지> 김이연 작가의 스릴러 신작.', '없음',
        'thumbnail_IMAG21_e19883fb-74f1-4491-9b72-8731946a11fc.jpg', '2023-10-10');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('230', '168', '230');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('231', 'dummyAuthor231@naver.com', '1234', '라라뮤');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('231', '라라뮤', '231');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('169', 0, '여름의 너에게', 4, 21, '월', '15살 여름, 하루아침에 서울에서 시골로 이사를 가게 된 소라. “여기서 어떻게 살아?!" 뒤바뀐 일상에 울적해진 소라의 앞에 두 소년이 나타난다.이사 온 첫날부터 늘 곁에서 도와주는 자상한 윤이, 얄궂지만 따뜻한 구석도 있는 태민.마음에 안 드는 것만 가득한 이 동네에서, 소라를 설레게 하는 사람은 누굴까?', '없음',
        'thumbnail_IMAG21_c4b3d6de-861e-46f2-983c-cb42ac787cf1.jpg', '2023-10-10');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('231', '169', '231');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('232', 'dummyAuthor232@naver.com', '1234', '이선');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('232', '이선', '232');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('170', 0, '개를 낳았다', 7, 26, '금', '사랑스러운 너와의 첫 만남부터 이별까지. 처음으로 반려견을 키우게 된 다나와 모든것이 처음인 강아지 명동이가 만나 함께 살아가는 이야기. 강아지 수명 20년. 너와 내가 함께하는 20년 동안 우린 어떤 일을 겪게 될까?', '무료', 'thumbnail_IMAG21_7220173143199539507.jpg', '2023-10-10');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('232', '170', '232');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('233', 'dummyAuthor233@naver.com', '1234', '바리');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('233', '바리', '233');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('171', 0, '오!너의 리스크', 2, 40, '월', '국내 굴지의 대기업 재벌 3세 차 상무, 그 기업의 법무팀 사원 윤의민이 둘은 서로 잘 아는 사이이지만 둘의 관계가 알려지면 모두에게 위험하다.재벌 3세 차 상무로 인해 벌어지는 오너리스크 때문에', '신작', 'thumbnail_IMAG21_7234251265032676917.jpg', '2023-10-10');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('233', '171', '233');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('172', 0, '재앙의 날', 3, 31, '토', '2009년, 한 산골마을에서 주민이 총살당한다. 연이어 일어나는 불길한 일들. 마을에서 나고 자란 소년  조정우 는 자신을 바라보는 미스터리한 시선을 느끼고, 걷잡을 수 없는 재앙에 휘말리기 시작한다.', '신작', 'thumbnail_IMAG21_3846462416433133112.jpg', '2023-10-10');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('234', 'dummyAuthor234@naver.com', '1234', '환상특급');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('234', '환상특급 ', '234');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('234', '172', '234');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('235', 'dummyAuthor235@naver.com', '1234', '이승찬');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('235', ' 이승찬', '235');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('235', '172', '235');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('236', 'dummyAuthor236@naver.com', '1234', '시뉴라');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('236', '시뉴라', '236');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('173', 0, '드래곤의 심장을 가지고 있습니다', 3, 27, '일', '천 년전 포악한 드래곤을 무찔렀다는 용사 샤론.샤론을 동경하며 자란 아루 앞에 어느날 정체불명의 남자가 등장한다.뭐? 자기가 바로 그 무시무시한 드래곤이라고? 게다가 내가 바로 그 용사라는데?!천 년만에 재회한 드래곤과 용사의 귀엽고도 애절한 로맨스 판타지!', '무료',
        'thumbnail_IMAG21_bb5de21f-2810-450e-9d4d-874d0decc936.jpg', '2023-10-10');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('236', '173', '236');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('174', 0, '백년게임', 5, 32, '일', '"당신의 게임은 여기까지군요" 백 년마다 열리는 소원 그 이상을 이뤄주는 대회, 최종 우승자는 단 한 명.소년 한시준, 가족을 구하기 위해 모든 것을 걸고 치열한 전투에 뛰어든다.', '없음', 'thumbnail_IMAG21_8797d0ef-cefd-463b-bf97-1361a5de293b.jpg', '2023-10-10');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('237', 'dummyAuthor237@naver.com', '1234', '하람');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('237', '하람 ', '237');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('237', '174', '237');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('238', 'dummyAuthor238@naver.com', '1234', '지야');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('238', ' 지야', '238');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('238', '174', '238');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('239', 'dummyAuthor239@naver.com', '1234', '고농');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('239', '고농', '239');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('175', 0, '우리 무슨 사이야?', 1, 30, '월', '세희와 연우는 어릴 때 부터 알고 지낸 소꿉친구이지만, 사실 세희는 연우를 짝사랑하고 있다. 그러나 짝사랑을 시작한 시점 이후로 묘하게 차가워진 연우의 태도. 이에 세희는 가망 없는 짝사랑을 접기로 결심한다.그런 세희의 앞에 전학생 서진이 나타나고 둘은 점점 가까워지는데…', '무료',
        'thumbnail_IMAG21_a0759dac-4e68-4ce1-b787-a2a235d1bd37.jpg', '2023-10-10');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('239', '175', '239');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('240', 'dummyAuthor240@naver.com', '1234', '뼈피살');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('240', '뼈피살', '240');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('176', 0, '합법해적 파르페', 5, 40, '토', '비범한 공주님 파르페의 신묘한 모험 판타지', '순위', 'thumbnail_IMAG21_e7de7318-0952-49a2-9e24-335e0a321ce8.jpg', '2023-10-10');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('240', '176', '240');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('241', 'dummyAuthor241@naver.com', '1234', '아르몽');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('241', '아르몽', '241');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('177', 8, '별빛 커튼콜', 5, 37, '화',
        '화려한 인플루언서로 살아온  문유별 . 아버지 사업이 망하며 성월에 있는 외할아버지 집으로 쫓기듯 내려오고, 그곳에 살고 있는 남자  오리온 을 만나게 된다. ​빚더미에서 벗어나기 위해, 외할아버지가 남긴 유산을 받으려 고군분투하는 유별과, 사사건건 유별을 방해하는 리온. ​과연 유별은 무사히 유산을 받고 원래의 삶으로 돌아갈 수 있을까? 성월에서 펼쳐지는 힐링 로맨스!', '무료',
        'thumbnail_IMAG21_e2baecd4-0f45-40b2-9de9-667f86e1f7f2.jpg', '2023-10-10');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('241', '177', '241');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('242', 'dummyAuthor242@naver.com', '1234', '원김');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('242', '원김', '242');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('178', 8, '미드우트', 3, 33, '화', '괴물 처치 부대  스레투 가 사라진 지금... 인간들은 괴물들의 먹이가 되었다. 이유는  이안 이라는 오퍼 지원자가 모든 군인들을 죽여버렸기 때문이다. 태어날 때부터 생명의 위협을 받으며 살아온  진청도 는 전설의 아이템  미드우트 를 이용해 과거로 가서 스레투를 학살한 이안을 죽이려 하는데...', '순위',
        'thumbnail_IMAG21_027497ee-7115-4fb9-b8ae-d99f54e47e42.jpg', '2023-10-10');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('242', '178', '242');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('179', 15, '하나는 적고 둘은 너무 많아', 6, 49, '목', '전 남편과 익명 데이트 어플에서 만났다...?연애부터 결혼까지 10년이란 긴 세월의 마침표를 찍고 얼마 전 이혼한 마루와 지호. 두 사람은 각각 외로운 마음을 달래고자 익명의 데이트 어플  큐피드 를 설치하게 되는데...  서로를 모르는 채 매칭이 된 두 사람은 이곳에서 은밀한 비밀을 공유하는 사이가 된다.', '없음',
        'thumbnail_IMAG21_ea1917eb-9a72-45ab-a7fe-fa5cbd90b2ca.jpg', '2023-10-10');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('243', 'dummyAuthor243@naver.com', '1234', '젤리피쉬');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('243', '젤리피쉬 ', '243');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('243', '179', '243');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('244', 'dummyAuthor244@naver.com', '1234', '손모모');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('244', ' 손모모', '244');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('244', '179', '244');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('180', 0, '천상의 주인', 2, 24, '일',
        '모두가 척박한 지상을 벗어나 풍족한 하늘로 가기를 꿈꾸는 세상.500년 전, 하늘이 붕괴되고 아홉 층운으로 갈라지면서 서바이벌이 시작된다. 아홉 층운을 넘어 천상에 오르는 자. 세상의 주인이 되리라. 가혹한 세상을 증오하였던 지크는 자신의 운명을 바꾸고자 천상에 오르길 꿈꾸고...마침내 아홉 층운으로 이어지는  하늘의 문 이 열리는 날, 오랫동안 염원하던 하늘길을 여는 특별한 새  소울버드 를 얻고는 하늘로 향하는 모험을 시작하게 된다.',
        '신작', 'thumbnail_IMAG21_0fd8f2b5-635c-4d34-ad9a-ef26e4de39ac.jpg', '2023-10-10');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('245', 'dummyAuthor245@naver.com', '1234', '권러프');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('245', '권러프 ', '245');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('245', '180', '245');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('246', 'dummyAuthor246@naver.com', '1234', 'MOOHAK');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('246', ' MOOHAK', '246');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('246', '180', '246');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('181', 0, '푸른 밤, 황홀의 윤무', 9, 29, '토', '평범한 회사원 강서윤은 피아니스트 안희원의 연주회장에서 깜빡 잠이 든다. 사람 한 명 남지 않은 콘서트홀에 남아 있던 그녀는 살인 사건을 방조하고 피 웅덩이에서 피아노를 연주하는 안희원을 목격하는데……?“그러니까 먹히든지, 죽든지. 선택은 우리 서윤 씨가 해요.”', '순위',
        'thumbnail_IMAG21_cfc478c6-3b56-4bdf-b959-089775b2b916.jpg', '2023-10-10');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('247', 'dummyAuthor247@naver.com', '1234', '호찌');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('247', '호찌 ', '247');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('247', '181', '247');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('248', 'dummyAuthor248@naver.com', '1234', '해독');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('248', ' 해독 ', '248');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('248', '181', '248');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('249', 'dummyAuthor249@naver.com', '1234', '유안나');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('249', ' 유안나', '249');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('249', '181', '249');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('182', 0, '비밀친구', 10, 48, '일', '세상의 모든 비밀을 알 수 있다면 그것은 축복일까?충격적인 비밀들을 나에게 알려주는 악마,그러나 이를 발설하면 상대는 죽음에 이르게 된다.악마와의 위험한 공존 속에서 그를 처단해야 한다.', '휴재', 'thumbnail_IMAG21_7089289671999633716.jpg', '2023-10-10');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('250', 'dummyAuthor250@naver.com', '1234', '이밤애');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('250', '이밤애 ', '250');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('250', '182', '250');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('251', 'dummyAuthor251@naver.com', '1234', '사바싸');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('251', ' 사바싸', '251');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('251', '182', '251');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('252', 'dummyAuthor252@naver.com', '1234', '전구');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('252', '전구', '252');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('183', 0, '애증화음', 6, 31, '금', '치열하게 경쟁하는 서화예술고등학교 피아노과의 두 여학생 최인정과 선경화. 중학교 시절부터 시작된 그들의 라이벌 관계는 끈질기게 계속되어왔다. 고3이 된 최근, 항상 아슬하게 뒤처지던 인정의 피아노 실력이 경화를 바짝 따라잡았고 경화는 위기감에 흔들리기 시작하는데...경화를 향한 인정의 집착, 인정을 향한 경화의 불안. 그 이유는 무엇일까.', '완결',
        'thumbnail_IMAG21_86c1543c-a30a-41cd-b010-ca749e5e7f25.jpg', '2023-10-10');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('252', '183', '252');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('253', 'dummyAuthor253@naver.com', '1234', '김찹쌀');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('253', '김찹쌀', '253');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('184', 8, '신의 최애캐', 10, 26, '화', '모든 것이 완벽한 고등학생 홍강후. 하지만 딱 하나, 그에게 허락되지 않은 것은 바로  연애 다.4월 8일 고백데이를 앞두고 드디어  모쏠인생  강후에게도 봄날이 오는가 싶었는데...', '무료', 'thumbnail_IMAG21_d687ee7c-9d25-4b56-8b89-b0acf3c0662a.jpg', '2023-10-10');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('253', '184', '253');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('254', 'dummyAuthor254@naver.com', '1234', 'HYBE');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('254', 'HYBE', '254');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('185', 0, '크림슨 하트', 5, 33, '토',
        ' 푸른 반딧불이 로 인해 폭주하는 마법의 땅 언노운, 그런 마법으로부터 완전히 차단된 통제도시 레퓨지아레퓨지아에서 완벽한 시스템을 통해 관리되며 살아가던 소녀들은어느날 도서관에서 의문의 낡은 책과 붉은 목걸이를 발견한다.자신들의 손에 쥐어진 것이 무엇인지도 모른 채소녀들은 푸른 반딧불이를 보고 호기심에 이끌려 아무도 넘지 않았던 장벽을 넘어 도시 밖으로 나간다소녀들의 손에 쥐어진 전설의 크림슨 하트, 푸른 반딧불이 섬의 저주를 풀라 는 의문의 메시지.미지의 땅 언노운을 모험할수록 밝혀지는 레퓨지아의 비밀과 푸른 반딧불이의 진실...소녀들의 운명은? 크림슨 하트 with 르세라핌',
        '없음', 'thumbnail_IMAG21_99fc6540-7391-462a-b08b-326f55a8b354.jpg', '2023-10-10');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('254', '185', '254');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('255', 'dummyAuthor255@naver.com', '1234', '햇살');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('255', '햇살', '255');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('186', 0, '세라는 망돌', 5, 24, '일', '톱스타 부부의 딸로 태어나 국내 최정상 인기 아이돌로 탄탄대로를 걷고 있던 강세라는 돌연 은퇴 선언 후 시골로 도망친다. 더이상 노래도 사랑도 싫다며 도망친 세라는 그곳에서 뜻밖의 소년들을 만나게 되는데.... 세라는 다시 노래할 수 있을까?', '무료',
        'thumbnail_IMAG21_3fa11f89-cf2d-4258-b130-7dd84bc14c95.jpg', '2023-10-10');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('255', '186', '255');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('187', 0, '뜨거운 홍차', 4, 30, '일', '학교를 자퇴하고 생계를 위해 아르바이트를 전전하는 누리.신세지고 있던 회장님 댁 아들이 오토바이 사고로 장기입원한다.회장님의 분노를 염려한 사모님은 아들과 똑 닮은 누리에게 남장을 하고 학교를 대신 다녀줄 것을 제안하는데..."아니... 사모님, 저는 여자인데요...?"', '순위',
        'thumbnail_IMAG21_84951a6c-71f7-42d1-8656-2625b47a9de9.jpg', '2023-10-10');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('256', 'dummyAuthor256@naver.com', '1234', '에리카');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('256', '에리카', '256');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('256', '187', '256');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('257', 'dummyAuthor257@naver.com', '1234', '느리');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('257', ' 느리 ', '257');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('257', '187', '257');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('258', 'dummyAuthor258@naver.com', '1234', 'ZZING');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('258', ' ZZING ', '258');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('258', '187', '258');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('259', 'dummyAuthor259@naver.com', '1234', '김빵');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('259', ' 김빵', '259');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('259', '187', '259');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('260', 'dummyAuthor260@naver.com', '1234', '세하');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('260', '세하', '260');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('188', 0, '지옥 키우기', 9, 37, '월', '망해버린 <지옥>을 성장시키는 악마의 게임, <지옥 키우기>! 상상 가능한 모든 것을 플레이어에게 줄 수 있는 <지옥>을 성장시키기 위해 현실의 인간을 게임 속에 가두고 괴롭혀야 하는데... 악마가 되더라도 모든 것을 가질 것인가?인간으로 남아 불공평한 삶을 견딜 것인가?', '순위',
        'thumbnail_IMAG21_54515d5f-c297-48b9-a9ad-07c759d278b4.jpg', '2023-10-10');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('260', '188', '260');



INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('301', 0, '뷰티풀 군바리', 6, 36, '일', ' 여자도 군대에 간다면? 본격 여자도 군대 가는 만화!', '없음', 'thumbnail_IMAG21_d9398229-cbfd-47dc-9208-0a6fb936f3a7.jpg', '2023-10-10');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('301', 'dummyAuthor301@naver.com', '1234', '설이');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('301', '설이 ', '301');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('301', '301', '301');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('302', 'dummyAuthor302@naver.com', '1234', '윤성원');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('302', ' 윤성원', '302');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('302', '301', '302');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('303', 'dummyAuthor303@naver.com', '1234', 'SIU');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('303', 'SIU', '303');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('302', 0, '신의 탑', 5, 47, '월', '자신의 모든 것이었던 소녀를 쫓아 탑에 들어온 소년그리고 그런 소년을 시험하는 탑', '무료', 'thumbnail_IMAG21_5f3fec31-5c95-4afe-a73f-3046288edb47.jpg', '2023-10-10');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('303', '302', '303');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('303', 0, '참교육', 9, 24, '일', '무너진 교권을 지키기 위해 교권보호국 소속 나화진의 참교육이 시작된다!<부활남> 채용택 작가 X <신석기녀> 한가람 작가의 신작!', '휴재', 'thumbnail_IMAG21_15cb2611-34c0-4f02-a689-41d0b1016579.jpg', '2023-10-10');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('304', 'dummyAuthor304@naver.com', '1234', '채용택');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('304', '채용택 ', '304');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('304', '303', '304');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('305', 'dummyAuthor305@naver.com', '1234', '한가람');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('305', ' 한가람', '305');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('305', '303', '305');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('306', 'dummyAuthor306@naver.com', '1234', '치즈');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('306', '치즈', '306');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('304', 0, '백수세끼', 9, 50, '토', '백수 시절 내 곁을 지켜줬던 그녀... 돌아와 주면 안 되겠니?음식 메뉴마다 담겨 있는 우리들의 연애 흑역사!', '없음', 'thumbnail_IMAG21_80df3e76-47af-4007-b57c-e8f2830835e5.jpg', '2023-10-10');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('306', '304', '306');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('305', 8, '퀘스트지상주의', 6, 27, '화',
        '[외모지상주의], [싸움독학], [인생존망]과 세계관을 공유하는 작품!공부, 싸움, 외모.뭐 하나 잘난 것 없는 평범한 고등학생 ‘김수현’의 눈앞에 갑자기 퀘스트창이 나타났다!첫 번째 퀘스트, [엄마한테 사과하기]를 완료한 수현은 보상으로 키가 3cm 커지게 되는데!퀘스트 엄청 쉽잖아?! 어떤 퀘스트든 완료해주마! 그런데 다음 퀘스트가?[system] 학교 일진녀와 키스하십시오', '없음',
        'thumbnail_IMAG21_800f4c56-26ac-419e-9ed0-baf322311dea.jpg', '2023-10-10');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('307', 'dummyAuthor307@naver.com', '1234', '박태준 만화회사');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('307', '박태준 만화회사', '307');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('307', '305', '307');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('308', 'dummyAuthor308@naver.com', '1234', '유누니');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('308', ' 유누니 ', '308');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('308', '305', '308');
-- INSERT INTO user_tb (`id`, `email`, `password`, `username`)
-- VALUES ('309', 'dummyAuthor309@naver.com', '1234', '박태준 만화회사');
-- INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
-- VALUES ('309', ' 박태준 만화회사', '309');
-- INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
-- VALUES ('309', '305', '309');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('310', 'dummyAuthor310@naver.com', '1234', '태완');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('310', ' 태완', '310');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('310', '305', '310');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('311', 'dummyAuthor311@naver.com', '1234', '조용석');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('311', '조용석', '311');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('306', 0, '윈드브레이커', 2, 49, '토', '혼자서 자전거를 즐겨타던 모범생 조자현.원치 않게 자전거 크루의 일에 자꾸 휘말리게 되는데...자유를 꿈꾸는 청춘들의 스트릿라이딩 드라마!', '순위', 'thumbnail_IMAG21_e861f2cf-6157-4d33-8e02-7b4cbf0a8baf.jpg', '2023-10-10');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('311', '306', '311');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('307', 0, '장씨세가 호위무사', 6, 47, '월', '‘당신이 부른 것이오. 나란 사람을... ’은둔고수 광휘. 호위무사 되다.웹소설 원작 웰메이드 무협 시대극!', '완결', 'thumbnail_IMAG21_47c21251-b213-4882-bacc-15adce1acfc8.jpg', '2023-10-10');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('312', 'dummyAuthor312@naver.com', '1234', '김인호');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('312', '김인호 ', '312');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('312', '307', '312');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('313', 'dummyAuthor313@naver.com', '1234', '조형근');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('313', ' 조형근', '313');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('313', '307', '313');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('314', 'dummyAuthor314@naver.com', '1234', '모랑지');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('314', '모랑지', '314');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('308', 0, '소녀의 세계', 6, 22, '토', '완벽해 보이지만 사실 외로웠던 백조들과 맘씨 착한 오리가 만나여러 갈등을 함께 겪으며 진짜 친구가 되어가는 소녀들의 찐 우정물', '신작', 'thumbnail_IMAG21_4048794550434817075.jpg', '2023-10-10');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('314', '308', '314');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('309', 0, '신화급 귀속 아이템을 손에 넣었다', 4, 28, '월', 'D급 무투계 레이더로 마법계 레이더들의 고기방패나 하며 별 볼 일 없이 살던 재현. 그러던 어느 날, 던전에서 우연히 "오딘의 눈" 이라는 최강의 귀속 아이템을 얻게 됐다.신의 눈을 가진 자, 세계를 구할 신의 대적자의 운명을 개척하라!', '휴재',
        'thumbnail_IMAG21_ceeeead6-8a9c-48ec-a793-f3cc092a0b10.jpg', '2023-10-10');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('315', 'dummyAuthor315@naver.com', '1234', '정선율');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('315', '정선율 ', '315');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('315', '309', '315');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('316', 'dummyAuthor316@naver.com', '1234', '헤스');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('316', ' 헤스', '316');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('316', '309', '316');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('317', 'dummyAuthor317@naver.com', '1234', '김성진');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('317', '김성진', '317');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('310', 0, '앵무살수', 5, 25, '토', '평범한 뱃사공으로 살고 있는 노소하. 하지만 그의 정체는 전설적인 구파검법의 후계자다. 이제 진시황이 남긴 비서 선근경을 향한 살수행이 시작된다.', '없음', 'thumbnail_IMAG21_7077747896626722102.jpg', '2023-10-10');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('317', '310', '317');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('318', 'dummyAuthor318@naver.com', '1234', 'HO9');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('318', 'HO9', '318');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('311', 12, '별난식당', 9, 34, '수',
        '<요리GO>의 새로운 이야기,<별난식당>.특급호텔에서 최연소 팀장에 오르며 승승장구하던 주인공 한별은 퇴사를 하고 작은 식당을 차린다.그 식당의 이름은  별난식당 .별난식당은 상권이라고는 찾아볼 수 없는, 서울에서 제일 가난한 동네인 부자동에 위치해 있다.또한 메뉴도 별나다. 바로 메뉴가 없기 때문이다. 메뉴가 없이 한별 셰프가 그때그때 제철 식재료를 이용해 요리를 만드는 식당이다.이 식당의 특별한 점은 요리를 먹는 손님이 마음까지 위로 받는다는 것.한별 셰프는 대체 어떠한 방법으로 마음의 상처가 있는 많은 손님들을 요리로 치유하는 것일까?',
        '완결', 'thumbnail_IMAG21_292de414-bd9a-418d-a4e9-d97060398223.jpg', '2023-10-10');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('318', '311', '318');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('312', 0, '절대검감', 4, 26, '일', '단전이 부숴졌다는 이유로 집에서는 내놓은 자식 취급을 받던 소운휘는 혈교에 납치되어서도 삼류 첩자로 살아왔다.어느 날, 전설로만 알려진 검선비록을 찾는데 이용당하다 죽은 운휘는 10년 전, 혈교에 납치되던 그 날로 돌아가게 되고 검의 목소리를 듣는 신비한 능력을 얻는다.', '없음',
        'thumbnail_IMAG21_31f75c4c-81c9-454a-8d92-9e23b577e1a5.jpg', '2023-10-10');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('319', 'dummyAuthor319@naver.com', '1234', '김두루미');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('319', '김두루미 ', '319');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('319', '312', '319');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('320', 'dummyAuthor320@naver.com', '1234', '티아이');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('320', ' 티아이 ', '320');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('320', '312', '320');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('321', 'dummyAuthor321@naver.com', '1234', '한중월야');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('321', ' 한중월야', '321');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('321', '312', '321');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('322', 'dummyAuthor322@naver.com', '1234', '배진수');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('322', '배진수', '322');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('313', 0, '퍼니게임', 2, 29, '일', '<머니게임>,<파이게임> 에서 실패를 맛본 주인공은, 마지막 <퍼니게임>에서우승하기 위해 신체를 단련하고 정신을 다잡는다. 모든 참가자 중 본인만이유일한 게임 경험자임을 확인한 주인공은, 승리를 위해 악마가 되기로 결심한다.', '없음', 'thumbnail_IMAG21_01fd148f-edb2-4ada-9571-910981ec3376.jpg',
        '2023-10-10');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('322', '313', '322');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('314', 8, '만렙돌파', 7, 50, '화', '알 수 없는 오류로 3000년간 각성 테스트에 갇힌 김기봉.그 사이 현실에선 10년이 흘렀고, 온 세상은 몬스터와 던전으로 가득차게 되었다. 만렙으로 귀환한 김기봉의 모든 것을 원래대로 돌려놓기 위한 싸움이 시작된다!', '없음', 'thumbnail_IMAG21_3976787538998813497.jpg', '2023-10-10');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('323', 'dummyAuthor323@naver.com', '1234', '성불예정');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('323', '성불예정', '323');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('323', '314', '323');
-- INSERT INTO user_tb (`id`, `email`, `password`, `username`)
-- VALUES ('324', 'dummyAuthor324@naver.com', '1234', '임형2');
-- INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
-- VALUES ('324', ' 임형2 ', '324');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('324', '314', '141');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('325', 'dummyAuthor325@naver.com', '1234', '미노');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('325', ' 미노', '325');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('325', '314', '325');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('326', 'dummyAuthor326@naver.com', '1234', '환댕');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('326', '환댕', '326');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('315', 0, '잔불의 기사', 1, 47, '일', '유일한 가족이자, 최고의 기사 유망주였던 쌍둥이 동생이 살해당했다.천재적이었던 동생과는 달리 무예에 재능이 전혀 없지만,동생의 복수를 위해  강함 을 연기하기로 결심했다.약해빠진 나는 복수에 성공할 수 있을까.', '신작', 'thumbnail_IMAG21_91c5c081-77e6-4516-a503-2f45aad57401.jpg', '2023-10-10');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('326', '315', '326');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('327', 'dummyAuthor327@naver.com', '1234', '성은');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('327', '성은', '327');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('316', 0, '물어보는 사이', 8, 48, '월', '뱀파이어에게 물리면 건강해진다?!​두통으로 의도치 않게 비호감 연예인이 된 이채이.우연히 톱스타인 서이준이 뱀파이어이고, 그에게 물리면 한동안 건강해진다는 걸 알게 된다.물어달라 부탁하는 채이에게 이준은 계약 연애를 제안하는데...​', '무료',
        'thumbnail_IMAG21_f53824ca-108b-438d-93d0-b5c45f7e90e2.jpg', '2023-10-10');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('327', '316', '327');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('328', 'dummyAuthor328@naver.com', '1234', '갬쟈');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('328', '갬쟈', '328');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('317', 15, '개같이 탈출', 8, 26, '목', '"살아남으라고? 나는 자그만 말티즈란 말이야!"세상 따뜻하고 포근한 가정집에서 살아온 삐용이. 언니 품에서 그저 귀엽기만 하면 되는 견생이었는데... 갑자기 가족들과 모든 인간이 사라져버렸다.혼자서는 아무것도 할 줄 모르는데, 괴물 좀비 개들이 우글거리는 고립된 도시를 탈출해 언니를 만날 수 있을까?', '완결',
        'thumbnail_IMAG21_8746b12b-566e-4375-b0ab-1eaf48e17a1d.jpg', '2023-10-10');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('328', '317', '328');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('329', 'dummyAuthor329@naver.com', '1234', '슈안');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('329', '슈안', '329');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('318', 15, '순정말고 순종', 1, 32, '목', '하루에 무려 쓰리잡. 스물 다섯 지언의 일과 끝에 남는 건 갑질에 시달린 스트레스와 돼지우리같은 집구석 뿐이다. 그러다 어느날 얻게 된 인형 한 개. 이것만 있으면 대한민국의 탑 배우 남도윤을 가정부로 부려먹을 수있다...?!2017 최강자전 대상 수상작 <늑대와 빨간모자> 슈안 작가의 차기작!', '없음',
        'thumbnail_IMAG21_e3c857a7-900b-4085-969a-75d9127b5a38.jpg', '2023-10-10');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('329', '318', '329');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('319', 0, '미친 재능의 플레이어', 1, 43, '금', '세상의 운명이 걸린 게임이 시작되고 6년. 한 번도 톱 랭커의 자리를 내어주지 않은 최강의 플레이어,영웅왕 강유성 역시 새로운 시즌을 맞이한다. “저는…… X나 예전에 끝났습니다. 돈 때문에 하는 거죠.” [도발 수치가 대폭 상승합니다!] [어릿광대 군주가 계약자의 행동에 흡족함을 표시합니다!] 미친 재능의 플레이어가 살아남는 법이 펼쳐진다!',
        '완결', 'thumbnail_IMAG21_c88e92fa-e109-47d6-8a59-912749ff3a40.jpg', '2023-10-10');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('330', 'dummyAuthor330@naver.com', '1234', 'S-Nanyc');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('330', 'S-Nanyc ', '330');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('330', '319', '330');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('331', 'dummyAuthor331@naver.com', '1234', 'H.로마');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('331', ' H.로마 ', '331');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('331', '319', '331');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('332', 'dummyAuthor332@naver.com', '1234', '체나');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('332', ' 체나', '332');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('332', '319', '332');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('320', 0, '리턴 투 플레이어', 8, 44, '금', '어느 날, 게임이 되어버린 세상.갑자기 나타난 몬스터들이 사람들을 죽이고, 사람들은 플레이어가 되어  퀘스트를 달성해야 한다!인류의 종말에서 회귀한 2회차 플레이어, 김세한.그는 과연 세상을 이렇게 만든  시스템 을 쳐부술 수 있을까!', '무료',
        'thumbnail_IMAG21_b66a0f20-01c1-4b3f-ab8e-1d5ca6f089fe.jpg', '2023-10-10');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('333', 'dummyAuthor333@naver.com', '1234', '레포');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('333', '레포 ', '333');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('333', '320', '333');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('334', 'dummyAuthor334@naver.com', '1234', '세혼');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('334', ' 세혼 ', '334');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('334', '320', '334');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('335', 'dummyAuthor335@naver.com', '1234', '인덱스');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('335', ' 인덱스', '335');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('335', '320', '335');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('321', 12, '악당 가족이 독립을 반대한다', 9, 25, '수',
        '가족애 따위 없는 살벌한 악당 가문의 사생아 엘로디, 어느 날 갑자기 전생의 기억을 찾다!자신이 환생한 이곳이 전생에 읽었던 소설 속이며3년 후 진짜 여주인공이 나타나면서 자신은 악당 가족에게 버림받고 살해당할 운명임을 깨닫고언니가 등장하기 전까지 적당히 뒷돈 챙기다가 이 가문에서 독립하자!고 생각했는데……“독립? 그게 무슨 개소리지?”“너한테 바람 불어 넣은 놈이 누구야.”“누님, 혹시라도 가출할 생각은 아니겠지?”가족들이 독립을 반대한다? 저 살고 싶은데요, 독립시켜 주세요!',
        '무료', 'thumbnail_IMAG21_fa059a74-ca14-4a89-b0d7-841a0c85139a.jpg', '2023-10-10');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('336', 'dummyAuthor336@naver.com', '1234', '밋츄');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('336', '밋츄 ', '336');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('336', '321', '336');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('337', 'dummyAuthor337@naver.com', '1234', '하티');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('337', ' 하티 ', '337');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('337', '321', '337');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('338', 'dummyAuthor338@naver.com', '1234', '이흰');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('338', ' 이흰', '338');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('338', '321', '338');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('322', 0, '좀비묵시록 82-08', 1, 38, '토', '탕-!의문의 선박 속 그것 으로부터 시작된 괴이한 전염병은서울을 죽음의 도시로 만들어버린다.예고 없이 닥쳐온 심판의 그날부터세상의 모든 질서는 완전히 리셋되었다.처절한 생존 경쟁 속에서프로젝트명 [좀비묵시록 82-08]이 시작된다.', '무료',
        'thumbnail_IMAG21_239b2422-91ff-4649-aa83-932f90582e11.jpg', '2023-10-10');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('339', 'dummyAuthor339@naver.com', '1234', '달아');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('339', '달아 ', '339');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('339', '322', '339');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('340', 'dummyAuthor340@naver.com', '1234', '경우');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('340', ' 경우 ', '340');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('340', '322', '340');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('341', 'dummyAuthor341@naver.com', '1234', '박스오피스');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('341', ' 박스오피스', '341');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('341', '322', '341');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('323', 0, '천재 타자가 강속구를 숨김', 5, 29, '토', '부와 명예, 모든 걸 얻은 천재 메이저리거 강건우.그런 그조차도 아내와의 행복한 결혼 생활만큼은 이어갈 수 없었다.아내의 빈자리를 느끼며 후회하던 그가 신비한 반지의 힘으로 과거에 돌아왔다.풋풋한 연애시절의 고등학생이 된 그는 이번에야말로 사랑을 쟁취할 수 있을까.', '없음',
        'thumbnail_IMAG21_91cb8ff9-5be3-40ba-8df9-661972577cd2.jpg', '2023-10-10');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('342', 'dummyAuthor342@naver.com', '1234', '황지성');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('342', '황지성 ', '342');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('342', '323', '342');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('343', 'dummyAuthor343@naver.com', '1234', '스튜디오MW');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('343', ' 스튜디오MW ', '343');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('343', '323', '343');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('344', 'dummyAuthor344@naver.com', '1234', '이블라인');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('344', ' 이블라인', '344');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('344', '323', '344');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('345', 'dummyAuthor345@naver.com', '1234', '빤쓰');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('345', '빤쓰', '345');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('324', 0, '히어로메이커', 6, 46, '월', '왕은 영웅이 되고 싶어하는 공주의 소원을 들어주기로 전격 결심! 공주를 속이고 마치 영웅이 된 것처럼 만들기 위해 온 나라가 연극을 하게 되는데..파란만장한 그들만의 눈물겨운 영웅만들기의 대장정이 펼쳐집니다~', '없음', 'thumbnail_IMAG21_7292511306663934265.jpg', '2023-10-10');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('345', '324', '345');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('346', 'dummyAuthor346@naver.com', '1234', '규남');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('346', '규남', '346');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('325', 12, '신군', 3, 49, '수', '악마에게 모든 걸 잃고 먹이로 사육당하는 소년.이를 갈며 복수를 갈망하지만 인간의 힘은 악마에게 닿지 못했다.그때 그의 앞에 신군이 나타난다.2020 지상최대공모전 2기 장려상 수상작!', '신작', 'thumbnail_IMAG21_ca9a662b-7a79-4e80-94c9-d62ebe597aad.jpg', '2023-10-10');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('346', '325', '346');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('347', 'dummyAuthor347@naver.com', '1234', '현이씨');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('347', '현이씨', '347');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('326', 0, '루루라라 우리네 인생', 4, 46, '토', '시간이 지나면 자연스레 성숙한 으른(?)이 되어 있을 줄 알았는데그저 술과 음란한 이야기를 좋아하는 알딸딸한 어른이 되어버렸다.  어느날 귀농을 결심한 부모님을 따라 어쩌다보니 시골과 도시를 오가게 된 현이씨의 인생 제 2막 시작!', '없음',
        'thumbnail_IMAG21_a7a82a34-586c-4acf-b6f2-ab052be786f1.jpg', '2023-10-10');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('347', '326', '347');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('327', 12, '제왕', 9, 33, '수', '깡패, 검사, 국회의원...절대 섞여서는 안 될세 친구가 만들어 내는30년 간의 핏빛 느와르.', '무료', 'thumbnail_IMAG21_4b6a83cd-a5e9-408f-bbac-244f25240394.jpg', '2023-10-10');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('348', 'dummyAuthor348@naver.com', '1234', '김남규');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('348', '김남규 ', '348');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('348', '327', '348');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('349', 'dummyAuthor349@naver.com', '1234', '애풍');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('349', ' 애풍', '349');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('349', '327', '349');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('350', 'dummyAuthor350@naver.com', '1234', '콘티메이커');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('350', ' 콘티메이커', '350');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('350', '327', '350');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('351', 'dummyAuthor351@naver.com', '1234', '오리');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('351', '오리', '351');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('328', 0, '칼가는 소녀', 4, 32, '월', '치사율 100%의 인싸 희귀병 소녀  사랑 누구보다 차분하고 두려움 없는 같은 반 소녀  은조 두 소녀가 가슴 속 칼을 품고 세상을 향한 복수를 꿈꾼다.네이버웹툰 최강자전 18년 대표작.', '없음', 'thumbnail_IMAG21_301ca9ab-3938-4028-832c-48febddd6cf7.jpg', '2023-10-10');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('351', '328', '351');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('352', 'dummyAuthor352@naver.com', '1234', '조9');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('352', '조9', '352');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('329', 15, '날 먹는 건 금지양!', 3, 47, '목', '잘생겼지만 성격이 개(?) 같기로 유명한  남해술 은 소꿉친구인  양미루 에게만 잘해준다. 좋아해서 잘해주는 게 분명해! 정말 그런 걸까?해술이의 속마음을 전혀 모르겠는 미루.  그러던 어느 날, 미루는 해술이가 품고있는   흑심 에 대해 알게 되는데!10년 우정에 금이 가기 시작한다..! 늑대소년과 순둥이 소녀의 천방지축 성장기!',
        '순위', 'thumbnail_IMAG21_6845792d-40db-4cd9-ab7a-9b86995f3383.jpg', '2023-10-10');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('352', '329', '352');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('353', 'dummyAuthor353@naver.com', '1234', '은꼼지');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('353', '은꼼지', '353');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('330', 0, '결혼생활 그림일기', 7, 21, '금', '고르고 골라 결혼했더니 매일매일 우당탕탕?!결혼생활이란 무엇인가?조용할 날 없는 결혼생활을 날 것 그대로 그렸다.모자르고 부족했던 두 짐승이 만나 그려가는 결혼생활 그림일기!', '없음', 'thumbnail_IMAG21_47b971e4-00b6-451b-862e-1060bae5a80d.jpg', '2023-10-10');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('353', '330', '353');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('331', 15, '더블클릭', 10, 21, '목', '악명 높은 난이도를 가진 게임의 세계 랭킹 1위였던 지호.서비스 종료된 줄만 알았던 그 게임이 새롭게 돌아왔다!지호는 다시 한번 랭킹 1위를 꿈꾸며 게임 동아리에 입부한다.오랜만에 게임을 해도 살아있는 감각. 하지만 게임이 새롭게 변하면서 예상치 못한 약점이 생긴다.강한 상대를 마주할수록 열정이 끓어오르는 주인공의 프로게이머 도전기!', '완결',
        'thumbnail_IMAG21_935bf47d-9219-4f45-8a58-d5a7af13ce51.jpg', '2023-10-10');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('354', 'dummyAuthor354@naver.com', '1234', '박수봉');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('354', '박수봉', '354');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('354', '331', '354');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('355', 'dummyAuthor355@naver.com', '1234', '김장훈');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('355', ' 김장훈 ', '355');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('355', '331', '355');
-- INSERT INTO user_tb (`id`, `email`, `password`, `username`)
-- VALUES ('356', 'dummyAuthor356@naver.com', '1234', '박수봉');
-- INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
-- VALUES ('356', ' 박수봉', '356');
-- INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
-- VALUES ('356', '331', '354');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('332', 0, '시한부의 아이까지 뺏으려 합니다', 6, 32, '월',
        '“아이에게 시한부 어머니를 남겨줄 생각이에요?”부모님의 유품인 마법 거울이 보여준 미래는 참담했다.아이를 낳고 나는 시한부가 되고, 남편의 정부가 아이를 두고 떠나라고 종용하는 미래.아직 우린 결혼조차 하지 않았으니 불행한 미래도 피할 수 있을 거야.“노공작께서 돌아가시면 우리도 헤어지자.”북부의 차가운 설원을 닮은 네가, 나를 붙들 리 없으니.그런데 이별을 이야기하는 나를 바라보는 네 눈빛은 왜 이렇게 뜨겁지?.“아이가 없으면 아무 문제없는 거 아닌가? 그러니까 너도 이혼 같은 거 꿈도 꾸지 마. 그냥 내 옆에 있어.”조심스럽게 다가온 네 입술에서 따뜻한 온기가 느껴졌다.하지만 깊은 입맞춤은 그저 이제 이어질 기나긴 밤의 시작을 알리는 행위였을 뿐이다.',
        '순위', 'thumbnail_IMAG21_16247d91-5c88-43aa-80e3-f28b2daf868d.jpg', '2023-10-10');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('357', 'dummyAuthor357@naver.com', '1234', '랍스타');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('357', '랍스타 ', '357');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('357', '332', '357');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('358', 'dummyAuthor358@naver.com', '1234', '이루이');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('358', ' 이루이', '358');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('358', '332', '358');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('333', 0, '아슈타르테', 5, 41, '일', '무한한 영광을 가져다줄 피렌체 제국의 빛,아슈타르테. 하지만 음모로 인해 예언은 뒤틀리고...아슈타르테가 어둠으로 알려지게 되면서 모두가 그녀를 외면한다. 가족들의 사랑을 꿈꾸던 어린아이에서 점점 강인한 소녀로 자라는  아슈타르테 의 성장기.', '무료',
        'thumbnail_IMAG21_f3e49f1a-befe-435f-bf83-845d8516a82b.jpg', '2023-10-10');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('359', 'dummyAuthor359@naver.com', '1234', 'SOON');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('359', 'SOON ', '359');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('359', '333', '359');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('360', 'dummyAuthor360@naver.com', '1234', '안다온');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('360', ' 안다온', '360');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('360', '333', '360');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('334', 0, '제국 제일의 상속녀가 되었습니다', 9, 36, '금',
        '사람들이 기피하는 백색병에 걸려 힘겹게 살던  에스텔 .어느 날 주인공  세리아 의 등장으로 전생을 떠올려 자신이 소설 속 엑스트라에게 빙의된 것임을 깨닫는다.어렸을 적 하녀의 아이와 바뀌었단 이유로 집에서 쫓겨난 에스텔은 발루아가 형제들의 도움으로 목숨을 건지게 되고, 본래라면 세리아와 이어지는 남주인공  클로드 와 엮이기 시작하는데...', '휴재',
        'thumbnail_IMAG21_4f97cbfb-8e3e-445d-848c-ae270c22f5b0.jpg', '2023-10-10');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('361', 'dummyAuthor361@naver.com', '1234', '한강');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('361', '한강 ', '361');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('361', '334', '361');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('362', 'dummyAuthor362@naver.com', '1234', '요정용');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('362', ' 요정용', '362');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('362', '334', '362');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('335', 15, '오빠집이 비어서', 3, 26, '목',
        '새엄마와 맞장 뜨고 집을 나온 재벌 3세 차은명.세상 딱 한 명인 친구 희영에게 신세를 질 수 없게 되자, 어쩔 수 없이 희영의 둘째 오빠가 잠시 비워둔 집에 머물게 된다.그렇게 한 달 뒤, 은명은 샤워를 하고 나오던 중 예고도 없이 집으로 돌아온 희영의 둘째 오빠를 대면하게 되고... 그런데 그 오빠의 정체가 바로바로 대한민국 탑 스타 영화배우 ‘제준영 이라고?!', '무료',
        'thumbnail_IMAG21_fc2621b0-84c3-404d-a18d-5925dba6ab77.jpg', '2023-10-10');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('363', 'dummyAuthor363@naver.com', '1234', '이서희');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('363', '이서희 ', '363');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('363', '335', '363');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('364', 'dummyAuthor364@naver.com', '1234', '태소영');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('364', ' 태소영', '364');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('364', '335', '364');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('336', 8, '파운더', 10, 25, '화', '1970년대 각하에 대한 과잉 충성으로 비밀스런 공작대가 운영되었고 이는 정권이 바뀐 1980년대 대한민국 최초의 살인 청부 회사가 설립되는 토대가 된다.공작대의 에이스 공작원은 처절하게 살아남아 살인청부업 회사의 대표가 되어 회사를 이끌어가게 되는데...', '없음', 'thumbnail_IMAG21_7149240538535388720.jpg',
        '2023-10-10');
-- INSERT INTO user_tb (`id`, `email`, `password`, `username`)
-- VALUES ('365', 'dummyAuthor365@naver.com', '1234', '임상윤');
-- INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
-- VALUES ('365', '임상윤 ', '365');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('365', '336', '220');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('366', 'dummyAuthor366@naver.com', '1234', '만두인');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('366', ' 만두인', '366');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('366', '336', '366');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('367', 'dummyAuthor367@naver.com', '1234', '구나');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('367', '구나', '367');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('337', 8, '어린이집 다니는 구나', 6, 43, '화', '"노는 게 제일 좋아!" 라고 했더니 정말 노는 게 직업이 됐다?! 매일 동심의 세계로 출퇴근한지 어쩌다 10년째!아이들이라면 알 만큼 안다고 생각했는데... 예측불가한 말과 행동들은 여전히 새롭기만 하다. 그런 아이들에게 언제나 "그랬구나" 라고 말해주는,10년차 프로공감러 구나가 들려주는 어린이집 선생님 이야기', '순위',
        'thumbnail_IMAG21_120ad315-8518-4430-bb30-739654b49635.jpg', '2023-10-10');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('367', '337', '367');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('368', 'dummyAuthor368@naver.com', '1234', '온윤');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('368', '온윤', '368');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('338', 0, '달로 만든 아이', 4, 41, '월', '어린 시절부터 남들이 보지 못하는 존재들을 볼 수 있던  박하 .평생을 외롭게 살아온 박하는 18살이 되던 해, 처음으로 자신과 같은 것을 볼 수 있는  진도 와 그의 친구들을 만나게 된다. 어느 날, 진도를 통해 박하가 과거에 영물들을 군림했던  달아이 라는 사실이 밝혀지게 되고그 사실이 소문이 나며 수많은 영물과 귀신들이 박하를 노리게 된다.',
        '순위', 'thumbnail_IMAG21_98a19f14-de9a-491d-bc11-a3103e7e671d.jpg', '2023-10-10');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('368', '338', '368');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('369', 'dummyAuthor369@naver.com', '1234', '마카빔');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('369', '마카빔', '369');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('339', 15, '인섹터', 4, 44, '목',
        '어느 날 학교에서 담임교사가 <공벌레 인섹터 내라해치>가 되어 반 아이들을 무차별적으로 살해한 사건이 벌어진다. 그때 나타난 검은 개미, 그는 반 아이들을 구하게 되고 이 사건을 시작으로 언론과 SNS로 퍼져 인섹터의 존재는 더 이상 도시 괴담 수준의 이야기가 아니게 된다. 결국, 정부는 비밀리에 임무를 수행하던 인섹터 퇴치반 버그리퍼를 내세우고 생존자의 증언에 따라 검은 개미를 뒤쫓게 되는데,검은 개미의 정체는 몸속에 개미 집이 지어진 채 살아가는 평범한 학생 가미성. 그저 몸속 개미들에게 먹히지 않기 위해 인섹터의대항마로 변신하여 내키지 않는 싸움을 한다.',
        '무료', 'thumbnail_IMAG21_b65d115a-9224-4d45-9773-18addbc432d3.jpg', '2023-10-10');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('369', '339', '369');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('340', 0, '팔이피플', 3, 40, '일', '<마스크걸>, <위대한 방옥숙> 매미/희세 작가의 신작!SNS에서 육아용품 파는 평범한 유부녀 박주연, 그녀의 고등학교 동창인 김예희는 팔로워 70만의 셀럽으로 엄청난 부와 명성을 누리는 중이다.박주연은 김예희를 미워하는 동시에 집착하고 있는데, 과연 그녀는 김예희의 과거를 폭로하고 셀럽으로 올라설 수 있을까?', '순위',
        'thumbnail_IMAG21_e390eaf4-cfcd-46bf-901f-93034135a314.jpg', '2023-10-10');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('370', 'dummyAuthor370@naver.com', '1234', '매미');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('370', '매미 ', '370');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('370', '340', '370');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('371', 'dummyAuthor371@naver.com', '1234', '희세');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('371', ' 희세', '371');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('371', '340', '371');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('372', 'dummyAuthor372@naver.com', '1234', '문지현');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('372', '문지현', '372');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('341', 12, '꿈의 기업', 9, 49, '수', '문명을 지배하는 거대기업과 거대기업을 움직이는 인공지능. 그 인공지능이 꿈을 꾸기 시작했다. 엄청난 경쟁률을 뚫고 대기업 드림코퍼레이션에 입사한 꿈사원들. 그들 앞에 의심스러운 일들이 펼쳐지는데..!', '없음', 'thumbnail_IMAG21_d46ad6b8-e9a8-4bc8-b501-e62adfee0eb6.jpg', '2023-10-10');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('372', '341', '372');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('342', 0, '서브 남주가 파업하면 생기는 일', 9, 50, '금',
        '평범한 한국인 ‘정예서’, 동생이 읽고 있던 대한민국을 휩쓴 초메가히트 로맨스 판타지 소설 ‘퇴사했더니 이계 공녀’에 서브남주로 빙의한다.이 서브남주, 훗날 전쟁에 나가 메인 남주 대신 죽을 운명이잖아? 여기서 죽을 수는 없어! 내 목표는 단 하나, 주인공들 근처엔 얼씬도 하지 말고, 건강하게 버티다가 집으로 돌아가기다.잠깐? 피하려던 메인 남주 세드리크와 메인 여주 크리스텔이 계속 다가온다?로맨스는 너희 둘이 하면 되잖아! 나는 판타지만 조금 빌려쓴다니까?',
        '휴재', 'thumbnail_IMAG21_32d146f5-7e22-4fe4-bc73-92b2e446d7f7.jpg', '2023-10-10');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('373', 'dummyAuthor373@naver.com', '1234', '쓰레빠인간');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('373', '쓰레빠인간 ', '373');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('373', '342', '373');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('374', 'dummyAuthor374@naver.com', '1234', '해그늘');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('374', ' 해그늘 ', '374');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('374', '342', '374');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('375', 'dummyAuthor375@naver.com', '1234', '숙임');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('375', ' 숙임', '375');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('375', '342', '375');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('343', 0, '쥴리에타의 드레스 업', 6, 41, '금',
        '"모습을 감춰야 해!"고위 귀족의 사생아로 본부인에게 내쳐져 5살 때부터 극장 소품실에서 자라난 쥴리에타.그 안에는 빙의된 한국인 여자 예나가 존재했다.뛰어난 외모는 고아가 된 자신에게 독이 될 것을 알게 된 쥴리에타는얼굴을 숨기기 위해 커다란 안경과 부스스한 가발로 변장한다.성인이 되어 극장을 나가고자 하지만 극장주는 지금까지 키워준 빚을 갚으라 독촉하고,쥴리에타는 인기 초절정인 황자의 시녀가 되어 그 돈을 갚기로 한다.하지만 특유의 매력은 변장으로도 가릴 수 없는 것.달라붙는 여자들에게 질린 황자 킬리언의 마음이 이윽고 무덤덤한 시녀에게 닿고 마는데…',
        '완결', 'thumbnail_IMAG21_d0fb6e8e-bae0-4561-b537-bd84a6b3cb09.jpg', '2023-10-10');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('376', 'dummyAuthor376@naver.com', '1234', '말차');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('376', '말차 ', '376');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('376', '343', '376');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('377', 'dummyAuthor377@naver.com', '1234', '유자차');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('377', ' 유자차 ', '377');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('377', '343', '377');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('378', 'dummyAuthor378@naver.com', '1234', '채하빈');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('378', ' 채하빈', '378');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('378', '343', '378');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('379', 'dummyAuthor379@naver.com', '1234', '홍작가');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('379', '홍작가', '379');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('344', 0, '엘프', 7, 35, '금', '유원지 관리인 태인에게 자신을  엘프 라 하는 이상한 손님 제솔이 찾아온다. 그녀는 아버지의 유품을 달라고 하면서 그의 목걸이를 훔쳐 간다. 그때, 태인을 납치(?) 하는 정체불명의 사람들. 그들은 태인이 우리나라의 소수민족  엘프 이며,  엘프  중에서도 신처럼 모셔지는 강산의 후예라며 태인에게  엘프 가 이주할 수 있게 도와달라 부탁하는데...', '완결',
        'thumbnail_IMAG21_fb25d2f3-790c-48db-beaf-c2504f4ed4c0.jpg', '2023-10-10');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('379', '344', '379');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('380', 'dummyAuthor380@naver.com', '1234', '곽백수');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('380', '곽백수', '380');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('345', 0, '파견체', 8, 31, '토', ' 단 하나의 지성이 온 우주의 종말을 가져올 수 있다. 빅뱅 38억년 한 지성체의 폭주로 우주 종말의 위기를 겪은우주의 지성체들은  전우주관리국 이란 연합기구를 만들어우주 전체의 지성체들을 감시 통제하고 있다.이미 지구도 300만년 전부터 인간을 복제한  파견체 들이란 존재들을 통해 비밀리에감시를 받아오고 있었는데....', '무료',
        'thumbnail_IMAG21_3833187132113172581.jpg', '2023-10-10');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('380', '345', '380');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('346', 0, '사이다걸', 6, 40, '일', '어느새 세상은 고구마밭이 되었다.앞뒤 꽉꽉 막힌 사람, 대화가 통하지 않는 사람, 상식이 통하지 않는 사람이 넘쳐나는 세상…상처 주기 싫어 참고, 배려하는 사람이 오히려 바보 취급당하는, 무언가 단단히 잘못된 이 세상!착할 사람일수록 할 말은 하고 살 수 있는 세상을 위해, 청량감 넘치는 히어로 ‘사이다걸’이 신비한 사이다를 들고 찾아온다.', '순위',
        'thumbnail_IMAG21_407ea651-d14f-47af-9e06-8813e7160421.jpeg', '2023-10-10');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('381', 'dummyAuthor381@naver.com', '1234', '김드루');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('381', '김드루 ', '381');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('381', '346', '381');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('382', 'dummyAuthor382@naver.com', '1234', '김그루');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('382', ' 김그루', '382');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('382', '346', '382');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('383', 'dummyAuthor383@naver.com', '1234', '감람');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('383', '감람', '383');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('347', 0, '라서드', 2, 23, '금', '절대적 권능을 지닌 11인의 왕과, 왕을 수호하기 위한 기사단이 존재하는 세계.수습기사 힌타는 파트너 캐넛과 함께 정식 기사가 되기 위한 모험을 떠나는데...정식기사가 되기 위한 소년들의 고군분투 정통판타지액션!', '없음', 'thumbnail_IMAG21_7c527b6e-773f-40c8-aa1a-5cbd9e7dc482.jpg', '2023-10-10');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('383', '347', '383');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('348', 15, '입술이 예쁜 남자', 10, 49, '목', '10년 전 첫키스의 주인공이었던 동생친구가 완벽한 어른남자가 되어 나타났다.여전히 예쁜 입술로 예쁜 말만 골라 하며 작정한 듯 한비를 홀리기 시작하는데...이 아슬아슬한 줄타기는 누구의 승리로 끝나게 될까?', '완결', 'thumbnail_IMAG21_4122541015824753209.jpg', '2023-10-10');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('384', 'dummyAuthor384@naver.com', '1234', '고도');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('384', '고도 ', '384');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('384', '348', '384');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('385', 'dummyAuthor385@naver.com', '1234', '플라비');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('385', ' 플라비', '385');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('385', '348', '385');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('386', 'dummyAuthor386@naver.com', '1234', '즛호');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('386', '즛호', '386');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('349', 8, '악녀교실', 1, 25, '화',
        '같은 반 여자애에게 약점을 잡혀 괴롭힘 당하는 고등학생  허정우 . 피폐한 나날을 보내던 정우의 반에 전학생  한보라 가 온다. 까만 생머리와 다리에 얼룩을 가진 그 아이를 보고 정우는 강한 기시감을 느낀다. 아니나다를까, 시비 거는 반 아이들을제압한 한보라는 그들에게 묻는다.  나랑 비슷한 애 본 적 있어?  어쩌면 꼬인 것을 바로잡아줄 보라에게 정우는 접근하기로 하는데...', '없음',
        'thumbnail_IMAG21_6a63ce48-bfe3-4a05-862f-4e6f1b3771c2.jpg', '2023-10-10');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('386', '349', '386');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('387', 'dummyAuthor387@naver.com', '1234', '호');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('387', '호', '387');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('350', 12, '피폐물의 해피엔딩을 위하여', 7, 29, '수', ' 나 는 피폐한 남주인공들이 신녀 ‘벨’을 소유하기 위해 수단과 방법을 가리지 않는 배드 엔딩 소설 [여명의 기적] 속으로 빙의했다. 주인공의 행복을 방해하는 걸림돌 로지아나로 환생한 나는 생각한다. "어쩌면 내가 이 소설의 엔딩을 바꿀 수 있지 않을까?"', '완결',
        'thumbnail_IMAG21_e830e751-20be-4c57-a6ff-f299588d05b6.jpg', '2023-10-10');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('387', '350', '387');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('388', 'dummyAuthor388@naver.com', '1234', '최삡뺩');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('388', '최삡뺩', '388');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('351', 8, '영앤리치가 아니야!', 7, 43, '화',
        '<공대생 너무만화> 최삡뺩 작가의 개그로맨스 신작! 모든 게 완벽한 퍼렁식품 CEO의 아들 서민준.어른들과 친구들에게는 인기 폭발이지만, 여자친구를 사귀어 본 적 없는 모태솔로다.민준은 같은 학교 여학생 새영에게 반하게 되는데, 새영의 이상형은 흙수저이지만 노력하는 사람이고, 자기보다 잘난 남자를 매우 싫어한다고?사랑을 얻기 위해 영앤리치를 숨겨야하는 민준이의 첫 연애 도전기!', '무료',
        'thumbnail_IMAG21_8688bbf6-1067-465b-9070-4fef7c1ab1cd.jpg', '2023-10-10');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('388', '351', '388');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('352', 0, '컨트롤X', 4, 22, '금', '10년 사귄 전남친  다니엘 이 절친  올리비아 와 결혼했다. 그것도 내 생일인 크리스마스에!!!!세계적인 싱어송라이터  크리스 는 다니엘과 올리비아의 결혼식에 깜짝 방문해 그곳을 콘서트장으로 만들며 보기좋게 복수한다. 하지만 다음날 아침, 크리스는 충격적인 소식을 접하게 된다. 크리스는 과연 잃어버린 사랑, 우정, 명성을 모두 되찾을 수 있을까?',
        '완결', 'thumbnail_IMAG21_bc35a097-4b19-43bf-849e-26f8712bd65f.jpg', '2023-10-10');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('389', 'dummyAuthor389@naver.com', '1234', '사이렌');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('389', '사이렌 ', '389');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('389', '352', '389');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('390', 'dummyAuthor390@naver.com', '1234', '서클');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('390', ' 서클', '390');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('390', '352', '390');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('391', 'dummyAuthor391@naver.com', '1234', '김뎐');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('391', '김뎐', '391');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('353', 0, '마이너스의 손', 10, 27, '월', '만지면 모두 부서진다.마이너스의 오른손을 가진 소년 이야기', '신작', 'thumbnail_IMAG21_0e7abd73-060d-42eb-afed-65cafc457104.jpg', '2023-10-10');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('391', '353', '391');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('354', 0, '랭커', 5, 38, '금', '극비리로 진행되는 멤버쉽 온라인 게임 <랭커>.우연히 랭커에 뛰어든 격투기선수 강준서.어느 순간부터 상대가 괴물로 보였던 준서는 자신의 플레이어인 정준의 목소리를 통해서 안정을 되찾고,정준과 함께하면서 증세를 치료하고자 마음먹는다.하지만 랭커에는 목숨을 걸어야 하는 퀘스트뿐 아니라,캐릭터끼리 벌이는 배틀과 사냥의 위협까지 도사리고 있다.', '무료',
        'thumbnail_IMAG21_46875d4a-190f-4663-bac5-0d3003263646.jpg', '2023-10-10');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('392', 'dummyAuthor392@naver.com', '1234', '신건');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('392', '신건 ', '392');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('392', '354', '392');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('393', 'dummyAuthor393@naver.com', '1234', 'taibogi');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('393', ' taibogi', '393');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('393', '354', '393');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('355', 0, '악당과 악당이 만나면', 4, 45, '토', '귀족들을 상대로 악명을 떨치던 제국 뒷세계 조직의 보스, 아탈란테. 어느 날 황제로부터 폭군 리오넬 비안크 대공을 암살해 달라는 의뢰를 받게 된다.조직원들과 평범하게 살고 싶었던 아탈란테는 의뢰를 수락하고 대공성에 잠입해 암살 시도하는데….하지만 어째서인지 죽지 않아?한순간에 사랑을 속삭이는 대공에게서 아탈란테는 무사히 탈출할 수 있을까?',
        '없음', 'thumbnail_IMAG21_f09967ec-e4e8-4fb8-a8d5-a65db4c6e14e.jpg', '2023-10-10');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('394', 'dummyAuthor394@naver.com', '1234', '삵');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('394', '삵 ', '394');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('394', '355', '394');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('395', 'dummyAuthor395@naver.com', '1234', '쏘가리');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('395', ' 쏘가리 ', '395');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('395', '355', '395');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('396', 'dummyAuthor396@naver.com', '1234', '임하얌');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('396', ' 임하얌', '396');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('396', '355', '396');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('397', 'dummyAuthor397@naver.com', '1234', '김이랑');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('397', '김이랑', '397');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('356', 15, '하루의 하루', 2, 42, '목', '오하루는 다른 사람의 마음을 읽을 수 있는 초능력자다.얼마 전, 저주 받은 능력 때문에 첫사랑도 허무하게 깨져버리고건조한 일상을 보내고 있던 하루에게 최근 신경쓰이는 사람이 생겼다.​그 사람은 바로, 같은 과 동기인 도하루.그녀의 마음은 도무지 보이지 않는다. 이건 혹시.. 운명..?', '신작',
        'thumbnail_IMAG21_4121973654889457249.jpg', '2023-10-10');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('397', '356', '397');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('398', 'dummyAuthor398@naver.com', '1234', '박혬');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('398', '박혬', '398');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('357', 8, '백호랑', 5, 37, '화', '모든 것이 완벽해 보이는 지룡은 비밀스런 동거 중!사촌동생이자 고양이이자 수호자인 소년은 바로 서쪽의 신수 백호였다!과거의 죄를 씻기 위해 인간계에서 하늘의 심부름을 수행인 백호랑과 그에게 엮인 지룡의 스펙타클한 일상', '없음', 'thumbnail_IMAG21_3978989878055821874.jpg', '2023-10-10');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('398', '357', '398');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('399', 'dummyAuthor399@naver.com', '1234', '한성만');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('399', '한성만', '399');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('358', 0, '너를 돌려차는 방법', 9, 46, '월', '관심 멈춰! 혼자가 제일 좋은 은신만렙 은솔.조용한 고등학교 생활을 꿈꿨는데... 인기짱 선배, 지수 때문에 다 망했다!엮였다 하면 파국인 환장듀오, 태권도부까지 함께하게 되다?!청춘 그잡채! 우당탕탕 첫사랑 로맨스♥︎', '순위', 'thumbnail_IMAG21_04fdcd36-c440-4feb-8b3d-573b3584a32f.jpg',
        '2023-10-10');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('399', '358', '399');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('359', 15, '최후의 금빛아이', 10, 39, '목',
        '언니의 생일날, 이 세계를 지배하는 신에 의해 모든 것을 잃은 소녀 록시.자신이 신들의 먹이에 불과하다는 충격적인 진실을 알게 된다.록시는 심장만 있으면 언니를 되살릴 수 있다는 말을 믿고 험난한 여행을 떠난다.그러나 곧 그녀를 뒤쫓는 자들과 감당할 수 없는 적들이 나타나는데...록시는 앞을 막아서는 그들을 물리치고 과연 언니를 되살릴 수 있을까?', '휴재',
        'thumbnail_IMAG21_fdecfea5-8ca1-4a32-9c55-34a30f24266d.jpg', '2023-10-10');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('400', 'dummyAuthor400@naver.com', '1234', '알깨');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('400', '알깨 ', '400');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('400', '359', '400');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('401', 'dummyAuthor401@naver.com', '1234', '새몽');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('401', ' 새몽', '401');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('401', '359', '401');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('360', 0, '어느날 짝남에게 공작님이 빙의했다', 1, 45, '토', '짝사랑하던 소꿉친구의 몸에로판 속 공작님이 빙의해버렸다.외모, 성적, 성격 모든 게 완벽하던 소꿉친구였는데………이 사고뭉치는 뭐야?!! 내 짝남 돌려내!생활력 빵점 오만한 공작님과 로판 덕후 유소아의 좌충우돌 학원로맨스', '없음',
        'thumbnail_IMAG21_12b8af45-dcdb-4a37-8ccf-b597e490e55c.jpg', '2023-10-10');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('402', 'dummyAuthor402@naver.com', '1234', '다담');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('402', '다담 ', '402');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('402', '360', '402');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('403', 'dummyAuthor403@naver.com', '1234', '죽순');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('403', ' 죽순', '403');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('403', '360', '403');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('404', 'dummyAuthor404@naver.com', '1234', '늠개');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('404', '늠개', '404');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('361', 12, '고백어택', 5, 39, '수', '하나는 언제나 2등이었다. 늘 1등을 하는 한건우 때문에!속을 알 수 없는 건우를 무너뜨리기 위해 수단과 방법을 가리지 않던 하나.이번에는 가짜 고백으로 멘탈을 흔들려 했는데...어라, 얘 이 고백 왜 받지? 뭐... 내가 좋다고?!', '순위', 'thumbnail_IMAG21_d0a7cee2-4ded-4506-aedf-71c25675247c.jpg',
        '2023-10-10');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('404', '361', '404');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('405', 'dummyAuthor405@naver.com', '1234', '꾀돌이');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('405', '꾀돌이', '405');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('362', 0, '집사, 주세요!', 1, 28, '일', '왕따인 내가 서열1위 존잘남을 내 집사로...?!학교에선 왕따, 집에선 재벌 아가씨인  백마리 .학교에선 서열 1위, 집에선 마리의 집사인  천하다 .천방지축 왕따 아가씨를 어떻게든 학교의 퀸으로 만들어야 한다!!정반대인 소년소녀의 서열반전 로맨스.<저세상 클라스!> 꾀돌이 작가의 신작', '순위',
        'thumbnail_IMAG21_ccce5530-0976-4a0d-b76c-d54c5620cdd5.jpg', '2023-10-10');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('405', '362', '405');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('406', 'dummyAuthor406@naver.com', '1234', '아실');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('406', '아실', '406');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('363', 15, '굿바이 유교보이', 1, 48, '목',
        '실시간 연애 리얼리티쇼  러브밤  ! 10일 촬영에 출연료 1억이라는 소리에 솔깃한 ‘이제’는오직 출연료와 자신의 스튜디오 홍보를 위해 프로그램에 참여한다. 한편 찐사랑을 꿈꾸는 유교보이 ‘헌도’는 ‘이제’에게 거부하기 힘든 달콤한 제안을 하고, 모종의 계약 관계로 엮인 둘은 물고 빨고 빼고 다 하는(?) 계약연애를 시작하는데… 과연 이들은  러브밤 에서 살아남을 수 있을까?!!! 유교보이 ‘헌도’ X 진보걸 ‘이제’의 대국민 사기 애정행각이 펼쳐진다!',
        '무료', 'thumbnail_IMAG21_fe6bfde6-5033-4037-9c30-eecd3fd70de3.jpg', '2023-10-10');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('406', '363', '406');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('407', 'dummyAuthor407@naver.com', '1234', '상수');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('407', '상수', '407');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('364', 0, '찌질하지만 로맨스는 하고 싶어', 5, 30, '일', '여자랑 말도 제대로 못 해본 탓에 쉽게 설레고 의미부여하는 금사빠 이현태.그렇지만 마음 속엔 순수한 사랑을 꿈꾼다. 이런 현태의 찌질함을 때려서라도 바로잡아 주는 ‘젊꼰’ 선배 윤지희.현태는 또 다시 사랑에 빠졌다. ‘금사빠라고? 아니야, 이번엔 진짜로 진지하다고! 한 소년의 성장기이자 모든 남자들의 순수한 첫사랑 이야기.', '순위',
        'thumbnail_IMAG21_5d86f40f-49cc-4ab3-a287-50a38c8ec95c.jpg', '2023-10-10');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('407', '364', '407');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('408', 'dummyAuthor408@naver.com', '1234', '지휘');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('408', '지휘', '408');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('365', 8, '오늘의 일기예보', 2, 43, '화', '새내기 시절 불같은 사랑을 했던  예보 와  일 통칭  일기예보 로 불리며 학과의 유명한 CC였으나,대차게 헤어진 후 둘은 각자 휴학을 하고 만다.그런데, 몇 년 뒤 다시 학교에서 재회하게 되었다?!"너네 CC 하지 마라. 일기예보처럼 돼!."휴학을 해도 잊혀지지 않은 희대의 CC.과연 남은 대학 생활을 무사히 마칠 수 있을까?', '신작',
        'thumbnail_IMAG21_22f8f0f6-ffb1-4b24-b47e-6a1d33074ead.jpg', '2023-10-10');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('408', '365', '408');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('409', 'dummyAuthor409@naver.com', '1234', '우까');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('409', '우까', '409');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('366', 0, '주작연애', 10, 40, '금',
        '"야야 저기 니 여친 지나간다ㅋㅋ""뭐?죽을래?"공부말고는 잘하는 것 하나 없는 이세경. 같은 학교 아이들에게 늘 저런식으로 괴롭힘 당한다.그런 그녀가 학교만 나가면 인싸녀 그 자체?!학교와의 정반대의 모습에 모두가 알아보지 못하고 심지어 성인 남자들도 그녀가 고딩인줄 모르고 세경에게 만나달라고 애걸복걸하는데.사람들을 속이며 재미 좀 보려는데 뭐야, 저건?하필 걸려도 같은 반의 앙숙인, 하선우한테 정체를 들키는데?!어른도 아닌, 그렇다고 아이도 아닌 청소년들의 방황,사랑,청춘.달콤매콤 톡톡쏘는 사춘기 로맨스가 시작된다!',
        '없음', 'thumbnail_IMAG21_8acfafa7-d1db-42fa-9e01-3b7500650e11.jpg', '2023-10-10');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('409', '366', '409');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('410', 'dummyAuthor410@naver.com', '1234', '웡웡이');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('410', '웡웡이', '410');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('367', 0, '매지컬 급식:암살법사', 4, 28, '금', '온갖 ‘빌런’들로 가득한 현대사회, 이 어지러운 세상에 정의를 실현하고자 신이 강림했다.그의 정의를 실현 할 용사는 바로… 마법소녀??어쨌든 빌런을 퇴치하고자 마법소녀가 나타났다! 성능 확실한 마법소녀의 빌런 퇴치기!', '신작', 'thumbnail_IMAG21_d358a9ab-09bc-436b-8a77-076cae2ea8d1.jpg',
        '2023-10-10');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('410', '367', '410');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('411', 'dummyAuthor411@naver.com', '1234', '비진');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('411', '비진', '411');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('368', 0, '원하나', 2, 35, '금', '‘하나를 위해 하나로 살기 시작했다.’연약한 몸을 가진 원이와 아역 배우인 하나. 둘은 쌍둥이다.같이 살게 되면서 본 하나의 삶은 원이가 상상했던 모습과 전혀 달랐고, 하나는 도리어 평범한 생활을 꿈꾼다. 그러던 어느 날 둘은 뒤바뀐 삶을 살게 되는데…“네가 원하던 삶, 내가 만들어줄게.”', '휴재',
        'thumbnail_IMAG21_2aa7b888-6149-4ba0-ae84-0158fd0e249c.jpeg', '2023-10-10');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('411', '368', '411');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('369', 15, '슈퍼스타 천대리', 9, 39, '목',
        '“대한민국 직장인이라면 포기한 꿈 하나 정도는 있잖아요.” “그래, 누구에게나 그럴듯한 변명이 있지. 슈퍼스타의 아우라를 전수받기 전까지는…” 일은 일대로 하고 업무 성과는 뺏기고, 오늘도 내일도 평범한 직딩 천호연 대리! 어느 날, 마음을 담아 부른 노래가 과거의 슈퍼스타 한지혁을 불러낸다. “네가 마음에 들었다. 내 아우라를 너에게 전수해 주지.” “…??!” “자, 이제 동료를 모아 직장인 밴드 오디션에 도전하자.” “…??????????!”',
        '없음', 'thumbnail_IMAG21_7d010b0f-a77f-4449-a910-1816e2c547cc.jpg', '2023-10-10');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('412', 'dummyAuthor412@naver.com', '1234', 'Do8');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('412', 'Do8 ', '412');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('412', '369', '412');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('413', 'dummyAuthor413@naver.com', '1234', '이재국');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('413', ' 이재국 ', '413');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('413', '369', '413');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('414', 'dummyAuthor414@naver.com', '1234', '박경원');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('414', ' 박경원', '414');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('414', '369', '414');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('415', 'dummyAuthor415@naver.com', '1234', '문조');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('415', '문조', '415');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('370', 0, '세번째 로망스', 3, 21, '토', '물 흐르듯 평범하게 살아온 연우는 오랜 연인이었던 태주와 헤어지고, 첫사랑이었던 세진을 만난다.그런데 잊었던 설렘을 느끼기도 전에 갑자기 고등학생으로 돌아가게 되는데…!?빛났던 첫사랑도, 오랜 연애의 끝도 모두 허무한 것을 알기에 사랑 따위엔 아무런 기대도 하지 않겠어!', '없음',
        'thumbnail_IMAG21_9f304f70-bc24-4cdc-b582-8d1b63d013e0.jpg', '2023-10-10');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('415', '370', '415');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('416', 'dummyAuthor416@naver.com', '1234', '김지수');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('416', '김지수', '416');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('371', 8, '메리의 불타는 행복회로', 9, 49, '화', '음침한 여고생 유메리는 엄마의 절친이었던 천혜윤과 그의 아들 천사현과 함께 살고 있다.외모, 성적, 사교성, 모든 게 완벽한 그야말로 ‘엄마 친구 아들‘인 사현.사현과 결혼하여 진정한 가족이 되는 것을 꿈꾸는 메리는 과연 사현의 마음을 얻을 수 있을까?', '휴재',
        'thumbnail_IMAG21_3adf296f-505b-4824-98b0-61c28432fb2d.jpg', '2023-10-10');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('416', '371', '416');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('372', 12, '어쌔신 크리드 - 잊혀진 사원', 9, 48, '수',
        '잃어버린 사원의 전설에 대한 단서를 얻은 에드워드 켄웨이.이번엔 해적이 아닌 암살단원으로서 다시 바다로 향한다."내가 에드워드 켄웨이라고? 이게 무슨 일이지...?"그리고 애니머스를 통해 머나먼 조상 에드워드 켄웨이의 기억을 따라가는 김노아.18세기 동남아 남중국해 무대에서 <어쌔신 크리드 IV: 블랙 플래그>의 후속편이 시작된다!"템플러들이 발견하기 전에, 내가 먼저 찾아주지."', '무료',
        'thumbnail_IMAG21_41bce5b2-aa2a-4186-94ea-22bf8b37488a.jpg', '2023-10-10');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('417', 'dummyAuthor417@naver.com', '1234', '샤이아탄');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('417', '샤이아탄', '417');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('417', '372', '417');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('418', 'dummyAuthor418@naver.com', '1234', 'ARC');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('418', ' ARC', '418');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('418', '372', '418');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('419', 'dummyAuthor419@naver.com', '1234', 'Ubisoft');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('419', ' Ubisoft ', '419');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('419', '372', '419');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('420', 'dummyAuthor420@naver.com', '1234', 'Tabii');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('420', ' Tabii', '420');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('420', '372', '420');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('373', 0, '모스크바의 여명', 8, 42, '월',
        '21세의 피아니스트 이시윤.사고로 인해 피아노를 더 이상 칠 수 없게 된 삶을 비관하다 죽음을 택했지만,알아들을 수 없는 외국어로 얘기하는 갑부 집안에서소녀  타티아나 로 눈을 뜬다.신이 주신 기회인 걸까? 아니면 저주인 걸까?성별이 바뀐 게 뭐 대수냐! 손만 멀쩡하다면 다시 피아노를 칠 수 있어!어차피 이렇게 된 거  타티아나 로서 못다 한 꿈을 이뤄보자!', '없음',
        'thumbnail_IMAG21_3918807214864216674.jpg', '2023-10-10');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('421', 'dummyAuthor421@naver.com', '1234', '이샨오');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('421', '이샨오 ', '421');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('421', '373', '421');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('422', 'dummyAuthor422@naver.com', '1234', '황장미');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('422', ' 황장미', '422');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('422', '373', '422');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('374', 8, '포스트 팬데믹', 4, 29, '화',
        '어느 날, 한국대학교병원으로 실려 왔던 아르스24 변종 의심 환자가 탈출했다.자신이 담당하고 있던 환자를 놓친 것에 대해 책임감을 느낀 감염내과 교수 정유현은 환자를 수색하는 일에 발 벗고 나서기로 하며, 환자가 마지막으로 목격된 화성시 수락 마을로 향한다. 그리고 그들은 마을 입구에서 무언가와 맞딱뜨리게 되는데...,2m에 달하는 키, 일반 성인 남성보다 훨씬 거대한 체구, 손에 들린 동물의 시체, 피로 얼룩지고 찢어진 옷, 노인의 얼굴을 하고 있지만 노인으로 보기 힘든 남자의 모습.수색조는 남자의 모습에 순간 압도당하고 만다. 그리고 정유현은 남자의 기이한 모습과 도망친 환자가 병원에서 보여 줬던 이상 증세가 서로 연관성이 있음을 발견하게 되는데...',
        '신작', 'thumbnail_IMAG21_e7c75b1e-7bc4-484b-874d-1245f114479e.jpg', '2023-10-10');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('423', 'dummyAuthor423@naver.com', '1234', '좡좡');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('423', '좡좡 ', '423');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('423', '374', '423');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('424', 'dummyAuthor424@naver.com', '1234', '영명');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('424', ' 영명 ', '424');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('424', '374', '424');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('425', 'dummyAuthor425@naver.com', '1234', '한산이가');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('425', ' 한산이가', '425');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('425', '374', '425');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('375', 0, '퇴근 후에 만나요', 2, 50, '금', '2억짜리 영혼결혼식,그 한 가운데에서 전남친을 마주쳤다?!빚을 갚기 위해 죽은 남자와 결혼하게 된 정채원은결혼까지 생각했던 전 남자친구 한성준의 회사에 취직한다."잊지 마세요. 3년 동안은 절대 남자를 만나선 안 됩니다."유부녀 코스프레를 들키지 않으려는 여자와,그 비밀을 밝혀내려는 남자.두 사람의 창과 방패의 대결이 시작된다!', '무료',
        'thumbnail_IMAG21_0a77b0a7-0677-4228-b88b-84619093999f.jpg', '2023-10-10');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('426', 'dummyAuthor426@naver.com', '1234', '박한나');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('426', '박한나 ', '426');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('426', '375', '426');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('427', 'dummyAuthor427@naver.com', '1234', '햄친');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('427', ' 햄친 ', '427');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('427', '375', '427');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('428', 'dummyAuthor428@naver.com', '1234', '로즈빈');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('428', ' 로즈빈', '428');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('428', '375', '428');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('376', 15, '루크 비셸 따라잡기', 5, 21, '목', '세상 두려울 게 없던 왕국에서 제일 가는 공작가의 망나니  바스티안 에펜베르크 .자신과 정반대인 왕국 최고 마물사냥꾼  루크 비셸 과 결혼하겠다고 선언한다!모든 게 반대인 두 사람의 결혼, 과연 평탄할 수 있을 것인가?', '무료', 'thumbnail_IMAG21_23006afc-accd-46f6-8014-c955c4aa6241.jpg',
        '2023-10-10');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('429', 'dummyAuthor429@naver.com', '1234', '앙꼬빵');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('429', '앙꼬빵 ', '429');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('429', '376', '429');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('430', 'dummyAuthor430@naver.com', '1234', '학뚜벅');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('430', ' 학뚜벅 ', '430');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('430', '376', '430');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('431', 'dummyAuthor431@naver.com', '1234', '에슈티');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('431', ' 에슈티', '431');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('431', '376', '431');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('432', 'dummyAuthor432@naver.com', '1234', '뮤리');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('432', '뮤리', '432');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('377', 8, '토마토가 돼라!', 4, 31, '화', '껄렁한 겉모습으로 인해 음험한 소문을 몰고 다니는 시골 토박이 전학생 신이석은 첫눈에 반한 전교 1등 수재 조해주의 앙큼한 비밀을 목격하게 되고... 그에 대한 의문은 점차 눈덩이처럼 불어나기만 한다. 겉만 번지르르 붉고 속은 흰 사과 같은 조해주에게 진성 토마토 신이석의 짝사랑 폭격이 시작된다!', '무료',
        'thumbnail_IMAG21_e7e812d2-5d0a-46c6-8a39-b67a5010a7bc.jpg', '2023-10-10');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('432', '377', '432');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('378', 0, '북부 공작님을 유혹하겠습니다', 5, 24, '금', '“내 애인인 척 사교계에 들어가.”전 세계에서 주목하는 톱스타, 셀리나는촬영 중 갑작스러운 사고로 북부 공작의 땅에 차원 이동한다.마수에게서 목숨을 구해준 북부 공작, 칼시온은셀리나에게 자신의 애인인 척 사교계에 들어가정보를 입수하라는 계약을 제시하는데..', '무료',
        'thumbnail_IMAG21_65e1c328-a2e5-42f6-86ef-47d7424bb44e.jpg', '2023-10-10');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('433', 'dummyAuthor433@naver.com', '1234', '가천가');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('433', '가천가 ', '433');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('433', '378', '433');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('434', 'dummyAuthor434@naver.com', '1234', '은하수');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('434', ' 은하수 ', '434');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('434', '378', '434');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('435', 'dummyAuthor435@naver.com', '1234', '주시하');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('435', ' 주시하', '435');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('435', '378', '435');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('436', 'dummyAuthor436@naver.com', '1234', '김현아');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('436', '김현아', '436');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('379', 8, '역주행!', 3, 39, '화', '"지금 인기 급상승 1위가 네 영상이라고!"직캠 하나로 하루아침에 역주행에 성공한 5년차 무명 아이돌 성준, 그리고 성준과 엮이며 서서히 팬이 되어가는 아윤.마냥 꿈과 희망만 있진 않은, 한 아이돌과 팬의 이야기!<일진이 사나워> 김현아 작가의 아이돌 드라마 신작.', '완결',
        'thumbnail_IMAG21_d520a876-7403-4349-a56a-f1203882bed2.jpg', '2023-10-10');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('436', '379', '436');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('437', 'dummyAuthor437@naver.com', '1234', '율무');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('437', '율무', '437');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('380', 0, '결혼공략', 2, 21, '월',
        '낡고 지친 k-직장인 주인공 하루.하루는 자신만이 가지고 있는 능력을 활용해 욜로처럼 펑펑 쓰고, 시간을 되돌리는 삶을 살아가고 있는데...난데없이 나타나 총을 겨눈 의문의 남자로 인해, 모든 것이 처음으로 돌아간다!어떻게 여기까지 왔는데...! 다시 새내기로 돌아가다니!!게다가 이 모든 것을 끝내려면... 정해진 결혼 상대를 찾아야만 한다?!두 플레이어의 우당탕탕 생존 결혼 공략!', '없음',
        'thumbnail_IMAG21_524ed207-a4c2-4864-b8e1-3aef96a7ba41.jpg', '2023-10-10');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('437', '380', '437');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('438', 'dummyAuthor438@naver.com', '1234', '이륙');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('438', '이륙', '438');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('381', 0, '버그이터', 2, 31, '일', '랭킹 1위 버그 플레이어  김지한 은 어느 날 의문의 유저에게 캐릭터를 삭제당하고 1레벨이 된다.  버그 쓰지 말 걸..  후회하던 그때 찾아온 새로운 기회."다시 랭커로 만들어 줄게. 너 같이 버그 쓰는 놈들 때려잡는 방식으로."최강 버그 플레이어, 버그 잡는  버그이터 로 갱생하다!', '완결',
        'thumbnail_IMAG21_3544444194497192757.jpg', '2023-10-10');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('438', '381', '438');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('439', 'dummyAuthor439@naver.com', '1234', '김진경');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('439', '김진경', '439');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('382', 15, '러브 똘츄얼리', 9, 30, '목', '어제 분명히 나랑 뽀뽀했던 썸남이 오늘은 내 친구의 남친이란다. 하루아침에 사랑과 우정 모두 잃고 왕따가 된 ‘서정’. 설상가상 극혐하는 음침 안경잡이 ‘이담’과 키스까지 하게 되는데….그렇게 얼렁뚱땅 시작된 서정과 이담의 똘끼충만 로맨스!', '없음',
        'thumbnail_IMAG21_02284133-0eb0-407a-9c4e-7381dbd7a8a4.jpg', '2023-10-10');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('439', '382', '439');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('440', 'dummyAuthor440@naver.com', '1234', '일쩜이');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('440', '일쩜이', '440');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('383', 15, '트러블리걸', 9, 29, '목', '매콤한 연애서바이벌에 출연하게 된 순둥이 하새월.플러팅과 호의도 구분 못하는 모쏠 새월에게직진남 n명과의 동거는 어렵기만 하다. 심지어 여기선 모든 게(?) 가능하다고?꼬리 백개 달린 폭스남녀들 사이에서 살아남을 수 있을까?!', '없음', 'thumbnail_IMAG21_d4899238-5123-443d-826c-f70b1f3618a5.jpg',
        '2023-10-10');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('440', '383', '440');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('441', 'dummyAuthor441@naver.com', '1234', '김택기');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('441', '김택기', '441');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('384', 0, '중독연구소', 10, 36, '일', '중독 가정에서 자라온 소년, ‘김태림’은 중독 전문병원에 입사를 하게 되면서 자신의 문제를 바라보게 된다.우리 모두의 중독 이야기, 당신은 무엇에 중독이 되어있나요?', '순위', 'thumbnail_IMAG21_d6f6e062-23d4-432a-a4be-6e1e66f63ede.jpg', '2023-10-10');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('441', '384', '441');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('442', 'dummyAuthor442@naver.com', '1234', '샘샘');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('442', '샘샘', '442');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('385', 0, '악취해결사', 5, 47, '월', '"이 지긋지긋한 마스크...!!"태어나서 한 번도 마스크를 벗은 모습으로 나가본 적 없는 김무명.사람들의 부정적인 감정이 내뿜는 악취를 맡을 수도, 볼 수도 있는 무명이 가장 뒤가 구리다는 소문의 명문 고등학교에 진학하게 된다.끊임없이 마주하는 악취들과 사건들 사이에서 무명은 앞으로 이 학교에서 잘 버틸 수 있을까?', '무료',
        'thumbnail_IMAG21_f1a481c2-78fb-433d-8db4-01e31b150755.jpg', '2023-10-10');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('442', '385', '442');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('443', 'dummyAuthor443@naver.com', '1234', '해롱');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('443', '해롱', '443');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('386', 12, '행운을 부탁해!', 1, 43, '수',
        '온갖 불행을 달고 사는 불운의 주인공,  허윤!  그런 허윤 앞에 나타난 이상하고 아름다운 남자,  앙드레!  허윤을 자신의 매니저라고 부르는 앙드레의 정체는 바로, 신을 뽑는 오디션  SHOW ME THE GRACE 의 후보생. 이상하게도 그의 곁에 있으면 잠시나마 행운을 맛볼 수 있다!? 달콤한 제안에 넘어간 불행 인간 허윤과 까다로운 은총 소유자 앙드레의 좌충우돌 계약 동거가 시작된다!', '완결',
        'thumbnail_IMAG21_edfa4344-9f13-4a6c-8b9f-00d08cf37a1d.jpg', '2023-10-10');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('443', '386', '443');
INSERT INTO user_tb (`id`, `email`, `password`, `username`)
VALUES ('444', 'dummyAuthor444@naver.com', '1234', '고경빈');
INSERT INTO author_tb (`id`, `author_nickname`, `user_id`)
VALUES ('444', '고경빈', '444');
INSERT INTO webtoon_tb (`id`, `age_limit`, `title`, `star_count`, `star_score`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
VALUES ('387', 12, '트리거', 9, 48, '수', '수수께끼의 아름다운 식인 생명체 "아니스"로 인해 멸망 직전에 다다른 인류. 16살 소년 에반은 단짝친구 니카를 만나기 위해 아니스로부터 얻어낸 물질로 초능력을 얻게 된 이들의 부대, 에이블 소대에 입대한다. 그리고 세계가 움직이기 시작한다. 누군가에게는 과거, 누군가에게는 현재, 누군가에게는 미래인 세계가.', '없음',
        'thumbnail_IMAG21_9551ea28-1692-4478-a090-10ef47770f40.jpg', '2023-10-10');
INSERT INTO webtoon_author_tb (`id`, `webtoon_id`, `author_id`)
VALUES ('444', '387', '444');









INSERT INTO webtoon_author_tb (`webtoon_id`, `author_id`) VALUES ('102', '101');
INSERT INTO webtoon_author_tb (`webtoon_id`, `author_id`) VALUES ('102', '108');
INSERT INTO webtoon_author_tb (`webtoon_id`, `author_id`) VALUES ('103', '101');
INSERT INTO webtoon_author_tb (`webtoon_id`, `author_id`) VALUES ('104', '106');
INSERT INTO webtoon_author_tb (`webtoon_id`, `author_id`) VALUES ('104', '102');
INSERT INTO webtoon_author_tb (`webtoon_id`, `author_id`) VALUES ('105', '106');
INSERT INTO webtoon_author_tb (`webtoon_id`, `author_id`) VALUES ('105', '105');
INSERT INTO webtoon_author_tb (`webtoon_id`, `author_id`) VALUES ('106', '103');
INSERT INTO webtoon_author_tb (`webtoon_id`, `author_id`) VALUES ('107', '101');
INSERT INTO webtoon_author_tb (`webtoon_id`, `author_id`) VALUES ('108', '101');





-- INSERT INTO webtoon_tb (`id`,`age_limit`, `title`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
-- VALUES (401, 0, '테스트용다른웹툰1', '화일', '내용내용내용1', '무료',
--         'thumbnail_IMAG21_335a77d2-bbcd-4766-83f6-8d90120e9379.jpg', '2023-10-10');
-- INSERT INTO webtoon_author_tb (`webtoon_id`, `author_id`)
-- VALUES ('401', '101');

-- INSERT INTO webtoon_tb (`id`,`age_limit`, `title`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
-- VALUES (402, 0, '테스트용다른웹툰2', '수목', '내용내용내용2', '순위',
--         'thumbnail_IMAG21_35c1a390-7598-418e-9902-dc9a84f22d8b.jpg', '2023-10-10');
-- INSERT INTO webtoon_author_tb (`webtoon_id`, `author_id`)
-- VALUES ('402', '101');
-- INSERT INTO webtoon_author_tb (`webtoon_id`, `author_id`)
-- VALUES ('402', '102');

-- INSERT INTO webtoon_tb (`id`,`age_limit`, `title`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
-- VALUES (403, 0, '테스트용다른웹툰3', '화목토', '내용내용내용3', '완결',
--         'thumbnail_IMAG21_0a77b0a7-0677-4228-b88b-84619093999f.jpg', '2023-10-10');
-- INSERT INTO webtoon_author_tb (`webtoon_id`, `author_id`)
-- VALUES ('403', '101');
-- INSERT INTO webtoon_author_tb (`webtoon_id`, `author_id`)
-- VALUES ('403', '102');
-- INSERT INTO webtoon_author_tb (`webtoon_id`, `author_id`)
-- VALUES ('403', '106');
-- INSERT INTO webtoon_author_tb (`webtoon_id`, `author_id`)
-- VALUES ('403', '108');

-- INSERT INTO webtoon_tb (`id`,`age_limit`, `title`, `webtoon_week_day_enum`, `intro`, `webtoon_specially_enum`, `image`, `created_at`)
-- VALUES (404, 0, '테스트용다른웹툰4', '목일', '내용내용내용4', '신작',
--         'thumbnail_IMAG21_7a731990-1b33-4d79-8c00-e8fe03460618.jpg', '2023-10-10');
-- INSERT INTO webtoon_author_tb (`webtoon_id`, `author_id`)
-- VALUES ('404', '101');
-- INSERT INTO webtoon_author_tb (`webtoon_id`, `author_id`)
-- VALUES ('404', '105');
-- INSERT INTO webtoon_author_tb (`webtoon_id`, `author_id`)
-- VALUES ('404', '106');
-- INSERT INTO webtoon_author_tb (`webtoon_id`, `author_id`)
-- VALUES ('404', '109');





-------------------------------------------------------------------------------------------------------------------------








INSERT INTO episode_tb (`webtoon_id`, `detail_title`, `star_count`, `star_score`, `thumbnail`, `created_at`, `author_text`)
VALUES (101, '466화 일해회(1계열사) [18]', 11, 54, 'thumbnail_202x120_069a105d-c46e-4024-8973-2aa7202c5a12.jpg', now(), '에피소드1작가의말');
INSERT INTO episode_tb (`webtoon_id`, `detail_title`, `star_count`, `star_score`, `thumbnail`, `created_at`)
VALUES (101, '465화 일해회(1계열사) [17]', 12, 58, 'thumbnail_202x120_e3dd5cd4-0d3f-4b76-bb49-386c23221c2a.jpg', '2023-10-28 17:00:00.0');
INSERT INTO episode_tb (`webtoon_id`, `detail_title`, `star_count`, `star_score`, `thumbnail`, `created_at`)
VALUES (101, '464화 일해회(1계열사) [16]', 13, 64, 'thumbnail_202x120_2e358a94-f7d3-41af-a458-1b4bc53b93df.jpg', '2023-10-28 12:00:00.0');
INSERT INTO episode_tb (`webtoon_id`, `detail_title`, `star_count`, `star_score`, `thumbnail`, `created_at`)
VALUES (101, '463화 일해회(1계열사) [15]', 12, 57, 'thumbnail_202x120_bd02bba8-9bcf-4cce-b2fe-a489ab91fc86.jpg', '2023-10-28 11:00:00.0');
INSERT INTO episode_tb (`webtoon_id`, `detail_title`, `star_count`, `star_score`, `thumbnail`, `created_at`)
VALUES (101, '462화 일해회(1계열사) [14]', 11, 54, 'thumbnail_202x120_ad714060-bd11-49cd-a7c0-54e87d9a70c2.jpg', '2023-10-28 01:00:00.0');
INSERT INTO episode_tb (`webtoon_id`, `detail_title`, `star_count`, `star_score`, `thumbnail`, `created_at`)
VALUES (101, '461화 일해회(1계열사) [13]', 12, 57, 'thumbnail_202x120_8a927f66-d9f8-4df7-a2e8-9dc86888bd9e.jpg', '2023-09-14 10:00:00.0');
INSERT INTO episode_tb (`webtoon_id`, `detail_title`, `star_count`, `star_score`, `thumbnail`, `created_at`)
VALUES (101, '460화 일해회(1계열사) [12]', 11, 54, 'thumbnail_202x120_a79b9214-dbab-4e63-9db8-17ecca04efd0.jpg', '2023-09-07 10:00:00.0');
INSERT INTO episode_tb (`webtoon_id`, `detail_title`, `star_count`, `star_score`, `thumbnail`, `created_at`)
VALUES (101, '459화 일해회(1계열사) [11]', 12, 58, 'thumbnail_202x120_9ee2b156-5598-4c6c-b395-e3281dd4b3e4.jpg', '2023-08-31 10:00:00.0');
INSERT INTO episode_tb (`webtoon_id`, `detail_title`, `star_count`, `star_score`, `thumbnail`, `created_at`)
VALUES (101, '458화 일해회(1계열사) [10]', 12, 57, 'thumbnail_202x120_b9b3fc8c-15ec-4c1f-a7f0-90176072f786.jpg', '2023-08-24 10:00:00.0');
INSERT INTO episode_tb (`webtoon_id`, `detail_title`, `star_count`, `star_score`, `thumbnail`, `created_at`)
VALUES (101, '457화 일해회(1계열사) [09]', 13, 63, 'thumbnail_202x120_7fbbe20f-1bb8-47e3-92ea-4d692054558d.jpg', '2023-08-17 10:00:00.0');
INSERT INTO episode_tb (`webtoon_id`, `detail_title`, `star_count`, `star_score`, `thumbnail`, `created_at`)
VALUES (101, '456화 일해회(1계열사) [08]', 11, 54, 'thumbnail_202x120_1230753d-3976-4092-8d57-21bf9196ad6e.jpg', '2023-08-10 10:00:00.0');
INSERT INTO episode_tb (`webtoon_id`, `detail_title`, `star_count`, `star_score`, `thumbnail`, `created_at`)
VALUES (101, '455화 일해회(1계열사) [07]', 11, 52, 'thumbnail_202x120_1f977eef-84cf-4b2a-b589-9a0a9bdc59a9.jpg', '2023-08-03 10:00:00.0');
INSERT INTO episode_tb (`webtoon_id`, `detail_title`, `star_count`, `star_score`, `thumbnail`, `created_at`)
VALUES (101, '454화 일해회(1계열사) [06]', 13, 61, 'thumbnail_202x120_80f89cbc-fe5b-4521-951d-9499271c903d.jpg', '2023-07-27 10:00:00.0');
INSERT INTO episode_tb (`webtoon_id`, `detail_title`, `star_count`, `star_score`, `thumbnail`, `created_at`)
VALUES (101, '453화 일해회(1계열사) [05]', 13, 62, 'thumbnail_202x120_fcb0e520-2a13-4f57-8786-d77d5bf5564f.jpg', '2023-07-20 10:00:00.0');
INSERT INTO episode_tb (`webtoon_id`, `detail_title`, `star_count`, `star_score`, `thumbnail`, `created_at`)
VALUES (101, '452화 일해회(1계열사) [04]', 12, 57, 'thumbnail_202x120_febb2ec4-9457-4b03-8f3e-4c2b0ed47c4c.jpg', '2023-07-13 10:00:00.0');
INSERT INTO episode_tb (`webtoon_id`, `detail_title`, `star_count`, `star_score`, `thumbnail`, `created_at`)
VALUES (101, '451화 일해회(1계열사) [03]', 11, 54, 'thumbnail_202x120_935e5f29-0399-4edd-9b0f-0649b971f2c8.jpg', '2023-07-06 10:00:00.0');
INSERT INTO episode_tb (`webtoon_id`, `detail_title`, `star_count`, `star_score`, `thumbnail`, `created_at`)
VALUES (101, '450화 일해회(1계열사) [02]', 11, 53, 'thumbnail_202x120_e3c94dd8-9dd8-4513-96ca-0629cec70e2b.jpg', '2023-06-29 10:00:00.0');
INSERT INTO episode_tb (`webtoon_id`, `detail_title`, `star_count`, `star_score`, `thumbnail`, `created_at`)
VALUES (101, '449화 일해회(1계열사) [01]', 11, 52, 'thumbnail_202x120_8220f69b-08ef-44c9-8b69-33d807650d41.jpg', '2023-06-22 10:00:00.0');
INSERT INTO episode_tb (`webtoon_id`, `detail_title`, `star_count`, `star_score`, `thumbnail`, `created_at`)
VALUES (101, '448화 1계열사 음지', 12, 57, 'thumbnail_202x120_d1b7895e-b895-4e3f-8890-a9c50cf50e36.jpg', '2023-06-15 10:00:00.0');
INSERT INTO episode_tb (`webtoon_id`, `detail_title`, `star_count`, `star_score`, `thumbnail`, `created_at`)
VALUES (101, '447화 외모지상주의 [마무리]', 11, 54, 'thumbnail_202x120_d8a6da67-ef5e-4186-ba2b-9d4180e56d05.jpg', '2023-06-08 10:00:00.0');
INSERT INTO episode_tb (`webtoon_id`, `detail_title`, `star_count`, `star_score`, `thumbnail`, `created_at`)
VALUES (102, '106화', 11, 34, 'thumbnail_202x120_a8875ebf-fbe1-4700-bea0-7d5c33e499f2.jpg', now());
INSERT INTO episode_tb (`webtoon_id`, `detail_title`, `star_count`, `star_score`, `thumbnail`, `created_at`)
VALUES (102, '105화', 11, 49, 'thumbnail_202x120_ace51d29-d5e5-42ba-b21d-2f15d7035b00.jpg', '2023-10-12 10:00:00.0');
INSERT INTO episode_tb (`webtoon_id`, `detail_title`, `star_count`, `star_score`, `thumbnail`, `created_at`)
VALUES (102, '휴재 특별편 5', 11, 49, 'thumbnail_202x120_7bbdd521-4788-48e4-86ba-b9bf6dc84e23.jpg', '2023-08-31 10:00:00.0');
INSERT INTO episode_tb (`webtoon_id`, `detail_title`, `star_count`, `star_score`, `thumbnail`, `created_at`)
VALUES (102, '휴재 특별편 4 (각색의 시작)', 11, 45, 'thumbnail_202x120_3bb676c5-db88-45ea-ac2c-9a8b9e193335.jpg', '2023-08-24 10:00:00.0');
INSERT INTO episode_tb (`webtoon_id`, `detail_title`, `star_count`, `star_score`, `thumbnail`, `created_at`)
VALUES (102, '휴재 특별편 3 (추가Q&A)', 11, 49, 'thumbnail_202x120_539baffd-ffa2-47c4-9aeb-c7ee6db25874.jpg', '2023-08-17 10:00:00.0');
INSERT INTO episode_tb (`webtoon_id`, `detail_title`, `star_count`, `star_score`, `thumbnail`, `created_at`)
VALUES (102, '휴재 특별편 2 (김현수 작가님)', 11, 43, 'thumbnail_202x120_dc5ac71d-6899-488a-a3d2-12d5eeae0cc1.jpg', '2023-08-10 10:00:00.0');
INSERT INTO episode_tb (`webtoon_id`, `detail_title`, `star_count`, `star_score`, `thumbnail`, `created_at`)
VALUES (102, '휴재 특별편 1 (이현민&문백경 작가님)', 11, 42, 'thumbnail_202x120_c3392e7c-754b-4515-b8ac-a0e74ff3c49a.jpg', '2023-08-03 10:00:00.0');
INSERT INTO episode_tb (`webtoon_id`, `detail_title`, `star_count`, `star_score`, `thumbnail`, `created_at`)
VALUES (102, '104화', 11, 48, 'thumbnail_202x120_b6316d1b-820f-4bfd-a7d8-2ae07674f64e.jpg', '2023-07-27 10:00:00.0');
INSERT INTO episode_tb (`webtoon_id`, `detail_title`, `star_count`, `star_score`, `thumbnail`, `created_at`)
VALUES (102, '103화', 11, 41, 'thumbnail_202x120_73c16fd1-68ce-41d1-811d-add3701ecf23.jpg', '2023-07-20 10:00:00.0');
INSERT INTO episode_tb (`webtoon_id`, `detail_title`, `star_count`, `star_score`, `thumbnail`, `created_at`)
VALUES (102, '102화', 11, 42, 'thumbnail_202x120_4cbb7dfb-4278-4d58-8f80-e5815f0bcd73.jpg', '2023-07-13 10:00:00.0');
INSERT INTO episode_tb (`webtoon_id`, `detail_title`, `star_count`, `star_score`, `thumbnail`, `created_at`)
VALUES (102, '101화', 11, 48, 'thumbnail_202x120_c8f3a464-c945-46cb-8e1e-816415ad7a48.jpg', '2023-07-06 10:00:00.0');
INSERT INTO episode_tb (`webtoon_id`, `detail_title`, `star_count`, `star_score`, `thumbnail`, `created_at`)
VALUES (102, '100화', 11, 48, 'thumbnail_202x120_2230b60f-b8c3-41b4-b0aa-17549a61a61d.jpg', '2023-06-29 10:00:00.0');
INSERT INTO episode_tb (`webtoon_id`, `detail_title`, `star_count`, `star_score`, `thumbnail`, `created_at`)
VALUES (102, '99화', 11, 47, 'thumbnail_202x120_be924d63-77dd-451e-a81f-f42bb5f05932.jpg', '2023-06-22 10:00:00.0');
INSERT INTO episode_tb (`webtoon_id`, `detail_title`, `star_count`, `star_score`, `thumbnail`, `created_at`)
VALUES (102, '98화', 11, 38, 'thumbnail_202x120_aefcdc69-e884-40e7-aa5b-25575b38cd81.jpg', '2023-06-15 10:00:00.0');
INSERT INTO episode_tb (`webtoon_id`, `detail_title`, `star_count`, `star_score`, `thumbnail`, `created_at`)
VALUES (102, '97화', 11, 39, 'thumbnail_202x120_270a65aa-2959-4081-8bf6-a034a77d1c53.jpg', '2023-06-08 10:00:00.0');
INSERT INTO episode_tb (`webtoon_id`, `detail_title`, `star_count`, `star_score`, `thumbnail`, `created_at`)
VALUES (102, '96화', 11, 37, 'thumbnail_202x120_f7bd3a7f-ec19-463d-901d-c86cead9f7fe.jpg', '2023-06-01 10:00:00.0');
INSERT INTO episode_tb (`webtoon_id`, `detail_title`, `star_count`, `star_score`, `thumbnail`, `created_at`)
VALUES (102, '95화', 11, 47, 'thumbnail_202x120_914b0b4e-e3f4-4b6d-a03e-edcbca52e2f1.jpg', '2023-05-25 10:00:00.0');
INSERT INTO episode_tb (`webtoon_id`, `detail_title`, `star_count`, `star_score`, `thumbnail`, `created_at`)
VALUES (102, '94화', 11, 47, 'thumbnail_202x120_d3279a0c-4827-4915-b0cc-f7d839a15f1e.jpg', '2023-05-18 10:00:00.0');
INSERT INTO episode_tb (`webtoon_id`, `detail_title`, `star_count`, `star_score`, `thumbnail`, `created_at`)
VALUES (102, '93화', 11, 36, 'thumbnail_202x120_5e4ffbda-c359-4e76-b4e1-bcd7f7aa6826.jpg', '2023-05-11 10:00:00.0');
INSERT INTO episode_tb (`webtoon_id`, `detail_title`, `star_count`, `star_score`, `thumbnail`, `created_at`)
VALUES (102, '92화', 11, 35, 'thumbnail_202x120_46c791e4-51af-450e-ab54-44a984c9680d.jpg', '2023-05-04 10:00:00.0');
INSERT INTO episode_tb (`webtoon_id`, `detail_title`, `star_count`, `star_score`, `thumbnail`, `created_at`)
VALUES (103, '89화', 11, 47, 'thumbnail_202x120_46a16f6f-344f-4dfd-a089-2881bc2a8f49.jpg', now());
INSERT INTO episode_tb (`webtoon_id`, `detail_title`, `star_count`, `star_score`, `thumbnail`, `created_at`)
VALUES (103, '88화', 11, 41, 'thumbnail_202x120_37073671-8d95-4a5d-860d-98d6053053c8.jpg', '2023-10-12 10:00:00.0');
INSERT INTO episode_tb (`webtoon_id`, `detail_title`, `star_count`, `star_score`, `thumbnail`, `created_at`)
VALUES (103, '87화', 11, 47, 'thumbnail_202x120_014f6424-4fcd-4b43-92db-c8816302e5b4.jpg', '2023-10-05 10:00:00.0');
INSERT INTO episode_tb (`webtoon_id`, `detail_title`, `star_count`, `star_score`, `thumbnail`, `created_at`)
VALUES (103, '86화', 11, 43, 'thumbnail_202x120_abaed91f-4b0a-4bf4-8804-24fb8da8c44f.jpg', '2023-09-28 10:00:00.0');
INSERT INTO episode_tb (`webtoon_id`, `detail_title`, `star_count`, `star_score`, `thumbnail`, `created_at`)
VALUES (103, '85화', 11, 47, 'thumbnail_202x120_b4ea3ed9-5e9c-47cf-9c7a-47f87e033ab0.jpg', '2023-09-21 10:00:00.0');
INSERT INTO episode_tb (`webtoon_id`, `detail_title`, `star_count`, `star_score`, `thumbnail`, `created_at`)
VALUES (103, '84화', 11, 42, 'thumbnail_202x120_403d65c0-0efb-4412-8bfb-31573795e85e.jpg', '2023-09-14 10:00:00.0');
INSERT INTO episode_tb (`webtoon_id`, `detail_title`, `star_count`, `star_score`, `thumbnail`, `created_at`)
VALUES (103, '83화', 11, 41, 'thumbnail_202x120_484fa97c-ebf5-468e-9b94-7ac0327070b1.jpg', '2023-09-07 10:00:00.0');
INSERT INTO episode_tb (`webtoon_id`, `detail_title`, `star_count`, `star_score`, `thumbnail`, `created_at`)
VALUES (103, '82화', 11, 47, 'thumbnail_202x120_c0a837bc-852d-47cf-98c9-266b07731457.jpg', '2023-08-31 10:00:00.0');
INSERT INTO episode_tb (`webtoon_id`, `detail_title`, `star_count`, `star_score`, `thumbnail`, `created_at`)
VALUES (103, '81화', 11, 47, 'thumbnail_202x120_c46cba05-e9f2-4e56-980a-499f20d7a274.jpg', '2023-08-24 10:00:00.0');
INSERT INTO episode_tb (`webtoon_id`, `detail_title`, `star_count`, `star_score`, `thumbnail`, `created_at`)
VALUES (103, '80화', 11, 47, 'thumbnail_202x120_e7f897ff-9afa-4664-b099-0d5c2ae51563.jpg', '2023-08-17 10:00:00.0');
INSERT INTO episode_tb (`webtoon_id`, `detail_title`, `star_count`, `star_score`, `thumbnail`, `created_at`)
VALUES (103, '79화', 11, 47, 'thumbnail_202x120_28bc76dc-dbd3-47d5-9627-2f23266a0860.jpg', '2023-08-10 10:00:00.0');
INSERT INTO episode_tb (`webtoon_id`, `detail_title`, `star_count`, `star_score`, `thumbnail`, `created_at`)
VALUES (103, '78화', 11, 47, 'thumbnail_202x120_2bbe5b1a-c1f5-483e-a519-759006b8cfda.jpg', '2023-08-03 10:00:00.0');
INSERT INTO episode_tb (`webtoon_id`, `detail_title`, `star_count`, `star_score`, `thumbnail`, `created_at`)
VALUES (103, '77화', 11, 47, 'thumbnail_202x120_08f983da-d543-4880-a918-904736657191.jpg', '2023-07-27 10:00:00.0');
INSERT INTO episode_tb (`webtoon_id`, `detail_title`, `star_count`, `star_score`, `thumbnail`, `created_at`)
VALUES (103, '76화', 11, 47, 'thumbnail_202x120_8c8526f0-7f16-4583-abe4-30d624bfb8ea.jpg', '2023-07-20 10:00:00.0');
INSERT INTO episode_tb (`webtoon_id`, `detail_title`, `star_count`, `star_score`, `thumbnail`, `created_at`)
VALUES (103, '75화', 11, 47, 'thumbnail_202x120_a11f8b33-4b7f-4871-9230-4af28656bcad.jpg', '2023-07-13 10:00:00.0');
INSERT INTO episode_tb (`webtoon_id`, `detail_title`, `star_count`, `star_score`, `thumbnail`, `created_at`)
VALUES (103, '74화', 11, 47, 'thumbnail_202x120_dae12d91-10c3-4988-8c19-a8270d035f22.jpg', '2023-07-06 10:00:00.0');
INSERT INTO episode_tb (`webtoon_id`, `detail_title`, `star_count`, `star_score`, `thumbnail`, `created_at`)
VALUES (103, '73화', 11, 47, 'thumbnail_202x120_39aa18b8-1b58-4fbe-92f7-dc0e2444259b.jpg', '2023-06-29 10:00:00.0');
INSERT INTO episode_tb (`webtoon_id`, `detail_title`, `star_count`, `star_score`, `thumbnail`, `created_at`)
VALUES (103, '72화', 11, 47, 'thumbnail_202x120_cbc87bef-6f54-49f3-b91f-d626ac52f9f7.jpg', '2023-06-22 10:00:00.0');
INSERT INTO episode_tb (`webtoon_id`, `detail_title`, `star_count`, `star_score`, `thumbnail`, `created_at`)
VALUES (103, '71화', 11, 47, 'thumbnail_202x120_76cd2289-d85a-4f5e-ac94-0dc2dcfa22f7.jpg', '2023-06-15 10:00:00.0');
INSERT INTO episode_tb (`webtoon_id`, `detail_title`, `star_count`, `star_score`, `thumbnail`, `created_at`)
VALUES (103, '70화', 11, 47, 'thumbnail_202x120_32e6c193-c3a5-40e5-9477-f4a9ade805c6.jpg', '2023-06-08 10:00:00.0');
INSERT INTO episode_tb (`webtoon_id`, `detail_title`, `star_count`, `star_score`, `thumbnail`, `created_at`)
VALUES (104, '152화', 11, 36, 'thumbnail_202x120_cf54b80e-2dd8-4138-95ca-82f2c7c517ef.jpg', '2023-10-19 10:00:00.0');
INSERT INTO episode_tb (`webtoon_id`, `detail_title`, `star_count`, `star_score`, `thumbnail`, `created_at`)
VALUES (104, '151화', 11, 36, 'thumbnail_202x120_92912862-c42f-4d59-9364-ebed145de9f2.jpg', '2023-10-12 10:00:00.0');
INSERT INTO episode_tb (`webtoon_id`, `detail_title`, `star_count`, `star_score`, `thumbnail`, `created_at`)
VALUES (104, '150화', 11, 45, 'thumbnail_202x120_dc6a667b-39c6-4842-87f6-dd3599b80228.jpg', '2023-10-05 10:00:00.0');
INSERT INTO episode_tb (`webtoon_id`, `detail_title`, `star_count`, `star_score`, `thumbnail`, `created_at`)
VALUES (104, '149화', 11, 36, 'thumbnail_202x120_c909af74-bc66-46a3-90ba-e660e36e5ab3.jpg', '2023-09-28 10:00:00.0');
INSERT INTO episode_tb (`webtoon_id`, `detail_title`, `star_count`, `star_score`, `thumbnail`, `created_at`)
VALUES (104, '148화', 11, 33, 'thumbnail_202x120_30b4f37f-bcd0-4161-8bb3-5450f21e8c05.jpg', '2023-09-21 10:00:00.0');
INSERT INTO episode_tb (`webtoon_id`, `detail_title`, `star_count`, `star_score`, `thumbnail`, `created_at`)
VALUES (104, '147화', 11, 34, 'thumbnail_202x120_7815c85e-cd09-47ea-af12-1f959f2ef3a7.jpg', '2023-09-14 10:00:00.0');
INSERT INTO episode_tb (`webtoon_id`, `detail_title`, `star_count`, `star_score`, `thumbnail`, `created_at`)
VALUES (104, '146화', 11, 35, 'thumbnail_202x120_d25a7029-ef32-4e59-beaf-f4a43bede28b.jpg', '2023-09-07 10:00:00.0');
INSERT INTO episode_tb (`webtoon_id`, `detail_title`, `star_count`, `star_score`, `thumbnail`, `created_at`)
VALUES (104, '145화', 11, 37, 'thumbnail_202x120_29b882f6-d22b-4607-ab16-445a75337722.jpg', '2023-08-31 10:00:00.0');
INSERT INTO episode_tb (`webtoon_id`, `detail_title`, `star_count`, `star_score`, `thumbnail`, `created_at`)
VALUES (104, '144화', 11, 31, 'thumbnail_202x120_de5af4d5-9541-4a7f-be71-8e384a65ef2b.jpg', '2023-08-24 10:00:00.0');
INSERT INTO episode_tb (`webtoon_id`, `detail_title`, `star_count`, `star_score`, `thumbnail`, `created_at`)
VALUES (104, '143화', 11, 35, 'thumbnail_202x120_2112411f-67d7-47bb-b91c-3f9bc950ca8a.jpg', '2023-08-17 10:00:00.0');
INSERT INTO episode_tb (`webtoon_id`, `detail_title`, `star_count`, `star_score`, `thumbnail`, `created_at`)
VALUES (104, '142화', 11, 46, 'thumbnail_202x120_ae4e0d29-bc6d-4705-a774-2367fccba105.jpg', '2023-08-10 10:00:00.0');
INSERT INTO episode_tb (`webtoon_id`, `detail_title`, `star_count`, `star_score`, `thumbnail`, `created_at`)
VALUES (104, '141화', 11, 36, 'thumbnail_202x120_1b2b6a5f-528d-40bc-bf4b-187e08472b86.jpg', '2023-08-03 10:00:00.0');
INSERT INTO episode_tb (`webtoon_id`, `detail_title`, `star_count`, `star_score`, `thumbnail`, `created_at`)
VALUES (104, '140화', 11, 37, 'thumbnail_202x120_48379591-57df-4750-8f9e-92f6f0b9adb0.jpg', '2023-07-27 10:00:00.0');
INSERT INTO episode_tb (`webtoon_id`, `detail_title`, `star_count`, `star_score`, `thumbnail`, `created_at`)
VALUES (104, '139화', 11, 41, 'thumbnail_202x120_3b7d3b59-ab90-4f39-9393-7762fc97fbc8.jpg', '2023-07-20 10:00:00.0');
INSERT INTO episode_tb (`webtoon_id`, `detail_title`, `star_count`, `star_score`, `thumbnail`, `created_at`)
VALUES (104, '138화', 11, 46, 'thumbnail_202x120_279e5d48-87c1-4422-b0cc-0b4d6317f130.jpg', '2023-07-13 10:00:00.0');
INSERT INTO episode_tb (`webtoon_id`, `detail_title`, `star_count`, `star_score`, `thumbnail`, `created_at`)
VALUES (104, '137화', 11, 46, 'thumbnail_202x120_ce008482-e598-4d3c-b4c4-b2fac66e6c5a.jpg', '2023-07-06 10:00:00.0');
INSERT INTO episode_tb (`webtoon_id`, `detail_title`, `star_count`, `star_score`, `thumbnail`, `created_at`)
VALUES (104, '136화', 11, 46, 'thumbnail_202x120_48319cff-10a6-49d6-bb8b-213f0cf396d8.jpg', '2023-06-29 10:00:00.0');
INSERT INTO episode_tb (`webtoon_id`, `detail_title`, `star_count`, `star_score`, `thumbnail`, `created_at`)
VALUES (104, '135화', 11, 46, 'thumbnail_202x120_f0392c10-c9d3-4297-a037-2df617b5df35.jpg', '2023-06-22 10:00:00.0');
INSERT INTO episode_tb (`webtoon_id`, `detail_title`, `star_count`, `star_score`, `thumbnail`, `created_at`)
VALUES (104, '134화', 11, 46, 'thumbnail_202x120_80b33a4d-52f5-4c7e-aeb3-1b071852ffb0.jpg', '2023-06-15 10:00:00.0');
INSERT INTO episode_tb (`webtoon_id`, `detail_title`, `star_count`, `star_score`, `thumbnail`, `created_at`)
VALUES (104, '133화', 11, 46, 'thumbnail_202x120_6df9d4df-7a7c-4a88-9b7c-aa1266e13bc5.jpg', '2023-06-08 10:00:00.0');
INSERT INTO episode_tb (`webtoon_id`, `detail_title`, `star_count`, `star_score`, `thumbnail`, `created_at`)
VALUES (105, '117화. 고인물 코퍼레이션 단합 대회', 11, 35, 'thumbnail_202x120_61f6c829-cbfd-49f7-8585-2b096cbac60c.jpg', '2023-10-19 10:00:00.0');
INSERT INTO episode_tb (`webtoon_id`, `detail_title`, `star_count`, `star_score`, `thumbnail`, `created_at`)
VALUES (105, '116화. 릭노스의 전당포', 11, 42, 'thumbnail_202x120_d449cc72-cc20-4fcd-8b12-cbc58dd0b6e3.jpg', '2023-10-12 10:00:00.0');
INSERT INTO episode_tb (`webtoon_id`, `detail_title`, `star_count`, `star_score`, `thumbnail`, `created_at`)
VALUES (105, '115화. 고인물이 이중 전직을 하는 법', 11, 35, 'thumbnail_202x120_1b72b68a-d00a-4849-ad5f-20b4bc240e4d.jpg', '2023-10-05 10:00:00.0');
INSERT INTO episode_tb (`webtoon_id`, `detail_title`, `star_count`, `star_score`, `thumbnail`, `created_at`)
VALUES (105, '114화. 신념을 잇는 끈', 11, 41, 'thumbnail_202x120_5d4ad464-5cfa-489f-b9f2-cfd0875941d4.jpg', '2023-09-28 10:00:00.0');
INSERT INTO episode_tb (`webtoon_id`, `detail_title`, `star_count`, `star_score`, `thumbnail`, `created_at`)
VALUES (105, '113화. 그림자 속 암기, 월영', 11, 47, 'thumbnail_202x120_e42b570e-e8dd-415e-820b-a1e6029e751c.jpg', '2023-09-21 10:00:00.0');
INSERT INTO episode_tb (`webtoon_id`, `detail_title`, `star_count`, `star_score`, `thumbnail`, `created_at`)
VALUES (105, '112화. 두 계층의 연합(2)', 11, 46, 'thumbnail_202x120_c083b6f7-1ae2-49c6-9be9-db6803ed111f.jpg', '2023-09-14 10:00:00.0');
INSERT INTO episode_tb (`webtoon_id`, `detail_title`, `star_count`, `star_score`, `thumbnail`, `created_at`)
VALUES (105, '111화. 두 계층의 연합(1)', 11, 44, 'thumbnail_202x120_81864290-d7bb-4ce1-9a17-c901c741d3c3.jpg', '2023-09-07 10:00:00.0');
INSERT INTO episode_tb (`webtoon_id`, `detail_title`, `star_count`, `star_score`, `thumbnail`, `created_at`)
VALUES (105, '110화. 붉은 맹세의 문양', 11, 35, 'thumbnail_202x120_0bc1aa55-30a4-424c-86c7-5df36c545006.jpg', '2023-08-31 10:00:00.0');
INSERT INTO episode_tb (`webtoon_id`, `detail_title`, `star_count`, `star_score`, `thumbnail`, `created_at`)
VALUES (105, '109화. 권천지룡 암황의 수제자', 11, 25, 'thumbnail_202x120_f180fa9e-83a3-49a4-8850-bf2b907f59c1.jpg', '2023-08-24 10:00:00.0');
INSERT INTO episode_tb (`webtoon_id`, `detail_title`, `star_count`, `star_score`, `thumbnail`, `created_at`)
VALUES (105, '108화. 일상을 살아간다는 것', 11, 35, 'thumbnail_202x120_3d949b24-36b5-4f29-9486-49020b5cd858.jpg', '2023-08-17 10:00:00.0');
INSERT INTO episode_tb (`webtoon_id`, `detail_title`, `star_count`, `star_score`, `thumbnail`, `created_at`)
VALUES (105, '107화. 세력 선택(3)', 11, 45, 'thumbnail_202x120_cae87f73-c52f-415f-9f58-636c3bf9b5da.jpg', '2023-08-10 10:00:00.0');
INSERT INTO episode_tb (`webtoon_id`, `detail_title`, `star_count`, `star_score`, `thumbnail`, `created_at`)
VALUES (105, '106화. 3대 재앙(2)', 11, 43, 'thumbnail_202x120_adaf65f3-8f84-43c7-adbe-23c5394d9fd7.jpg', '2023-08-03 10:00:00.0');
INSERT INTO episode_tb (`webtoon_id`, `detail_title`, `star_count`, `star_score`, `thumbnail`, `created_at`)
VALUES (105, '105화. 3대 재앙(1)', 11, 45, 'thumbnail_202x120_f3f0c856-2fab-41d7-b1b6-c4b2d2c74cae.jpg', '2023-07-27 10:00:00.0');
INSERT INTO episode_tb (`webtoon_id`, `detail_title`, `star_count`, `star_score`, `thumbnail`, `created_at`)
VALUES (105, '104화. 절망을 부르는 뿔피리(2)', 11, 45, 'thumbnail_202x120_2ff46987-9b30-4d74-a326-0e7b35b19f26.jpg', '2023-07-20 10:00:00.0');
INSERT INTO episode_tb (`webtoon_id`, `detail_title`, `star_count`, `star_score`, `thumbnail`, `created_at`)
VALUES (105, '103화. 절망을 부르는 뿔피리(1)', 11, 45, 'thumbnail_202x120_2cdde2c8-1cfa-4de1-a968-16f6239424a2.jpg', '2023-07-13 10:00:00.0');
INSERT INTO episode_tb (`webtoon_id`, `detail_title`, `star_count`, `star_score`, `thumbnail`, `created_at`)
VALUES (105, '102화. 귀혈대주 염호', 11, 45, 'thumbnail_202x120_9dfbf71e-0e95-4d34-ad05-f09c33be55da.jpg', '2023-07-06 10:00:00.0');
INSERT INTO episode_tb (`webtoon_id`, `detail_title`, `star_count`, `star_score`, `thumbnail`, `created_at`)
VALUES (105, '101화. 쾌락 전투광', 11, 45, 'thumbnail_202x120_a8996102-4949-4fa5-8079-b2b1c488c196.jpg', '2023-06-29 10:00:00.0');
INSERT INTO episode_tb (`webtoon_id`, `detail_title`, `star_count`, `star_score`, `thumbnail`, `created_at`)
VALUES (105, '100화. 세력 선택(2)', 11, 45, 'thumbnail_202x120_a93eb4bc-23bd-41c3-b100-933664cfa28e.jpg', '2023-06-22 10:00:00.0');
INSERT INTO episode_tb (`webtoon_id`, `detail_title`, `star_count`, `star_score`, `thumbnail`, `created_at`)
VALUES (105, '99화. 세력 선택(1)', 11, 45, 'thumbnail_202x120_e1fd4e23-d364-432d-a67c-ce3d688a324f.jpg', '2023-06-15 10:00:00.0');
INSERT INTO episode_tb (`webtoon_id`, `detail_title`, `star_count`, `star_score`, `thumbnail`, `created_at`)
VALUES (105, '98화. 가면무도회(2)', 11, 45, 'thumbnail_202x120_3bb77bf0-6260-4f12-9d64-5f4932e084a8.jpg', '2023-06-08 10:00:00.0');
INSERT INTO episode_tb (`webtoon_id`, `detail_title`, `star_count`, `star_score`, `thumbnail`, `created_at`)
VALUES (106, '[월] 은우와 5주차', 11, 43, 'thumbnail_202x120_7e3575ed-30dd-4b14-ad3a-1c98f11d8c83.jpg', now());
INSERT INTO episode_tb (`webtoon_id`, `detail_title`, `star_count`, `star_score`, `thumbnail`, `created_at`)
VALUES (106, '[일] 정완과 4주차', 11, 54, 'thumbnail_202x120_f4dbd952-c7de-4b17-b176-b3ea9f1c2c74.jpg', '2023-10-21 10:00:00.0');
INSERT INTO episode_tb (`webtoon_id`, `detail_title`, `star_count`, `star_score`, `thumbnail`, `created_at`)
VALUES (106, '[토] 연희와 4주차', 11, 53, 'thumbnail_202x120_3167d441-9a34-4b5f-851d-5dd1c0b0a569.jpg', '2023-10-20 10:00:00.0');
INSERT INTO episode_tb (`webtoon_id`, `detail_title`, `star_count`, `star_score`, `thumbnail`, `created_at`)
VALUES (106, '[금] 태원과 4주차', 11, 52, 'thumbnail_202x120_93624cf6-769a-4fd8-91d7-2b1a4467cf3d.jpg', '2023-10-19 10:00:00.0');
INSERT INTO episode_tb (`webtoon_id`, `detail_title`, `star_count`, `star_score`, `thumbnail`, `created_at`)
VALUES (106, '[목] 티아와 4주차', 11, 44, 'thumbnail_202x120_6626545d-0299-4cfe-8f00-6615c537e804.jpg', '2023-10-18 10:00:00.0');
INSERT INTO episode_tb (`webtoon_id`, `detail_title`, `star_count`, `star_score`, `thumbnail`, `created_at`)
VALUES (106, '[수] 범철과 4주차', 11, 51, 'thumbnail_202x120_f38ba06b-8b9f-4604-9dfd-3c3146357033.jpg', '2023-10-17 10:00:00.0');
INSERT INTO episode_tb (`webtoon_id`, `detail_title`, `star_count`, `star_score`, `thumbnail`, `created_at`)
VALUES (106, '[화] 하얀 개와 4주차', 11, 35, 'thumbnail_202x120_06279fc7-fda1-4207-bfd6-35099c23fe63.jpg', '2023-10-16 10:00:00.0');
INSERT INTO episode_tb (`webtoon_id`, `detail_title`, `star_count`, `star_score`, `thumbnail`, `created_at`)
VALUES (106, '[월] 은우와 4주차', 11, 25, 'thumbnail_202x120_1848b457-24bd-4eca-aa46-e1efc7ac3ced.jpg', '2023-10-15 10:00:00.0');
INSERT INTO episode_tb (`webtoon_id`, `detail_title`, `star_count`, `star_score`, `thumbnail`, `created_at`)
VALUES (106, '[일] 정완과 3주차', 11, 43, 'thumbnail_202x120_1ad4400e-b30f-4e27-a5ed-2d337840070b.jpg', '2023-10-14 10:00:00.0');
INSERT INTO episode_tb (`webtoon_id`, `detail_title`, `star_count`, `star_score`, `thumbnail`, `created_at`)
VALUES (106, '[토] 연희와 3주차', 11, 45, 'thumbnail_202x120_fb0fb7fa-bd7f-4143-bc2a-5a638d4c53c0.jpg', '2023-10-13 10:00:00.0');
INSERT INTO episode_tb (`webtoon_id`, `detail_title`, `star_count`, `star_score`, `thumbnail`, `created_at`)
VALUES (106, '[금] 태원과 3주차', 11, 45, 'thumbnail_202x120_20805ff6-f511-4dfd-ab4f-dcb7ce07307c.jpg', '2023-10-12 10:00:00.0');
INSERT INTO episode_tb (`webtoon_id`, `detail_title`, `star_count`, `star_score`, `thumbnail`, `created_at`)
VALUES (106, '[목] 티아와 3주차', 11, 45, 'thumbnail_202x120_f704d761-e934-4a34-87db-3f2667b749c5.jpg', '2023-10-11 10:00:00.0');
INSERT INTO episode_tb (`webtoon_id`, `detail_title`, `star_count`, `star_score`, `thumbnail`, `created_at`)
VALUES (106, '[수] 범철과 3주차', 11, 45, 'thumbnail_202x120_188f57b6-1006-4503-9f2b-8083d44e2098.jpg', '2023-10-10 10:00:00.0');
INSERT INTO episode_tb (`webtoon_id`, `detail_title`, `star_count`, `star_score`, `thumbnail`, `created_at`)
VALUES (106, '[화] 하얀 개와 3주차', 11, 45, 'thumbnail_202x120_d3d6b6c8-39cb-4e6a-8f57-85389f0a7e98.jpg', '2023-10-09 10:00:00.0');
INSERT INTO episode_tb (`webtoon_id`, `detail_title`, `star_count`, `star_score`, `thumbnail`, `created_at`)
VALUES (106, '[월] 은우와 3주차', 11, 45, 'thumbnail_202x120_3f9309f2-4f43-477a-96ac-57deed30354b.jpg', '2023-10-08 10:00:00.0');
INSERT INTO episode_tb (`webtoon_id`, `detail_title`, `star_count`, `star_score`, `thumbnail`, `created_at`)
VALUES (106, '[일] 정완과 2주차', 11, 43, 'thumbnail_202x120_d2d45e17-6e7a-4649-b197-cfebef2ca4f1.jpg', '2023-10-07 10:00:00.0');
INSERT INTO episode_tb (`webtoon_id`, `detail_title`, `star_count`, `star_score`, `thumbnail`, `created_at`)
VALUES (106, '[토] 연희와 2주차', 11, 44, 'thumbnail_202x120_9df0de5a-f921-464b-b601-c58f5437969b.jpg', '2023-10-06 10:00:00.0');
INSERT INTO episode_tb (`webtoon_id`, `detail_title`, `star_count`, `star_score`, `thumbnail`, `created_at`)
VALUES (106, '[금] 태원과 2주차', 11, 45, 'thumbnail_202x120_7abc4726-4185-4e8e-a9b4-96c43b9007e4.jpg', '2023-10-05 10:00:00.0');
INSERT INTO episode_tb (`webtoon_id`, `detail_title`, `star_count`, `star_score`, `thumbnail`, `created_at`)
VALUES (106, '[목] 티아와 2주차', 11, 42, 'thumbnail_202x120_96d6d684-82c5-4651-9172-4e40204dae31.jpeg', '2023-10-04 10:00:00.0');
INSERT INTO episode_tb (`webtoon_id`, `detail_title`, `star_count`, `star_score`, `thumbnail`, `created_at`)
VALUES (106, '[수] 범철과 2주차', 11, 45, 'thumbnail_202x120_085de48b-dadb-479e-851b-25b14f6824f5.jpg', '2023-10-03 10:00:00.0');
INSERT INTO episode_tb (`webtoon_id`, `detail_title`, `star_count`, `star_score`, `thumbnail`, `created_at`)
VALUES (107, '1부 여희연(6)', 11, 45, 'thumbnail_202x120_f638e258-b4f8-4731-b628-d29e16e878d6.jpg', '2023-10-19 10:00:00.0');
INSERT INTO episode_tb (`webtoon_id`, `detail_title`, `star_count`, `star_score`, `thumbnail`, `created_at`)
VALUES (107, '1부 여희연(5)', 11, 41, 'thumbnail_202x120_7531eabf-2c72-451e-b3d1-11c8525d9f1f.jpg', '2023-10-12 10:00:00.0');
INSERT INTO episode_tb (`webtoon_id`, `detail_title`, `star_count`, `star_score`, `thumbnail`, `created_at`)
VALUES (107, '1부 여희연(4)', 11, 45, 'thumbnail_202x120_0548ea96-699c-4283-a9b9-7e3dbe575c36.jpg', '2023-10-05 10:00:00.0');
INSERT INTO episode_tb (`webtoon_id`, `detail_title`, `star_count`, `star_score`, `thumbnail`, `created_at`)
VALUES (107, '1부 여희연(3)', 11, 42, 'thumbnail_202x120_16828337-71f6-4964-be33-7ad160c9f3b8.jpg', '2023-09-28 10:00:00.0');
INSERT INTO episode_tb (`webtoon_id`, `detail_title`, `star_count`, `star_score`, `thumbnail`, `created_at`)
VALUES (107, '1부 여희연(2)', 11, 43, 'thumbnail_202x120_84da0cc0-84d0-4658-9448-a91890e232de.jpg', '2023-09-21 10:00:00.0');
INSERT INTO episode_tb (`webtoon_id`, `detail_title`, `star_count`, `star_score`, `thumbnail`, `created_at`)
VALUES (107, '1부 여희연(1)', 11, 45, 'thumbnail_202x120_317fc3b9-aad2-4132-b13a-c80376e093ba.jpg', '2023-09-14 10:00:00.0');
INSERT INTO episode_tb (`webtoon_id`, `detail_title`, `star_count`, `star_score`, `thumbnail`, `created_at`)
VALUES (108, '5화 - 그런 도박에는 자신있으니까', 11, 35, 'thumbnail_202x120_e813d9d4-0c40-4dce-83cc-127079f9cf06.jpg', now());
INSERT INTO episode_tb (`webtoon_id`, `detail_title`, `star_count`, `star_score`, `thumbnail`, `created_at`)
VALUES (108, '4화 - 타임 패러독스', 11, 48, 'thumbnail_202x120_41d7bdf5-6dc5-41dd-8ef0-09a8a6411cd6.jpg', '2023-10-12 10:00:00.0');
INSERT INTO episode_tb (`webtoon_id`, `detail_title`, `star_count`, `star_score`, `thumbnail`, `created_at`)
VALUES (108, '3화 - 전직과 참교육', 11, 45, 'thumbnail_202x120_8de811e3-37e9-449a-8abe-47824ff2d9d4.jpg', '2023-10-05 10:00:00.0');
INSERT INTO episode_tb (`webtoon_id`, `detail_title`, `star_count`, `star_score`, `thumbnail`, `created_at`)
VALUES (108, '2화 - 철 (凸)', 11, 47, 'thumbnail_202x120_aa5692b6-c7d5-4f99-a61f-3decdc23f235.jpg', '2023-09-28 10:00:00.0');
INSERT INTO episode_tb (`webtoon_id`, `detail_title`, `star_count`, `star_score`, `thumbnail`, `created_at`)
VALUES (108, '1화 - 내가 돌아왔다', 11, 46, 'thumbnail_202x120_276db2b9-007b-4295-82d1-98764a29f654.jpg', '2023-09-21 10:00:00.0');
INSERT INTO episode_tb (`webtoon_id`, `detail_title`, `star_count`, `star_score`, `thumbnail`, `created_at`)
VALUES (108, '프롤로그 - 롤백', 11, 35, 'thumbnail_202x120_3cbccb02-0c9e-49aa-952a-9bb6a129fb34.jpg', '2023-09-21 10:00:00.0');



-------------------------------------------------------------------------------------------------------------------------


-- 에피소드 사진
INSERT INTO EPISODE_PHOTO_TB (`episode_id`, `photoURL`)
VALUES (1, 'testphoto1.jpg');
INSERT INTO EPISODE_PHOTO_TB (`episode_id`, `photoURL`)
VALUES (1, 'testW.png');
INSERT INTO EPISODE_PHOTO_TB (`episode_id`, `photoURL`)
VALUES (1, 'testH.png');

INSERT INTO EPISODE_PHOTO_TB (`episode_id`, `photoURL`)
VALUES (2, 'testphoto1.jpg');
INSERT INTO EPISODE_PHOTO_TB (`episode_id`, `photoURL`)
VALUES (2, 'testphoto2.jpg');
INSERT INTO EPISODE_PHOTO_TB (`episode_id`, `photoURL`)
VALUES (2, 'testphoto3.jpg');
INSERT INTO EPISODE_PHOTO_TB (`episode_id`, `photoURL`)
VALUES (2, 'testphoto4.jpg');
INSERT INTO EPISODE_PHOTO_TB (`episode_id`, `photoURL`)
VALUES (2, 'testphoto5.jpg');
INSERT INTO EPISODE_PHOTO_TB (`episode_id`, `photoURL`)
VALUES (2, 'testphoto6.jpg');


-------------------------------------------------------------------------------------------------------------------------


-- 에피소드 좋아요
INSERT INTO like_episode_tb (`id`, `user_id`, `episode_id`, `is_like`, `created_at`)
VALUES (1, 1, 1, true, '2023-10-10');
INSERT INTO like_episode_tb (`id`, `user_id`, `episode_id`, `is_like`, `created_at`)
VALUES (2, 2, 1, true, '2023-10-10');
INSERT INTO like_episode_tb (`id`, `user_id`, `episode_id`, `is_like`, `created_at`)
VALUES (3, 3, 1, true, '2023-10-10');
INSERT INTO like_episode_tb (`id`, `user_id`, `episode_id`, `is_like`, `created_at`)
VALUES (4, 101, 1, true, '2023-10-10');
INSERT INTO like_episode_tb (`id`, `user_id`, `episode_id`, `is_like`, `created_at`)
VALUES (5, 1, 2, true, '2023-10-10');
INSERT INTO like_episode_tb (`id`, `user_id`, `episode_id`, `is_like`, `created_at`)
VALUES (6, 2, 2, true, '2023-10-10');
INSERT INTO like_episode_tb (`id`, `user_id`, `episode_id`, `is_like`, `created_at`)
VALUES (7, 3, 2, true, '2023-10-10');



-------------------------------------------------------------------------------------------------------------------------


-- 댓글
<<<<<<< HEAD
INSERT INTO comment_tb (`id`, `user_id`, `episode_id`, `text`, `created_at`)
VALUES (1, 1, 1, '에피소드1 쌀댓글1', '2020-11-21');
INSERT INTO comment_tb (`id`, `user_id`, `episode_id`, `text`, `created_at`)
VALUES (2, 1, 1, '에피소드1 쌀댓글2', '2020-09-15');
INSERT INTO comment_tb (`id`, `user_id`, `episode_id`, `text`, `created_at`)
VALUES (3, 1, 1, '에피소드1 쌀댓글3', '2021-01-05');
INSERT INTO comment_tb (`id`, `user_id`, `episode_id`, `text`, `created_at`)
VALUES (4, 1, 1, '에피소드1 쌀댓글4', '2021-02-01');
INSERT INTO comment_tb (`id`, `user_id`, `episode_id`, `text`, `created_at`)
VALUES (5, 1, 1, '에피소드1 쌀댓글5', '2021-04-15');
INSERT INTO comment_tb (`id`, `user_id`, `episode_id`, `text`, `created_at`, `is_delete`)
VALUES (6, 1, 1, '에피소드1 쌀댓글6 삭제', '2021-06-19', true);
INSERT INTO comment_tb (`id`, `user_id`, `episode_id`, `text`, `created_at`)
VALUES (7, 2, 1, '에피소드1 코스댓글1', '2021-09-22');
INSERT INTO comment_tb (`id`, `user_id`, `episode_id`, `text`, `created_at`)
VALUES (8, 2, 1, '에피소드1 코스댓글2', '2022-02-11');
INSERT INTO comment_tb (`id`, `user_id`, `episode_id`, `text`, `created_at`)
VALUES (9, 2, 1, '에피소드1 코스댓글3', '2022-06-18');
INSERT INTO comment_tb (`id`, `user_id`, `episode_id`, `text`, `created_at`)
VALUES (10, 3, 1, '에피소드1 어드민댓글1', '2022-07-17');
INSERT INTO comment_tb (`id`, `user_id`, `episode_id`, `text`, `created_at`, `is_delete`)
VALUES (11, 3, 1, '에피소드1 어드민댓글2 삭제', '2022-08-21', true);
INSERT INTO comment_tb (`id`, `user_id`, `episode_id`, `text`, `created_at`)
VALUES (12, 101, 1, '에피소드1 작가댓글1', '2022-09-22');
INSERT INTO comment_tb (`id`, `user_id`, `episode_id`, `text`, `created_at`, `is_delete`)
VALUES (13, 101, 1, '에피소드1 작가댓글2 삭제', '2022-11-02', true);

INSERT INTO comment_tb (`id`, `user_id`, `episode_id`, `text`, `created_at`)
VALUES (14, 1, 2, '에피소드2 쌀댓글1', '2022-01-01');
INSERT INTO comment_tb (`id`, `user_id`, `episode_id`, `text`, `created_at`)
VALUES (15, 2, 2, '에피소드2 코스댓글1', '2022-04-12');
INSERT INTO comment_tb (`id`, `user_id`, `episode_id`, `text`, `created_at`)
VALUES (16, 101, 2, '에피소드2 작가댓글1', '2022-06-16');
INSERT INTO comment_tb (`id`, `user_id`, `episode_id`, `text`, `created_at`)
VALUES (17, 101, 2, '에피소드2 작가댓글2', '2022-07-21');
=======

  INSERT INTO comment_tb (`id`,`user_id`,`episode_id`,`text`,`created_at`) VALUES (1,2,65,'dictum magna. Ut tincidunt orci','2022-11-14 19:50:04');
  INSERT INTO comment_tb (`id`,`user_id`,`episode_id`,`text`,`created_at`) VALUES (2,3,41,'lectus rutrum urna, nec luctus felis purus','2024-07-08 08:23:43');
  INSERT INTO comment_tb (`id`,`user_id`,`episode_id`,`text`,`created_at`) VALUES (3,2,18,'nisi nibh lacinia orci, consectetuer euismod est arcu ac orci. Ut','2023-07-13 09:19:18');
  INSERT INTO comment_tb (`id`,`user_id`,`episode_id`,`text`,`created_at`) VALUES (4,400,21,'In condimentum. Donec','2023-05-29 14:55:20');
  INSERT INTO comment_tb (`id`,`user_id`,`episode_id`,`text`,`created_at`) VALUES (5,4,68,'Sed eu nibh vulputate mauris sagittis placerat.','2024-03-08 02:25:27');
  INSERT INTO comment_tb (`id`,`user_id`,`episode_id`,`text`,`created_at`) VALUES (6,4,94,'netus et','2024-08-19 00:15:15');
  INSERT INTO comment_tb (`id`,`user_id`,`episode_id`,`text`,`created_at`) VALUES (7,1,44,'feugiat nec, diam. Duis mi enim, condimentum eget, volutpat ornare, facilisis eget, ipsum. Donec sollicitudin adipiscing','2024-01-15 18:00:48');
  INSERT INTO comment_tb (`id`,`user_id`,`episode_id`,`text`,`created_at`) VALUES (8,390,33,'Ut nec urna et arcu imperdiet ullamcorper.','2024-02-24 22:15:55');
  INSERT INTO comment_tb (`id`,`user_id`,`episode_id`,`text`,`created_at`) VALUES (9,1,63,'nec, eleifend non, dapibus rutrum, justo.','2024-05-21 01:45:36');
  INSERT INTO comment_tb (`id`,`user_id`,`episode_id`,`text`,`created_at`) VALUES (10,410,35,'mattis','2024-06-14 09:49:14');
  INSERT INTO comment_tb (`id`,`user_id`,`episode_id`,`text`,`created_at`) VALUES (11,1,21,'nec, cursus a, enim. Suspendisse aliquet,','2023-06-05 04:02:40');
  INSERT INTO comment_tb (`id`,`user_id`,`episode_id`,`text`,`created_at`) VALUES (12,412,105,'scelerisque sed, sapien. Nunc','2024-02-18 06:32:27');
  INSERT INTO comment_tb (`id`,`user_id`,`episode_id`,`text`,`created_at`) VALUES (13,2,42,'sed orci lobortis augue scelerisque mollis. Phasellus','2023-05-21 21:36:08');
  INSERT INTO comment_tb (`id`,`user_id`,`episode_id`,`text`,`created_at`) VALUES (14,1,57,'Quisque tincidunt pede ac urna. Ut tincidunt vehicula risus. Nulla eget','2023-08-24 10:22:48');
  INSERT INTO comment_tb (`id`,`user_id`,`episode_id`,`text`,`created_at`) VALUES (15,430,106,'egestas, urna justo faucibus lectus, a sollicitudin orci sem eget massa. Suspendisse eleifend.','2023-01-13 21:57:33');
  INSERT INTO comment_tb (`id`,`user_id`,`episode_id`,`text`,`created_at`) VALUES (16,400,59,'vel lectus. Cum','2023-12-22 10:19:21');
  INSERT INTO comment_tb (`id`,`user_id`,`episode_id`,`text`,`created_at`) VALUES (17,1,52,'fermentum fermentum','2023-10-19 11:30:49');
  INSERT INTO comment_tb (`id`,`user_id`,`episode_id`,`text`,`created_at`) VALUES (18,2,83,'tristique pharetra. Quisque ac libero nec ligula consectetuer rhoncus. Nullam velit dui, semper et, lacinia','2023-05-15 17:12:38');
  INSERT INTO comment_tb (`id`,`user_id`,`episode_id`,`text`,`created_at`) VALUES (20,4,76,'rhoncus. Donec','2022-12-17 05:45:08');
  INSERT INTO comment_tb (`id`,`user_id`,`episode_id`,`text`,`created_at`) VALUES (21,4,16,'metus facilisis','2024-10-19 16:54:02');
  INSERT INTO comment_tb (`id`,`user_id`,`episode_id`,`text`,`created_at`) VALUES (22,421,34,'cursus non, egestas a, dui. Cras pellentesque. Sed dictum. Proin eget odio. Aliquam vulputate','2023-08-04 14:08:59');
  INSERT INTO comment_tb (`id`,`user_id`,`episode_id`,`text`,`created_at`) VALUES (23,1,38,'mollis','2024-10-24 04:25:41');
  INSERT INTO comment_tb (`id`,`user_id`,`episode_id`,`text`,`created_at`) VALUES (24,3,87,'sapien, cursus in, hendrerit consectetuer, cursus et, magna. Praesent interdum ligula eu enim. Etiam imperdiet','2023-07-29 20:01:23');
  INSERT INTO comment_tb (`id`,`user_id`,`episode_id`,`text`,`created_at`) VALUES (25,432,41,'Aliquam ultrices iaculis odio. Nam interdum enim non','2023-08-06 09:40:43');
  INSERT INTO comment_tb (`id`,`user_id`,`episode_id`,`text`,`created_at`) VALUES (26,440,95,'Donec feugiat metus sit amet ante. Vivamus non','2023-05-16 18:51:11');
  INSERT INTO comment_tb (`id`,`user_id`,`episode_id`,`text`,`created_at`) VALUES (27,1,32,'egestas a, dui. Cras','2024-05-03 20:34:16');
  INSERT INTO comment_tb (`id`,`user_id`,`episode_id`,`text`,`created_at`) VALUES (28,391,34,'accumsan sed, facilisis vitae, orci. Phasellus dapibus quam quis diam. Pellentesque habitant','2023-09-26 21:13:12');
  INSERT INTO comment_tb (`id`,`user_id`,`episode_id`,`text`,`created_at`) VALUES (29,392,106,'et risus. Quisque libero lacus, varius et, euismod et, commodo at, libero. Morbi accumsan laoreet ipsum.','2023-08-13 00:05:55');
  INSERT INTO comment_tb (`id`,`user_id`,`episode_id`,`text`,`created_at`) VALUES (30,3,62,'nibh enim, gravida sit amet,','2023-04-27 21:06:17');
  INSERT INTO comment_tb (`id`,`user_id`,`episode_id`,`text`,`created_at`) VALUES (31,2,31,'odio a purus. Duis elementum,','2024-07-16 10:09:27');
  INSERT INTO comment_tb (`id`,`user_id`,`episode_id`,`text`,`created_at`) VALUES (32,397,59,'eleifend vitae, erat.','2023-07-01 15:04:19');
  INSERT INTO comment_tb (`id`,`user_id`,`episode_id`,`text`,`created_at`) VALUES (33,395,58,'rutrum non, hendrerit id, ante.','2023-04-23 16:30:33');
  INSERT INTO comment_tb (`id`,`user_id`,`episode_id`,`text`,`created_at`) VALUES (34,411,23,'tortor nibh sit amet orci. Ut','2024-06-19 23:21:26');
  INSERT INTO comment_tb (`id`,`user_id`,`episode_id`,`text`,`created_at`) VALUES (35,412,9,'quam a felis ullamcorper viverra. Maecenas iaculis aliquet diam. Sed','2024-04-18 20:09:05');
  INSERT INTO comment_tb (`id`,`user_id`,`episode_id`,`text`,`created_at`) VALUES (36,415,49,'sagittis. Duis gravida. Praesent eu nulla at sem molestie sodales. Mauris','2024-01-04 16:47:00');
  INSERT INTO comment_tb (`id`,`user_id`,`episode_id`,`text`,`created_at`) VALUES (37,3,66,'tellus. Aenean egestas hendrerit neque. In ornare sagittis felis. Donec tempor, est','2024-10-09 05:11:02');
  INSERT INTO comment_tb (`id`,`user_id`,`episode_id`,`text`,`created_at`) VALUES (38,422,9,'quis urna. Nunc quis arcu','2022-12-17 19:25:01');
  INSERT INTO comment_tb (`id`,`user_id`,`episode_id`,`text`,`created_at`) VALUES (39,4,102,'dolor egestas rhoncus. Proin nisl sem, consequat nec, mollis vitae, posuere at, velit. Cras','2023-11-22 04:56:00');
  INSERT INTO comment_tb (`id`,`user_id`,`episode_id`,`text`,`created_at`) VALUES (40,411,54,'vel turpis. Aliquam adipiscing lobortis risus. In mi pede,','2023-06-18 12:26:34');
  INSERT INTO comment_tb (`id`,`user_id`,`episode_id`,`text`,`created_at`) VALUES (41,1,46,'primis in faucibus orci luctus et ultrices posuere cubilia','2024-10-18 23:48:18');
  INSERT INTO comment_tb (`id`,`user_id`,`episode_id`,`text`,`created_at`) VALUES (42,4,88,'mauris eu elit. Nulla facilisi. Sed neque. Sed eget lacus.','2024-01-02 23:47:47');
  INSERT INTO comment_tb (`id`,`user_id`,`episode_id`,`text`,`created_at`) VALUES (43,403,7,'mollis lectus pede et risus. Quisque libero lacus, varius et, euismod','2023-09-01 02:56:07');
  INSERT INTO comment_tb (`id`,`user_id`,`episode_id`,`text`,`created_at`) VALUES (44,412,38,'et malesuada fames ac turpis egestas. Fusce aliquet magna','2024-04-17 07:57:56');
  INSERT INTO comment_tb (`id`,`user_id`,`episode_id`,`text`,`created_at`) VALUES (45,2,38,'cursus a, enim. Suspendisse aliquet, sem ut cursus luctus, ipsum leo elementum sem, vitae','2022-12-02 09:11:40');
  INSERT INTO comment_tb (`id`,`user_id`,`episode_id`,`text`,`created_at`) VALUES (46,4,100,'magnis dis parturient montes,','2024-02-12 18:51:11');
  INSERT INTO comment_tb (`id`,`user_id`,`episode_id`,`text`,`created_at`) VALUES (47,411,32,'ut odio vel est tempor bibendum. Donec felis orci, adipiscing non,','2024-07-03 07:23:25');
  INSERT INTO comment_tb (`id`,`user_id`,`episode_id`,`text`,`created_at`) VALUES (48,389,100,'Donec nibh enim, gravida sit amet, dapibus','2023-12-19 00:41:56');
  INSERT INTO comment_tb (`id`,`user_id`,`episode_id`,`text`,`created_at`) VALUES (49,388,84,'eu, ligula. Aenean euismod mauris eu elit. Nulla facilisi. Sed neque. Sed eget lacus. Mauris','2023-12-16 13:29:58');
  INSERT INTO comment_tb (`id`,`user_id`,`episode_id`,`text`,`created_at`) VALUES (50,392,108,'odio. Phasellus at augue id ante dictum cursus. Nunc mauris elit,','2022-11-17 02:20:20');
  INSERT INTO comment_tb (`id`,`user_id`,`episode_id`,`text`,`created_at`) VALUES (51,400,15,'libero nec ligula consectetuer','2024-07-11 00:42:34');
  INSERT INTO comment_tb (`id`,`user_id`,`episode_id`,`text`,`created_at`) VALUES (52,406,11,'nascetur ridiculus mus. Proin vel arcu eu odio tristique','2023-09-13 20:17:26');
  INSERT INTO comment_tb (`id`,`user_id`,`episode_id`,`text`,`created_at`) VALUES (53,404,75,'convallis ligula. Donec luctus aliquet odio. Etiam ligula tortor, dictum','2023-03-21 07:15:33');
  INSERT INTO comment_tb (`id`,`user_id`,`episode_id`,`text`,`created_at`) VALUES (54,4,37,'magnis dis parturient montes, nascetur ridiculus mus. Proin vel arcu eu odio tristique pharetra.','2023-10-29 12:06:20');
  INSERT INTO comment_tb (`id`,`user_id`,`episode_id`,`text`,`created_at`) VALUES (55,3,107,'mauris','2024-06-09 21:23:51');
  INSERT INTO comment_tb (`id`,`user_id`,`episode_id`,`text`,`created_at`) VALUES (56,1,104,'a felis ullamcorper viverra. Maecenas iaculis aliquet diam. Sed diam','2024-04-16 00:08:47');
  INSERT INTO comment_tb (`id`,`user_id`,`episode_id`,`text`,`created_at`) VALUES (57,1,104,'feugiat nec, diam. Duis mi enim, condimentum eget, volutpat ornare, facilisis eget, ipsum. Donec sollicitudin adipiscing','2024-09-07 23:38:14');
  INSERT INTO comment_tb (`id`,`user_id`,`episode_id`,`text`,`created_at`) VALUES (58,4,77,'ultrices. Duis volutpat nunc sit amet metus. Aliquam erat volutpat. Nulla facilisis. Suspendisse commodo tincidunt nibh. Phasellus','2024-07-07 06:33:35');
  INSERT INTO comment_tb (`id`,`user_id`,`episode_id`,`text`,`created_at`) VALUES (59,4,82,'ligula. Aliquam erat volutpat. Nulla dignissim. Maecenas ornare egestas ligula. Nullam feugiat placerat','2023-05-09 01:05:09');
  INSERT INTO comment_tb (`id`,`user_id`,`episode_id`,`text`,`created_at`) VALUES (60,4,64,'et malesuada fames ac turpis egestas. Fusce aliquet magna a neque. Nullam ut nisi a','2023-01-20 07:01:48');
  INSERT INTO comment_tb (`id`,`user_id`,`episode_id`,`text`,`created_at`) VALUES (61,1,103,'ultrices iaculis odio. Nam interdum enim non nisi. Aenean eget metus. In nec','2023-11-20 05:22:02');
  INSERT INTO comment_tb (`id`,`user_id`,`episode_id`,`text`,`created_at`) VALUES (62,4,35,'Integer sem elit, pharetra','2023-03-07 10:40:16');
  INSERT INTO comment_tb (`id`,`user_id`,`episode_id`,`text`,`created_at`) VALUES (63,2,13,'torquent per conubia nostra, per inceptos hymenaeos. Mauris ut quam vel sapien imperdiet ornare. In faucibus.','2022-12-16 07:47:02');
  INSERT INTO comment_tb (`id`,`user_id`,`episode_id`,`text`,`created_at`) VALUES (64,4,22,'Integer aliquam adipiscing lacus. Ut nec urna et arcu imperdiet ullamcorper. Duis at lacus. Quisque purus','2024-03-02 11:53:24');
  INSERT INTO comment_tb (`id`,`user_id`,`episode_id`,`text`,`created_at`) VALUES (65,4,103,'Etiam bibendum','2024-10-15 03:31:24');
  INSERT INTO comment_tb (`id`,`user_id`,`episode_id`,`text`,`created_at`) VALUES (66,4,84,'aliquet odio. Etiam ligula tortor, dictum eu, placerat eget,','2023-09-14 03:25:59');
  INSERT INTO comment_tb (`id`,`user_id`,`episode_id`,`text`,`created_at`) VALUES (67,2,38,'enim, sit','2023-12-26 22:46:52');
  INSERT INTO comment_tb (`id`,`user_id`,`episode_id`,`text`,`created_at`) VALUES (68,4,45,'mus. Proin vel arcu eu odio tristique pharetra. Quisque','2024-03-31 20:15:54');
  INSERT INTO comment_tb (`id`,`user_id`,`episode_id`,`text`,`created_at`) VALUES (69,4,25,'feugiat metus sit amet ante.','2024-07-01 14:24:59');
  INSERT INTO comment_tb (`id`,`user_id`,`episode_id`,`text`,`created_at`) VALUES (70,3,75,'sagittis augue, eu tempor erat neque non quam. Pellentesque habitant morbi tristique senectus et netus et malesuada','2024-04-23 17:04:14');
  INSERT INTO comment_tb (`id`,`user_id`,`episode_id`,`text`,`created_at`) VALUES (71,411,98,'scelerisque neque sed sem egestas','2023-03-19 07:22:48');
  INSERT INTO comment_tb (`id`,`user_id`,`episode_id`,`text`,`created_at`) VALUES (72,1,32,'egestas. Duis ac arcu. Nunc mauris. Morbi non sapien','2024-05-26 06:57:54');
  INSERT INTO comment_tb (`id`,`user_id`,`episode_id`,`text`,`created_at`) VALUES (73,1,79,'rutrum urna, nec luctus','2024-03-07 16:11:17');
  INSERT INTO comment_tb (`id`,`user_id`,`episode_id`,`text`,`created_at`) VALUES (74,2,58,'Aliquam ultrices','2023-11-29 04:30:16');
  INSERT INTO comment_tb (`id`,`user_id`,`episode_id`,`text`,`created_at`) VALUES (75,4,46,'penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec dignissim magna a tortor. Nunc commodo auctor velit.','2023-01-03 09:33:50');
  INSERT INTO comment_tb (`id`,`user_id`,`episode_id`,`text`,`created_at`) VALUES (76,3,77,'enim. Mauris quis turpis vitae purus gravida sagittis. Duis gravida. Praesent eu nulla at sem','2023-09-07 20:58:31');
  INSERT INTO comment_tb (`id`,`user_id`,`episode_id`,`text`,`created_at`) VALUES (77,4,58,'velit. Aliquam nisl. Nulla eu neque pellentesque massa lobortis ultrices. Vivamus rhoncus. Donec est. Nunc ullamcorper, velit','2023-08-08 04:45:14');
  INSERT INTO comment_tb (`id`,`user_id`,`episode_id`,`text`,`created_at`) VALUES (78,1,2,'dolor vitae dolor. Donec fringilla. Donec feugiat metus sit amet ante. Vivamus','2022-11-21 14:02:40');
  INSERT INTO comment_tb (`id`,`user_id`,`episode_id`,`text`,`created_at`) VALUES (79,1,107,'eget lacus. Mauris non dui nec urna suscipit nonummy. Fusce fermentum fermentum arcu. Vestibulum ante','2023-05-11 23:27:55');
  INSERT INTO comment_tb (`id`,`user_id`,`episode_id`,`text`,`created_at`) VALUES (80,4,6,'Cras dolor dolor, tempus non, lacinia at, iaculis quis, pede. Praesent eu dui. Cum sociis natoque','2023-07-25 20:53:39');
  INSERT INTO comment_tb (`id`,`user_id`,`episode_id`,`text`,`created_at`) VALUES (81,1,91,'nisi magna sed dui. Fusce aliquam, enim nec tempus scelerisque, lorem ipsum sodales purus,','2024-06-24 12:00:14');
  INSERT INTO comment_tb (`id`,`user_id`,`episode_id`,`text`,`created_at`) VALUES (82,1,83,'amet, consectetuer','2024-05-24 17:03:15');
  INSERT INTO comment_tb (`id`,`user_id`,`episode_id`,`text`,`created_at`) VALUES (83,4,13,'erat volutpat. Nulla dignissim. Maecenas','2023-04-29 10:47:08');
  INSERT INTO comment_tb (`id`,`user_id`,`episode_id`,`text`,`created_at`) VALUES (84,417,16,'ridiculus mus. Proin vel arcu eu odio tristique pharetra. Quisque ac libero nec','2024-01-14 08:23:50');
  INSERT INTO comment_tb (`id`,`user_id`,`episode_id`,`text`,`created_at`) VALUES (85,2,47,'mauris. Suspendisse aliquet molestie tellus. Aenean egestas','2023-11-18 11:05:17');
  INSERT INTO comment_tb (`id`,`user_id`,`episode_id`,`text`,`created_at`) VALUES (86,3,81,'diam dictum sapien. Aenean massa. Integer vitae nibh. Donec est mauris, rhoncus id, mollis','2024-08-17 21:39:27');
  INSERT INTO comment_tb (`id`,`user_id`,`episode_id`,`text`,`created_at`) VALUES (87,2,72,'ultrices sit amet, risus.','2023-04-30 07:30:50');
  INSERT INTO comment_tb (`id`,`user_id`,`episode_id`,`text`,`created_at`) VALUES (88,1,1,'enim, condimentum','2023-11-27 12:12:06');
  INSERT INTO comment_tb (`id`,`user_id`,`episode_id`,`text`,`created_at`) VALUES (89,411,8,'Aliquam ultrices iaculis odio. Nam interdum enim non nisi. Aenean','2022-11-13 14:37:24');
  INSERT INTO comment_tb (`id`,`user_id`,`episode_id`,`text`,`created_at`) VALUES (90,3,37,'adipiscing ligula. Aenean','2024-09-19 11:23:14');
  INSERT INTO comment_tb (`id`,`user_id`,`episode_id`,`text`,`created_at`) VALUES (91,3,67,'nostra, per inceptos hymenaeos. Mauris ut quam vel sapien imperdiet ornare. In faucibus.','2024-05-08 06:30:35');
  INSERT INTO comment_tb (`id`,`user_id`,`episode_id`,`text`,`created_at`) VALUES (92,433,67,'sem, vitae aliquam eros turpis non','2024-06-07 15:49:15');
  INSERT INTO comment_tb (`id`,`user_id`,`episode_id`,`text`,`created_at`) VALUES (93,3,57,'mi lacinia mattis. Integer eu lacus. Quisque imperdiet, erat nonummy ultricies ornare, elit','2024-05-28 13:58:57');
  INSERT INTO comment_tb (`id`,`user_id`,`episode_id`,`text`,`created_at`) VALUES (94,1,8,'magna. Phasellus','2023-06-20 11:21:23');
  INSERT INTO comment_tb (`id`,`user_id`,`episode_id`,`text`,`created_at`) VALUES (95,3,33,'aliquet. Phasellus fermentum convallis ligula. Donec luctus aliquet odio. Etiam ligula tortor, dictum eu,','2023-10-18 01:25:25');
  INSERT INTO comment_tb (`id`,`user_id`,`episode_id`,`text`,`created_at`) VALUES (96,4,62,'ornare egestas ligula. Nullam feugiat placerat velit. Quisque varius. Nam porttitor scelerisque neque. Nullam nisl.','2023-02-23 08:34:07');
  INSERT INTO comment_tb (`id`,`user_id`,`episode_id`,`text`,`created_at`) VALUES (97,411,103,'vitae, erat. Vivamus nisi. Mauris nulla. Integer urna. Vivamus molestie dapibus ligula.','2023-10-28 21:36:51');
  INSERT INTO comment_tb (`id`,`user_id`,`episode_id`,`text`,`created_at`) VALUES (98,390,71,'lorem vitae odio sagittis semper. Nam tempor','2023-09-30 08:30:31');
  INSERT INTO comment_tb (`id`,`user_id`,`episode_id`,`text`,`created_at`) VALUES (99,3,102,'elementum, dui quis accumsan convallis, ante lectus convallis est, vitae sodales nisi magna sed dui. Fusce aliquam,','2024-01-08 18:32:51');
  INSERT INTO comment_tb (`id`,`user_id`,`episode_id`,`text`,`created_at`) VALUES (100,4,87,'libero at auctor','2023-04-02 14:38:53');

>>>>>>> dev


-------------------------------------------------------------------------------------------------------------------------


-- 댓글 좋아요
INSERT INTO like_comment_tb (`id`, `user_id`, `comment_id`, `is_like`, `created_at`)
VALUES (1, 1, 7, true, '2023-10-10');
INSERT INTO like_comment_tb (`id`, `user_id`, `comment_id`, `is_like`, `created_at`)
VALUES (2, 1, 8, false, '2023-10-10');
INSERT INTO like_comment_tb (`id`, `user_id`, `comment_id`, `is_like`, `created_at`)
VALUES (3, 2, 1, true, '2023-10-10');
INSERT INTO like_comment_tb (`id`, `user_id`, `comment_id`, `is_like`, `created_at`)
VALUES (4, 2, 2, false, '2023-10-10');
INSERT INTO like_comment_tb (`id`, `user_id`, `comment_id`, `is_like`, `created_at`)
VALUES (5, 1, 9, true, '2023-10-10');
INSERT INTO like_comment_tb (`id`, `user_id`, `comment_id`, `is_like`, `created_at`)
VALUES (6, 101, 1, true, '2023-10-10');
INSERT INTO like_comment_tb (`id`, `user_id`, `comment_id`, `is_like`, `created_at`)
VALUES (7, 1, 5, false, '2023-10-10');
INSERT INTO like_comment_tb (`id`, `user_id`, `comment_id`, `is_like`, `created_at`)
VALUES (8, 2, 9, true, '2023-10-10');



-------------------------------------------------------------------------------------------------------------------------


-- 대댓글
INSERT INTO re_comment_tb (`id`, `user_id`, `comment_id`, `text`, `created_at`)
VALUES (1, 1, 1, '댓글1 쌀 대댓글1', '2021-04-16');
INSERT INTO re_comment_tb (`id`, `user_id`, `comment_id`, `text`, `created_at`)
VALUES (2, 1, 1, '댓글1 쌀 대댓글2', '2021-06-15');
INSERT INTO re_comment_tb (`id`, `user_id`, `comment_id`, `text`, `created_at`)
VALUES (3, 2, 1, '댓글1 코스 대댓글1', '2021-09-11');
INSERT INTO re_comment_tb (`id`, `user_id`, `comment_id`, `text`, `created_at`)
VALUES (4, 3, 1, '댓글1 어드민 대댓글1', '2021-11-21');
INSERT INTO re_comment_tb (`id`, `user_id`, `comment_id`, `text`, `created_at`)
VALUES (5, 101, 1, '댓글1 작가 대댓글1', '2021-12-14');
INSERT INTO re_comment_tb (`id`, `user_id`, `comment_id`, `text`, `created_at`)
VALUES (6, 101, 1, '댓글1 작가 대댓글2', '2022-05-21');
INSERT INTO re_comment_tb (`id`, `user_id`, `comment_id`, `text`, `created_at`, `is_delete`)
VALUES (7, 101, 1, '댓글1 작가 대댓글3 삭제', '2022-06-01', true);
INSERT INTO re_comment_tb (`id`, `user_id`, `comment_id`, `text`, `created_at`, `is_delete`)
VALUES (8, 101, 1, '댓글1 쌀 대댓글3 삭제', '2022-09-02', true);
INSERT INTO re_comment_tb (`id`, `user_id`, `comment_id`, `text`, `created_at`, `is_delete`)
VALUES (9, 101, 1, '댓글1 어드민 대댓글2 삭제', '2022-12-04', true);

INSERT INTO re_comment_tb (`id`, `user_id`, `comment_id`, `text`, `created_at`)
VALUES (10, 1, 2, '댓글2 쌀 대댓글1', '2021-05-16');
INSERT INTO re_comment_tb (`id`, `user_id`, `comment_id`, `text`, `created_at`)
VALUES (11, 3, 2, '댓글2 어드민 대댓글1', '2022-06-21');


-------------------------------------------------------------------------------------------------------------------------


-- 대댓글 좋아요
INSERT INTO like_re_comment_tb (`id`, `user_id`, `re_comment_id`, `is_like`, `created_at`)
VALUES (1, 2, 1, true, '2023-10-10');
INSERT INTO like_re_comment_tb (`id`, `user_id`, `re_comment_id`, `is_like`, `created_at`)
VALUES (2, 3, 1, true, '2023-10-10');
INSERT INTO like_re_comment_tb (`id`, `user_id`, `re_comment_id`, `is_like`, `created_at`)
VALUES (3, 1, 2, false, '2023-10-10');
INSERT INTO like_re_comment_tb (`id`, `user_id`, `re_comment_id`, `is_like`, `created_at`)
VALUES (4, 1, 3, true, '2023-10-10');



-------------------------------------------------------------------------------------------------------------------------


-- 웹툰해시태그
INSERT INTO webtoon_hash_tag_tb (`id`, `webtoon_id`, `hash_tag_enum`, `hash_tag_name`)
VALUES (1, 101, '랭킹', '주간남성랭킹 TOP 10');
INSERT INTO webtoon_hash_tag_tb (`id`, `webtoon_id`, `hash_tag_enum`, `hash_tag_name`)
VALUES (2, 101, '랭킹', '드라마랭킹 1위');
INSERT INTO webtoon_hash_tag_tb (`id`, `webtoon_id`, `hash_tag_enum`, `hash_tag_name`)
VALUES (3, 101, '장르', '드라마');
INSERT INTO webtoon_hash_tag_tb (`id`, `webtoon_id`, `hash_tag_enum`, `hash_tag_name`)
VALUES (4, 101, '장르', '판타지');
INSERT INTO webtoon_hash_tag_tb (`id`, `webtoon_id`, `hash_tag_enum`, `hash_tag_name`)
VALUES (5, 101, '장르', '액션');
INSERT INTO webtoon_hash_tag_tb (`id`, `webtoon_id`, `hash_tag_enum`, `hash_tag_name`)
VALUES (6, 101, '장르', '로맨스');


-------------------------------------------------------------------------------------------------------------------------


-- 관심웹툰
INSERT INTO interest_webtoon_tb (`id`, `user_id`, `webtoon_id`, `is_alarm`, `created_at`)
VALUES (1, 1, 101, true, '2020-08-02');
INSERT INTO interest_webtoon_tb (`id`, `user_id`, `webtoon_id`, `is_alarm`, `created_at`)
VALUES (2, 1, 102, false, '2020-11-16');
INSERT INTO interest_webtoon_tb (`id`, `user_id`, `webtoon_id`, `is_alarm`, `created_at`)
VALUES (3, 1, 103, true, '2020-12-15');
INSERT INTO interest_webtoon_tb (`id`, `user_id`, `webtoon_id`, `is_alarm`, `created_at`)
VALUES (4, 1, 104, false, '2021-01-04');
INSERT INTO interest_webtoon_tb (`id`, `user_id`, `webtoon_id`, `is_alarm`, `created_at`)
VALUES (5, 1, 105, false, '2021-02-16');
INSERT INTO interest_webtoon_tb (`id`, `user_id`, `webtoon_id`, `is_alarm`, `created_at`)
VALUES (6, 2, 101, false, '2021-05-17');
INSERT INTO interest_webtoon_tb (`id`, `user_id`, `webtoon_id`, `is_alarm`, `created_at`)
VALUES (7, 2, 102, true, '2022-06-22');
INSERT INTO interest_webtoon_tb (`id`, `user_id`, `webtoon_id`, `is_alarm`, `created_at`)
VALUES (8, 3, 101, true, '2022-09-11');



-------------------------------------------------------------------------------------------------------------------------


-- 임시 설정용

UPDATE USER_TB
SET USER_TYPE_ENUM = 'AUTHOR'
WHERE USER_TYPE_ENUM IS NULL;

UPDATE WEBTOON_TB
SET STAR_SCORE = '0';

UPDATE WEBTOON_TB
SET STAR_COUNT = '0';

-- UPDATE WEBTOON_TB
-- SET CREATED_AT = '2023-10-20';


---


UPDATE AUTHOR_TB
SET CREATED_AT = '2023-10-10'
WHERE CREATED_AT IS NULL;

UPDATE AUTHOR_TB
SET UPDATED_AT = '2023-10-10'
WHERE UPDATED_AT IS NULL;

UPDATE EPISODE_TB
SET UPDATED_AT = CREATED_AT
WHERE UPDATED_AT IS NULL;

UPDATE USER_TB
SET CREATED_AT = '2023-10-10'
WHERE CREATED_AT IS NULL;

UPDATE USER_TB
SET UPDATED_AT = '2023-10-10'
WHERE UPDATED_AT IS NULL;

UPDATE WEBTOON_TB
SET UPDATED_AT = CREATED_AT
WHERE UPDATED_AT IS NULL;




-------------------------------------------------------------------------------------------------------------------------


-- 테스트용

-- INSERT INTO episode_tb (`webtoon_id`, `detail_title`, `star_count`, `star_score`, `thumbnail`, `created_at`, `author_text`)
-- VALUES (101, '마지막임ㅁ', 555, 1, 'thumbnail_202x120_e3dd5cd4-0d3f-4b76-bb49-386c23221c2a.jpg', '2023-10-10', '에피소드1작가의말');

