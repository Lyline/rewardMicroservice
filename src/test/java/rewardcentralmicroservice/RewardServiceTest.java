package rewardcentralmicroservice;


import org.junit.jupiter.api.Test;
import rewardCentral.RewardCentral;

import java.util.UUID;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class RewardServiceTest {

  private RewardCentral rewardMock=mock(RewardCentral.class);

  RewardService classUnderTest=new RewardService(rewardMock);

  @Test
  public void testGetAttractionRewardPoints() {
    UUID attractionId= new UUID(1,1);
    UUID userId= new UUID(10,12);

    when(rewardMock.getAttractionRewardPoints(any(),any())).thenReturn(20);

    int actual= classUnderTest.getAttractionRewardPoints(attractionId,userId);

    assertThat(actual).isEqualTo(20);
  }
}