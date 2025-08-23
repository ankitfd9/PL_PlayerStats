package com.springtest.demo.entity;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String nation;
    private String position;
    private int age;
    private int matchPlayed;
    private int starts;
    private double minutesPlayed;
    private double goals;
    private double assists;
    private double penaltyGoals;
    private double yellowCards;
    private double redCards;
    private double xG;
    private double xA;
    private String club;

    public Player(int id, String name, String nation, String position, int age, int matchPlayed, int starts, int minutesPlayed, int goals, int assists, int penaltyGoals, int yellowCards, int redCards, int xG, int xA, String club) {
        this.id = id;
        this.name = name;
        this.nation = nation;
        this.position = position;
        this.age = age;
        this.matchPlayed = matchPlayed;
        this.starts = starts;
        this.minutesPlayed = minutesPlayed;
        this.goals = goals;
        this.assists = assists;
        this.penaltyGoals = penaltyGoals;
        this.yellowCards = yellowCards;
        this.redCards = redCards;
        this.xG = xG;
        this.xA = xA;
        this.club = club;
    }

    public Player(){
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getNation() {
        return nation;
    }

    public String getPosition() {
        return position;
    }

    public int getAge() {
        return age;
    }

    public int getMatchPlayed() {
        return matchPlayed;
    }

    public int getStarts() {
        return starts;
    }

    public double getMinutesPlayed() {
        return minutesPlayed;
    }

    public double getGoals() {
        return goals;
    }

    public double getAssists() {
        return assists;
    }

    public double getPenaltyGoals() {
        return penaltyGoals;
    }

    public double getYellowCards() {
        return yellowCards;
    }

    public double getRedCards() {
        return redCards;
    }

    public double getxG() {
        return xG;
    }

    public double getxA() {
        return xA;
    }

    public String getClub() {
        return club;
    }

    public void setId(Integer id) {
        this.id = id==null ? 0 : id;
    }

    
    // Setter for Integer fields: set to 0 if null
    public void setAge(Integer age) {
        this.age = (age == null) ? 0 : age;
    }

    public void setMatchPlayed(Integer matchPlayed) {
        this.matchPlayed = (matchPlayed == null) ? 0 : matchPlayed;
    }

    public void setStarts(Integer starts) {
        this.starts = (starts == null) ? 0 : starts;
    }

    // Setter for Double fields: set to 0.0 if null
    public void setMinutesPlayed(Double minutesPlayed) {
        this.minutesPlayed = (minutesPlayed == null) ? 0.0 : minutesPlayed;
    }

    public void setGoals(Double goals) {
        this.goals = (goals == null) ? 0.0 : goals;
    }

    public void setAssists(Double assists) {
        this.assists = (assists == null) ? 0.0 : assists;
    }

    public void setPenaltyGoals(Double penaltyGoals) {
        this.penaltyGoals = (penaltyGoals == null) ? 0.0 : penaltyGoals;
    }

    public void setYellowCards(Double yellowCards) {
        this.yellowCards = (yellowCards == null) ? 0.0 : yellowCards;
    }

    public void setRedCards(Double redCards) {
        this.redCards = (redCards == null) ? 0.0 : redCards;
    }

    public void setxG(Double xG) {
        this.xG = (xG == null) ? 0.0 : xG;
    }

    public void setxA(Double xA) {
        this.xA = (xA == null) ? 0.0 : xA;
    }
public void setName(String name) {
    this.name = (name == null) ? "" : name;
}

public void setNation(String nation) {
    this.nation = (nation == null) ? "" : nation;
}

public void setPosition(String position) {
    this.position = (position == null) ? "" : position;
}

public void setClub(String club) {
    this.club = (club == null) ? "" : club;
}

}
