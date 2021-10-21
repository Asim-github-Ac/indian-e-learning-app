package com.example.svadhyaya.RetrofitModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class LiveClassRoom  implements Serializable {
    String authkey,status,message;
    @SerializedName("data")
    private LiveClass2 liveClass2;

    public LiveClassRoom(String authkey) {
        this.authkey = authkey;
    }

    public String getAuthkey() {
        return authkey;
    }

    public void setAuthkey(String authkey) {
        this.authkey = authkey;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LiveClass2 getLiveClass2() {
        return liveClass2;
    }

    public void setLiveClass2(LiveClass2 liveClass2) {
        this.liveClass2 = liveClass2;
    }
    public class LiveClass2 implements Serializable {
        @SerializedName("data")
        @Expose
        List<LiveClassList3> liveClassLists= null;

        public LiveClass2(List<LiveClassList3> liveClassLists) {
            this.liveClassLists = liveClassLists;
        }

        public List<LiveClassList3> getLiveClassLists() {
            return liveClassLists;
        }

        public void setLiveClassLists(List<LiveClassList3> liveClassLists) {
            this.liveClassLists = liveClassLists;
        }

        public class LiveClassList3 implements Serializable {
            public String classroom_id;
            public String institute_id;
            public String class_id;
            public String subject_id;
            public String topic;
            public String classroom_title;
            public String schedule;
            public String live_link;
            public String shared_link;
            public String attachment;
            public String entry_on;
            public String entry_by;
            public Object modified_on;
            public String modified_by;
            public String attachmenturl;
            public String subject_name;
            public String topic_name;
            public LiveClassList3() {
            }

            public LiveClassList3(String classroom_id, String institute_id, String class_id, String subject_id, String topic, String classroom_title, String schedule, String live_link, String shared_link, String attachment, String entry_on, String entry_by, Object modified_on, String modified_by, String attachmenturl, String subject_name, String topic_name) {
                this.classroom_id = classroom_id;
                this.institute_id = institute_id;
                this.class_id = class_id;
                this.subject_id = subject_id;
                this.topic = topic;
                this.classroom_title = classroom_title;
                this.schedule = schedule;
                this.live_link = live_link;
                this.shared_link = shared_link;
                this.attachment = attachment;
                this.entry_on = entry_on;
                this.entry_by = entry_by;
                this.modified_on = modified_on;
                this.modified_by = modified_by;
                this.attachmenturl = attachmenturl;
                this.subject_name = subject_name;
                this.topic_name = topic_name;
            }
            public String getClassroom_id() {
                return classroom_id;
            }

            public void setClassroom_id(String classroom_id) {
                this.classroom_id = classroom_id;
            }

            public String getInstitute_id() {
                return institute_id;
            }

            public void setInstitute_id(String institute_id) {
                this.institute_id = institute_id;
            }

            public String getClass_id() {
                return class_id;
            }

            public void setClass_id(String class_id) {
                this.class_id = class_id;
            }

            public String getSubject_id() {
                return subject_id;
            }

            public void setSubject_id(String subject_id) {
                this.subject_id = subject_id;
            }

            public String getTopic() {
                return topic;
            }

            public void setTopic(String topic) {
                this.topic = topic;
            }

            public String getClassroom_title() {
                return classroom_title;
            }

            public void setClassroom_title(String classroom_title) {
                this.classroom_title = classroom_title;
            }

            public String getSchedule() {
                return schedule;
            }

            public void setSchedule(String schedule) {
                this.schedule = schedule;
            }

            public String getLive_link() {
                return live_link;
            }

            public void setLive_link(String live_link) {
                this.live_link = live_link;
            }

            public String getShared_link() {
                return shared_link;
            }

            public void setShared_link(String shared_link) {
                this.shared_link = shared_link;
            }

            public String getAttachment() {
                return attachment;
            }

            public void setAttachment(String attachment) {
                this.attachment = attachment;
            }

            public String getEntry_on() {
                return entry_on;
            }

            public void setEntry_on(String entry_on) {
                this.entry_on = entry_on;
            }

            public String getEntry_by() {
                return entry_by;
            }

            public void setEntry_by(String entry_by) {
                this.entry_by = entry_by;
            }

            public Object getModified_on() {
                return modified_on;
            }

            public void setModified_on(Object modified_on) {
                this.modified_on = modified_on;
            }

            public String getModified_by() {
                return modified_by;
            }

            public void setModified_by(String modified_by) {
                this.modified_by = modified_by;
            }

            public String getAttachmenturl() {
                return attachmenturl;
            }

            public void setAttachmenturl(String attachmenturl) {
                this.attachmenturl = attachmenturl;
            }

            public String getSubject_name() {
                return subject_name;
            }

            public void setSubject_name(String subject_name) {
                this.subject_name = subject_name;
            }

            public String getTopic_name() {
                return topic_name;
            }

            public void setTopic_name(String topic_name) {
                this.topic_name = topic_name;
            }
        }

    }

}
