// package com.example.kakao._core.crawling;

// import org.jsoup.Jsoup;
// import org.jsoup.nodes.Document;
// import org.jsoup.nodes.Element;
// import org.jsoup.select.Elements;

// import java.io.IOException;
// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.List;

// public class QueryMake {
//     public static void main(String[] args) {

//         int DBEpisodeTableStart = 0; // 추가 해야되면 DB보고 추가된거 시작 pk 적기 -1해서
//         int DBEpisodeTableEnd = 410; // 추가 해야되면 DB보고 끝 pk 적기

//         String query1 = "INSERT INTO EPISODE_PHOTO_TB (`episode_id`, `photoURL`) VALUES (";
//         String query2 = ", 'random1000/dummy (";
//         String query3 = ").png');";

//         // System.out.println(query1+episodeId+query2+(int)(Math.random()*1000+1)+query3);

//         while(DBEpisodeTableStart++ < DBEpisodeTableEnd){
//             int randomCount = ((int)(Math.random()*7+1))+3;
            
//             for(int i=randomCount ; i>0 ; i--){
//                 System.out.println(query1+DBEpisodeTableStart+query2+(int)(Math.random()*1000+1)+query3);
//             }
//         }



//     }
// }
