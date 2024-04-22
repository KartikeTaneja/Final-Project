/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

/**
 *
 * @author Ketki
 */
public class FitnessChallenge {
    private String title;
    private String description;
    private int duration; // Duration in days
    private int rewardPoints;
    private boolean accepted;

    // Constructor
    public FitnessChallenge(String title) {
        this.title = title;
        this.description = description;
        this.duration = duration;
        this.rewardPoints = rewardPoints;
        this.accepted = false;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getDuration() {
        return duration;
    }

    public int getRewardPoints() {
        return rewardPoints;
    }
     public void setAccepted(boolean accepted) {
        this.accepted = accepted;
    }
    
}
