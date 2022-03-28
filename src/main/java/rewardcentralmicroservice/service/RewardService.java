package rewardcentralmicroservice.service;

import org.springframework.stereotype.Service;
import rewardCentral.RewardCentral;
import rewardcentralmicroservice.RewardCentralMicroserviceApplication;

@Service
public class RewardService {
  RewardCentral reward= new RewardCentral();
}
