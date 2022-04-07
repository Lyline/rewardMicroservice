package rewardcentralmicroservice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import rewardCentral.RewardCentral;

@Configuration
public class Config {

  @Bean
  public RewardCentral getRewardCentral(){return new RewardCentral();}
}
