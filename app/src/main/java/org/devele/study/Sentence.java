package org.devele.study;

public class Sentence {
    String title;
    String teamname;

    public Sentence(String title, String teamname){
        this.teamname = teamname;
        this.title = title;
    }


    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getTeamname(){
        return teamname;
    }
    public void setName(String name){
        this.teamname = name;
    }
}
