package rewardcentralmicroservice;

import org.springframework.stereotype.Service;
import rewardCentral.RewardCentral;

import java.util.UUID;

@Service
public class RewardService {
  private final RewardCentral reward;

  public RewardService(RewardCentral reward) {
    this.reward = reward;
  }

  public int getAttractionRewardPoints(UUID attractionId, UUID userId){
    return reward.getAttractionRewardPoints(attractionId,userId);
  }
}
