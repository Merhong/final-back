package com.example.kakao._core;


// import com.google.firebase.messaging.AndroidConfig;
// import com.google.firebase.messaging.AndroidNotification;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Builder
@AllArgsConstructor
@Getter
public class FcmMessage {
    private boolean validate_only;
    private Message message;


    @Builder
    @AllArgsConstructor
    @Getter
    public static class Message {
        private Notification notification;
        private String token;
        private Data data;
        private Android android;
    }


    @Builder
    @AllArgsConstructor
    @Getter
    public static class Android {
        private AndroidNotification notification;
    }

    
    @Builder
    @AllArgsConstructor
    @Getter
    public static class AndroidNotification {
        private String channelId;
    }


    @Builder
    @AllArgsConstructor
    @Getter
    public static class Notification {
        private String title;
        private String body;
        // private String image;
    }
    

    @Builder
    @AllArgsConstructor
    @Getter
    public static class Data{
        private String route;
    }

}
