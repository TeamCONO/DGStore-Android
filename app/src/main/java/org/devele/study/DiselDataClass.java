//package org.devele.study;
//
//import androidx.annotation.NonNull;
//
//import com.google.gson.annotations.Expose;
//import com.google.gson.annotations.SerializedName;
//
//public class DiselDataClass {
//
//    @SerializedName("title")
//    @Expose
//    private String title;
//
//    @SerializedName("developer")
//    @Expose
//    private String developer;
//
//    @SerializedName("description")
//    @Expose
//    private String description;
//
//
//    @SerializedName("thumb")
//    @Expose
//    private String thumb;
//
//    @SerializedName("framework")
//    @Expose
//    private String framework;
//
//    @SerializedName("github")
//    @Expose
//    private String github;
//
//    @SerializedName("data")
//    @Expose
//    private DiselData[] diselData;
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public String getDeveloper() {
//        return developer;
//    }
//
//    public void setDeveloper(String developer) {
//        this.developer = developer;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
//
//    public String getThumb() {
//        return thumb;
//    }
//
//    public void setThumb(String thumb) {
//        this.thumb = thumb;
//    }
//
//    public String getFramework() {
//        return framework;
//    }
//
//    public void setFramework(String framework) {
//        this.framework = framework;
//    }
//
//    public String getGithub() {
//        return github;
//    }
//
//    public void setGithub(String github) {
//        this.github = github;
//    }
//
//    public DiselData[] getDiselData() {
//        return diselData;
//    }
//
//    public void setDiselData(DiselData[] diselData) {
//        this.diselData = diselData;
//    }
//
//    @NonNull
//    @Override
//    public String toString() {
//        return "dataclass{" +
//                "title='" + title + '\'' +
//                ", developer='" + developer + '\'' +
//                ", description='" + description + '\'' +
//                ", thumb='" + thumb + '\'' +
//                ", framework='" + framework + '\'' +
//                ", github='" + github + '\'' +
//                ", download='" + diselData + '\'' +
//                '}';
//    }
//
//    public DiselDataClass(DiselDataClass d){
//        this.title = d.getTitle();
//        this.developer = d.getDeveloper();
//        this.description = d.getDescription();
//        this.thumb = d.getThumb();
//        this.framework = d.getFramework();
//        this.github = d.getGithub();
//        this.diselData = d.getDiselData();
//    }
//
//
//}
//"title": "도담도담",
//        "developer": "B1ND",
//        "description": "platform",
//        "thumb": "Dodam",
//        "framework": "javascript",
//        "github": "",
//        "download": {
//        "windows": "",
//        "macos": "",
//        "linux": "",
//        "android": "",
//        "ios": ""
//        }