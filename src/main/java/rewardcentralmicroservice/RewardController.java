package rewardcentralmicroservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class RewardController {
  private final RewardService service;

  public RewardController(RewardService service) {
    this.service = service;
  }

  @GetMapping("/getAttractionReward/{attractionId}/{userId}")
  public Integer getAttractionRewards(@PathVariable UUID attractionId, @PathVariable UUID userId){
    return service.getAttractionRewardPoints(attractionId,userId);
  }
}
