package com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.Enums;

public enum NewsFeedSharingCheckboxItems {
    BECOME_FRIEND_W_SOMEONE("I become friends with someone"),
    REPLY_TO_TOPIC_ON_MESSAGE_BOARDS("I reply to a topic on the message boards"),
    CREATE_NEW_TOPIC_ON_MESSAGE_BOARDS("I create a new topic on the message boards"),
    CREATE_NEW_BLOG_POST("I create a new blog post"),
    COMMENTED_SOMEONE_ELSE("I commented on someone else's news feed update"),
    WROTE_SOMEONE_ELSE("I wrote on someone else's profile page"),
    HAVE_NOT_LOGGED_IN_SEVERAL_DAYS("I have not logged into MyFitnessPal for several days"),
    HAVE_LOGGED_IN_SEVERAL_DAYS_IN_ROW("I have logged in for several days in row"),
    HAVE_LOST_WEIGHT("I have lost weight"),
    HAVE_COMPLETED_DIARY_FOR_THE_DAY("I have completed my diary for the day"),
    PERFORM_CARDIO_EXERCISE("I perform a cardio exercise"),
    NEW_ARTICLES_FROM_THE_BLOG("There are new articles from the MyFitnessPal blog"),
    NEW_VIDEOS_FROM_BLOG("There are new videos from the MyFitnessPal blog");


    private String text;

    NewsFeedSharingCheckboxItems(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

}
