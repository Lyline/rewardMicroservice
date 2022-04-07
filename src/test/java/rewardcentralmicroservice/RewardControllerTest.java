package rewardcentralmicroservice;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(RewardController.class)
public class RewardControllerTest {

  @Autowired
  private MockMvc mockMvc;

  @MockBean
  private RewardService service;

  @Test
  void givenAnAttractionIdAndUserIdWhenGetAttractionRewardThenReturnRewardPointAndStatus200() throws Exception {
    //Given
    when(service.getAttractionRewardPoints(any(),any())).thenReturn(250);

    //When
    mockMvc.perform(
        get("/getAttractionReward/8877e67c-0b44-4232-8e7b-85a995f71050" +
                      "/8877e67c-0b44-4232-8e7b-85a995f71050"))
        .andExpect(status().isOk())
        .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
        .andExpect(content().json("250"));
    //Then
  }
}