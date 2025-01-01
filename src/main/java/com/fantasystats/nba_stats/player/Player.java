package com.fantasystats.nba_stats.player;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="player_stats")

public class Player {
    private int rank;
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


}
