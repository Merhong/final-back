package com.example.kakao._core.crawling;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CrawlingThumbnail {
    public static void main(String[] args) throws IOException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yy.MM.dd");


        int WTid = 1;


        Document doc = Jsoup
                .connect("http://127.0.0.1:5500/src/main/java/com/example/kakao/_core/crawling/dummy/_target.html")
                .get();
        // System.out.println(doc);

        Elements els = doc.select("a.EpisodeListList__link--DdClU").select("img");
        // System.out.println(els);
        Elements titles = doc.select("span.EpisodeListList__title--lfIzU");
        Elements stars = doc.select("span.Rating__star_area--dFzsb span.text");
        Elements dates = doc.select(".EpisodeListList__meta_info--Cgquz span.date");

        // System.out.println(els.get(4).attr("src"));

        // System.out.println("thumbnail"+els.get(4).attr("src").split("/thumbnail")[1]);

        // System.out.println(titles.get(4));
        // System.out.println(stars.get(4));
        // System.out.println(dates.get(4));

        List<CrawlingEntityEpisode> epList = new ArrayList<CrawlingEntityEpisode>();


        int i = 0;
        try {
            while (i < 20) {

                CrawlingEntityEpisode episode = new CrawlingEntityEpisode();
                try {
                    Date date = dateFormat.parse(dates.get(i).text());
                    Timestamp timestamp = new Timestamp(date.getTime());
                    episode.setCreatedAt(timestamp);

                    episode.setStarCount(Double.parseDouble(stars.get(i).text()));

                    episode.setDetailTitle(titles.get(i).text());

                    String FILE_URL = els.get(i).attr("src");
                    // System.out.println(FILE_URL);
                    String OUTPUT_FILE_PATH = "thumbnail" + els.get(i).attr("src").split("/thumbnail")[1];
                    episode.setThumbnail(OUTPUT_FILE_PATH);

                    // String OUTPUT_FILE_PATH = "C:\\workspace\\" +
                    // FILE_URL.split("/thumbnail/")[1];
                    URL url = new URL(FILE_URL);
                    URLConnection connection = url.openConnection();

                    // User-Agent 설정
                    connection.setRequestProperty("User-Agent", "Mozilla/5.0");

                    try (InputStream in = connection.getInputStream()) {
                        Path imagePath = Paths.get("C:\\workspace\\" + OUTPUT_FILE_PATH);
                        // System.out.println("C:\\workspace\\" + imagePath);
                        Files.copy(in, imagePath);
                        // System.out.println("성공");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }

                // System.out.println(episode);

                epList.add(episode);

                i++;

                String sql = "INSERT INTO episode_tb (`webtoon_id`, `detail_title`,`star_count`,`thumbnail`,`created_at`) VALUES "
                        + " (" + WTid + ",'" + episode.getDetailTitle() + "', " + episode.getStarCount() + ", '"
                        + episode.getThumbnail() + "','" + episode.getCreatedAt() + "');";

                System.out.println(sql);
            }
        } catch (Exception e) {
            System.out.println("실패");
        }

        // CrawlingEntityEpisode episode = new CrawlingEntityEpisode();

        // for (Element element : els) {

        // try {

        // String FILE_URL = element.attr("src");
        // // System.out.println(FILE_URL);
        // episode.setThumbnail(FILE_URL + ".jpg");

        // String OUTPUT_FILE_PATH = "C:\\workspace\\" + FILE_URL +".jpg";
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

        // }

    }
}