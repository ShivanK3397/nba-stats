package com.fantasystats.nba_stats.player;

import jakarta.persistence.*;

@Entity
@Table(name="player_stats")

public class Player {

    private int rank;
    @Id
    @Column(name="player_name",unique=true)
    private String name;
    private String pos;
    private String age;
    private String team;
    private int gamesPlayed;
    private int gamesStarted;
    private double minutesPerGame;
    private double fieldGoalsPerGame;
    private double fieldGoalAttemptsPerGame;
    private double threePointFieldGoals;
    private double threePointFieldGoalAttempts;
    private double threePointFieldGoalPercentage;
    private double twoPointFieldGoals;
    private double twoPA;
    // Two-point field goal percentage
    private double twoPPercent;

    // Effective field goal percentage
    private double eFGPercent;

    // Free throws per game
    private double freeThrows;

    // Free throw attempts per game
    private double freeThrowAttempts;

    // Free throw percentage
    private double freeThrowPercent;

    // Offensive rebounds per game
    private double offensiveRebounds;

    // Defensive rebounds per game
    private double defensiveRebounds;

    // Total rebounds per game
    private double totalRebounds;

    // Assists per game
    private double assists;

    // Steals per game
    private double steals;

    // Blocks per game
    private double blocks;

    // Turnovers per game
    private double turnovers;

    // Personal fouls per game
    private double personalFouls;

    // Points per game
    private double pointsPerGame;

    public Player() {
    }

    public Player(int rank, String name, String pos, double fieldGoalAttemptsPerGame, String age, String team, int gamesPlayed, int gamesStarted, double minutesPerGame, double fieldGoalsPerGame, double threePointFieldGoals, double threePointFieldGoalAttempts, double threePointFieldGoalPercentage, double twoPointFieldGoals, double twoPA, double twoPPercent, double eFGPercent, double freeThrows, double freeThrowAttempts, double freeThrowPercent, double offensiveRebounds, double defensiveRebounds, double totalRebounds, double assists, double steals, double blocks, double turnovers, double personalFouls, double pointsPerGame) {
        this.rank = rank;
        this.name = name;
        this.pos = pos;
        this.fieldGoalAttemptsPerGame = fieldGoalAttemptsPerGame;
        this.age = age;
        this.team = team;
        this.gamesPlayed = gamesPlayed;
        this.gamesStarted = gamesStarted;
        this.minutesPerGame = minutesPerGame;
        this.fieldGoalsPerGame = fieldGoalsPerGame;
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

    public int getRank() {
        return rank;
    }

    public double getPointsPerGame() {
        return pointsPerGame;
    }

    public double getPersonalFouls() {
        return personalFouls;
    }

    public double getTurnovers() {
        return turnovers;
    }

    public double getBlocks() {
        return blocks;
    }

    public double getSteals() {
        return steals;
    }

    public double getAssists() {
        return assists;
    }

    public double getTotalRebounds() {
        return totalRebounds;
    }

    public double getDefensiveRebounds() {
        return defensiveRebounds;
    }

    public double getOffensiveRebounds() {
        return offensiveRebounds;
    }

    public double getFreeThrowPercent() {
        return freeThrowPercent;
    }

    public double getFreeThrowAttempts() {
        return freeThrowAttempts;
    }

    public double getFreeThrows() {
        return freeThrows;
    }

    public double geteFGPercent() {
        return eFGPercent;
    }

    public double getTwoPPercent() {
        return twoPPercent;
    }

    public double getTwoPA() {
        return twoPA;
    }

    public double getTwoPointFieldGoals() {
        return twoPointFieldGoals;
    }

    public double getThreePointFieldGoalPercentage() {
        return threePointFieldGoalPercentage;
    }

    public double getThreePointFieldGoalAttempts() {
        return threePointFieldGoalAttempts;
    }

    public double getThreePointFieldGoals() {
        return threePointFieldGoals;
    }

    public double getFieldGoalAttemptsPerGame() {
        return fieldGoalAttemptsPerGame;
    }

    public double getFieldGoalsPerGame() {
        return fieldGoalsPerGame;
    }

    public double getMinutesPerGame() {
        return minutesPerGame;
    }

    public int getGamesStarted() {
        return gamesStarted;
    }

    public int getGamesPlayed() {
        return gamesPlayed;
    }

    public String getTeam() {
        return team;
    }

    public String getAge() {
        return age;
    }

    public String getPos() {
        return pos;
    }

    public String getName() {
        return name;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public void setGamesPlayed(int gamesPlayed) {
        this.gamesPlayed = gamesPlayed;
    }

    public void setGamesStarted(int gamesStarted) {
        this.gamesStarted = gamesStarted;
    }

    public void setMinutesPerGame(double minutesPerGame) {
        this.minutesPerGame = minutesPerGame;
    }

    public void setFieldGoalsPerGame(double fieldGoalsPerGame) {
        this.fieldGoalsPerGame = fieldGoalsPerGame;
    }

    public void setFieldGoalAttemptsPerGame(double fieldGoalAttemptsPerGame) {
        this.fieldGoalAttemptsPerGame = fieldGoalAttemptsPerGame;
    }

    public void setThreePointFieldGoals(double threePointFieldGoals) {
        this.threePointFieldGoals = threePointFieldGoals;
    }

    public void setThreePointFieldGoalAttempts(double threePointFieldGoalAttempts) {
        this.threePointFieldGoalAttempts = threePointFieldGoalAttempts;
    }

    public void setThreePointFieldGoalPercentage(double threePointFieldGoalPercentage) {
        this.threePointFieldGoalPercentage = threePointFieldGoalPercentage;
    }

    public void setTwoPointFieldGoals(double twoPointFieldGoals) {
        this.twoPointFieldGoals = twoPointFieldGoals;
    }

    public void setTwoPA(double twoPA) {
        this.twoPA = twoPA;
    }

    public void setTwoPPercent(double twoPPercent) {
        this.twoPPercent = twoPPercent;
    }

    public void seteFGPercent(double eFGPercent) {
        this.eFGPercent = eFGPercent;
    }

    public void setFreeThrows(double freeThrows) {
        this.freeThrows = freeThrows;
    }

    public void setFreeThrowAttempts(double freeThrowAttempts) {
        this.freeThrowAttempts = freeThrowAttempts;
    }

    public void setFreeThrowPercent(double freeThrowPercent) {
        this.freeThrowPercent = freeThrowPercent;
    }

    public void setOffensiveRebounds(double offensiveRebounds) {
        this.offensiveRebounds = offensiveRebounds;
    }

    public void setDefensiveRebounds(double defensiveRebounds) {
        this.defensiveRebounds = defensiveRebounds;
    }

    public void setTotalRebounds(double totalRebounds) {
        this.totalRebounds = totalRebounds;
    }

    public void setAssists(double assists) {
        this.assists = assists;
    }

    public void setSteals(double steals) {
        this.steals = steals;
    }

    public void setBlocks(double blocks) {
        this.blocks = blocks;
    }

    public void setTurnovers(double turnovers) {
        this.turnovers = turnovers;
    }

    public void setPersonalFouls(double personalFouls) {
        this.personalFouls = personalFouls;
    }

    public void setPointsPerGame(double pointsPerGame) {
        this.pointsPerGame = pointsPerGame;
    }
}
