/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Ketki
 */
public class FitnessChallengeManager {
    
    private List<FitnessChallenge> challenges;
    private Map<String, Integer> participantProgress; // Map participant username to progress points
    private Map<String, Integer> participantRewards;  // Map participant username to earned rewards

    // Constructor
    public FitnessChallengeManager() {
        challenges = new ArrayList<>();
        participantProgress = new HashMap<>();
        participantRewards = new HashMap<>();
    }

    // Method to add a new challenge
    public void addChallenge(FitnessChallenge challenge) {
        challenges.add(challenge);
    }

    // Method to join a challenge
    public void joinChallenge(String username) {
        participantProgress.put(username, 0); // Initialize progress to 0
    }

    // Method to record progress for a participant
    public void recordProgress(String username, int points) {
        if (participantProgress.containsKey(username)) {
            int currentPoints = participantProgress.get(username);
            participantProgress.put(username, currentPoints + points);

            // Check if the participant has completed any challenge to earn rewards
            for (FitnessChallenge challenge : challenges) {
                if (currentPoints + points >= challenge.getRewardPoints()) {
                    participantRewards.put(username, participantRewards.getOrDefault(username, 0) + challenge.getRewardPoints());
                }
            }
        }
    }

    // Method to retrieve challenge list
    public List<FitnessChallenge> getChallenges() {
        return challenges;
    }

    // Method to retrieve participant progress
    public int getParticipantProgress(String username) {
        return participantProgress.getOrDefault(username, 0);
    }

    // Method to retrieve participant rewards
    public int getParticipantRewards(String username) {
        return participantRewards.getOrDefault(username, 0);
    }
    
}
