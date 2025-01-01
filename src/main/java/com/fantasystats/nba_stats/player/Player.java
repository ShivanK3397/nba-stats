package com.fantasystats.nba_stats.player;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name="player_stats")

public class Player {

    private Integer rank;
    @Id
    @Column(name="name",unique=true)
    private String name;
    private String pos;
    private Integer age;
    private String team;
    private Integer gamesPlayed;
    private Integer gamesStarted;
    private Double minutesPerGame;
    private Double fieldGoalsPerGame;
    private Double fieldGoalAttemptsPerGame;
    private Double fieldGoalAttemptsPercentage;
    private Double threePointFieldGoals;
    private Double threePointFieldGoalAttempts;
    private Double threePointFieldGoalPercentage;
    private Double twoPointFieldGoals;
    private Double twoPA;
    private Double twoPPercent;
    private Double eFGPercent;
    private Double freeThrows;
    private Double freeThrowAttempts;
    private Double freeThrowPercent;
    private Double offensiveRebounds;
    private Double defensiveRebounds;
    private Double totalRebounds;
    private Double assists;
    private Double steals;
    private Double blocks;
    private Double turnovers;
    private Double personalFouls;
    private Double pointsPerGame;

    public Player(Integer rank, String name, String pos, Integer age, String team, Integer gamesPlayed, Integer gamesStarted, Double minutesPerGame, Double fieldGoalsPerGame, Double fieldGoalAttemptsPerGame, Double fieldGoalAttemptsPercentage, Double threePointFieldGoals, Double threePointFieldGoalAttempts, Double threePointFieldGoalPercentage, Double twoPointFieldGoals, Double twoPA, Double twoPPercent, Double eFGPercent, Double freeThrows, Double freeThrowAttempts, Double freeThrowPercent, Double offensiveRebounds, Double defensiveRebounds, Double totalRebounds, Double assists, Double steals, Double blocks, Double turnovers, Double personalFouls, Double pointsPerGame) {
        this.rank = rank;
        this.name = name;
        this.pos = pos;
        this.age = age;
        this.team = team;
        this.gamesPlayed = gamesPlayed;
        this.gamesStarted = gamesStarted;
        this.minutesPerGame = minutesPerGame;
        this.fieldGoalsPerGame = fieldGoalsPerGame;
        this.fieldGoalAttemptsPerGame = fieldGoalAttemptsPerGame;
        this.fieldGoalAttemptsPercentage = fieldGoalAttemptsPercentage;
        this.threePointFieldGoals = threePointFieldGoals;
        this.threePointFieldGoalAttempts = threePointFieldGoalAttempts;
        this.threePointFieldGoalPercentage = threePointFieldGoalPercentage;
        this.twoPointFieldGoals = twoPointFieldGoals;
        this.twoPA = twoPA;
        this.twoPPercent = twoPPercent;
        this.eFGPercent = eFGPercent;
        this.freeThrows = freeThrows;
        this.freeThrowAttempts = freeThrowAttempts;
        this.freeThrowPercent = freeThrowPercent;
        this.offensiveRebounds = offensiveRebounds;
        this.defensiveRebounds = defensiveRebounds;
        this.totalRebounds = totalRebounds;
        this.assists = assists;
        this.steals = steals;
        this.blocks = blocks;
        this.turnovers = turnovers;
        this.personalFouls = personalFouls;
        this.pointsPerGame = pointsPerGame;
    }

    public Player(String name) {
        this.name = name;
    }
    public Player(){

    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPos() {
        return pos;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public Integer getGamesPlayed() {
        return gamesPlayed;
    }

    public void setGamesPlayed(Integer gamesPlayed) {
        this.gamesPlayed = gamesPlayed;
    }

    public Integer getGamesStarted() {
        return gamesStarted;
    }

    public void setGamesStarted(Integer gamesStarted) {
        this.gamesStarted = gamesStarted;
    }

    public Double getMinutesPerGame() {
        return minutesPerGame;
    }

    public void setMinutesPerGame(Double minutesPerGame) {
        this.minutesPerGame = minutesPerGame;
    }

    public Double getFieldGoalsPerGame() {
        return fieldGoalsPerGame;
    }

    public void setFieldGoalsPerGame(Double fieldGoalsPerGame) {
        this.fieldGoalsPerGame = fieldGoalsPerGame;
    }

    public Double getFieldGoalAttemptsPerGame() {
        return fieldGoalAttemptsPerGame;
    }

    public void setFieldGoalAttemptsPerGame(Double fieldGoalAttemptsPerGame) {
        this.fieldGoalAttemptsPerGame = fieldGoalAttemptsPerGame;
    }

    public Double getFieldGoalAttemptsPercentage() {
        return fieldGoalAttemptsPercentage;
    }

    public void setFieldGoalAttemptsPercentage(Double fieldGoalAttemptsPercentage) {
        this.fieldGoalAttemptsPercentage = fieldGoalAttemptsPercentage;
    }

    public Double getThreePointFieldGoals() {
        return threePointFieldGoals;
    }

    public void setThreePointFieldGoals(Double threePointFieldGoals) {
        this.threePointFieldGoals = threePointFieldGoals;
    }

    public Double getThreePointFieldGoalAttempts() {
        return threePointFieldGoalAttempts;
    }

    public void setThreePointFieldGoalAttempts(Double threePointFieldGoalAttempts) {
        this.threePointFieldGoalAttempts = threePointFieldGoalAttempts;
    }

    public Double getThreePointFieldGoalPercentage() {
        return threePointFieldGoalPercentage;
    }

    public void setThreePointFieldGoalPercentage(Double threePointFieldGoalPercentage) {
        this.threePointFieldGoalPercentage = threePointFieldGoalPercentage;
    }

    public Double getTwoPointFieldGoals() {
        return twoPointFieldGoals;
    }

    public void setTwoPointFieldGoals(Double twoPointFieldGoals) {
        this.twoPointFieldGoals = twoPointFieldGoals;
    }

    public Double getTwoPA() {
        return twoPA;
    }

    public void setTwoPA(Double twoPA) {
        this.twoPA = twoPA;
    }

    public Double getTwoPPercent() {
        return twoPPercent;
    }

    public void setTwoPPercent(Double twoPPercent) {
        this.twoPPercent = twoPPercent;
    }

    public Double geteFGPercent() {
        return eFGPercent;
    }

    public void seteFGPercent(Double eFGPercent) {
        this.eFGPercent = eFGPercent;
    }

    public Double getFreeThrows() {
        return freeThrows;
    }

    public void setFreeThrows(Double freeThrows) {
        this.freeThrows = freeThrows;
    }

    public Double getFreeThrowAttempts() {
        return freeThrowAttempts;
    }

    public void setFreeThrowAttempts(Double freeThrowAttempts) {
        this.freeThrowAttempts = freeThrowAttempts;
    }

    public Double getFreeThrowPercent() {
        return freeThrowPercent;
    }

    public void setFreeThrowPercent(Double freeThrowPercent) {
        this.freeThrowPercent = freeThrowPercent;
    }

    public Double getOffensiveRebounds() {
        return offensiveRebounds;
    }

    public void setOffensiveRebounds(Double offensiveRebounds) {
        this.offensiveRebounds = offensiveRebounds;
    }

    public Double getDefensiveRebounds() {
        return defensiveRebounds;
    }

    public void setDefensiveRebounds(Double defensiveRebounds) {
        this.defensiveRebounds = defensiveRebounds;
    }

    public Double getTotalRebounds() {
        return totalRebounds;
    }

    public void setTotalRebounds(Double totalRebounds) {
        this.totalRebounds = totalRebounds;
    }

    public Double getAssists() {
        return assists;
    }

    public void setAssists(Double assists) {
        this.assists = assists;
    }

    public Double getSteals() {
        return steals;
    }

    public void setSteals(Double steals) {
        this.steals = steals;
    }

    public Double getBlocks() {
        return blocks;
    }

    public void setBlocks(Double blocks) {
        this.blocks = blocks;
    }

    public Double getTurnovers() {
        return turnovers;
    }

    public void setTurnovers(Double turnovers) {
        this.turnovers = turnovers;
    }

    public Double getPersonalFouls() {
        return personalFouls;
    }

    public void setPersonalFouls(Double personalFouls) {
        this.personalFouls = personalFouls;
    }

    public Double getPointsPerGame() {
        return pointsPerGame;
    }

    public void setPointsPerGame(Double pointsPerGame) {
        this.pointsPerGame = pointsPerGame;
    }
}
