//CampusConnectPlus scenario

import javax.swing.JOptionPane;

public class CampusConnectPlus {
  static final int POINTS_PER_EVENT = 10;

  //parallel arrays for event names, categories, capacities, participant counts, and if the user is registered in them or not
  static String[] eventNames = {"Sports Fair Swim Meet", "Robotics Workshop", "HFES Winter Social", "Canadian Brass"};

  static String[] eventCategories = {"Sports", "Academic", "Social", "Cultural"};

  static int[] eventCapacities = {20, 25, 40, 60};

  static int[] participantCounts = {15, 19, 32, 56};

  static boolean[] userRegistered = {false, false, false, false};

  //user's total points
  static int totalPoints = 0;
  
  public static void main(String[] args) {

  }
}

