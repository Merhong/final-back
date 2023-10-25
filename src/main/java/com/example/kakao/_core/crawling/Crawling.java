package com.example.kakao._core.crawling;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Crawling {
    public static void main(String[] args) {
        
        int authorCount = 301;
        int webtoonCount = 301;
        int userCount = 301;
        int WACount = 301;

        Document doc = null;
        try {
            doc = Jsoup.connect("http://127.0.0.1:5500/src/main/java/com/example/kakao/_core/crawling/dummy/monday.html")
                    .get();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        // System.out.println(doc);

        Elements elements = doc.select("ul.ContentList__content_list--q5KXY li.item");
        // System.out.println(els);
        // System.out.println(doc);

        List<CrawlingEntity> entityList = new ArrayList<>();

        for (Element el : elements) {
            try {
                // System.out.println(el);
                CrawlingEntity entity = new CrawlingEntity();

                entity.setTitle(el.select("img.Poster__image--d9XTI").toString().split("alt=\"")[1].split("\">")[0]);
                entity.setImage(el.select("img.Poster__image--d9XTI").attr("src").split("/thumbnail/")[1]);
                entity.setAuthor(el.select(".ContentAuthor__author--CTAAP").text());
                entity.setStarCount(Double.parseDouble(el.select("span.text").get(1).text()));
                entity.setLink(el.select("a.Poster__link--sopnC").attr("href"));

                int randomWeek = ((int) (Math.random() * 7));
                entity.setWeekDay("월");
                if (randomWeek == 1) {
                    entity.setWeekDay("화");
                }
                if (randomWeek == 2) {
                    entity.setWeekDay("수");
                }
                if (randomWeek == 3) {
                    entity.setWeekDay("목");
                }
                if (randomWeek == 4) {
                    entity.setWeekDay("금");
                }
                if (randomWeek == 5) {
                    entity.setWeekDay("토");
                }
                if (randomWeek == 6) {
                    entity.setWeekDay("일");
                }

                int randomlike = ((int) (Math.random() * 1000000));
                entity.setLikeCount(randomlike);

                int randomAge = ((int) (Math.random() * 4));
                entity.setAge(0);
                if (randomWeek == 1) {
                    entity.setAge(8);
                }
                if (randomWeek == 2) {
                    entity.setAge(12);
                }
                if (randomWeek == 3) {
                    entity.setAge(15);
                }

                int randomSpecial = ((int) (Math.random() * 10));
                entity.setSpecial("");
                if (randomSpecial == 3) {
                    entity.setSpecial("신작");
                }
                if (randomSpecial == 4 || randomSpecial == 5) {
                    entity.setSpecial("순위");
                }
                if (randomSpecial == 6 || randomSpecial == 7) {
                    entity.setSpecial("무료");
                }
                if (randomSpecial == 8) {
                    entity.setSpecial("휴재");
                }
                if (randomSpecial == 9) {
                    entity.setSpecial("완결");
                }

                Document doc2 = Jsoup.connect("https://comic.naver.com" + entity.getLink()).get();

                String intro = doc2.select("meta[property=og:description]").first().attr("content");
                intro = intro.replace('\'', ' ');
                entity.setIntro(intro);

                ///

                // String FILE_URL =
                // doc2.select("meta[property=og:image]").first().attr("content");
                // System.out.println(FILE_URL);
                // String OUTPUT_FILE_PATH = "C:\\workspace\\" +
                // FILE_URL.split("/thumbnail/")[1];
                // try {
                // URL url = new URL(FILE_URL);
                // URLConnection connection = url.openConnection();

                // // User-Agent 설정
                // connection.setRequestProperty("User-Agent", "Mozilla/5.0");

                // try (InputStream in = connection.getInputStream()) {
                // Path imagePath = Paths.get(OUTPUT_FILE_PATH);
                // Files.copy(in, imagePath);
                // }
                // } catch (Exception e) {
                // e.printStackTrace();
                // }

                ///

                entityList.add(entity);
                // System.out.println(entity);
                System.out.println("=====================");
            } catch (Exception e) {
                System.out.println("실패");
            }
        }



        for (CrawlingEntity et : entityList) {

            if (et.getAuthor().contains("/")) {

                if(et.getAuthor().contains("네이버")){continue;}

                // int starCount = ((int)(Math.random()*10))+1; // 1~10명
                // int starScore = starCount*(int)(Math.random()*6)+6;
                // if(starScore<starCount*2){starScore=(int)(starScore+Math.random()+Math.random()*2);}
                // if(starScore>starCount*5){starScore=starCount*(int)(Math.random()*5)+(int)(Math.random()*3);}
                // if(starScore>starCount*5){starScore=starCount*(int)(Math.random()*4);}

                int starCount = ((int)(Math.random()*10))+1; // 1~10명
                int starScore = ((int)(Math.random()*30))+21; // 0~29 + 21 = 21~50점


                String defaultStr = "INSERT INTO webtoon_tb (`id`, `age_limit`,`title`,`star_count`,`star_score`,`week_day`,`intro`,`specially`,`image`,`created_at`) VALUES "
                        + " ('" + webtoonCount + "'," + et.getAge() + ", '" + et.getTitle()
                        + "', "+starCount+","+starScore+",'"
                        + "" + et.getWeekDay() + ""
                        + "','" + et.getIntro() + "','" +
                        "" + et.getSpecial() + "','"
                        + et.getImage() + "',now());";

                System.out.println(defaultStr);

                String[] authorArray = et.getAuthor().split("[,/]");
                ArrayList<String> authorList = new ArrayList<>(Arrays.asList(authorArray));


                String userStr="";
                String authorStr="";
                String WAStr="";
                for (String author : authorList) {
                    //////////////////// enum 수정해야함
                userStr = "INSERT INTO user_tb (`id`,`email`,`password`,`username`) VALUES ('"+userCount+"', 'dummyAuthor"+authorCount+"@naver.com', '1234', '"+author.trim()+"');";

                System.out.println(userStr);

                authorStr = "INSERT INTO author_tb (`id`,`author_nickname`,`user_id`) VALUES ('" + authorCount + "', '"
                        + author.trim() + "','"+userCount+"');";

                System.out.println(authorStr);

                WAStr = "INSERT INTO webtoon_author_tb (`id`,`webtoon_id`,`author_id`) VALUES ('"+WACount+"', '"+webtoonCount+"', '"+authorCount+"');";
                
                System.out.println(WAStr);

                userCount++;
                authorCount++;
                WACount++;
                

                }


                
                webtoonCount++;

            } else {

                if(et.getAuthor().contains("네이버")){continue;}

                // int starCount = ((int)(Math.random()*10))+1; // 1~10명
                // int starScore = starCount*(int)(Math.random()*6)+6;
                // if(starScore<starCount*2){starScore=(int)(starScore+Math.random()+Math.random()*2);}
                // if(starScore>starCount*5){starScore=starCount*(int)(Math.random()*5)+(int)(Math.random()*3);}
                // if(starScore>starCount*5){starScore=starCount*(int)(Math.random()*4);}

                int starCount = ((int)(Math.random()*10))+1; // 1~10명
                int starScore = ((int)(Math.random()*30))+21; // 0~29 + 21 = 21~50점


                String defaultStr = "INSERT INTO webtoon_tb (`id`, `age_limit`,`title`,`star_count`,`star_score`,`week_day`,`intro`,`specially`,`image`,`created_at`) VALUES "
                        + " ('" + webtoonCount + "'," + et.getAge() + ", '" + et.getTitle()
                        + "', "+starCount+","+starScore+",'"
                        + "" + et.getWeekDay() + ""
                        + "','" + et.getIntro() + "','" +
                        "" + et.getSpecial() + "','"
                        + et.getImage() + "',now());";

                String userStr = "INSERT INTO user_tb (`id`,`email`,`password`,`username`) VALUES ('"+userCount+"', 'dummyAuthor"+authorCount+"@naver.com', '1234', '"+et.getAuthor()+"');";

                String authorStr = "INSERT INTO author_tb (`id`,`author_nickname`,`user_id`) VALUES ('" + authorCount + "', '"
                        + et.getAuthor() + "','"+userCount+"');";

                String WAStr = "INSERT INTO webtoon_author_tb (`id`,`webtoon_id`,`author_id`) VALUES ('"+WACount+"', '"+webtoonCount+"', '"+authorCount+"');";
                        
                webtoonCount++;
                userCount++;
                authorCount++;
                WACount++;

                System.out.println(userStr);
                System.out.println(authorStr);
                System.out.println(defaultStr);
                System.out.println(WAStr);
            }

        }

    }
}
